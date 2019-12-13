package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfCustExcel {

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
	@Pattern(regexp = "(-?[0-9]{01,6}+)|()$", message = "El campo paymentSeqNum debe ser entero de 6 números")
	private String paymentSeqNum;
	
	@JsonProperty("ID_SEQ_NUM")
	@NotNull(message = "idSeqNum no puede ser nulo")	
	@Pattern(regexp = "-?([0-9]{01,1}+)|()$", message = "El campo idSeqNum debe ser entero de 1 número")
	private String idSeqNum;
	
	@JsonProperty("NATIONAL_ID")
	@NotNull(message = "nationalId no puede ser nulo")	
	private String nationalId;
	
	@JsonProperty("NATIONAL_ID_TYPE")
	@NotNull(message = "nationalIdType no puede ser nulo")	
	private String nationalIdType;
	
	@JsonProperty("BUSINESS_UNIT")
	@NotNull(message = "businessUnit no puede ser nulo")	
	private String businessUnit;
	
	@JsonProperty("MICR_ID")
	@NotNull(message = "micrId no puede ser nulo")	
	private String micrId;

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

	public String getIdSeqNum() {
		return idSeqNum;
	}

	public void setIdSeqNum(String idSeqNum) {
		this.idSeqNum = idSeqNum;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getNationalIdType() {
		return nationalIdType;
	}

	public void setNationalIdType(String nationalIdType) {
		this.nationalIdType = nationalIdType;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getMicrId() {
		return micrId;
	}

	public void setMicrId(String micrId) {
		this.micrId = micrId;
	}
	
	
}
