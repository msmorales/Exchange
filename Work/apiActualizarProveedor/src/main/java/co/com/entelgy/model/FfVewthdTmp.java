package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVewthdTmp {

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

	@JsonProperty("ADDRESS_SEQ_NUM")
	@NotNull(message = "addressSeqNum no puede ser nulo")
	private String addressSeqNum;

	@JsonProperty("SEX")
	@NotNull(message = "sex no puede ser nulo")
	private String sex;

	@JsonProperty("BIRTHDATE")
	@NotNull(message = "birthdate no puede ser nulo")
	private String birthdate;

	@JsonProperty("BIRTHPLACE")
	@NotNull(message = "birthplace no puede ser nulo")
	private String birthplace;

	@JsonProperty("NUM_CHILDREN")
	@NotNull(message = "numChildren no puede ser nulo")
	private String numChildren;

	@JsonProperty("COMPANY_FLG")
	@NotNull(message = "companyFlg no puede ser nulo")
	private String companyFlg;

	@JsonProperty("TAX_DIST_REF")
	@NotNull(message = "taxDistRef no puede ser nulo")
	private String taxDistRef;

	@JsonProperty("CERTIFICATE_TYPE")
	@NotNull(message = "certificateType no puede ser nulo")
	private String certificateType;

	@JsonProperty("CERTIFICATE_NUM")
	@NotNull(message = "certificateNum no puede ser nulo")
	private String certificateNum;

	@JsonProperty("CERTIFICATE_EXP_DT")
	@NotNull(message = "certificateExpDt no puede ser nulo")
	private String certificateExpDt;

	@JsonProperty("DIRECT_SALES")
	@NotNull(message = "directSales no puede ser nulo")
	private String directSales;

	@JsonProperty("SECOND_TIN")
	@NotNull(message = "secondTin no puede ser nulo")
	private String secondTin;

	@JsonProperty("STATE_TAX_WH")
	@NotNull(message = "stateTaxWh no puede ser nulo")
	private String stateTaxWh;

	@JsonProperty("TIN_TYPE")
	@NotNull(message = "tinType no puede ser nulo")
	private String tinType;

	@JsonProperty("TIN")
	@NotNull(message = "tin no puede ser nulo")
	private String tin;

	@JsonProperty("WTHD_CONTROL_NAME")
	@NotNull(message = "wthdControlName no puede ser nulo")
	private String wthdControlName;

	@JsonProperty("PROFESSION")
	@NotNull(message = "profession no puede ser nulo")
	private String profession;

	@JsonProperty("WTHD_PAN_NUM")
	@NotNull(message = "wthdPanNum no puede ser nulo")
	private String wthdPanNum;

	@JsonProperty("WTHD_PAN_WARD")
	@NotNull(message = "wthdPanWard no puede ser nulo")
	private String wthdPanWard;

	@JsonProperty("TRADE_BUS_INC")
	@NotNull(message = "tradeBusInc no puede ser nulo")
	private String tradeBusInc;

	@JsonProperty("COUNTRY_PAID")
	@NotNull(message = "countryPaid no puede ser nulo")
	private String countryPaid;

	@JsonProperty("FOREIGN_TAX_PAID")
	@NotNull(message = "foreignTaxPaid no puede ser nulo")
	private String foreignTaxPaid;

	@JsonProperty("GBR_VENDOR_TYPE")
	@NotNull(message = "gbrVendorType no puede ser nulo")
	private String gbrVendorType;

	@JsonProperty("GBR_REG_NO")
	@NotNull(message = "gbrRegNo no puede ser nulo")
	private String gbrRegNo;

	@JsonProperty("GBR_VERIFY")
	@NotNull(message = "gbrVerify no puede ser nulo")
	private String gbrVerify;

	@JsonProperty("GBR_VERIFY_NBR")
	@NotNull(message = "gbrVerifyNbr no puede ser nulo")
	private String gbrVerifyNbr;

	@JsonProperty("GBR_VERIFY_DATE")
	@NotNull(message = "gbrVerifyDate no puede ser nulo")
	private String gbrVerifyDate;

	@JsonProperty("CUSIP_NBR")
	@NotNull(message = "cusipNbr no puede ser nulo")
	private String cusipNbr;

	@JsonProperty("STATE_INCOME")
	@NotNull(message = "stateIncome no puede ser nulo")
	private String stateIncome;

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

	public String getAddressSeqNum() {
		return addressSeqNum;
	}

	public void setAddressSeqNum(String addressSeqNum) {
		this.addressSeqNum = addressSeqNum;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getNumChildren() {
		return numChildren;
	}

	public void setNumChildren(String numChildren) {
		this.numChildren = numChildren;
	}

	public String getCompanyFlg() {
		return companyFlg;
	}

	public void setCompanyFlg(String companyFlg) {
		this.companyFlg = companyFlg;
	}

	public String getTaxDistRef() {
		return taxDistRef;
	}

	public void setTaxDistRef(String taxDistRef) {
		this.taxDistRef = taxDistRef;
	}

	public String getCertificateType() {
		return certificateType;
	}

	public void setCertificateType(String certificateType) {
		this.certificateType = certificateType;
	}

	public String getCertificateNum() {
		return certificateNum;
	}

	public void setCertificateNum(String certificateNum) {
		this.certificateNum = certificateNum;
	}

	public String getCertificateExpDt() {
		return certificateExpDt;
	}

	public void setCertificateExpDt(String certificateExpDt) {
		this.certificateExpDt = certificateExpDt;
	}

	public String getDirectSales() {
		return directSales;
	}

	public void setDirectSales(String directSales) {
		this.directSales = directSales;
	}

	public String getSecondTin() {
		return secondTin;
	}

	public void setSecondTin(String secondTin) {
		this.secondTin = secondTin;
	}

	public String getStateTaxWh() {
		return stateTaxWh;
	}

	public void setStateTaxWh(String stateTaxWh) {
		this.stateTaxWh = stateTaxWh;
	}

	public String getTinType() {
		return tinType;
	}

	public void setTinType(String tinType) {
		this.tinType = tinType;
	}

	public String getTin() {
		return tin;
	}

	public void setTin(String tin) {
		this.tin = tin;
	}

	public String getWthdControlName() {
		return wthdControlName;
	}

	public void setWthdControlName(String wthdControlName) {
		this.wthdControlName = wthdControlName;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getWthdPanNum() {
		return wthdPanNum;
	}

	public void setWthdPanNum(String wthdPanNum) {
		this.wthdPanNum = wthdPanNum;
	}

	public String getWthdPanWard() {
		return wthdPanWard;
	}

	public void setWthdPanWard(String wthdPanWard) {
		this.wthdPanWard = wthdPanWard;
	}

	public String getTradeBusInc() {
		return tradeBusInc;
	}

	public void setTradeBusInc(String tradeBusInc) {
		this.tradeBusInc = tradeBusInc;
	}

	public String getCountryPaid() {
		return countryPaid;
	}

	public void setCountryPaid(String countryPaid) {
		this.countryPaid = countryPaid;
	}

	public String getForeignTaxPaid() {
		return foreignTaxPaid;
	}

	public void setForeignTaxPaid(String foreignTaxPaid) {
		this.foreignTaxPaid = foreignTaxPaid;
	}

	public String getGbrVendorType() {
		return gbrVendorType;
	}

	public void setGbrVendorType(String gbrVendorType) {
		this.gbrVendorType = gbrVendorType;
	}

	public String getGbrRegNo() {
		return gbrRegNo;
	}

	public void setGbrRegNo(String gbrRegNo) {
		this.gbrRegNo = gbrRegNo;
	}

	public String getGbrVerify() {
		return gbrVerify;
	}

	public void setGbrVerify(String gbrVerify) {
		this.gbrVerify = gbrVerify;
	}

	public String getGbrVerifyNbr() {
		return gbrVerifyNbr;
	}

	public void setGbrVerifyNbr(String gbrVerifyNbr) {
		this.gbrVerifyNbr = gbrVerifyNbr;
	}

	public String getGbrVerifyDate() {
		return gbrVerifyDate;
	}

	public void setGbrVerifyDate(String gbrVerifyDate) {
		this.gbrVerifyDate = gbrVerifyDate;
	}

	public String getCusipNbr() {
		return cusipNbr;
	}

	public void setCusipNbr(String cusipNbr) {
		this.cusipNbr = cusipNbr;
	}

	public String getStateIncome() {
		return stateIncome;
	}

	public void setStateIncome(String stateIncome) {
		this.stateIncome = stateIncome;
	}
	
	
	

}
