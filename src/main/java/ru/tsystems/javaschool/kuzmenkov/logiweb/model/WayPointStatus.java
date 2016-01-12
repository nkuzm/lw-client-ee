
package ru.tsystems.javaschool.kuzmenkov.logiweb.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wayPointStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="wayPointStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PICK_UP"/>
 *     &lt;enumeration value="DELIVER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "wayPointStatus")
@XmlEnum
public enum WayPointStatus {

    PICK_UP,
    DELIVER
}
