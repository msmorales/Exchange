package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestRest {

	
	@JsonProperty("DEPOSIT_BU")
	@NotNull(message = "depositBu no puede ser nulo")	
	@NotEmpty(message = "depositBu no puede ser vacio")
	@Size(max = 5, message = "depositBu debe ser de 5 caracteres")
	private String depositBu;
	
	@JsonProperty("DEPOSIT_ID")
	@NotNull(message = "depositId no puede ser nulo")	
	@Size(max = 15, message = "depositId debe ser de 15 caracteres")
	private String depositId;
	
	@JsonProperty("OPRID")
	@NotNull(message = "oprid no puede ser nulo")
	@Size(max = 30, message = "oprid debe ser de 30 caracteres")
	private String oprid;
	
	@JsonProperty("CONTROL_CNT")
	@NotNull(message = "controlCnt no puede ser nulo")
	@Size(max = 6, message = "controlCnt debe ser de 6 caracteres")
	@Pattern(regexp = "-?([0-9]+)|()$", message = "El campo controlCnt debe ser entero")
	private String controlCnt;
	
	@JsonProperty("CONTROL_AMT")
	@NotNull(message = "controlAmt no puede ser nulo")
	@Pattern(regexp = "(-?[0-9]{01,20}+(\\.[0-9][0-9]?)?)|()$", message = "El campo controlAmt debe ser numerico con maximo 20 digitos y 2 decimales")
	private String controlAmt;
	
	@JsonProperty("ACCOUNTING_DT")
	@NotNull(message = "accountingDt no puede ser nulo")
	@Size(max = 10, message = "accountingDt debe ser de 10 caracteres")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])|()$", message = "El campo accountingDt debe ser yyyy-MM-dd")
	private String accountingDt;
	
	@JsonProperty("BANK_CD")
	@NotNull(message = "bankCd no puede ser nulo")
	private String bankCd;
	
	@JsonProperty("BANK_ACCT_KEY")
	@NotNull(message = "bankAcctKey no puede ser nulo")
	@Size(max = 15, message = "bankAcctKey debe ser de 15 caracteres")
	private String bankAcctKey;
	
	@JsonProperty("RECEIVED_DT")
	@NotNull(message = "receivedDt no puede ser nulo")
	@Size(max = 10, message = "receivedDt debe ser de 10 caracteres")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])|()$", message = "El campo receivedDt debe ser yyyy-MM-dd")
	private String receivedDt;
	
	@JsonProperty("TYPE")
	@NotNull(message = "type no puede ser nulo")
	private String type;
	
	@JsonProperty("MISC_PAYMENT")
	@NotNull(message = "miscPayment no puede ser nulo")
	@Size(max = 1, message = "miscPayment debe ser de 1 caracter")
	private String miscPayment;
	
	@JsonProperty("FI_FLEXIFON")
	@NotNull(message = "fiFlexifon no puede ser nulo")
	@Size(max = 1, message = "fiFlexifon debe ser de 1 caracter")
	private String fiFlexifon;
	
	@JsonProperty("CONTROL_CURRENCY")
	@NotNull(message = "controlCurrency no puede ser nulo")
	@Size(max = 3, message = "controlCurrency debe ser de 3 caracteres")
	private String controlCurrency;
	
	@JsonProperty("DEPOSIT_TYPE")
	@NotNull(message = "depositType no puede ser nulo")
	@Size(max = 1, message = "depositType debe ser de 1 caracter")
	private String depositType;
	
	@JsonProperty("FF_REFERENCIA")
	@NotNull(message = "ffReferencia no puede ser nulo")
	@Size(max = 10, message = "ffReferencia debe ser de 10 caracteres")
	@Pattern(regexp = "(-?[0-9]+)|()$", message = "El campo ffReferencia debe ser numérico entero")
	private String ffReferencia;
	
	@JsonProperty("BRANCH_NAME")
	@NotNull(message = "branchName no puede ser nulo")
	@Size(max = 10, message = "branchName debe ser de 10 caracteres")
	private String branchName;
	
	@JsonProperty("LC_CIUDAD")
	@NotNull(message = "lcCiudad no puede ser nulo")
	@Size(max = 5, message = "lcCiudad debe ser de 5 caracteres")
	private String lcCiudad;
	
	@JsonProperty("FF_PYMN_EXCEL")
	@NotNull(message = "ffPymnExcel no puede ser vacio")	
	@Valid
	private FfPymnExcel ffPymnExcel;

	public String getDepositBu() {
		return depositBu;
	}

	public void setDepositBu(String depositBu) {
		this.depositBu = depositBu;
	}

	public String getDepositId() {
		return depositId;
	}

	public void setDepositId(String depositId) {
		this.depositId = depositId;
	}

	public String getOprid() {
		return oprid;
	}

	public void setOprid(String oprid) {
		this.oprid = oprid;
	}

	public String getControlCnt() {
		return controlCnt;
	}

	public void setControlCnt(String controlCnt) {
		this.controlCnt = controlCnt;
	}

	public String getControlAmt() {
		return controlAmt;
	}

	public void setControlAmt(String controlAmt) {
		this.controlAmt = controlAmt;
	}

	public String getAccountingDt() {
		return accountingDt;
	}

	public void setAccountingDt(String accountingDt) {
		this.accountingDt = accountingDt;
	}

	public String getBankCd() {
		return bankCd;
	}

	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}

	public String getBankAcctKey() {
		return bankAcctKey;
	}

	public void setBankAcctKey(String bankAcctKey) {
		this.bankAcctKey = bankAcctKey;
	}

	public String getReceivedDt() {
		return receivedDt;
	}

	public void setReceivedDt(String receivedDt) {
		this.receivedDt = receivedDt;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMiscPayment() {
		return miscPayment;
	}

	public void setMiscPayment(String miscPayment) {
		this.miscPayment = miscPayment;
	}

	public String getFiFlexifon() {
		return fiFlexifon;
	}

	public void setFiFlexifon(String fiFlexifon) {
		this.fiFlexifon = fiFlexifon;
	}

	public String getControlCurrency() {
		return controlCurrency;
	}

	public void setControlCurrency(String controlCurrency) {
		this.controlCurrency = controlCurrency;
	}

	public String getDepositType() {
		return depositType;
	}

	public void setDepositType(String depositType) {
		this.depositType = depositType;
	}

	public String getFfReferencia() {
		return ffReferencia;
	}

	public void setFfReferencia(String ffReferencia) {
		this.ffReferencia = ffReferencia;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getLcCiudad() {
		return lcCiudad;
	}

	public void setLcCiudad(String lcCiudad) {
		this.lcCiudad = lcCiudad;
	}

	public FfPymnExcel getFfPymnExcel() {
		return ffPymnExcel;
	}

	public void setFfPymnExcel(FfPymnExcel ffPymnExcel) {
		this.ffPymnExcel = ffPymnExcel;
	}

	
}
