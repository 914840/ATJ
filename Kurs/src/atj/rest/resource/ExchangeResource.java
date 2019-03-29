package atj.rest.resource;

import java.io.IOException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBException;
import javax.xml.stream.FactoryConfigurationError;
import javax.xml.stream.XMLStreamException;

import atj.rest.model.ExchangeRatesSeries;
import atj.rest.service.ExchangeService;

@Path("CHF")
//@Consumes(MediaType.TEXT_PLAIN)
//@Produces(MediaType.TEXT_PLAIN)
public class ExchangeResource {

	private ExchangeService exchangeService = new ExchangeService();
	
	@GET
	@Path("{day}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAverageCHF(@PathParam("day") int day) throws JAXBException, XMLStreamException, FactoryConfigurationError, IOException{
		String response = exchangeService.requestNBP(day);
		
		exchangeService.xmlAnswerToFile(response);
		ExchangeRatesSeries ex = exchangeService.unMarshallingFileXML();
		double answer = exchangeService.getAverageExchange(ex);

		return "srednia wartosc kursu z "+day+ " ostatnich sesji to " + answer;
		
		

	}
}
