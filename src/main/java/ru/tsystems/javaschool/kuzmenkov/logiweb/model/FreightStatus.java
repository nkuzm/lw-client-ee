
package ru.tsystems.javaschool.kuzmenkov.logiweb.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for freightStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="freightStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WAITING_FOR_PICK_UP"/>
 *     &lt;enumeration value="PICKED_UP"/>
 *     &lt;enumeration value="DELIVERED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "freightStatus")
@XmlEnum
public enum FreightStatus {

    WAITING_FOR_PICK_UP,
    PICKED_UP,
    DELIVERED
}
