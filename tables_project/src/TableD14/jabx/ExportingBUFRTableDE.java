//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.12 at 04:46:08 PM EDT 
//


package TableD14.jabx;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Category" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CategoryOfSequences" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FXY1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ElementName1" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ElementName1_sub" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FXY2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ElementName2" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Notes" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="536870910"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "no",
    "category",
    "categoryOfSequences",
    "fxy1",
    "elementName1",
    "elementName1Sub",
    "fxy2",
    "elementName2",
    "status",
    "notes"
})
@XmlRootElement(name = "Exporting_BUFRTableD_E")
public class ExportingBUFRTableDE {

    @XmlElement(name = "No")
    protected Integer no;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "CategoryOfSequences")
    protected String categoryOfSequences;
    @XmlElement(name = "FXY1")
    protected String fxy1;
    @XmlElement(name = "ElementName1")
    protected String elementName1;
    @XmlElement(name = "ElementName1_sub")
    protected String elementName1Sub;
    @XmlElement(name = "FXY2")
    protected String fxy2;
    @XmlElement(name = "ElementName2")
    protected String elementName2;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Notes")
    protected String notes;

    /**
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo(Integer value) {
        this.no = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the categoryOfSequences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategoryOfSequences() {
        return categoryOfSequences;
    }

    /**
     * Sets the value of the categoryOfSequences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategoryOfSequences(String value) {
        this.categoryOfSequences = value;
    }

    /**
     * Gets the value of the fxy1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXY1() {
        return fxy1;
    }

    /**
     * Sets the value of the fxy1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXY1(String value) {
        this.fxy1 = value;
    }

    /**
     * Gets the value of the elementName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName1() {
        return elementName1;
    }

    /**
     * Sets the value of the elementName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName1(String value) {
        this.elementName1 = value;
    }

    /**
     * Gets the value of the elementName1Sub property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName1Sub() {
        return elementName1Sub;
    }

    /**
     * Sets the value of the elementName1Sub property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName1Sub(String value) {
        this.elementName1Sub = value;
    }

    /**
     * Gets the value of the fxy2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFXY2() {
        return fxy2;
    }

    /**
     * Sets the value of the fxy2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFXY2(String value) {
        this.fxy2 = value;
    }

    /**
     * Gets the value of the elementName2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getElementName2() {
        return elementName2;
    }

    /**
     * Sets the value of the elementName2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setElementName2(String value) {
        this.elementName2 = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

}