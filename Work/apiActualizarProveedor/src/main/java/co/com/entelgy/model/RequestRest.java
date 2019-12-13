package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestRest {

	@JsonProperty("VENDOR_ID")
	@NotNull(message = "vendorId no puede ser nulo")
	private String vendorId;

	@JsonProperty("NATIONAL_ID")
	@NotNull(message = "nationalId no puede ser nulo")
	private String nationalId;

	@JsonProperty("NATIONAL_ID_TYPE")
	@NotNull(message = "nationalIdType no puede ser nulo")
	private String nationalIdType;

	@JsonProperty("VENDOR_NAME_SHORT")
	@NotNull(message = "vendorNameShort no puede ser nulo")
	private String vendorNameShort;

	@JsonProperty("VNDR_NAME_SHRT_USR")
	@NotNull(message = "vndrNameShrtUsr no puede ser nulo")
	private String vndrNameShrtUsr;

	@JsonProperty("VNDR_NAME_SEQ_NUM")
	@NotNull(message = "vndrNameSeqNum no puede ser nulo")
	private String vndrNameSeqNum;

	@JsonProperty("NAME1")
	@NotNull(message = "name1 no puede ser nulo")
	private String name1;

	@JsonProperty("NAME2")
	@NotNull(message = "name2 no puede ser nulo")
	private String name2;

	@JsonProperty("VENDOR_STATUS")
	@NotNull(message = "vendorStatus no puede ser nulo")
	private String vendorStatus;

	@JsonProperty("VENDOR_CLASS")
	@NotNull(message = "vendorClass no puede ser nulo")
	private String vendorClass;

	@JsonProperty("VENDOR_PERSISTENCE")
	@NotNull(message = "vendorPersistence no puede ser nulo")
	private String vendorPersistence;

	@JsonProperty("REMIT_ADDR_SEQ_NUM")
	@NotNull(message = "remitAddrSeqNum no puede ser nulo")
	private String remitAddrSeqNum;

	@JsonProperty("PRIM_ADDR_SEQ_NUM")
	@NotNull(message = "primAddrSeqNum no puede ser nulo")
	private String primAddrSeqNum;

	@JsonProperty("ADDR_SEQ_NUM_ORDR")
	@NotNull(message = "addrSeqNumOrdr no puede ser nulo")
	private String addrSeqNumOrdr;

	@JsonProperty("REMIT_SETID")
	@NotNull(message = "remitSetid no puede ser nulo")
	private String remitSetid;

	@JsonProperty("REMIT_VENDOR")
	@NotNull(message = "remitVendor no puede ser nulo")
	private String remitVendor;

	@JsonProperty("CORPORATE_SETID")
	@NotNull(message = "corporateSetid no puede ser nulo")
	private String corporateSetid;

	@JsonProperty("CORPORATE_VENDOR")
	@NotNull(message = "corporateVendor no puede ser nulo")
	private String corporateVendor;

	@JsonProperty("CUST_SETID")
	@NotNull(message = "custSetid no puede ser nulo")
	private String custSetid;

	@JsonProperty("CUST_ID")
	@NotNull(message = "custId no puede ser nulo")
	private String custId;

	@JsonProperty("ENTERED_BY")
	@NotNull(message = "enteredBy no puede ser nulo")
	private String enteredBy;

	@JsonProperty("AR_NUM")
	@NotNull(message = "arNum no puede ser nulo")
	private String arNum;

	@JsonProperty("OLD_VENDOR_ID")
	@NotNull(message = "oldVendorId no puede ser nulo")
	private String oldVendorId;

	@JsonProperty("WTHD_SW")
	@NotNull(message = "wthdSw no puede ser nulo")
	private String wthdSw;

	@JsonProperty("VAT_SW")
	@NotNull(message = "vatSw no puede ser nulo")
	private String vatSw;

	@JsonProperty("VNDR_STATUS_PO")
	@NotNull(message = "vndrStatusPo no puede ser nulo")
	private String vndrStatusPo;

	@JsonProperty("REMIT_LOC")
	@NotNull(message = "remitLoc no puede ser nulo")
	private String remitLoc;

	@JsonProperty("DEFAULT_LOC")
	@NotNull(message = "defaultLoc no puede ser nulo")
	private String defaultLoc;

	@JsonProperty("NAME1_AC")
	@NotNull(message = "name1Ac no puede ser nulo")
	private String name1Ac;

	@JsonProperty("NAME2_AC")
	@NotNull(message = "name2Ac no puede ser nulo")
	private String name2Ac;

	@JsonProperty("PRIMARY_VENDOR")
	@NotNull(message = "primaryVendor no puede ser nulo")
	private String primaryVendor;

	@JsonProperty("LAST_ACTIVITY_DT")
	@NotNull(message = "lastActivityDt no puede ser nulo")
	private String lastActivityDt;

	@JsonProperty("WITHHOLD_LOC")
	@NotNull(message = "withholdLoc no puede ser nulo")
	private String withholdLoc;

	@JsonProperty("IN_PROCESS_FLG")
	@NotNull(message = "inProcessFlg no puede ser nulo")
	private String inProcessFlg;

	@JsonProperty("PROCESS_INSTANCE")
	@NotNull(message = "processInstance no puede ser nulo")
	private String processInstance;

	@JsonProperty("HUB_ZONE")
	@NotNull(message = "hubZone no puede ser nulo")
	private String hubZone;

	@JsonProperty("EEO_CERTIF_DT")
	@NotNull(message = "eeoCertifDt no puede ser nulo")
	private String eeoCertifDt;

	@JsonProperty("HRMS_CLASS")
	@NotNull(message = "hrmsClass no puede ser nulo")
	private String hrmsClass;

	@JsonProperty("INTERUNIT_VNDR_FLG")
	@NotNull(message = "interunitVndrFlg no puede ser nulo")
	private String interunitVndrFlg;

	@JsonProperty("VNDR_AFFILIATE")
	@NotNull(message = "vndrAffiliate no puede ser nulo")
	private String vndrAffiliate;

	@JsonProperty("BUSINESS_UNIT")
	@NotNull(message = "businessUnit no puede ser nulo")
	private String businessUnit;

	@JsonProperty("VNDR_TIN")
	@NotNull(message = "vndrTin no puede ser nulo")
	private String vndrTin;

	@JsonProperty("ARCHIVED_BY")
	@NotNull(message = "archivedBy no puede ser nulo")
	private String archivedBy;

	@JsonProperty("CREATED_DTTM")
	@NotNull(message = "createdDttm no puede ser nulo")
	private String createdDttm;

	@JsonProperty("CREATED_BY_USER")
	@NotNull(message = "createdByUser no puede ser nulo")
	private String createdByUser;

	@JsonProperty("LAST_MODIFIED_DATE")
	@NotNull(message = "lastModifiedDate no puede ser nulo")
	private String lastModifiedDate;

	@JsonProperty("VNDR_FIELD_C30_A")
	@NotNull(message = "vndrFieldC30A no puede ser nulo")
	private String vndrFieldC30A;

	@JsonProperty("VNDR_FIELD_C30_B")
	@NotNull(message = "vndrFieldC30B no puede ser nulo")
	private String vndrFieldC30B;

	@JsonProperty("VNDR_FIELD_C30_C")
	@NotNull(message = "vndrFieldC30C no puede ser nulo")
	private String vndrFieldC30C;

	@JsonProperty("VNDR_FIELD_C30_D")
	@NotNull(message = "vndrFieldC30D no puede ser nulo")
	private String vndrFieldC30D;

	@JsonProperty("VNDR_FIELD_C30_E")
	@NotNull(message = "vndrFieldC30E no puede ser nulo")
	private String vndrFieldC30E;

	@JsonProperty("VNDR_FIELD_C30_F")
	@NotNull(message = "vndrFieldC30F no puede ser nulo")
	private String vndrFieldC30F;

	@JsonProperty("VNDR_FIELD_C30_G")
	@NotNull(message = "vndrFieldC30G no puede ser nulo")
	private String vndrFieldC30G;

	@JsonProperty("VNDR_FIELD_C30_H")
	@NotNull(message = "vndrFieldC30H no puede ser nulo")
	private String vndrFieldC30H;

	@JsonProperty("VNDR_FIELD_C30_I")
	@NotNull(message = "vndrFieldC30I no puede ser nulo")
	private String vndrFieldC30I;

	@JsonProperty("VNDR_FIELD_C30_J")
	@NotNull(message = "vndrFieldC30J no puede ser nulo")
	private String vndrFieldC30J;

	@JsonProperty("VNDR_CCR_STATUS")
	@NotNull(message = "vndrCcrStatus no puede ser nulo")
	private String vndrCcrStatus;

	@JsonProperty("OFAC_STATUS")
	@NotNull(message = "ofacStatus no puede ser nulo")
	private String ofacStatus;

	@JsonProperty("OFAC_STATUS_DT")
	@NotNull(message = "ofacStatusDt no puede ser nulo")
	private String ofacStatusDt;

	@JsonProperty("OFAC_MOD_USER")
	@NotNull(message = "ofacModUser no puede ser nulo")
	private String ofacModUser;

	@JsonProperty("OFAC_LAG_DAYS")
	@NotNull(message = "ofacLagDays no puede ser nulo")
	private String ofacLagDays;

	@JsonProperty("OFAC_SKIP_VAL")
	@NotNull(message = "ofacSkipVal no puede ser nulo")
	private String ofacSkipVal;

	@JsonProperty("SDN_PUBLISH_DATE")
	@NotNull(message = "sdnPublishDate no puede ser nulo")
	private String sdnPublishDate;

	@JsonProperty("COMMENTS_2000")
	@NotNull(message = "comments2000 no puede ser nulo")
	private String comments2000;

	// Listo!
	@JsonProperty("FF_VNDINV_TMP")
	@NotNull(message = "ffVndinvTmp no puede ser vacio")
	@Valid
	private FfVndinvTmp ffVndinvTmp;

	// Listo!
	@JsonProperty("FF_VNDVAT_TMP")
	@NotNull(message = "ffVndvatTmp no puede ser vacio")
	@Valid
	private FfVndvatTmp ffVndvatTmp;

	// Listo!
	@JsonProperty("FF_VNDRSC_TMP")
	@NotNull(message = "ffVndrscTmp no puede ser vacio")
	@Valid
	private FfVndrscTmp ffVndrscTmp;
	
	// Listo!
	@JsonProperty("FF_VNDADS_TMP")
	@NotNull(message = "ffVndadsTmp no puede ser vacio")
	@Valid
	private FfVndadsTmp ffVndadsTmp;

	// Listo!
	@JsonProperty("FF_VNDCSR_TMP")
	@NotNull(message = "ffVndcsrTmp no puede ser vacio")
	@Valid
	private FfVndcsrTmp ffVndcsrTmp;

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
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

	public String getVendorNameShort() {
		return vendorNameShort;
	}

	public void setVendorNameShort(String vendorNameShort) {
		this.vendorNameShort = vendorNameShort;
	}

	public String getVndrNameShrtUsr() {
		return vndrNameShrtUsr;
	}

	public void setVndrNameShrtUsr(String vndrNameShrtUsr) {
		this.vndrNameShrtUsr = vndrNameShrtUsr;
	}

	public String getVndrNameSeqNum() {
		return vndrNameSeqNum;
	}

	public void setVndrNameSeqNum(String vndrNameSeqNum) {
		this.vndrNameSeqNum = vndrNameSeqNum;
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

	public String getVendorStatus() {
		return vendorStatus;
	}

	public void setVendorStatus(String vendorStatus) {
		this.vendorStatus = vendorStatus;
	}

	public String getVendorClass() {
		return vendorClass;
	}

	public void setVendorClass(String vendorClass) {
		this.vendorClass = vendorClass;
	}

	public String getVendorPersistence() {
		return vendorPersistence;
	}

	public void setVendorPersistence(String vendorPersistence) {
		this.vendorPersistence = vendorPersistence;
	}

	public String getRemitAddrSeqNum() {
		return remitAddrSeqNum;
	}

	public void setRemitAddrSeqNum(String remitAddrSeqNum) {
		this.remitAddrSeqNum = remitAddrSeqNum;
	}

	public String getPrimAddrSeqNum() {
		return primAddrSeqNum;
	}

	public void setPrimAddrSeqNum(String primAddrSeqNum) {
		this.primAddrSeqNum = primAddrSeqNum;
	}

	public String getAddrSeqNumOrdr() {
		return addrSeqNumOrdr;
	}

	public void setAddrSeqNumOrdr(String addrSeqNumOrdr) {
		this.addrSeqNumOrdr = addrSeqNumOrdr;
	}

	public String getRemitSetid() {
		return remitSetid;
	}

	public void setRemitSetid(String remitSetid) {
		this.remitSetid = remitSetid;
	}

	public String getRemitVendor() {
		return remitVendor;
	}

	public void setRemitVendor(String remitVendor) {
		this.remitVendor = remitVendor;
	}

	public String getCorporateSetid() {
		return corporateSetid;
	}

	public void setCorporateSetid(String corporateSetid) {
		this.corporateSetid = corporateSetid;
	}

	public String getCorporateVendor() {
		return corporateVendor;
	}

	public void setCorporateVendor(String corporateVendor) {
		this.corporateVendor = corporateVendor;
	}

	public String getCustSetid() {
		return custSetid;
	}

	public void setCustSetid(String custSetid) {
		this.custSetid = custSetid;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getEnteredBy() {
		return enteredBy;
	}

	public void setEnteredBy(String enteredBy) {
		this.enteredBy = enteredBy;
	}

	public String getArNum() {
		return arNum;
	}

	public void setArNum(String arNum) {
		this.arNum = arNum;
	}

	public String getOldVendorId() {
		return oldVendorId;
	}

	public void setOldVendorId(String oldVendorId) {
		this.oldVendorId = oldVendorId;
	}

	public String getWthdSw() {
		return wthdSw;
	}

	public void setWthdSw(String wthdSw) {
		this.wthdSw = wthdSw;
	}

	public String getVatSw() {
		return vatSw;
	}

	public void setVatSw(String vatSw) {
		this.vatSw = vatSw;
	}

	public String getVndrStatusPo() {
		return vndrStatusPo;
	}

	public void setVndrStatusPo(String vndrStatusPo) {
		this.vndrStatusPo = vndrStatusPo;
	}

	public String getRemitLoc() {
		return remitLoc;
	}

	public void setRemitLoc(String remitLoc) {
		this.remitLoc = remitLoc;
	}

	public String getDefaultLoc() {
		return defaultLoc;
	}

	public void setDefaultLoc(String defaultLoc) {
		this.defaultLoc = defaultLoc;
	}

	public String getName1Ac() {
		return name1Ac;
	}

	public void setName1Ac(String name1Ac) {
		this.name1Ac = name1Ac;
	}

	public String getName2Ac() {
		return name2Ac;
	}

	public void setName2Ac(String name2Ac) {
		this.name2Ac = name2Ac;
	}

	public String getPrimaryVendor() {
		return primaryVendor;
	}

	public void setPrimaryVendor(String primaryVendor) {
		this.primaryVendor = primaryVendor;
	}

	public String getLastActivityDt() {
		return lastActivityDt;
	}

	public void setLastActivityDt(String lastActivityDt) {
		this.lastActivityDt = lastActivityDt;
	}

	public String getWithholdLoc() {
		return withholdLoc;
	}

	public void setWithholdLoc(String withholdLoc) {
		this.withholdLoc = withholdLoc;
	}

	public String getInProcessFlg() {
		return inProcessFlg;
	}

	public void setInProcessFlg(String inProcessFlg) {
		this.inProcessFlg = inProcessFlg;
	}

	public String getProcessInstance() {
		return processInstance;
	}

	public void setProcessInstance(String processInstance) {
		this.processInstance = processInstance;
	}

	public String getHubZone() {
		return hubZone;
	}

	public void setHubZone(String hubZone) {
		this.hubZone = hubZone;
	}

	public String getEeoCertifDt() {
		return eeoCertifDt;
	}

	public void setEeoCertifDt(String eeoCertifDt) {
		this.eeoCertifDt = eeoCertifDt;
	}

	public String getHrmsClass() {
		return hrmsClass;
	}

	public void setHrmsClass(String hrmsClass) {
		this.hrmsClass = hrmsClass;
	}

	public String getInterunitVndrFlg() {
		return interunitVndrFlg;
	}

	public void setInterunitVndrFlg(String interunitVndrFlg) {
		this.interunitVndrFlg = interunitVndrFlg;
	}

	public String getVndrAffiliate() {
		return vndrAffiliate;
	}

	public void setVndrAffiliate(String vndrAffiliate) {
		this.vndrAffiliate = vndrAffiliate;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getVndrTin() {
		return vndrTin;
	}

	public void setVndrTin(String vndrTin) {
		this.vndrTin = vndrTin;
	}

	public String getArchivedBy() {
		return archivedBy;
	}

	public void setArchivedBy(String archivedBy) {
		this.archivedBy = archivedBy;
	}

	public String getCreatedDttm() {
		return createdDttm;
	}

	public void setCreatedDttm(String createdDttm) {
		this.createdDttm = createdDttm;
	}

	public String getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

	public String getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(String lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getVndrFieldC30A() {
		return vndrFieldC30A;
	}

	public void setVndrFieldC30A(String vndrFieldC30A) {
		this.vndrFieldC30A = vndrFieldC30A;
	}

	public String getVndrFieldC30B() {
		return vndrFieldC30B;
	}

	public void setVndrFieldC30B(String vndrFieldC30B) {
		this.vndrFieldC30B = vndrFieldC30B;
	}

	public String getVndrFieldC30C() {
		return vndrFieldC30C;
	}

	public void setVndrFieldC30C(String vndrFieldC30C) {
		this.vndrFieldC30C = vndrFieldC30C;
	}

	public String getVndrFieldC30D() {
		return vndrFieldC30D;
	}

	public void setVndrFieldC30D(String vndrFieldC30D) {
		this.vndrFieldC30D = vndrFieldC30D;
	}

	public String getVndrFieldC30E() {
		return vndrFieldC30E;
	}

	public void setVndrFieldC30E(String vndrFieldC30E) {
		this.vndrFieldC30E = vndrFieldC30E;
	}

	public String getVndrFieldC30F() {
		return vndrFieldC30F;
	}

	public void setVndrFieldC30F(String vndrFieldC30F) {
		this.vndrFieldC30F = vndrFieldC30F;
	}

	public String getVndrFieldC30G() {
		return vndrFieldC30G;
	}

	public void setVndrFieldC30G(String vndrFieldC30G) {
		this.vndrFieldC30G = vndrFieldC30G;
	}

	public String getVndrFieldC30H() {
		return vndrFieldC30H;
	}

	public void setVndrFieldC30H(String vndrFieldC30H) {
		this.vndrFieldC30H = vndrFieldC30H;
	}

	public String getVndrFieldC30I() {
		return vndrFieldC30I;
	}

	public void setVndrFieldC30I(String vndrFieldC30I) {
		this.vndrFieldC30I = vndrFieldC30I;
	}

	public String getVndrFieldC30J() {
		return vndrFieldC30J;
	}

	public void setVndrFieldC30J(String vndrFieldC30J) {
		this.vndrFieldC30J = vndrFieldC30J;
	}

	public String getVndrCcrStatus() {
		return vndrCcrStatus;
	}

	public void setVndrCcrStatus(String vndrCcrStatus) {
		this.vndrCcrStatus = vndrCcrStatus;
	}

	public String getOfacStatus() {
		return ofacStatus;
	}

	public void setOfacStatus(String ofacStatus) {
		this.ofacStatus = ofacStatus;
	}

	public String getOfacStatusDt() {
		return ofacStatusDt;
	}

	public void setOfacStatusDt(String ofacStatusDt) {
		this.ofacStatusDt = ofacStatusDt;
	}

	public String getOfacModUser() {
		return ofacModUser;
	}

	public void setOfacModUser(String ofacModUser) {
		this.ofacModUser = ofacModUser;
	}

	public String getOfacLagDays() {
		return ofacLagDays;
	}

	public void setOfacLagDays(String ofacLagDays) {
		this.ofacLagDays = ofacLagDays;
	}

	public String getOfacSkipVal() {
		return ofacSkipVal;
	}

	public void setOfacSkipVal(String ofacSkipVal) {
		this.ofacSkipVal = ofacSkipVal;
	}

	public String getSdnPublishDate() {
		return sdnPublishDate;
	}

	public void setSdnPublishDate(String sdnPublishDate) {
		this.sdnPublishDate = sdnPublishDate;
	}

	public String getComments2000() {
		return comments2000;
	}

	public void setComments2000(String comments2000) {
		this.comments2000 = comments2000;
	}

	public FfVndinvTmp getFfVndinvTmp() {
		return ffVndinvTmp;
	}

	public void setFfVndinvTmp(FfVndinvTmp ffVndinvTmp) {
		this.ffVndinvTmp = ffVndinvTmp;
	}

	public FfVndvatTmp getFfVndvatTmp() {
		return ffVndvatTmp;
	}

	public void setFfVndvatTmp(FfVndvatTmp ffVndvatTmp) {
		this.ffVndvatTmp = ffVndvatTmp;
	}

	public FfVndrscTmp getFfVndrscTmp() {
		return ffVndrscTmp;
	}

	public void setFfVndrscTmp(FfVndrscTmp ffVndrscTmp) {
		this.ffVndrscTmp = ffVndrscTmp;
	}

	public FfVndadsTmp getFfVndadsTmp() {
		return ffVndadsTmp;
	}

	public void setFfVndadsTmp(FfVndadsTmp ffVndadsTmp) {
		this.ffVndadsTmp = ffVndadsTmp;
	}

	public FfVndcsrTmp getFfVndcsrTmp() {
		return ffVndcsrTmp;
	}

	public void setFfVndcsrTmp(FfVndcsrTmp ffVndcsrTmp) {
		this.ffVndcsrTmp = ffVndcsrTmp;
	}
}
