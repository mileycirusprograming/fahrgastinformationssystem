//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for tStopTimes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tStopTimes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.railml.org/schemas/2009}aStopTimes"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tStopTimes")
public class TStopTimes {

    @XmlAttribute(name = "minimalTime")
    protected Duration minimalTime;
    @XmlAttribute(name = "operationalReserve")
    protected Duration operationalReserve;
    @XmlAttribute(name = "additionalReserve")
    protected Duration additionalReserve;
    @XmlAttribute(name = "shuntingTime")
    protected Duration shuntingTime;
    @XmlAttribute(name = "clearanceTime")
    protected Duration clearanceTime;

    /**
     * Gets the value of the minimalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimalTime() {
        return minimalTime;
    }

    /**
     * Sets the value of the minimalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimalTime(Duration value) {
        this.minimalTime = value;
    }

    /**
     * Gets the value of the operationalReserve property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOperationalReserve() {
        return operationalReserve;
    }

    /**
     * Sets the value of the operationalReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOperationalReserve(Duration value) {
        this.operationalReserve = value;
    }

    /**
     * Gets the value of the additionalReserve property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getAdditionalReserve() {
        return additionalReserve;
    }

    /**
     * Sets the value of the additionalReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setAdditionalReserve(Duration value) {
        this.additionalReserve = value;
    }

    /**
     * Gets the value of the shuntingTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getShuntingTime() {
        return shuntingTime;
    }

    /**
     * Sets the value of the shuntingTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setShuntingTime(Duration value) {
        this.shuntingTime = value;
    }

    /**
     * Gets the value of the clearanceTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getClearanceTime() {
        return clearanceTime;
    }

    /**
     * Sets the value of the clearanceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setClearanceTime(Duration value) {
        this.clearanceTime = value;
    }

}
