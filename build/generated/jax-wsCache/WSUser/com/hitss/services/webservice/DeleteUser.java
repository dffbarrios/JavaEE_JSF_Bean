
package com.hitss.services.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para deleteUser complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="deleteUser"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="currentUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="currentPass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idUser" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteUser", propOrder = {
    "currentUser",
    "currentPass",
    "idUser"
})
public class DeleteUser {

    protected String currentUser;
    protected String currentPass;
    protected int idUser;

    /**
     * Obtiene el valor de la propiedad currentUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentUser() {
        return currentUser;
    }

    /**
     * Define el valor de la propiedad currentUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentUser(String value) {
        this.currentUser = value;
    }

    /**
     * Obtiene el valor de la propiedad currentPass.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPass() {
        return currentPass;
    }

    /**
     * Define el valor de la propiedad currentPass.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPass(String value) {
        this.currentPass = value;
    }

    /**
     * Obtiene el valor de la propiedad idUser.
     * 
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * Define el valor de la propiedad idUser.
     * 
     */
    public void setIdUser(int value) {
        this.idUser = value;
    }

}
