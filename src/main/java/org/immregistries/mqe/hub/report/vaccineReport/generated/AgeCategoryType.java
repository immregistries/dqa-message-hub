//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.19 at 02:05:44 PM MDT 
//


package org.immregistries.mqe.hub.report.vaccineReport.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ageCategoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ageCategoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ageMin" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="ageMax" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ageCategoryType", propOrder = {
    "label",
    "ageMin",
    "ageMax"
})
public class AgeCategoryType {

    @XmlElement(required = true)
    protected String label;
    protected short ageMin;
    protected short ageMax;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the ageMin property.
     * 
     */
    public short getAgeMin() {
        return ageMin;
    }

    /**
     * Sets the value of the ageMin property.
     * 
     */
    public void setAgeMin(short value) {
        this.ageMin = value;
    }

    /**
     * Gets the value of the ageMax property.
     * 
     */
    public short getAgeMax() {
        return ageMax;
    }

    /**
     * Sets the value of the ageMax property.
     * 
     */
    public void setAgeMax(short value) {
        this.ageMax = value;
    }

}
