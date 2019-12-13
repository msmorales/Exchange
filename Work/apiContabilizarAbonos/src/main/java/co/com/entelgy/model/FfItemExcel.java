package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfItemExcel {
	
	@JsonProperty("DEPOSIT_BU")
	@NotNull(message = "depositBu no puede ser nulo")	
	@NotEmpty(message = "depositBu no puede ser vacio")
	@Size(max = 1024, message = "depositBu debe ser de 1024 caracteres")
	private String depositBu;
	
	@JsonProperty("DEPOSIT_ID")
	@NotNull(message = "depositId no puede ser nulo")	
	@Size(max = 4, message = "depositId debe ser de 4 caracteres")
	private String depositId;
	
	@JsonProperty("REF_QUALIFIER_CODE")
	@NotNull(message = "refQualifierCode no puede ser nulo")	
	private String refQualifierCode;
	
	@JsonProperty("REF_VALUE")
	@NotNull(message = "refValue no puede ser nulo")	
	private String refValue;
	
	@JsonProperty("ENTRY_EVENT")
	@NotNull(message = "entryEvent no puede ser nulo")	
	private String entryEvent;
	
	@JsonProperty("ITEM_LINE")
	@Pattern(regexp = "-?([0-9]+)|()$", message = "El campo itemLine debe ser entero")
	@NotNull(message = "itemLine no puede ser nulo")
	private String itemLine;
	
	@JsonProperty("NATIONAL_ID_TYPE")
	@NotNull(message = "nationalIdType no puede ser nulo")	
	private String nationalIdType;
	
	@JsonProperty("NATIONAL_ID")
	@NotNull(message = "nationalId no puede ser nulo")	
	private String nationalId;
	
	@JsonProperty("BUSINESS_UNIT")
	@NotNull(message = "businessUnit no puede ser nulo")	
	private String businessUnit;
	
	@JsonProperty("CUST_ID")
	@NotNull(message = "custId no puede ser nulo")	
	private String custId;
	
	@JsonProperty("PAY_AMT")
	@NotNull(message = "payAmt no puede ser nulo")	
	private String payAmt;
	
	@JsonProperty("DISC_TAKEN")	
	@NotNull(message = "discTaken no puede ser nulo")
	@Pattern(regexp = "-?([0-9]+)|()$", message = "El campo discTaken debe ser entero")
	private String discTaken;

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

	public String getRefQualifierCode() {
		return refQualifierCode;
	}

	public void setRefQualifierCode(String refQualifierCode) {
		this.refQualifierCode = refQualifierCode;
	}

	public String getRefValue() {
		return refValue;
	}

	public void setRefValue(String refValue) {
		this.refValue = refValue;
	}

	public String getEntryEvent() {
		return entryEvent;
	}

	public void setEntryEvent(String entryEvent) {
		this.entryEvent = entryEvent;
	}

	public String getItemLine() {
		return itemLine;
	}

	public void setItemLine(String itemLine) {
		this.itemLine = itemLine;
	}

	public String getNationalIdType() {
		return nationalIdType;
	}

	public void setNationalIdType(String nationalIdType) {
		this.nationalIdType = nationalIdType;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}

	public String getDiscTaken() {
		return discTaken;
	}

	public void setDiscTaken(String discTaken) {
		this.discTaken = discTaken;
	}

}
