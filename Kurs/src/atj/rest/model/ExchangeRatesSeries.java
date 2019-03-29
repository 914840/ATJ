package atj.rest.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ExchangeRatesSeries")
@XmlAccessorType(XmlAccessType.FIELD)
public class ExchangeRatesSeries {

	// TODO sprawdziæ z ma³ymi literami
	private String Table;	// wersja niezgodna z praktyk¹
	private String Currency;
	private String Code;

	//private Rates rates;
	@XmlElementWrapper(name = "Rates")
	@XmlElement(name = "Rate")
	private List<Rate> rates = new ArrayList<Rate>();
	
	
	ExchangeRatesSeries() {
	}
	
	
	public ExchangeRatesSeries(String Table, String Currency, String Code, List<Rate> rates) {
		this.Table = Table;
		this.Currency = Currency;
		this.Code = Code;
		this.rates=rates;
	}

	
	public String getTable() {
		return Table;
	}
	

	public void setTable(String table) {
		Table = table;
	}

	
	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	
	public String getCode() {
		return Code;
	}
	
	
	public void setCode(String code) {
		Code = code;
	}
	
//	public Rates getRates() {
//		return rates;
//	}
//	
//	public void setRates(Rates rates) {
//		this.rates = rates;
//	}
	
//	public void add(Rate rate) {
//		this.rates.add(rate);
//	}
//	
	//@XmlElement(name = "Rate")
	public List<Rate> getRates(){
		return rates;
	}
	
	public void setRates(List<Rate> rates) {
		this.rates = rates;
	}
	
}
