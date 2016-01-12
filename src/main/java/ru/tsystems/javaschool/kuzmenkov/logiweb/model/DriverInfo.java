
package ru.tsystems.javaschool.kuzmenkov.logiweb.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for driverInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="driverInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="personalNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="workingHoursInThisMonth" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="currentDriverStatus" type="{http://ws.logiweb.kuzmenkov.javaschool.tsystems.ru/}driverStatus" minOccurs="0"/>
 *         &lt;element name="orderWayPoints" type="{http://ws.logiweb.kuzmenkov.javaschool.tsystems.ru/}wayPoint" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="orderStatus" type="{http://ws.logiweb.kuzmenkov.javaschool.tsystems.ru/}orderStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "driverInfo", propOrder = {
    "personalNumber",
    "firstName",
    "lastName",
    "workingHoursInThisMonth",
    "currentDriverStatus",
    "orderWayPoints",
    "orderStatus"
})
public class DriverInfo {

    protected Integer personalNumber;
    protected String firstName;
    protected String lastName;
    protected Float workingHoursInThisMonth;
    @XmlSchemaType(name = "string")
    protected DriverStatus currentDriverStatus;
    @XmlElement(nillable = true)
    protected List<WayPoint> orderWayPoints;
    @XmlSchemaType(name = "string")
    protected OrderStatus orderStatus;

    /**
     * Gets the value of the personalNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonalNumber() {
        return personalNumber;
    }

    /**
     * Sets the value of the personalNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonalNumber(Integer value) {
        this.personalNumber = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the workingHoursInThisMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWorkingHoursInThisMonth() {
        return workingHoursInThisMonth;
    }

    /**
     * Sets the value of the workingHoursInThisMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWorkingHoursInThisMonth(Float value) {
        this.workingHoursInThisMonth = value;
    }

    /**
     * Gets the value of the currentDriverStatus property.
     * 
     * @return
     *     possible object is
     *     {@link DriverStatus }
     *     
     */
    public DriverStatus getCurrentDriverStatus() {
        return currentDriverStatus;
    }

    /**
     * Sets the value of the currentDriverStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriverStatus }
     *     
     */
    public void setCurrentDriverStatus(DriverStatus value) {
        this.currentDriverStatus = value;
    }

    /**
     * Gets the value of the orderWayPoints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderWayPoints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderWayPoints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WayPoint }
     * 
     * 
     */
    public List<WayPoint> getOrderWayPoints() {
        if (orderWayPoints == null) {
            orderWayPoints = new ArrayList<WayPoint>();
        }
        return this.orderWayPoints;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatus }
     *     
     */
    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatus }
     *     
     */
    public void setOrderStatus(OrderStatus value) {
        this.orderStatus = value;
    }

}
