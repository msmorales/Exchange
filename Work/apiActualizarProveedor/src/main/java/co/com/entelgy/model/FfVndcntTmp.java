package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndcntTmp {

	@JsonProperty("PROCESS_INSTANCE")
	@NotNull(message = "processInstance no puede ser nulo")
	private String processInstance;

	@JsonProperty("SETID")
	@NotNull(message = "setid no puede ser nulo")
	private String setid;

	@JsonProperty("VENDOR_ID")
	@NotNull(message = "vendorId no puede ser nulo")
	private String vendorId;

	@JsonProperty("CNTCT_SEQ_NUM")
	@NotNull(message = "cntctSeqNum no puede ser nulo")
	private String cntctSeqNum;

	@JsonProperty("EFFDT")
	@NotNull(message = "effdt no puede ser nulo")
	private String effdt;

	@JsonProperty("ADDRESS_SEQ_NUM")
	@NotNull(message = "addressSeqNum no puede ser nulo")
	private String addressSeqNum;

	@JsonProperty("EFF_STATUS")
	@NotNull(message = "effStatus no puede ser nulo")
	private String effStatus;

	@JsonProperty("CONTACT_NAME")
	@NotNull(message = "contactName no puede ser nulo")
	private String contactName;

	@JsonProperty("CONTACT_TYPE")
	@NotNull(message = "contactType no puede ser nulo")
	private String contactType;

	@JsonProperty("CONTACT_TITLE")
	@NotNull(message = "contactTitle no puede ser nulo")
	private String contactTitle;

	@JsonProperty("PREFERRED_LANGUAGE")
	@NotNull(message = "preferredLanguage no puede ser nulo")
	private String preferredLanguage;

	@JsonProperty("URL")
	@NotNull(message = "url no puede ser nulo")
	private String url;

	@JsonProperty("DESCR")
	@NotNull(message = "descr no puede ser nulo")
	private String descr;

	@JsonProperty("EMAILID")
	@NotNull(message = "emailid no puede ser nulo")
	private String emailid;

	@JsonProperty("OPRID_EXT")
	@NotNull(message = "opridExt no puede ser nulo")
	private String opridExt;

	@JsonProperty("EXT_VIEW_ACCESS")
	@NotNull(message = "extViewAccess no puede ser nulo")
	private String extViewAccess;

	@JsonProperty("EXT_PRIMARY_OWNER")
	@NotNull(message = "extPrimaryOwner no puede ser nulo")
	private String extPrimaryOwner;

	@JsonProperty("CS_SIGNER_FLG")
	@NotNull(message = "csSignerFlg no puede ser nulo")
	private String csSignerFlg;

	@JsonProperty("CS_SIGN_NBR")
	@NotNull(message = "csSignNbr no puede ser nulo")
	private String csSignNbr;

	@JsonProperty("CS_SIGN_VISIBLE")
	@NotNull(message = "csSignVisible no puede ser nulo")
	private String csSignVisible;
	
	// Listo!
	@JsonProperty("FF_CNTPHN_TMP")
	@NotNull(message = "ffCntphnTmp no puede ser vacio")
	@Valid
	private FfCntphnTmp ffCntphnTmp;

	public String getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(String processInstance) {
		this.processInstance = processInstance;
	}

	public String getSetid() {
		return setid;
	}

	public void setSetid(String setid) {
		this.setid = setid;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getCntctSeqNum() {
		return cntctSeqNum;
	}

	public void setCntctSeqNum(String cntctSeqNum) {
		this.cntctSeqNum = cntctSeqNum;
	}

	public String getEffdt() {
		return effdt;
	}

	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}

	public String getAddressSeqNum() {
		return addressSeqNum;
	}

	public void setAddressSeqNum(String addressSeqNum) {
		this.addressSeqNum = addressSeqNum;
	}

	public String getEffStatus() {
		return effStatus;
	}

	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactType() {
		return contactType;
	}

	public void setContactType(String contactType) {
		this.contactType = contactType;
	}

	public String getContactTitle() {
		return contactTitle;
	}

	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getOpridExt() {
		return opridExt;
	}

	public void setOpridExt(String opridExt) {
		this.opridExt = opridExt;
	}

	public String getExtViewAccess() {
		return extViewAccess;
	}

	public void setExtViewAccess(String extViewAccess) {
		this.extViewAccess = extViewAccess;
	}

	public String getExtPrimaryOwner() {
		return extPrimaryOwner;
	}

	public void setExtPrimaryOwner(String extPrimaryOwner) {
		this.extPrimaryOwner = extPrimaryOwner;
	}

	public String getCsSignerFlg() {
		return csSignerFlg;
	}

	public void setCsSignerFlg(String csSignerFlg) {
		this.csSignerFlg = csSignerFlg;
	}

	public String getCsSignNbr() {
		return csSignNbr;
	}

	public void setCsSignNbr(String csSignNbr) {
		this.csSignNbr = csSignNbr;
	}

	public String getCsSignVisible() {
		return csSignVisible;
	}

	public void setCsSignVisible(String csSignVisible) {
		this.csSignVisible = csSignVisible;
	}

	public FfCntphnTmp getFfCntphnTmp() {
		return ffCntphnTmp;
	}

	public void setFfCntphnTmp(FfCntphnTmp ffCntphnTmp) {
		this.ffCntphnTmp = ffCntphnTmp;
	}
	
	
	
	

}
