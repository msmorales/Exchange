package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfPymnExcel {

	@JsonProperty("DEPOSIT_BU")
	@NotNull(message = "depositBu no puede ser nulo")	
	@NotEmpty(message = "depositBu no puede ser vacio")
	@Size(max = 1024, message = "depositBu debe ser de 1024 caracteres")
	private String depositBu;
	
	@JsonProperty("DEPOSIT_ID")
	@NotNull(message = "depositId no puede ser nulo")
	@Size(max = 4, message = "depositId debe ser de 4 caracteres")
	private String depositId;
	
	@JsonProperty("PAYMENT_SEQ_NUM")
	@NotNull(message = "paymentSeqNum no puede ser nulo")
	@Size(max = 1, message = "paymentSeqNum debe ser de 1 caracteres")
	@Pattern(regexp = "-?([0-9]+)|()$", message = "El campo paymentSeqNum debe ser entero")
	private String paymentSeqNum;
	
	@JsonProperty("PAYMENT_ID")
	@NotNull(message = "paymentId no puede ser nulo")
	@Pattern(regexp = "(-?[0-9]+)|()$", message = "El campo paymentId debe ser numérico entero")
	private String paymentId;
	
	@JsonProperty("CUST_ID")
	@NotNull(message = "custId no puede ser nulo")
	private String custId;
	
	@JsonProperty("PAYMENT_AMT")
	@NotNull(message = "paymentAmt no puede ser nulo")
	@Pattern(regexp = "^(-?[0-9]{01,20}+(\\.[0-9][0-9]?)?)|()$", message = "El campo paymentAmt es numerico de menor o igual a 20 caracteres y con maximo dos decimales")
	private String paymentAmt;
	
	@JsonProperty("PAYMENT_CURRENCY")	
	@NotNull(message = "paymentCurrency no puede ser nulo")
	@Size(max = 3, message = "paymentCurrency debe ser de 3 caracteres")
	private String paymentCurrency;
	
	@JsonProperty("PAYMENT_METHOD")
	@NotNull(message = "paymentMethod no puede ser nulo")
	@Size(max = 10, message = "paymentMethod debe ser de 10 caracteres")
	private String paymentMethod;

	@JsonProperty("FF_CUST_EXCEL")
	@NotNull(message = "ffCustExcel no puede ser vacio")	
	@Valid
	private FfCustExcel ffCustExcel;

	@JsonProperty("FF_ITEM_EXCEL")
	@NotNull(message = "ffItemExcel no puede ser vacio")	
	@Valid
	private FfItemExcel ffItemExcel;
	
	@JsonProperty("FF_PY_MSC_DST")
	@NotNull(message = "ffPyMscDst no puede ser vacio")	
	@Valid
	private FfPyMscDst ffPyMscDst;

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

	public String getPaymentSeqNum() {
		return paymentSeqNum;
	}

	public void setPaymentSeqNum(String paymentSeqNum) {
		this.paymentSeqNum = paymentSeqNum;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getPaymentAmt() {
		return paymentAmt;
	}

	public void setPaymentAmt(String paymentAmt) {
		this.paymentAmt = paymentAmt;
	}

	public String getPaymentCurrency() {
		return paymentCurrency;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public FfCustExcel getFfCustExcel() {
		return ffCustExcel;
	}

	public void setFfCustExcel(FfCustExcel ffCustExcel) {
		this.ffCustExcel = ffCustExcel;
	}

	public FfItemExcel getFfItemExcel() {
		return ffItemExcel;
	}

	public void setFfItemExcel(FfItemExcel ffItemExcel) {
		this.ffItemExcel = ffItemExcel;
	}

	public FfPyMscDst getFfPyMscDst() {
		return ffPyMscDst;
	}

	public void setFfPyMscDst(FfPyMscDst ffPyMscDst) {
		this.ffPyMscDst = ffPyMscDst;
	}
	
	
}