//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eTrackTopology complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eTrackTopology">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="trackBegin" type="{http://www.railml.org/schemas/2009}eTrackNode"/>
 *         &lt;element name="trackEnd" type="{http://www.railml.org/schemas/2009}eTrackNode"/>
 *         &lt;element name="mileageChanges" type="{http://www.railml.org/schemas/2009}eMileageChanges" minOccurs="0"/>
 *         &lt;element name="connections" type="{http://www.railml.org/schemas/2009}eConnections" minOccurs="0"/>
 *         &lt;element name="crossSections" type="{http://www.railml.org/schemas/2009}eCrossSections" minOccurs="0"/>
 *         &lt;element name="borders" type="{http://www.railml.org/schemas/2009}eBorder" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eTrackTopology", propOrder = {
    "trackBegin",
    "trackEnd",
    "mileageChanges",
    "connections",
    "crossSections",
    "borders"
})
public class ETrackTopology {

    @XmlElement(required = true)
    protected ETrackNode trackBegin;
    @XmlElement(required = true)
    protected ETrackNode trackEnd;
    protected EMileageChanges mileageChanges;
    protected EConnections connections;
    protected ECrossSections crossSections;
    protected EBorder borders;

    /**
     * Gets the value of the trackBegin property.
     * 
     * @return
     *     possible object is
     *     {@link ETrackNode }
     *     
     */
    public ETrackNode getTrackBegin() {
        return trackBegin;
    }

    /**
     * Sets the value of the trackBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETrackNode }
     *     
     */
    public void setTrackBegin(ETrackNode value) {
        this.trackBegin = value;
    }

    /**
     * Gets the value of the trackEnd property.
     * 
     * @return
     *     possible object is
     *     {@link ETrackNode }
     *     
     */
    public ETrackNode getTrackEnd() {
        return trackEnd;
    }

    /**
     * Sets the value of the trackEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link ETrackNode }
     *     
     */
    public void setTrackEnd(ETrackNode value) {
        this.trackEnd = value;
    }

    /**
     * Gets the value of the mileageChanges property.
     * 
     * @return
     *     possible object is
     *     {@link EMileageChanges }
     *     
     */
    public EMileageChanges getMileageChanges() {
        return mileageChanges;
    }

    /**
     * Sets the value of the mileageChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link EMileageChanges }
     *     
     */
    public void setMileageChanges(EMileageChanges value) {
        this.mileageChanges = value;
    }

    /**
     * Gets the value of the connections property.
     * 
     * @return
     *     possible object is
     *     {@link EConnections }
     *     
     */
    public EConnections getConnections() {
        return connections;
    }

    /**
     * Sets the value of the connections property.
     * 
     * @param value
     *     allowed object is
     *     {@link EConnections }
     *     
     */
    public void setConnections(EConnections value) {
        this.connections = value;
    }

    /**
     * Gets the value of the crossSections property.
     * 
     * @return
     *     possible object is
     *     {@link ECrossSections }
     *     
     */
    public ECrossSections getCrossSections() {
        return crossSections;
    }

    /**
     * Sets the value of the crossSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECrossSections }
     *     
     */
    public void setCrossSections(ECrossSections value) {
        this.crossSections = value;
    }

    /**
     * Gets the value of the borders property.
     * 
     * @return
     *     possible object is
     *     {@link EBorder }
     *     
     */
    public EBorder getBorders() {
        return borders;
    }

    /**
     * Sets the value of the borders property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBorder }
     *     
     */
    public void setBorders(EBorder value) {
        this.borders = value;
    }

}