//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.06 at 11:34:29 AM CET 
//


package org.railml.schemas._2009;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 				table of values vs. arbitrary x-variable
 * 			
 * 
 * <p>Java class for tValueTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tValueTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="columnHeader" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="zValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valueLine" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="values" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="yValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="xValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="xValueName" use="required" type="{http://www.railml.org/schemas/2009}tElementDescription" />
 *       &lt;attribute name="xValueUnit" use="required" type="{http://www.railml.org/schemas/2009}tUnitName" />
 *       &lt;attribute name="yValueName" use="required" type="{http://www.railml.org/schemas/2009}tElementDescription" />
 *       &lt;attribute name="yValueUnit" use="required" type="{http://www.railml.org/schemas/2009}tUnitName" />
 *       &lt;attribute name="zValueName" type="{http://www.railml.org/schemas/2009}tElementDescription" />
 *       &lt;attribute name="zValueUnit" type="{http://www.railml.org/schemas/2009}tUnitName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tValueTable", propOrder = {
    "columnHeader",
    "valueLine"
})
@XmlSeeAlso({
    org.railml.schemas._2009.EPulsePattern.ValueTable.class,
    org.railml.schemas._2009.TCurve.ValueTable.class
})
public class TValueTable {

    protected List<TValueTable.ColumnHeader> columnHeader;
    @XmlElement(required = true)
    protected List<TValueTable.ValueLine> valueLine;
    @XmlAttribute(name = "xValueName", required = true)
    protected String xValueName;
    @XmlAttribute(name = "xValueUnit", required = true)
    protected String xValueUnit;
    @XmlAttribute(name = "yValueName", required = true)
    protected String yValueName;
    @XmlAttribute(name = "yValueUnit", required = true)
    protected String yValueUnit;
    @XmlAttribute(name = "zValueName")
    protected String zValueName;
    @XmlAttribute(name = "zValueUnit")
    protected String zValueUnit;

    /**
     * Gets the value of the columnHeader property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnHeader property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnHeader().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TValueTable.ColumnHeader }
     * 
     * 
     */
    public List<TValueTable.ColumnHeader> getColumnHeader() {
        if (columnHeader == null) {
            columnHeader = new ArrayList<TValueTable.ColumnHeader>();
        }
        return this.columnHeader;
    }

    /**
     * Gets the value of the valueLine property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valueLine property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValueLine().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TValueTable.ValueLine }
     * 
     * 
     */
    public List<TValueTable.ValueLine> getValueLine() {
        if (valueLine == null) {
            valueLine = new ArrayList<TValueTable.ValueLine>();
        }
        return this.valueLine;
    }

    /**
     * Gets the value of the xValueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXValueName() {
        return xValueName;
    }

    /**
     * Sets the value of the xValueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXValueName(String value) {
        this.xValueName = value;
    }

    /**
     * Gets the value of the xValueUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXValueUnit() {
        return xValueUnit;
    }

    /**
     * Sets the value of the xValueUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXValueUnit(String value) {
        this.xValueUnit = value;
    }

    /**
     * Gets the value of the yValueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYValueName() {
        return yValueName;
    }

    /**
     * Sets the value of the yValueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYValueName(String value) {
        this.yValueName = value;
    }

    /**
     * Gets the value of the yValueUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYValueUnit() {
        return yValueUnit;
    }

    /**
     * Sets the value of the yValueUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYValueUnit(String value) {
        this.yValueUnit = value;
    }

    /**
     * Gets the value of the zValueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZValueName() {
        return zValueName;
    }

    /**
     * Sets the value of the zValueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZValueName(String value) {
        this.zValueName = value;
    }

    /**
     * Gets the value of the zValueUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZValueUnit() {
        return zValueUnit;
    }

    /**
     * Sets the value of the zValueUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZValueUnit(String value) {
        this.zValueUnit = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="zValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ColumnHeader {

        @XmlAttribute(name = "zValue", required = true)
        protected BigDecimal zValue;

        /**
         * Gets the value of the zValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getZValue() {
            return zValue;
        }

        /**
         * Sets the value of the zValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setZValue(BigDecimal value) {
            this.zValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="values" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="yValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="xValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "values"
    })
    public static class ValueLine {

        @XmlElement(required = true)
        protected List<TValueTable.ValueLine.Values> values;
        @XmlAttribute(name = "xValue", required = true)
        protected BigDecimal xValue;

        /**
         * Gets the value of the values property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the values property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValues().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TValueTable.ValueLine.Values }
         * 
         * 
         */
        public List<TValueTable.ValueLine.Values> getValues() {
            if (values == null) {
                values = new ArrayList<TValueTable.ValueLine.Values>();
            }
            return this.values;
        }

        /**
         * Gets the value of the xValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getXValue() {
            return xValue;
        }

        /**
         * Sets the value of the xValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setXValue(BigDecimal value) {
            this.xValue = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="yValue" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Values {

            @XmlAttribute(name = "yValue", required = true)
            protected BigDecimal yValue;

            /**
             * Gets the value of the yValue property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getYValue() {
                return yValue;
            }

            /**
             * Sets the value of the yValue property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setYValue(BigDecimal value) {
                this.yValue = value;
            }

        }

    }

}