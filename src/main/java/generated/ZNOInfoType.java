//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.06.05 at 10:42:23 AM MSK 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ���
 * 
 * <p>Java class for ZNOInfo_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ZNOInfo_Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{}C15_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="SourceID" type="{}C15_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="Title" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="Description" type="{}C4000_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="TemplateID" type="{}EsoTemplateId_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="Status" type="{}C50_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="AssigneeName" type="{}C1024" minOccurs="0" form="qualified"/>
 *         &lt;element name="AssignmentName" type="{}C1024" minOccurs="0" form="qualified"/>
 *         &lt;element name="NextBreach" type="{}DateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="ActualFinish" type="{}DateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="CloseTime" type="{}DateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="Resolution" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="ResolutionCode" type="{}C50_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="AttachmentStatus" type="{}Boolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="PriorityCode" type="{}C32_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="ContactName" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="CallbackContact" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="Category" type="{}C100_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbK2" type="{}Boolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbAIB" type="{}Boolean" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbDRUGId" type="{}C40_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbMqrqid" type="{}C100_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbSourceName" type="{}C100_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="IncidentID" type="{}C50_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbForecastMoveCause" type="{}C100_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbLogin" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbPassword" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="PlanFinish" type="{}DateTime" minOccurs="0" form="qualified"/>
 *         &lt;element name="AffectedItem" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="LogicalName" type="{}C255_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="AdditionalFields" type="{}AdditionalZNOFields_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="ECM" type="{}ECM_Type" maxOccurs="unbounded" minOccurs="0" form="qualified"/>
 *         &lt;element name="Channel" type="{}C50_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="DynamicFields" type="{}DynamicFields_Type" minOccurs="0" form="qualified"/>
 *         &lt;element name="SbDynamicFields" type="{}SbDynamicFields_Type" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ZNOInfo_Type", propOrder = {
    "number",
    "sourceID",
    "title",
    "description",
    "templateID",
    "status",
    "assigneeName",
    "assignmentName",
    "nextBreach",
    "actualFinish",
    "closeTime",
    "resolution",
    "resolutionCode",
    "attachmentStatus",
    "priorityCode",
    "contactName",
    "callbackContact",
    "category",
    "sbK2",
    "sbAIB",
    "sbDRUGId",
    "sbMqrqid",
    "sbSourceName",
    "incidentID",
    "sbForecastMoveCause",
    "sbLogin",
    "sbPassword",
    "planFinish",
    "affectedItem",
    "logicalName",
    "additionalFields",
    "ecm",
    "channel",
    "dynamicFields",
    "sbDynamicFields"
})
public class ZNOInfoType {

