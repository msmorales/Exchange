package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndinvTmp {

	@JsonProperty("PROCESS_INSTANCE")
	@NotNull(message = "processInstance no puede ser nulo")
	private String processInstance;

	@JsonProperty("VENDOR_ID")
	@NotNull(message = "vendorId no puede ser nulo")
	private String vendorId;

	@JsonProperty("EFFDT")
	@NotNull(message = "effdt no puede ser nulo")
	private String effdt;

	@JsonProperty("EFF_STATUS")
	@NotNull(message = "effStatus no puede ser nulo")
	private String effStatus;

	@JsonProperty("DUP_INVOICE_IND")
	@NotNull(message = "dupInvoiceInd no puede ser nulo")
	private String dupInvoiceInd;

	@JsonProperty("DUP_INVOICE_ACTION")
	@NotNull(message = "dupInvoiceAction no puede ser nulo")
	private String dupInvoiceAction;

	@JsonProperty("DUP_INV_NUM_FLG")
	@NotNull(message = "dupInvNumFlg no puede ser nulo")
	private String dupInvNumFlg;

	@JsonProperty("DUP_INV_VENDOR_NUM")
	@NotNull(message = "dupInvVendorNum no puede ser nulo")
	private String dupInvVendorNum;

	@JsonProperty("DUP_INV_GROSS_AMT")
	@NotNull(message = "dupInvGrossAmt no puede ser nulo")
	private String dupInvGrossAmt;

	@JsonProperty("DUP_INV_DT")
	@NotNull(message = "dupInvDt no puede ser nulo")
	private String dupInvDt;

	@JsonProperty("DUP_INV_BUS_UNIT")
	@NotNull(message = "dupInvBusUnit no puede ser nulo")
	private String dupInvBusUnit;

	@JsonProperty("DUP_INV_COMB_CODE")
	@NotNull(message = "dupInvCombCode no puede ser nulo")
	private String dupInvCombCode;

	public String getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(String processInstance) {
		this.processInstance = processInstance;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getEffdt() {
		return effdt;
	}

	public void setEffdt(String effdt) {
		this.effdt = effdt;
	}

	public String getEffStatus() {
		return effStatus;
	}

	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}

	public String getDupInvoiceInd() {
		return dupInvoiceInd;
	}

	public void setDupInvoiceInd(String dupInvoiceInd) {
		this.dupInvoiceInd = dupInvoiceInd;
	}

	public String getDupInvoiceAction() {
		return dupInvoiceAction;
	}

	public void setDupInvoiceAction(String dupInvoiceAction) {
		this.dupInvoiceAction = dupInvoiceAction;
	}

	public String getDupInvNumFlg() {
		return dupInvNumFlg;
	}

	public void setDupInvNumFlg(String dupInvNumFlg) {
		this.dupInvNumFlg = dupInvNumFlg;
	}

	public String getDupInvVendorNum() {
		return dupInvVendorNum;
	}

	public void setDupInvVendorNum(String dupInvVendorNum) {
		this.dupInvVendorNum = dupInvVendorNum;
	}

	public String getDupInvGrossAmt() {
		return dupInvGrossAmt;
	}

	public void setDupInvGrossAmt(String dupInvGrossAmt) {
		this.dupInvGrossAmt = dupInvGrossAmt;
	}

	public String getDupInvDt() {
		return dupInvDt;
	}

	public void setDupInvDt(String dupInvDt) {
		this.dupInvDt = dupInvDt;
	}

	public String getDupInvBusUnit() {
		return dupInvBusUnit;
	}

	public void setDupInvBusUnit(String dupInvBusUnit) {
		this.dupInvBusUnit = dupInvBusUnit;
	}

	public String getDupInvCombCode() {
		return dupInvCombCode;
	}

	public void setDupInvCombCode(String dupInvCombCode) {
		this.dupInvCombCode = dupInvCombCode;
	}

	
}
