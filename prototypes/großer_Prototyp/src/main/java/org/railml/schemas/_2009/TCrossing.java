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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tCrossing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tCrossing">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.railml.org/schemas/2009}tCommonSwitchAndCrossingData">
 *       &lt;attribute name="type" type="{http://www.railml.org/schemas/2009}tCrossingType" />
 *       &lt;anyAttribute namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tCrossing")
@XmlSeeAlso({
    ECrossing.class
})
public class TCrossing
    extends TCommonSwitchAndCrossingData
{

    @XmlAttribute(name = "type")
    protected TCrossingType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link TCrossingType }
     *     
     */
    public TCrossingType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link TCrossingType }
     *     
     */
    public void setType(TCrossingType value) {
        this.type = value;
    }

}
