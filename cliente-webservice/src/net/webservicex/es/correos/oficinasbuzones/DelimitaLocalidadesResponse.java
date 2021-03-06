
package net.webservicex.es.correos.oficinasbuzones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DelimitaLocalidadesResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "delimitaLocalidadesResult"
})
@XmlRootElement(name = "DelimitaLocalidadesResponse")
public class DelimitaLocalidadesResponse {

    @XmlElement(name = "DelimitaLocalidadesResult")
    protected String delimitaLocalidadesResult;

    /**
     * Obtiene el valor de la propiedad delimitaLocalidadesResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelimitaLocalidadesResult() {
        return delimitaLocalidadesResult;
    }

    /**
     * Define el valor de la propiedad delimitaLocalidadesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelimitaLocalidadesResult(String value) {
        this.delimitaLocalidadesResult = value;
    }

}
