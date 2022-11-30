
package com.amx.co.schema.mobile.common.aplicationintegration.comunes.v1;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para SeverityType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SeverityType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FATAL"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="INFO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SeverityType")
@XmlEnum
public enum SeverityType {

    FATAL,
    ERROR,
    INFO;

    public String value() {
        return name();
    }

    public static SeverityType fromValue(String v) {
        return valueOf(v);
    }

}
