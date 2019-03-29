package atj.rest.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
//@XmlRootElement(name = "Rate")
@XmlAccessorType (XmlAccessType.FIELD)
public class Rate {
	
	private String No;
	//@XmlAttribute
	private String EffectiveDate;
	//@XmlAttribute
	private double Bid;
	//@XmlAttribute
	private double Ask;
	
	public Rate() {
	}
	
	public Rate(String No, String EffectiveDate, double Bid, double Ask) {
		this.No = No;
		this.EffectiveDate = EffectiveDate;
		this.Bid = Bid;
		this.Ask = Ask;
	}

	
	public String getNo() {
		return No;
	}
	@XmlAttribute
	public void setNo(String No) {
		this.No = No;
	}
	
	public String getEffectiveDate() {
		return EffectiveDate;
	}
	@XmlAttribute
	public void setEffectiveDate(String EffectiveDate) {
		this.EffectiveDate = EffectiveDate;
	}

	public double getBid() {
		return Bid;
	}
	
	@XmlAttribute
	public void setBid(double Bid) {
		this.Bid = Bid;
	}
	

	public double getAsk() {
		return Ask;
	}

	@XmlAttribute
	public void setAsk(double Ask) {
		this.Ask = Ask;
	}
}
