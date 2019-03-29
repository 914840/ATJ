package atj.rest.service;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.RoundingMode;
import java.net.URI;
import java.text.DecimalFormat;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import atj.rest.model.ExchangeRatesSeries;
import atj.rest.model.Rate;

public class ExchangeService {
	
	public ExchangeService() {}
	
	public String requestNBP(int day) {
		String sDay = String.valueOf(day);
		
		Client client = ClientBuilder.newClient();
		
		URI uri = URI.create(
				"http://api.nbp.pl/api/exchangerates/rates/C/CHF"
				);
		WebTarget webTarget = client.target(uri);
		webTarget = webTarget.path("last").path(sDay); //.path("?format=xml");
		
		String xmlAnswer = webTarget.request().accept(MediaType.TEXT_XML).get(String.class);
	
		return xmlAnswer;
	}
	
//	public Answer unMarshalingAnswer(String xmlAnswer) throws JAXBException, XMLStreamException, FactoryConfigurationError
//	{
//		JAXBContext jaxbContext = JAXBContext.newInstance(Answer.class);
//		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
//		XMLStreamReader reader = XMLInputFactory.newInstance().createXMLStreamReader(new StringReader(xmlAnswer));
//		JAXBElement<Answer> ans = unmarshaller.unmarshal(reader, Answer.class);
//		Answer answer = ans.getValue();
//		//System.out.println(answer.getCode());
//		
//		return answer;
//		
//	}
	
	public void xmlAnswerToFile(String xmlAnswer) {
		FileWriter plikXML = null;
		
			try {
				plikXML = new FileWriter("c:/temp/inXML.xml");
				plikXML.write(xmlAnswer);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				if(plikXML != null) {
				try {
					plikXML.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public ExchangeRatesSeries unMarshallingFileXML() throws IOException, JAXBException {

		
		File fileIn = new File("c:/temp/inXML.xml");
		JAXBContext jaxbContext = JAXBContext.newInstance(ExchangeRatesSeries.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		ExchangeRatesSeries exchangeRatesSeries = (ExchangeRatesSeries) jaxbUnmarshaller.unmarshal(fileIn);
		
		return exchangeRatesSeries;		
	}

	public double getAverageExchange(ExchangeRatesSeries ex) {
		int size = ex.getRates().size();
		double sum = 0;
		for (int i=0; i<size; i++) {
			
			double val = ex.getRates().get(i).getAsk()+ex.getRates().get(i).getBid();
			sum = sum + val;
		}
		
		double average = sum /(2*size);

		DecimalFormat df = new DecimalFormat("#.####");
		df.setRoundingMode(RoundingMode.CEILING);
		
		return average;
	}
	
}
