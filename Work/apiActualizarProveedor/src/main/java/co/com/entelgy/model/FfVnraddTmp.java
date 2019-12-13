package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVnraddTmp {

	@JsonProperty("PROCESS_INSTANCE")
	@NotNull(message = "processInstance no puede ser nulo")
	private String processInstance;

	@JsonProperty("SETID")
	@NotNull(message = "setid no puede ser nulo")
	private String setid;

	@JsonProperty("VENDOR_ID")
	@NotNull(message = "vendorId no puede ser nulo")
	private String vendorId;

	@JsonProperty("ADDRESS_SEQ_NUM")
	@NotNull(message = "addressSeqNum no puede ser nulo")
	private String addressSeqNum;

	@JsonProperty("EFFDT")
	@NotNull(message = "effdt no puede ser nulo")
	private String effdt;

	@JsonProperty("EFF_STATUS")
	@NotNull(message = "effStatus no puede ser nulo")
	private String effStatus;

	@JsonProperty("NAME1")
	@NotNull(message = "name1 no puede ser nulo")
	private String name1;

	@JsonProperty("NAME2")
	@NotNull(message = "name2 no puede ser nulo")
	private String name2;

	@JsonProperty("EMAILID")
	@NotNull(message = "emailid no puede ser nulo")
	private String emailid;

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

	@JsonProperty("NAME1_WTHD")
	@NotNull(message = "name1Wthd no puede ser nulo")
	private String name1Wthd;

	@JsonProperty("NAME2_WTHD")
	@NotNull(message = "name2Wthd no puede ser nulo")
	private String name2Wthd;

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

	public String getAddressSeqNum() {
		return addressSeqNum;
	}

	public void setAddressSeqNum(String addressSeqNum) {
		this.addressSeqNum = addressSeqNum;
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

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
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

	public String getName1Wthd() {
		return name1Wthd;
	}

	public void setName1Wthd(String name1Wthd) {
		this.name1Wthd = name1Wthd;
	}

	public String getName2Wthd() {
		return name2Wthd;
	}

	public void setName2Wthd(String name2Wthd) {
		this.name2Wthd = name2Wthd;
	}
	
	

}
