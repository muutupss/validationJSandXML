//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.04 at 07:56:56 PM MSK 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * ��� �������� ������� ������������ ��� (�����)
 * 
 * <p>Java class for NotifySMITZNOStatusRsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotifySMITZNOStatusRsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Header" type="{}RqHeader_Type" minOccurs="0"/>
 *         &lt;element name="Status" type="{}Status_Type"/>
 *         &lt;element name="ZNO" type="{}ZNOInfo_Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotifySMITZNOStatusRsType", propOrder = {
    "header",
    "status",
    "zno"
})
@XmlSeeAlso({
    NotifySMITZNOStatusRs.class
})
public class NotifySMITZNOStatusRsType {

    @XmlElement(name = "Header")
    protected RqHeaderType header;
    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "ZNO", required = true)
    protected ZNOInfoType zno;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link RqHeaderType }
     *     
     */
    public RqHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link RqHeaderType }
     *     
     */
    public void setHeader(RqHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the zno property.
     * 
     * @return
     *     possible object is
     *     {@link ZNOInfoType }
     *     
     */
    public ZNOInfoType getZNO() {
        return zno;
    }

    /**
     * Sets the value of the zno property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZNOInfoType }
     *     
     */
    public void setZNO(ZNOInfoType value) {
        this.zno = value;
    }

}
