
package com.hitss.services.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para user complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="user"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="usrCreationdate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="usrEtaid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usrId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="usrLastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usrName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usrPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usrUsername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "user", propOrder = {
    "usrCreationdate",
    "usrEtaid",
    "usrId",
    "usrLastname",
    "usrName",
    "usrPassword",
    "usrUsername"
})
public class User {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar usrCreationdate;
    protected String usrEtaid;
    protected Integer usrId;
    protected String usrLastname;
    protected String usrName;
    protected String usrPassword;
    protected String usrUsername;

    /**
     * Obtiene el valor de la propiedad usrCreationdate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUsrCreationdate() {
        return usrCreationdate;
    }

    /**
     * Define el valor de la propiedad usrCreationdate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUsrCreationdate(XMLGregorianCalendar value) {
        this.usrCreationdate = value;
    }

    /**
     * Obtiene el valor de la propiedad usrEtaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrEtaid() {
        return usrEtaid;
    }

    /**
     * Define el valor de la propiedad usrEtaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrEtaid(String value) {
        this.usrEtaid = value;
    }

    /**
     * Obtiene el valor de la propiedad usrId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUsrId() {
        return usrId;
    }

    /**
     * Define el valor de la propiedad usrId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUsrId(Integer value) {
        this.usrId = value;
    }

    /**
     * Obtiene el valor de la propiedad usrLastname.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrLastname() {
        return usrLastname;
    }

    /**
     * Define el valor de la propiedad usrLastname.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrLastname(String value) {
        this.usrLastname = value;
    }

    /**
     * Obtiene el valor de la propiedad usrName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrName() {
        return usrName;
    }

    /**
     * Define el valor de la propiedad usrName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrName(String value) {
        this.usrName = value;
    }

    /**
     * Obtiene el valor de la propiedad usrPassword.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrPassword() {
        return usrPassword;
    }

    /**
     * Define el valor de la propiedad usrPassword.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrPassword(String value) {
        this.usrPassword = value;
    }

    /**
     * Obtiene el valor de la propiedad usrUsername.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrUsername() {
        return usrUsername;
    }

    /**
     * Define el valor de la propiedad usrUsername.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrUsername(String value) {
        this.usrUsername = value;
    }

}
