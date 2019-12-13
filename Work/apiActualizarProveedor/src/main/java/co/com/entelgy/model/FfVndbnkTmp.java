package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndbnkTmp {

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

	@JsonProperty("BANK_ACCT_SEQ_NBR")
	@NotNull(message = "bankAcctSeqNbr no puede ser nulo")
	private String bankAcctSeqNbr;

	@JsonProperty("DESCR")
	@NotNull(message = "descr no puede ser nulo")
	private String descr;

	@JsonProperty("DEFAULT_IND")
	@NotNull(message = "defaultInd no puede ser nulo")
	private String defaultInd;

	@JsonProperty("BANK_ID_QUAL")
	@NotNull(message = "bankIdQual no puede ser nulo")
	private String bankIdQual;

	@JsonProperty("BNK_ID_NBR")
	@NotNull(message = "bnkIdNbr no puede ser nulo")
	private String bnkIdNbr;

	@JsonProperty("BRANCH_ID")
	@NotNull(message = "branchId no puede ser nulo")
	private String branchId;

	@JsonProperty("BANK_ACCT_TYPE")
	@NotNull(message = "bankAcctType no puede ser nulo")
	private String bankAcctType;

	@JsonProperty("BANK_ACCOUNT_NUM")
	@NotNull(message = "bankAccountNum no puede ser nulo")
	private String bankAccountNum;

	@JsonProperty("CHECK_DIGIT")
	@NotNull(message = "checkDigit no puede ser nulo")
	private String checkDigit;

	@JsonProperty("DFI_ID_QUAL")
	@NotNull(message = "dfiIdQual no puede ser nulo")
	private String dfiIdQual;

	@JsonProperty("DFI_ID_NUM")
	@NotNull(message = "dfiIdNum no puede ser nulo")
	private String dfiIdNum;

	@JsonProperty("BENEFICIARY_BANK")
	@NotNull(message = "beneficiaryBank no puede ser nulo")
	private String beneficiaryBank;

	@JsonProperty("BENEFICIARY_BNK_AC")
	@NotNull(message = "beneficiaryBnkAc no puede ser nulo")
	private String beneficiaryBnkAc;

	@JsonProperty("BENEF_BRANCH")
	@NotNull(message = "benefBranch no puede ser nulo")
	private String benefBranch;

	@JsonProperty("BENEF_BRANCH_AC")
	@NotNull(message = "benefBranchAc no puede ser nulo")
	private String benefBranchAc;

	@JsonProperty("BIC_ID")
	@NotNull(message = "bicId no puede ser nulo")
	private String bicId;

	@JsonProperty("COUNTRY")
	@NotNull(message = "country no puede ser nulo")
	private String country;

	@JsonProperty("ADDRESS1")
	@NotNull(message = "address1 no puede ser nulo")
	private String address1;

	@JsonProperty("ADDRESS2")
	@NotNull(message = "address2 no puede ser nulo")
	private String address2;

	@JsonProperty("ADDRESS3")
	@NotNull(message = "address3 no puede ser nulo")
	private String address3;

	@JsonProperty("ADDRESS4")
	@NotNull(message = "address4 no puede ser nulo")
	private String address4;

	@JsonProperty("CITY")
	@NotNull(message = "city no puede ser nulo")
	private String city;

	@JsonProperty("NUM1")
	@NotNull(message = "num1 no puede ser nulo")
	private String num1;

	@JsonProperty("NUM2")
	@NotNull(message = "num2 no puede ser nulo")
	private String num2;

	@JsonProperty("HOUSE_TYPE")
	@NotNull(message = "houseType no puede ser nulo")
	private String houseType;

	@JsonProperty("ADDR_FIELD1")
	@NotNull(message = "addrField1 no puede ser nulo")
	private String addrField1;

	@JsonProperty("ADDR_FIELD2")
	@NotNull(message = "addrField2 no puede ser nulo")
	private String addrField2;

	@JsonProperty("ADDR_FIELD3")
	@NotNull(message = "addrField3 no puede ser nulo")
	private String addrField3;

	@JsonProperty("COUNTY")
	@NotNull(message = "county no puede ser nulo")
	private String county;

	@JsonProperty("STATE")
	@NotNull(message = "state no puede ser nulo")
	private String state;

	@JsonProperty("POSTAL")
	@NotNull(message = "postal no puede ser nulo")
	private String postal;

	@JsonProperty("GEO_CODE")
	@NotNull(message = "geoCode no puede ser nulo")
	private String geoCode;

	@JsonProperty("IN_CITY_LIMIT")
	@NotNull(message = "inCityLimit no puede ser nulo")
	private String inCityLimit;

	@JsonProperty("COUNTRY_CODE")
	@NotNull(message = "countryCode no puede ser nulo")
	private String countryCode;

	@JsonProperty("PHONE")
	@NotNull(message = "phone no puede ser nulo")
	private String phone;

	@JsonProperty("EXTENSION")
	@NotNull(message = "extension no puede ser nulo")
	private String extension;

	@JsonProperty("FAX")
	@NotNull(message = "fax no puede ser nulo")
	private String fax;

	@JsonProperty("IBAN_CHECK_DIGIT")
	@NotNull(message = "ibanCheckDigit no puede ser nulo")
	private String ibanCheckDigit;

	@JsonProperty("IBAN_ID")
	@NotNull(message = "ibanId no puede ser nulo")
	private String ibanId;

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

	public String getBankAcctSeqNbr() {
		return bankAcctSeqNbr;
	}

	public void setBankAcctSeqNbr(String bankAcctSeqNbr) {
		this.bankAcctSeqNbr = bankAcctSeqNbr;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDefaultInd() {
		return defaultInd;
	}

	public void setDefaultInd(String defaultInd) {
		this.defaultInd = defaultInd;
	}

	public String getBankIdQual() {
		return bankIdQual;
	}

	public void setBankIdQual(String bankIdQual) {
		this.bankIdQual = bankIdQual;
	}

	public String getBnkIdNbr() {
		return bnkIdNbr;
	}

	public void setBnkIdNbr(String bnkIdNbr) {
		this.bnkIdNbr = bnkIdNbr;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBankAcctType() {
		return bankAcctType;
	}

	public void setBankAcctType(String bankAcctType) {
		this.bankAcctType = bankAcctType;
	}

	public String getBankAccountNum() {
		return bankAccountNum;
	}

	public void setBankAccountNum(String bankAccountNum) {
		this.bankAccountNum = bankAccountNum;
	}

	public String getCheckDigit() {
		return checkDigit;
	}

	public void setCheckDigit(String checkDigit) {
		this.checkDigit = checkDigit;
	}

	public String getDfiIdQual() {
		return dfiIdQual;
	}

	public void setDfiIdQual(String dfiIdQual) {
		this.dfiIdQual = dfiIdQual;
	}

	public String getDfiIdNum() {
		return dfiIdNum;
	}

	public void setDfiIdNum(String dfiIdNum) {
		this.dfiIdNum = dfiIdNum;
	}

	public String getBeneficiaryBank() {
		return beneficiaryBank;
	}

	public void setBeneficiaryBank(String beneficiaryBank) {
		this.beneficiaryBank = beneficiaryBank;
	}

	public String getBeneficiaryBnkAc() {
		return beneficiaryBnkAc;
	}

	public void setBeneficiaryBnkAc(String beneficiaryBnkAc) {
		this.beneficiaryBnkAc = beneficiaryBnkAc;
	}

	public String getBenefBranch() {
		return benefBranch;
	}

	public void setBenefBranch(String benefBranch) {
		this.benefBranch = benefBranch;
	}

	public String getBenefBranchAc() {
		return benefBranchAc;
	}

	public void setBenefBranchAc(String benefBranchAc) {
		this.benefBranchAc = benefBranchAc;
	}

	public String getBicId() {
		return bicId;
	}

	public void setBicId(String bicId) {
		this.bicId = bicId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public String getHouseType() {
		return houseType;
	}

	public void setHouseType(String houseType) {
		this.houseType = houseType;
	}

	public String getAddrField1() {
		return addrField1;
	}

	public void setAddrField1(String addrField1) {
		this.addrField1 = addrField1;
	}

	public String getAddrField2() {
		return addrField2;
	}

	public void setAddrField2(String addrField2) {
		this.addrField2 = addrField2;
	}

	public String getAddrField3() {
		return addrField3;
	}

	public void setAddrField3(String addrField3) {
		this.addrField3 = addrField3;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getGeoCode() {
		return geoCode;
	}

	public void setGeoCode(String geoCode) {
		this.geoCode = geoCode;
	}

	public String getInCityLimit() {
		return inCityLimit;
	}

	public void setInCityLimit(String inCityLimit) {
		this.inCityLimit = inCityLimit;
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

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getIbanCheckDigit() {
		return ibanCheckDigit;
	}

	public void setIbanCheckDigit(String ibanCheckDigit) {
		this.ibanCheckDigit = ibanCheckDigit;
	}

	public String getIbanId() {
		return ibanId;
	}

	public void setIbanId(String ibanId) {
		this.ibanId = ibanId;
	}
	
	

}