    @XmlElement(name = "Number")
    protected String number;
    @XmlElement(name = "SourceID")
    protected String sourceID;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "TemplateID")
    protected Long templateID;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "AssigneeName")
    protected String assigneeName;
    @XmlElement(name = "AssignmentName")
    protected String assignmentName;
    @XmlElement(name = "NextBreach")
    protected String nextBreach;
    @XmlElement(name = "ActualFinish")
    protected String actualFinish;
    @XmlElement(name = "CloseTime")
    protected String closeTime;
    @XmlElement(name = "Resolution")
    protected String resolution;
    @XmlElement(name = "ResolutionCode")
    protected String resolutionCode;
    @XmlElement(name = "AttachmentStatus")
    protected Boolean attachmentStatus;
    @XmlElement(name = "PriorityCode")
    protected String priorityCode;
    @XmlElement(name = "ContactName")
    protected String contactName;
    @XmlElement(name = "CallbackContact")
    protected String callbackContact;
    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "SbK2")
    protected Boolean sbK2;
    @XmlElement(name = "SbAIB")
    protected Boolean sbAIB;
    @XmlElement(name = "SbDRUGId")
    protected String sbDRUGId;
    @XmlElement(name = "SbMqrqid")
    protected String sbMqrqid;
    @XmlElement(name = "SbSourceName")
    protected String sbSourceName;
    @XmlElement(name = "IncidentID")
    protected String incidentID;
    @XmlElement(name = "SbForecastMoveCause")
    protected String sbForecastMoveCause;
    @XmlElement(name = "SbLogin")
    protected String sbLogin;
    @XmlElement(name = "SbPassword")
    protected String sbPassword;
    @XmlElement(name = "PlanFinish")
    protected String planFinish;
    @XmlElement(name = "AffectedItem")
    protected String affectedItem;
    @XmlElement(name = "LogicalName")
    protected String logicalName;
    @XmlElement(name = "AdditionalFields")
    protected AdditionalZNOFieldsType additionalFields;
    @XmlElement(name = "ECM")
    protected List<ECMType> ecm;
    @XmlElement(name = "Channel")
    protected String channel;
    @XmlElement(name = "DynamicFields")
    protected DynamicFieldsType dynamicFields;
    @XmlElement(name = "SbDynamicFields")
    protected SbDynamicFieldsType sbDynamicFields;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the sourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceID() {
        return sourceID;
    }

    /**
     * Sets the value of the sourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceID(String value) {
        this.sourceID = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the templateID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemplateID() {
        return templateID;
    }

    /**
     * Sets the value of the templateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemplateID(Long value) {
        this.templateID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the assigneeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssigneeName() {
        return assigneeName;
    }

    /**
     * Sets the value of the assigneeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssigneeName(String value) {
        this.assigneeName = value;
    }

    /**
     * Gets the value of the assignmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssignmentName() {
        return assignmentName;
    }

    /**
     * Sets the value of the assignmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssignmentName(String value) {
        this.assignmentName = value;
    }

    /**
     * Gets the value of the nextBreach property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNextBreach() {
        return nextBreach;
    }

    /**
     * Sets the value of the nextBreach property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNextBreach(String value) {
        this.nextBreach = value;
    }

    /**
     * Gets the value of the actualFinish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualFinish() {
        return actualFinish;
    }

    /**
     * Sets the value of the actualFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualFinish(String value) {
        this.actualFinish = value;
    }

    /**
     * Gets the value of the closeTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloseTime() {
        return closeTime;
    }

    /**
     * Sets the value of the closeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloseTime(String value) {
        this.closeTime = value;
    }

    /**
     * Gets the value of the resolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Sets the value of the resolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolution(String value) {
        this.resolution = value;
    }

    /**
     * Gets the value of the resolutionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionCode() {
        return resolutionCode;
    }

    /**
     * Sets the value of the resolutionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionCode(String value) {
        this.resolutionCode = value;
    }

    /**
     * Gets the value of the attachmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAttachmentStatus() {
        return attachmentStatus;
    }

    /**
     * Sets the value of the attachmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAttachmentStatus(Boolean value) {
        this.attachmentStatus = value;
    }

    /**
     * Gets the value of the priorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriorityCode() {
        return priorityCode;
    }

    /**
     * Sets the value of the priorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriorityCode(String value) {
        this.priorityCode = value;
    }

    /**
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactName(String value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the callbackContact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallbackContact() {
        return callbackContact;
    }

    /**
     * Sets the value of the callbackContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallbackContact(String value) {
        this.callbackContact = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the sbK2 property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbK2() {
        return sbK2;
    }

    /**
     * Sets the value of the sbK2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSbK2(Boolean value) {
        this.sbK2 = value;
    }

    /**
     * Gets the value of the sbAIB property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbAIB() {
        return sbAIB;
    }

    /**
     * Sets the value of the sbAIB property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSbAIB(Boolean value) {
        this.sbAIB = value;
    }

    /**
     * Gets the value of the sbDRUGId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbDRUGId() {
        return sbDRUGId;
    }

    /**
     * Sets the value of the sbDRUGId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbDRUGId(String value) {
        this.sbDRUGId = value;
    }

    /**
     * Gets the value of the sbMqrqid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbMqrqid() {
        return sbMqrqid;
    }

    /**
     * Sets the value of the sbMqrqid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbMqrqid(String value) {
        this.sbMqrqid = value;
    }

    /**
     * Gets the value of the sbSourceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbSourceName() {
        return sbSourceName;
    }

    /**
     * Sets the value of the sbSourceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbSourceName(String value) {
        this.sbSourceName = value;
    }

    /**
     * Gets the value of the incidentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentID() {
        return incidentID;
    }

    /**
     * Sets the value of the incidentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentID(String value) {
        this.incidentID = value;
    }

    /**
     * Gets the value of the sbForecastMoveCause property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbForecastMoveCause() {
        return sbForecastMoveCause;
    }

    /**
     * Sets the value of the sbForecastMoveCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbForecastMoveCause(String value) {
        this.sbForecastMoveCause = value;
    }

    /**
     * Gets the value of the sbLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbLogin() {
        return sbLogin;
    }

    /**
     * Sets the value of the sbLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbLogin(String value) {
        this.sbLogin = value;
    }

    /**
     * Gets the value of the sbPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbPassword() {
        return sbPassword;
    }

    /**
     * Sets the value of the sbPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbPassword(String value) {
        this.sbPassword = value;
    }

    /**
     * Gets the value of the planFinish property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanFinish() {
        return planFinish;
    }

    /**
     * Sets the value of the planFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanFinish(String value) {
        this.planFinish = value;
    }

    /**
     * Gets the value of the affectedItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedItem() {
        return affectedItem;
    }

    /**
     * Sets the value of the affectedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedItem(String value) {
        this.affectedItem = value;
    }

    /**
     * Gets the value of the logicalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogicalName() {
        return logicalName;
    }

    /**
     * Sets the value of the logicalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogicalName(String value) {
        this.logicalName = value;
    }

    /**
     * Gets the value of the additionalFields property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalZNOFieldsType }
     *     
     */
    public AdditionalZNOFieldsType getAdditionalFields() {
        return additionalFields;
    }

    /**
     * Sets the value of the additionalFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalZNOFieldsType }
     *     
     */
    public void setAdditionalFields(AdditionalZNOFieldsType value) {
        this.additionalFields = value;
    }

    /**
     * Gets the value of the ecm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECM().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECMType }
     * 
     * 
     */
    public List<ECMType> getECM() {
        if (ecm == null) {
            ecm = new ArrayList<ECMType>();
        }
        return this.ecm;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the dynamicFields property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicFieldsType }
     *     
     */
    public DynamicFieldsType getDynamicFields() {
        return dynamicFields;
    }

    /**
     * Sets the value of the dynamicFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicFieldsType }
     *     
     */
    public void setDynamicFields(DynamicFieldsType value) {
        this.dynamicFields = value;
    }

    /**
     * Gets the value of the sbDynamicFields property.
     * 
     * @return
     *     possible object is
     *     {@link SbDynamicFieldsType }
     *     
     */
    public SbDynamicFieldsType getSbDynamicFields() {
        return sbDynamicFields;
    }

    /**
     * Sets the value of the sbDynamicFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link SbDynamicFieldsType }
     *     
     */
    public void setSbDynamicFields(SbDynamicFieldsType value) {
        this.sbDynamicFields = value;
    }

}
