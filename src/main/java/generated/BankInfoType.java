//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.05 at 04:02:27 PM MSK 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ���� ������� �������� �������������� ���������� ��� ������������� �����.
 * 
 * <p>Java class for BankInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BranchId" type="{}BranchId_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="BranchName" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="AgencyId" type="{}AgencyId_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="RegionId" type="{}RegionId_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="RbTbBrchId" type="{}RbTbBrchType" minOccurs="0" form="qualified"/>
 *         &lt;element name="RbBrchId" type="{}RbBrchType" minOccurs="0" form="qualified"/>
 *         &lt;element name="BranchIndex" type="{}C" minOccurs="0" form="qualified"/>
 *         &lt;element name="AgencyIdOld" type="{}AgencyId_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="BranchAddress" type="{}C50_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="BranchFullName" type="{}C" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankInfo_Type", propOrder = {
    "branchId",
    "branchName",
    "agencyId",
    "regionId",
    "rbTbBrchId",
    "rbBrchId",
    "branchIndex",
    "agencyIdOld",
    "branchAddress",
    "branchFullName"
})
public class BankInfoType {

    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "BranchName")
    protected String branchName;
    @XmlElement(name = "AgencyId")
    protected String agencyId;
    @XmlElement(name = "RegionId")
    protected String regionId;
    @XmlElement(name = "RbTbBrchId")
    protected String rbTbBrchId;
    @XmlElement(name = "RbBrchId")
    protected String rbBrchId;
    @XmlElement(name = "BranchIndex")
    protected String branchIndex;
    @XmlElement(name = "AgencyIdOld")
    protected String agencyIdOld;
    @XmlElement(name = "BranchAddress")
    protected String branchAddress;
    @XmlElement(name = "BranchFullName")
    protected String branchFullName;

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the agencyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyId() {
        return agencyId;
    }

    /**
     * Sets the value of the agencyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyId(String value) {
        this.agencyId = value;
    }

    /**
     * Gets the value of the regionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * Sets the value of the regionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionId(String value) {
        this.regionId = value;
    }

    /**
     * Gets the value of the rbTbBrchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbTbBrchId() {
        return rbTbBrchId;
    }

    /**
     * Sets the value of the rbTbBrchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbTbBrchId(String value) {
        this.rbTbBrchId = value;
    }

    /**
     * Gets the value of the rbBrchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRbBrchId() {
        return rbBrchId;
    }

    /**
     * Sets the value of the rbBrchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRbBrchId(String value) {
        this.rbBrchId = value;
    }

    /**
     * Gets the value of the branchIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchIndex() {
        return branchIndex;
    }

    /**
     * Sets the value of the branchIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchIndex(String value) {
        this.branchIndex = value;
    }

    /**
     * Gets the value of the agencyIdOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyIdOld() {
        return agencyIdOld;
    }

    /**
     * Sets the value of the agencyIdOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyIdOld(String value) {
        this.agencyIdOld = value;
    }

    /**
     * Gets the value of the branchAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchAddress() {
        return branchAddress;
    }

    /**
     * Sets the value of the branchAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchAddress(String value) {
        this.branchAddress = value;
    }

    /**
     * Gets the value of the branchFullName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchFullName() {
        return branchFullName;
    }

    /**
     * Sets the value of the branchFullName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchFullName(String value) {
        this.branchFullName = value;
    }

}
