
package ru.tsystems.javaschool.kuzmenkov.logiweb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freight complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="freight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="freightId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="weight" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="freightStatus" type="{http://ws.logiweb.kuzmenkov.javaschool.tsystems.ru/}freightStatus" minOccurs="0"/>
 *         &lt;element name="cityFromFK" type="{http://ws.logiweb.kuzmenkov.javaschool.tsystems.ru/}city" minOccurs="0"/>
 *         &lt;element name="cityToFK" type="{http://ws.logiweb.kuzmenkov.javaschool.tsystems.ru/}city" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "freight", propOrder = {
    "freightId",
    "description",
    "weight",
    "freightStatus",
    "cityFromFK",
    "cityToFK"
})
public class Freight {

    protected Integer freightId;
    protected String description;
    protected Float weight;
    @XmlSchemaType(name = "string")
    protected FreightStatus freightStatus;
    protected City cityFromFK;
    protected City cityToFK;

    /**
     * Gets the value of the freightId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFreightId() {
        return freightId;
    }

    /**
     * Sets the value of the freightId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFreightId(Integer value) {
        this.freightId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWeight(Float value) {
        this.weight = value;
    }

    /**
     * Gets the value of the freightStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FreightStatus }
     *     
     */
    public FreightStatus getFreightStatus() {
        return freightStatus;
    }

    /**
     * Sets the value of the freightStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightStatus }
     *     
     */
    public void setFreightStatus(FreightStatus value) {
        this.freightStatus = value;
    }

    /**
     * Gets the value of the cityFromFK property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCityFromFK() {
        return cityFromFK;
    }

    /**
     * Sets the value of the cityFromFK property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCityFromFK(City value) {
        this.cityFromFK = value;
    }

    /**
     * Gets the value of the cityToFK property.
     * 
     * @return
     *     possible object is
     *     {@link City }
     *     
     */
    public City getCityToFK() {
        return cityToFK;
    }

    /**
     * Sets the value of the cityToFK property.
     * 
     * @param value
     *     allowed object is
     *     {@link City }
     *     
     */
    public void setCityToFK(City value) {
        this.cityToFK = value;
    }

}
