package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndcsrTmp {

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

	@JsonProperty("DESCR")
	@NotNull(message = "descr no puede ser nulo")
	private String descr;

	@JsonProperty("CCR_ADDR_TYPE")
	@NotNull(message = "ccrAddrType no puede ser nulo")
	private String ccrAddrType;
	
	// Listo!
	@JsonProperty("FF_VNDCNT_TMP")
	@NotNull(message = "ffVndcntTmp no puede ser vacio")
	@Valid
	private FfVndcntTmp ffVndcntTmp;

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

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getCcrAddrType() {
		return ccrAddrType;
	}

	public void setCcrAddrType(String ccrAddrType) {
		this.ccrAddrType = ccrAddrType;
	}

	public FfVndcntTmp getFfVndcntTmp() {
		return ffVndcntTmp;
	}

	public void setFfVndcntTmp(FfVndcntTmp ffVndcntTmp) {
		this.ffVndcntTmp = ffVndcntTmp;
	}

	
	
}
