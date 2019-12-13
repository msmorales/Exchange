package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfWthjurTmp {

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

	@JsonProperty("WTHD_ENTITY")
	@NotNull(message = "wthdEntity no puede ser nulo")
	private String wthdEntity;

	@JsonProperty("WTHD_TYPE")
	@NotNull(message = "wthdType no puede ser nulo")
	private String wthdType;

	@JsonProperty("WTHD_JUR_CD")
	@NotNull(message = "wthdJurCd no puede ser nulo")
	private String wthdJurCd;

	@JsonProperty("DEFAULT_CLASS")
	@NotNull(message = "defaultClass no puede ser nulo")
	private String defaultClass;

	@JsonProperty("WTHD_IND")
	@NotNull(message = "wthdInd no puede ser nulo")
	private String wthdInd;

	@JsonProperty("WTHD_RULE")
	@NotNull(message = "wthdRule no puede ser nulo")
	private String wthdRule;

	@JsonProperty("HOLD_PAY_IND")
	@NotNull(message = "holdPayInd no puede ser nulo")
	private String holdPayInd;

	@JsonProperty("HOLD_PAY_FLG")
	@NotNull(message = "holdPayFlg no puede ser nulo")
	private String holdPayFlg;

	@JsonProperty("WTHD_FLG")
	@NotNull(message = "wthdFlg no puede ser nulo")
	private String wthdFlg;

	@JsonProperty("DEFAULT_JUR_FLG")
	@NotNull(message = "defaultJurFlg no puede ser nulo")
	private String defaultJurFlg;

	@JsonProperty("VENDOR_CATEGORY")
	@NotNull(message = "vendorCategory no puede ser nulo")
	private String vendorCategory;

	@JsonProperty("WTHD_CONDITION")
	@NotNull(message = "wthdCondition no puede ser nulo")
	private String wthdCondition;

	@JsonProperty("CONDITION_PCT")
	@NotNull(message = "conditionPct no puede ser nulo")
	private String conditionPct;

	@JsonProperty("CONDITION_UNTIL")
	@NotNull(message = "conditionUntil no puede ser nulo")
	private String conditionUntil;

	@JsonProperty("REMIT_WTHD_TO_FLG")
	@NotNull(message = "remitWthdToFlg no puede ser nulo")
	private String remitWthdToFlg;

	@JsonProperty("REMIT_VENDOR")
	@NotNull(message = "remitVendor no puede ser nulo")
	private String remitVendor;

	@JsonProperty("REMIT_LOC")
	@NotNull(message = "remitLoc no puede ser nulo")
	private String remitLoc;

	@JsonProperty("REMIT_ADDR_SEQ_NUM")
	@NotNull(message = "remitAddrSeqNum no puede ser nulo")
	private String remitAddrSeqNum;

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

	public String getWthdEntity() {
		return wthdEntity;
	}

	public void setWthdEntity(String wthdEntity) {
		this.wthdEntity = wthdEntity;
	}

	public String getWthdType() {
		return wthdType;
	}

	public void setWthdType(String wthdType) {
		this.wthdType = wthdType;
	}

	public String getWthdJurCd() {
		return wthdJurCd;
	}

	public void setWthdJurCd(String wthdJurCd) {
		this.wthdJurCd = wthdJurCd;
	}

	public String getDefaultClass() {
		return defaultClass;
	}

	public void setDefaultClass(String defaultClass) {
		this.defaultClass = defaultClass;
	}

	public String getWthdInd() {
		return wthdInd;
	}

	public void setWthdInd(String wthdInd) {
		this.wthdInd = wthdInd;
	}

	public String getWthdRule() {
		return wthdRule;
	}

	public void setWthdRule(String wthdRule) {
		this.wthdRule = wthdRule;
	}

	public String getHoldPayInd() {
		return holdPayInd;
	}

	public void setHoldPayInd(String holdPayInd) {
		this.holdPayInd = holdPayInd;
	}

	public String getHoldPayFlg() {
		return holdPayFlg;
	}

	public void setHoldPayFlg(String holdPayFlg) {
		this.holdPayFlg = holdPayFlg;
	}

	public String getWthdFlg() {
		return wthdFlg;
	}

	public void setWthdFlg(String wthdFlg) {
		this.wthdFlg = wthdFlg;
	}

	public String getDefaultJurFlg() {
		return defaultJurFlg;
	}

	public void setDefaultJurFlg(String defaultJurFlg) {
		this.defaultJurFlg = defaultJurFlg;
	}

	public String getVendorCategory() {
		return vendorCategory;
	}

	public void setVendorCategory(String vendorCategory) {
		this.vendorCategory = vendorCategory;
	}

	public String getWthdCondition() {
		return wthdCondition;
	}

	public void setWthdCondition(String wthdCondition) {
		this.wthdCondition = wthdCondition;
	}

	public String getConditionPct() {
		return conditionPct;
	}

	public void setConditionPct(String conditionPct) {
		this.conditionPct = conditionPct;
	}

	public String getConditionUntil() {
		return conditionUntil;
	}

	public void setConditionUntil(String conditionUntil) {
		this.conditionUntil = conditionUntil;
	}

	public String getRemitWthdToFlg() {
		return remitWthdToFlg;
	}

	public void setRemitWthdToFlg(String remitWthdToFlg) {
		this.remitWthdToFlg = remitWthdToFlg;
	}

	public String getRemitVendor() {
		return remitVendor;
	}

	public void setRemitVendor(String remitVendor) {
		this.remitVendor = remitVendor;
	}

	public String getRemitLoc() {
		return remitLoc;
	}

	public void setRemitLoc(String remitLoc) {
		this.remitLoc = remitLoc;
	}

	public String getRemitAddrSeqNum() {
		return remitAddrSeqNum;
	}

	public void setRemitAddrSeqNum(String remitAddrSeqNum) {
		this.remitAddrSeqNum = remitAddrSeqNum;
	}

	
	
	
}
