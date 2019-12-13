package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndadsTmp {

	@JsonProperty("PROCESS_INSTANCE")
	@NotNull(message = "processInstance no puede ser nulo")
	private String processInstance;

	@JsonProperty("SETID")
	@NotNull(message = "setid no puede ser nulo")
	private String setid;

	@JsonProperty("VENDOR_ID")
	@NotNull(message = "vendorId no puede ser nulo")
	private String vendorId;

	@JsonProperty("ADDRESS_SEQ_NUM")
	@NotNull(message = "addressSeqNum no puede ser nulo")
	private String addressSeqNum;

	@JsonProperty("DESCR")
	@NotNull(message = "descr no puede ser nulo")
	private String descr;

	@JsonProperty("VNDR_ADDRESS_TYPE")
	@NotNull(message = "vndrAddressType no puede ser nulo")
	private String vndrAddressType;

	@JsonProperty("CCR_ADDR_TYPE")
	@NotNull(message = "ccrAddrType no puede ser nulo")
	private String ccrAddrType;

	// Listo!
	@JsonProperty("FF_VNRADD_TMP")
	@NotNull(message = " no puede ser vacio")
	@Valid
	private FfVnraddTmp ffVnraddTmp;

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

	public String getAddressSeqNum() {
		return addressSeqNum;
	}

	public void setAddressSeqNum(String addressSeqNum) {
		this.addressSeqNum = addressSeqNum;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getVndrAddressType() {
		return vndrAddressType;
	}

	public void setVndrAddressType(String vndrAddressType) {
		this.vndrAddressType = vndrAddressType;
	}

	public String getCcrAddrType() {
		return ccrAddrType;
	}

	public void setCcrAddrType(String ccrAddrType) {
		this.ccrAddrType = ccrAddrType;
	}

	public FfVnraddTmp getFfVnraddTmp() {
		return ffVnraddTmp;
	}

	public void setFfVnraddTmp(FfVnraddTmp ffVnraddTmp) {
		this.ffVnraddTmp = ffVnraddTmp;
	}
	
	
}
