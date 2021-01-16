
package webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour account complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="account">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNbr" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sold" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account", propOrder = {
    "accountNbr"
})
public class Account {

    protected int accountNbr;
    @XmlAttribute(name = "sold", required = true)
    protected double sold;

    /**
     * Obtient la valeur de la propriété accountNbr.
     * 
     */
    public int getAccountNbr() {
        return accountNbr;
    }

    /**
     * Définit la valeur de la propriété accountNbr.
     * 
     */
    public void setAccountNbr(int value) {
        this.accountNbr = value;
    }

    /**
     * Obtient la valeur de la propriété sold.
     * 
     */
    public double getSold() {
        return sold;
    }

    /**
     * Définit la valeur de la propriété sold.
     * 
     */
    public void setSold(double value) {
        this.sold = value;
    }

}
