
package ru.tsystems.javaschool.kuzmenkov.logiweb.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wayPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wayPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wayPointStatus" type="{http://ws.logiweb.kuzmenkov.javaschool.tsystems.ru/}wayPointStatus" minOccurs="0"/>
 *         &lt;element name="freight" type="{http://ws.logiweb.kuzmenkov.javaschool.tsystems.ru/}freight" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wayPoint", propOrder = {
    "wayPointStatus",
    "freight"
})
public class WayPoint {

    @XmlSchemaType(name = "string")
    protected WayPointStatus wayPointStatus;
    protected Freight freight;

    /**
     * Gets the value of the wayPointStatus property.
     * 
     * @return
     *     possible object is
     *     {@link WayPointStatus }
     *     
     */
    public WayPointStatus getWayPointStatus() {
        return wayPointStatus;
    }

    /**
     * Sets the value of the wayPointStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link WayPointStatus }
     *     
     */
    public void setWayPointStatus(WayPointStatus value) {
        this.wayPointStatus = value;
    }

    /**
     * Gets the value of the freight property.
     * 
     * @return
     *     possible object is
     *     {@link Freight }
     *     
     */
    public Freight getFreight() {
        return freight;
    }

    /**
     * Sets the value of the freight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Freight }
     *     
     */
    public void setFreight(Freight value) {
        this.freight = value;
    }

}
