//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.05 at 10:42:23 AM MSK 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *     &lt;restriction base="{}NotifySMITZNOStatusRsType">
 *       &lt;sequence>
 *         &lt;element name="Status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{}Status_Type">
 *                 &lt;sequence>
 *                   &lt;element name="StatusCode" type="{}StatusCode_Type"/>
 *                   &lt;element name="ServerStatusCode" type="{}ServerStatusCode_Type" minOccurs="0"/>
 *                   &lt;element name="Severity" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{}C">
 *                         &lt;maxLength value="80"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="StatusDesc" type="{}StatusDesc_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ZNO">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{}ZNOInfo_Type">
 *                 &lt;sequence>
 *                   &lt;element name="Number" type="{}C15_Type" minOccurs="0" form="qualified"/>
 *                   &lt;element name="SourceID" type="{}C15_Type" minOccurs="0"/>
 *                   &lt;element name="SbDRUGId" type="{}C40_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
@XmlType(name = "")
@XmlRootElement(name = "NotifySMITZNOStatusRs")
public class NotifySMITZNOStatusRs
    extends NotifySMITZNOStatusRsType
{


}
