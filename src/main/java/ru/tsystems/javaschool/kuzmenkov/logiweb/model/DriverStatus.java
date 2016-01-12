
package ru.tsystems.javaschool.kuzmenkov.logiweb.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for driverStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="driverStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FREE"/>
 *     &lt;enumeration value="REST_IN_SHIFT"/>
 *     &lt;enumeration value="DRIVING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "driverStatus")
@XmlEnum
public enum DriverStatus {

    FREE,
    REST_IN_SHIFT,
    DRIVING
}
