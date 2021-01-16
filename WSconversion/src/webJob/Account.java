package webJob;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name = "account") 
@XmlAccessorType(XmlAccessType.FIELD) //acceptable de mettre les annotations sur les attributs au lieu de les mettre sur les setters and getters  
public class Account {
	
	@XmlElement
	private int accountNbr;
	@XmlAttribute
	private double sold;
	@XmlTransient //n'est serializer cet attribut
	private Date dateCreation;

	public Account(int accountNbr, double sold, Date dateCreation) {
		super();
		this.accountNbr = accountNbr;
		this.sold = sold;
		this.dateCreation = dateCreation;
	}

	public int getAccountNbr() {
		return accountNbr;
	}

	public void setAccountNbr(int accountNbr) {
		this.accountNbr = accountNbr;
	}

	public double getSold() {
		return sold;
	}

	public void setSold(double sold) {
		this.sold = sold;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

}
