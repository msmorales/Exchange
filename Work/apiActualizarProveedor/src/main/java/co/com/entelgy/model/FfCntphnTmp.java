package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfCntphnTmp {

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

	@JsonProperty("PHONE_TYPE")
	@NotNull(message = "phoneType no puede ser nulo")
	private String phoneType;

	@JsonProperty("COUNTRY_CODE")
	@NotNull(message = "countryCode no puede ser nulo")
	private String countryCode;

	@JsonProperty("PHONE")
	@NotNull(message = "phone no puede ser nulo")
	private String phone;

	@JsonProperty("EXTENSION")
	@NotNull(message = "extension no puede ser nulo")
	private String extension;

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

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

}
