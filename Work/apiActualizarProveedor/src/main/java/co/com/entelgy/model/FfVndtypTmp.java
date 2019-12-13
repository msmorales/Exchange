package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndtypTmp {

	@JsonProperty("PROCESS_INSTANCE")
	@NotNull(message = "processInstance no puede ser nulo")
	private String processInstance;

	@JsonProperty("SETID")
	@NotNull(message = "setid no puede ser nulo")
	private String setid;

	@JsonProperty("VENDOR_ID")
	@NotNull(message = "vendorId no puede ser nulo")
	private String vendorId;

	@JsonProperty("VNDR_LOC")
	@NotNull(message = "vndrLoc no puede ser nulo")
	private String vndrLoc;

	@JsonProperty("EFFDT")
	@NotNull(message = "effdt no puede ser nulo")
	private String effdt;

	@JsonProperty("VENDOR_TYPE")
	@NotNull(message = "vendorType no puede ser nulo")
	private String vendorType;

	@JsonProperty("DESCRSHORT")
	@NotNull(message = "descrshort no puede ser nulo")
	private String descrshort;

	@JsonProperty("VNDR_SERVICE_TYPE")
	@NotNull(message = "vndrServiceType no puede ser nulo")
	private String vndrServiceType;

	@JsonProperty("PRIMARY_SW")
	@NotNull(message = "primarySw no puede ser nulo")
	private String primarySw;

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

	public String getVndrLoc() {
		return vndrLoc;
	}

	public void setVndrLoc(String vndrLoc) {
		this.vndrLoc = vndrLoc;
	}

	public String getEffdt() {
		return effdt;
	}

	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}

	public String getVendorType() {
		return vendorType;
	}

	public void setVendorType(String vendorType) {
		this.vendorType = vendorType;
	}

	public String getDescrshort() {
		return descrshort;
	}

	public void setDescrshort(String descrshort) {
		this.descrshort = descrshort;
	}

	public String getVndrServiceType() {
		return vndrServiceType;
	}

	public void setVndrServiceType(String vndrServiceType) {
		this.vndrServiceType = vndrServiceType;
	}

	public String getPrimarySw() {
		return primarySw;
	}

	public void setPrimarySw(String primarySw) {
		this.primarySw = primarySw;
	}
	
	

}
