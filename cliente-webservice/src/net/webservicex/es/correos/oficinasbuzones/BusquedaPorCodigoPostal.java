
package net.webservicex.es.correos.oficinasbuzones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="idioma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigopostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="servicios" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="diadelasemana" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hora" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buscaoficinas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxnumoficinas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="buscabuzones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="maxnumbuzones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idioma",
    "codigopostal",
    "servicios",
    "fecha",
    "diadelasemana",
    "hora",
    "buscaoficinas",
    "maxnumoficinas",
    "buscabuzones",
    "maxnumbuzones"
})
@XmlRootElement(name = "BusquedaPorCodigoPostal")
public class BusquedaPorCodigoPostal {

    protected String idioma;
    protected String codigopostal;
    protected String servicios;
    protected String fecha;
    protected String diadelasemana;
    protected String hora;
    protected String buscaoficinas;
    protected String maxnumoficinas;
    protected String buscabuzones;
    protected String maxnumbuzones;

    /**
     * Obtiene el valor de la propiedad idioma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * Define el valor de la propiedad idioma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdioma(String value) {
        this.idioma = value;
    }

    /**
     * Obtiene el valor de la propiedad codigopostal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigopostal() {
        return codigopostal;
    }

    /**
     * Define el valor de la propiedad codigopostal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigopostal(String value) {
        this.codigopostal = value;
    }

    /**
     * Obtiene el valor de la propiedad servicios.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicios() {
        return servicios;
    }

    /**
     * Define el valor de la propiedad servicios.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicios(String value) {
        this.servicios = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad diadelasemana.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiadelasemana() {
        return diadelasemana;
    }

    /**
     * Define el valor de la propiedad diadelasemana.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiadelasemana(String value) {
        this.diadelasemana = value;
    }

    /**
     * Obtiene el valor de la propiedad hora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHora() {
        return hora;
    }

    /**
     * Define el valor de la propiedad hora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHora(String value) {
        this.hora = value;
    }

    /**
     * Obtiene el valor de la propiedad buscaoficinas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscaoficinas() {
        return buscaoficinas;
    }

    /**
     * Define el valor de la propiedad buscaoficinas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscaoficinas(String value) {
        this.buscaoficinas = value;
    }

    /**
     * Obtiene el valor de la propiedad maxnumoficinas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxnumoficinas() {
        return maxnumoficinas;
    }

    /**
     * Define el valor de la propiedad maxnumoficinas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxnumoficinas(String value) {
        this.maxnumoficinas = value;
    }

    /**
     * Obtiene el valor de la propiedad buscabuzones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuscabuzones() {
        return buscabuzones;
    }

    /**
     * Define el valor de la propiedad buscabuzones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuscabuzones(String value) {
        this.buscabuzones = value;
    }

    /**
     * Obtiene el valor de la propiedad maxnumbuzones.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxnumbuzones() {
        return maxnumbuzones;
    }

    /**
     * Define el valor de la propiedad maxnumbuzones.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxnumbuzones(String value) {
        this.maxnumbuzones = value;
    }

}
