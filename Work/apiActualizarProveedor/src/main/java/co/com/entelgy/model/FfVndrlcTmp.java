package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndrlcTmp {

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

	@JsonProperty("EFF_STATUS")
	@NotNull(message = "effStatus no puede ser nulo")
	private String effStatus;

	@JsonProperty("CURRENCY_CD")
	@NotNull(message = "currencyCd no puede ser nulo")
	private String currencyCd;

	@JsonProperty("CUR_RT_TYPE")
	@NotNull(message = "curRtType no puede ser nulo")
	private String curRtType;

	@JsonProperty("FREIGHT_TERMS")
	@NotNull(message = "freightTerms no puede ser nulo")
	private String freightTerms;

	@JsonProperty("SHIP_TYPE_ID")
	@NotNull(message = "shipTypeId no puede ser nulo")
	private String shipTypeId;

	@JsonProperty("DISP_METHOD")
	@NotNull(message = "dispMethod no puede ser nulo")
	private String dispMethod;

	@JsonProperty("PYMNT_TERMS_CD")
	@NotNull(message = "pymntTermsCd no puede ser nulo")
	private String pymntTermsCd;

	@JsonProperty("MATCH_OPT_FLG")
	@NotNull(message = "matchOptFlg no puede ser nulo")
	private String matchOptFlg;

	@JsonProperty("MATCH_CNTRL_ID")
	@NotNull(message = "matchCntrlId no puede ser nulo")
	private String matchCntrlId;

	@JsonProperty("MATCH_OPT")
	@NotNull(message = "matchOpt no puede ser nulo")
	private String matchOpt;

	@JsonProperty("ERS_ACTION")
	@NotNull(message = "ersAction no puede ser nulo")
	private String ersAction;

	@JsonProperty("ERS_FLAG")
	@NotNull(message = "ersFlag no puede ser nulo")
	private String ersFlag;

	@JsonProperty("VCHR_APPRVL_FLG")
	@NotNull(message = "vchrApprvlFlg no puede ser nulo")
	private String vchrApprvlFlg;

	@JsonProperty("BUSPROCNAME")
	@NotNull(message = "busprocname no puede ser nulo")
	private String busprocname;

	@JsonProperty("APPR_RULE_SET")
	@NotNull(message = "apprRuleSet no puede ser nulo")
	private String apprRuleSet;

	@JsonProperty("BUYER_ID")
	@NotNull(message = "buyerId no puede ser nulo")
	private String buyerId;

	@JsonProperty("REMIT_SETID")
	@NotNull(message = "remitSetid no puede ser nulo")
	private String remitSetid;

	@JsonProperty("REMIT_VENDOR")
	@NotNull(message = "remitVendor no puede ser nulo")
	private String remitVendor;

	@JsonProperty("REMIT_LOC")
	@NotNull(message = "remitLoc no puede ser nulo")
	private String remitLoc;

	@JsonProperty("REMIT_ADDR_SEQ_NUM")
	@NotNull(message = "remitAddrSeqNum no puede ser nulo")
	private String remitAddrSeqNum;

	@JsonProperty("ADDR_SEQ_NUM_ORDR")
	@NotNull(message = "addrSeqNumOrdr no puede ser nulo")
	private String addrSeqNumOrdr;

	@JsonProperty("PRICE_SETID")
	@NotNull(message = "priceSetid no puede ser nulo")
	private String priceSetid;

	@JsonProperty("PRICE_VENDOR")
	@NotNull(message = "priceVendor no puede ser nulo")
	private String priceVendor;

	@JsonProperty("PRICE_LOC")
	@NotNull(message = "priceLoc no puede ser nulo")
	private String priceLoc;

	@JsonProperty("RETURN_VENDOR")
	@NotNull(message = "returnVendor no puede ser nulo")
	private String returnVendor;

	@JsonProperty("RET_ADDR_SEQ_NUM")
	@NotNull(message = "retAddrSeqNum no puede ser nulo")
	private String retAddrSeqNum;

	@JsonProperty("DST_CNTRL_ID")
	@NotNull(message = "dstCntrlId no puede ser nulo")
	private String dstCntrlId;

	@JsonProperty("PREFERRED_LANGUAGE")
	@NotNull(message = "preferredLanguage no puede ser nulo")
	private String preferredLanguage;

	@JsonProperty("RFQ_DISP_MTHD")
	@NotNull(message = "rfqDispMthd no puede ser nulo")
	private String rfqDispMthd;

	@JsonProperty("CNTRCT_DISP_MTHD")
	@NotNull(message = "cntrctDispMthd no puede ser nulo")
	private String cntrctDispMthd;

	@JsonProperty("PRIMARY_VENDOR")
	@NotNull(message = "primaryVendor no puede ser nulo")
	private String primaryVendor;

	@JsonProperty("PRIM_ADDR_SEQ_NUM")
	@NotNull(message = "primAddrSeqNum no puede ser nulo")
	private String primAddrSeqNum;

	@JsonProperty("SHIPTO_ID")
	@NotNull(message = "shiptoId no puede ser nulo")
	private String shiptoId;

	@JsonProperty("SUT_BASE_ID")
	@NotNull(message = "sutBaseId no puede ser nulo")
	private String sutBaseId;

	@JsonProperty("SALETX_TOL_AMT")
	@NotNull(message = "saletxTolAmt no puede ser nulo")
	private String saletxTolAmt;

	@JsonProperty("SALETX_TOL_CUR_CD")
	@NotNull(message = "saletxTolCurCd no puede ser nulo")
	private String saletxTolCurCd;

	@JsonProperty("SALETX_TOL_PCT")
	@NotNull(message = "saletxTolPct no puede ser nulo")
	private String saletxTolPct;

	@JsonProperty("SALETX_TOL_RT_TYPE")
	@NotNull(message = "saletxTolRtType no puede ser nulo")
	private String saletxTolRtType;

	@JsonProperty("SALETX_CD_ERS")
	@NotNull(message = "saletxCdErs no puede ser nulo")
	private String saletxCdErs;

	@JsonProperty("SALES_USE_TX_FLG")
	@NotNull(message = "salesUseTxFlg no puede ser nulo")
	private String salesUseTxFlg;

	@JsonProperty("AUTO_ASN_FLG")
	@NotNull(message = "autoAsnFlg no puede ser nulo")
	private String autoAsnFlg;

	@JsonProperty("SALETX_TOL_FLG")
	@NotNull(message = "saletxTolFlg no puede ser nulo")
	private String saletxTolFlg;

	@JsonProperty("SHIP_LOC_FLG")
	@NotNull(message = "shipLocFlg no puede ser nulo")
	private String shipLocFlg;

	@JsonProperty("WTHD_CD")
	@NotNull(message = "wthdCd no puede ser nulo")
	private String wthdCd;

	@JsonProperty("WTHD_SW")
	@NotNull(message = "wthdSw no puede ser nulo")
	private String wthdSw;

	@JsonProperty("DOC_TYPE")
	@NotNull(message = "docType no puede ser nulo")
	private String docType;

	@JsonProperty("DOC_TYPE_FLG")
	@NotNull(message = "docTypeFlg no puede ser nulo")
	private String docTypeFlg;

	@JsonProperty("RTV_DISPATCH_METH")
	@NotNull(message = "rtvDispatchMeth no puede ser nulo")
	private String rtvDispatchMeth;

	@JsonProperty("RTV_NOTIFY_METH")
	@NotNull(message = "rtvNotifyMeth no puede ser nulo")
	private String rtvNotifyMeth;

	@JsonProperty("RTV_DEBIT_OPT")
	@NotNull(message = "rtvDebitOpt no puede ser nulo")
	private String rtvDebitOpt;

	@JsonProperty("VNDR_SBI_FLG")
	@NotNull(message = "vndrSbiFlg no puede ser nulo")
	private String vndrSbiFlg;

	@JsonProperty("SBI_APPROVAL_FLG")
	@NotNull(message = "sbiApprovalFlg no puede ser nulo")
	private String sbiApprovalFlg;

	@JsonProperty("ACCOUNT")
	@NotNull(message = "account no puede ser nulo")
	private String account;

	@JsonProperty("ALTACCT")
	@NotNull(message = "altacct no puede ser nulo")
	private String altacct;

	@JsonProperty("DEPTID")
	@NotNull(message = "deptid no puede ser nulo")
	private String deptid;

	@JsonProperty("OPERATING_UNIT")
	@NotNull(message = "operatingUnit no puede ser nulo")
	private String operatingUnit;

	@JsonProperty("PRODUCT")
	@NotNull(message = "product no puede ser nulo")
	private String product;

	@JsonProperty("FUND_CODE")
	@NotNull(message = "fundCode no puede ser nulo")
	private String fundCode;

	@JsonProperty("CLASS_FLD")
	@NotNull(message = "classFld no puede ser nulo")
	private String classFld;

	@JsonProperty("PROGRAM_CODE")
	@NotNull(message = "programCode no puede ser nulo")
	private String programCode;

	@JsonProperty("BUDGET_REF")
	@NotNull(message = "budgetRef no puede ser nulo")
	private String budgetRef;

	@JsonProperty("AFFILIATE")
	@NotNull(message = "affiliate no puede ser nulo")
	private String affiliate;

	@JsonProperty("AFFILIATE_INTRA1")
	@NotNull(message = "affiliateIntra1 no puede ser nulo")
	private String affiliateIntra1;

	@JsonProperty("AFFILIATE_INTRA2")
	@NotNull(message = "affiliateIntra2 no puede ser nulo")
	private String affiliateIntra2;

	@JsonProperty("CHARTFIELD1")
	@NotNull(message = "chartfield1 no puede ser nulo")
	private String chartfield1;

	@JsonProperty("CHARTFIELD2")
	@NotNull(message = "chartfield2 no puede ser nulo")
	private String chartfield2;

	@JsonProperty("CHARTFIELD3")
	@NotNull(message = "chartfield3 no puede ser nulo")
	private String chartfield3;

	@JsonProperty("PROJECT_ID")
	@NotNull(message = "projectId no puede ser nulo")
	private String projectId;

	@JsonProperty("CONSIGNED_FLAG")
	@NotNull(message = "consignedFlag no puede ser nulo")
	private String consignedFlag;

	@JsonProperty("VCHR_CONSIGN_OPT")
	@NotNull(message = "vchrConsignOpt no puede ser nulo")
	private String vchrConsignOpt;

	@JsonProperty("BANK_ACCT_SEQ_NBR")
	@NotNull(message = "bankAcctSeqNbr no puede ser nulo")
	private String bankAcctSeqNbr;

	@JsonProperty("ACCT_TEMPL_FLG")
	@NotNull(message = "acctTemplFlg no puede ser nulo")
	private String acctTemplFlg;

	@JsonProperty("PAY_TRM_BSE_DT_DFT")
	@NotNull(message = "payTrmBseDtDft no puede ser nulo")
	private String payTrmBseDtDft;

	@JsonProperty("RECV_ONLY_MTCH_FLG")
	@NotNull(message = "recvOnlyMtchFlg no puede ser nulo")
	private String recvOnlyMtchFlg;

	@JsonProperty("VCHR_MTCH_ADJ_DFLT")
	@NotNull(message = "vchrMtchAdjDflt no puede ser nulo")
	private String vchrMtchAdjDflt;

	@JsonProperty("ERS_INV_DT_OPT")
	@NotNull(message = "ersInvDtOpt no puede ser nulo")
	private String ersInvDtOpt;

	@JsonProperty("ERS_INV_DT_DFLT")
	@NotNull(message = "ersInvDtDflt no puede ser nulo")
	private String ersInvDtDflt;

	@JsonProperty("ERS_TAX_TYPE_DFLT")
	@NotNull(message = "ersTaxTypeDflt no puede ser nulo")
	private String ersTaxTypeDflt;

	@JsonProperty("ERS_TAX_CD_OPT")
	@NotNull(message = "ersTaxCdOpt no puede ser nulo")
	private String ersTaxCdOpt;

	@JsonProperty("LAST_SBI_NUM")
	@NotNull(message = "lastSbiNum no puede ser nulo")
	private String lastSbiNum;

	@JsonProperty("SBI_DOC_DFLT")
	@NotNull(message = "sbiDocDflt no puede ser nulo")
	private String sbiDocDflt;

	@JsonProperty("SBI_PRINT_OPT")
	@NotNull(message = "sbiPrintOpt no puede ser nulo")
	private String sbiPrintOpt;

	@JsonProperty("VCHR_TAX_ADJ_DFT")
	@NotNull(message = "vchrTaxAdjDft no puede ser nulo")
	private String vchrTaxAdjDft;

	@JsonProperty("RTV_VCHR_ADJ_DFLT")
	@NotNull(message = "rtvVchrAdjDflt no puede ser nulo")
	private String rtvVchrAdjDflt;

	@JsonProperty("VAT_SUSPENSION_FLG")
	@NotNull(message = "vatSuspensionFlg no puede ser nulo")
	private String vatSuspensionFlg;

	@JsonProperty("VAT_ROUND_RULE")
	@NotNull(message = "vatRoundRule no puede ser nulo")
	private String vatRoundRule;

	@JsonProperty("REPL_DISP_METHOD")
	@NotNull(message = "replDispMethod no puede ser nulo")
	private String replDispMethod;

	@JsonProperty("VNDR_UPN_FLG")
	@NotNull(message = "vndrUpnFlg no puede ser nulo")
	private String vndrUpnFlg;

	@JsonProperty("COMMENTS_2000")
	@NotNull(message = "comments2000 no puede ser nulo")
	private String comments2000;

	@JsonProperty("DISP_CO_FLAG")
	@NotNull(message = "dispCoFlag no puede ser nulo")
	private String dispCoFlag;

	@JsonProperty("DATE_CALC_BASIS")
	@NotNull(message = "dateCalcBasis no puede ser nulo")
	private String dateCalcBasis;

	@JsonProperty("PAY_SCHEDULE_TYPE")
	@NotNull(message = "payScheduleType no puede ser nulo")
	private String payScheduleType;

	@JsonProperty("FEDERAL_INDICATOR")
	@NotNull(message = "federalIndicator no puede ser nulo")
	private String federalIndicator;

	@JsonProperty("TRADING_PARTNER")
	@NotNull(message = "tradingPartner no puede ser nulo")
	private String tradingPartner;

	@JsonProperty("ALC")
	@NotNull(message = "alc no puede ser nulo")
	private String alc;

	@JsonProperty("WORKFLOW_OPT")
	@NotNull(message = "workflowOpt no puede ser nulo")
	private String workflowOpt;

	@JsonProperty("PHYSICAL_NATURE")
	@NotNull(message = "physicalNature no puede ser nulo")
	private String physicalNature;

	@JsonProperty("VAT_SVC_PERFRM_FLG")
	@NotNull(message = "vatSvcPerfrmFlg no puede ser nulo")
	private String vatSvcPerfrmFlg;

	@JsonProperty("ULTIMATE_USE_CD")
	@NotNull(message = "ultimateUseCd no puede ser nulo")
	private String ultimateUseCd;

	@JsonProperty("ADDR_SEQ_NUM_SHFR")
	@NotNull(message = "addrSeqNumShfr no puede ser nulo")
	private String addrSeqNumShfr;

	@JsonProperty("POA_REQUIRED")
	@NotNull(message = "poaRequired no puede ser nulo")
	private String poaRequired;

	@JsonProperty("ACK_ALERT_DISP")
	@NotNull(message = "ackAlertDisp no puede ser nulo")
	private String ackAlertDisp;

	@JsonProperty("ACK_ALERT_SHIP")
	@NotNull(message = "ackAlertShip no puede ser nulo")
	private String ackAlertShip;

	@JsonProperty("POA_CO_REQUIRED")
	@NotNull(message = "poaCoRequired no puede ser nulo")
	private String poaCoRequired;

	@JsonProperty("POA_TOL_FLAG")
	@NotNull(message = "poaTolFlag no puede ser nulo")
	private String poaTolFlag;

	@JsonProperty("POA_SCHED_EARLY")
	@NotNull(message = "poaSchedEarly no puede ser nulo")
	private String poaSchedEarly;

	@JsonProperty("POA_SCHED_LATE")
	@NotNull(message = "poaSchedLate no puede ser nulo")
	private String poaSchedLate;

	@JsonProperty("POA_QTY_OVER")
	@NotNull(message = "poaQtyOver no puede ser nulo")
	private String poaQtyOver;

	@JsonProperty("POA_QTY_UNDER")
	@NotNull(message = "poaQtyUnder no puede ser nulo")
	private String poaQtyUnder;

	@JsonProperty("POA_PRICE_OVER")
	@NotNull(message = "poaPriceOver no puede ser nulo")
	private String poaPriceOver;

	@JsonProperty("POA_PRICE_UNDER")
	@NotNull(message = "poaPriceUnder no puede ser nulo")
	private String poaPriceUnder;

	@JsonProperty("CC_ACCEPT_CC")
	@NotNull(message = "ccAcceptCc no puede ser nulo")
	private String ccAcceptCc;

	@JsonProperty("CC_DISP_OPTION")
	@NotNull(message = "ccDispOption no puede ser nulo")
	private String ccDispOption;

	@JsonProperty("CC_ALLOW_OVERRIDE")
	@NotNull(message = "ccAllowOverride no puede ser nulo")
	private String ccAllowOverride;

	@JsonProperty("CC_SECURITY_ID")
	@NotNull(message = "ccSecurityId no puede ser nulo")
	private String ccSecurityId;

	@JsonProperty("CC_USE_FLAG")
	@NotNull(message = "ccUseFlag no puede ser nulo")
	private String ccUseFlag;

	@JsonProperty("MATCH_DELAY_FLG")
	@NotNull(message = "matchDelayFlg no puede ser nulo")
	private String matchDelayFlg;

	@JsonProperty("MATCH_DELAY_DAYS")
	@NotNull(message = "matchDelayDays no puede ser nulo")
	private String matchDelayDays;

	@JsonProperty("DISBURSING_OFFICE")
	@NotNull(message = "disbursingOffice no puede ser nulo")
	private String disbursingOffice;

	@JsonProperty("GEN_1099_RPT")
	@NotNull(message = "gen1099Rpt no puede ser nulo")
	private String gen1099Rpt;
	
	/*-------------------------------------------------------------
	 * 
	 * Inicio de componentes anidados
	 * 
	 * -----------------------------------------------------------
	 */
	// Listo!
	@JsonProperty("FF_VEWTHD_TMP")
	@NotNull(message = "ffVewthdTmp no puede ser vacio")
	@Valid
	private  FfVewthdTmp ffVewthdTmp;
	
	// Listo!
	@JsonProperty("FF_VNDBNK_TMP")
	@NotNull(message = "ffVndbnkTmp no puede ser vacio")
	@Valid
	private  FfVndbnkTmp ffVndbnkTmp;
	
	// Listo!
	@JsonProperty("FF_VNDRPY_TMP")
	@NotNull(message = "ffVndrpyTmp no puede ser vacio")
	@Valid
	private  FfVndrpyTmp ffVndrpyTmp;
	
	// Listo!
	@JsonProperty("FF_VNDTYP_TMP")
	@NotNull(message = "ffVndtypTmp no puede ser vacio")
	@Valid
	private  FfVndtypTmp ffVndtypTmp;
	
	// Listo!
	@JsonProperty("FF_WTHJUR_TMP")
	@NotNull(message = "ffWthjurTmp no puede ser vacio")
	@Valid
	private  FfWthjurTmp ffWthjurTmp;

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

	public String getEffStatus() {
		return effStatus;
	}

	public void setEffStatus(String effStatus) {
		this.effStatus = effStatus;
	}

	public String getCurrencyCd() {
		return currencyCd;
	}

	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}

	public String getCurRtType() {
		return curRtType;
	}

	public void setCurRtType(String curRtType) {
		this.curRtType = curRtType;
	}

	public String getFreightTerms() {
		return freightTerms;
	}

	public void setFreightTerms(String freightTerms) {
		this.freightTerms = freightTerms;
	}

	public String getShipTypeId() {
		return shipTypeId;
	}

	public void setShipTypeId(String shipTypeId) {
		this.shipTypeId = shipTypeId;
	}

	public String getDispMethod() {
		return dispMethod;
	}

	public void setDispMethod(String dispMethod) {
		this.dispMethod = dispMethod;
	}

	public String getPymntTermsCd() {
		return pymntTermsCd;
	}

	public void setPymntTermsCd(String pymntTermsCd) {
		this.pymntTermsCd = pymntTermsCd;
	}

	public String getMatchOptFlg() {
		return matchOptFlg;
	}

	public void setMatchOptFlg(String matchOptFlg) {
		this.matchOptFlg = matchOptFlg;
	}

	public String getMatchCntrlId() {
		return matchCntrlId;
	}

	public void setMatchCntrlId(String matchCntrlId) {
		this.matchCntrlId = matchCntrlId;
	}

	public String getMatchOpt() {
		return matchOpt;
	}

	public void setMatchOpt(String matchOpt) {
		this.matchOpt = matchOpt;
	}

	public String getErsAction() {
		return ersAction;
	}

	public void setErsAction(String ersAction) {
		this.ersAction = ersAction;
	}

	public String getErsFlag() {
		return ersFlag;
	}

	public void setErsFlag(String ersFlag) {
		this.ersFlag = ersFlag;
	}

	public String getVchrApprvlFlg() {
		return vchrApprvlFlg;
	}

	public void setVchrApprvlFlg(String vchrApprvlFlg) {
		this.vchrApprvlFlg = vchrApprvlFlg;
	}

	public String getBusprocname() {
		return busprocname;
	}

	public void setBusprocname(String busprocname) {
		this.busprocname = busprocname;
	}

	public String getApprRuleSet() {
		return apprRuleSet;
	}

	public void setApprRuleSet(String apprRuleSet) {
		this.apprRuleSet = apprRuleSet;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
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

	public String getAddrSeqNumOrdr() {
		return addrSeqNumOrdr;
	}

	public void setAddrSeqNumOrdr(String addrSeqNumOrdr) {
		this.addrSeqNumOrdr = addrSeqNumOrdr;
	}

	public String getPriceSetid() {
		return priceSetid;
	}

	public void setPriceSetid(String priceSetid) {
		this.priceSetid = priceSetid;
	}

	public String getPriceVendor() {
		return priceVendor;
	}

	public void setPriceVendor(String priceVendor) {
		this.priceVendor = priceVendor;
	}

	public String getPriceLoc() {
		return priceLoc;
	}

	public void setPriceLoc(String priceLoc) {
		this.priceLoc = priceLoc;
	}

	public String getReturnVendor() {
		return returnVendor;
	}

	public void setReturnVendor(String returnVendor) {
		this.returnVendor = returnVendor;
	}

	public String getRetAddrSeqNum() {
		return retAddrSeqNum;
	}

	public void setRetAddrSeqNum(String retAddrSeqNum) {
		this.retAddrSeqNum = retAddrSeqNum;
	}

	public String getDstCntrlId() {
		return dstCntrlId;
	}

	public void setDstCntrlId(String dstCntrlId) {
		this.dstCntrlId = dstCntrlId;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	public String getRfqDispMthd() {
		return rfqDispMthd;
	}

	public void setRfqDispMthd(String rfqDispMthd) {
		this.rfqDispMthd = rfqDispMthd;
	}

	public String getCntrctDispMthd() {
		return cntrctDispMthd;
	}

	public void setCntrctDispMthd(String cntrctDispMthd) {
		this.cntrctDispMthd = cntrctDispMthd;
	}

	public String getPrimaryVendor() {
		return primaryVendor;
	}

	public void setPrimaryVendor(String primaryVendor) {
		this.primaryVendor = primaryVendor;
	}

	public String getPrimAddrSeqNum() {
		return primAddrSeqNum;
	}

	public void setPrimAddrSeqNum(String primAddrSeqNum) {
		this.primAddrSeqNum = primAddrSeqNum;
	}

	public String getShiptoId() {
		return shiptoId;
	}

	public void setShiptoId(String shiptoId) {
		this.shiptoId = shiptoId;
	}

	public String getSutBaseId() {
		return sutBaseId;
	}

	public void setSutBaseId(String sutBaseId) {
		this.sutBaseId = sutBaseId;
	}

	public String getSaletxTolAmt() {
		return saletxTolAmt;
	}

	public void setSaletxTolAmt(String saletxTolAmt) {
		this.saletxTolAmt = saletxTolAmt;
	}

	public String getSaletxTolCurCd() {
		return saletxTolCurCd;
	}

	public void setSaletxTolCurCd(String saletxTolCurCd) {
		this.saletxTolCurCd = saletxTolCurCd;
	}

	public String getSaletxTolPct() {
		return saletxTolPct;
	}

	public void setSaletxTolPct(String saletxTolPct) {
		this.saletxTolPct = saletxTolPct;
	}

	public String getSaletxTolRtType() {
		return saletxTolRtType;
	}

	public void setSaletxTolRtType(String saletxTolRtType) {
		this.saletxTolRtType = saletxTolRtType;
	}

	public String getSaletxCdErs() {
		return saletxCdErs;
	}

	public void setSaletxCdErs(String saletxCdErs) {
		this.saletxCdErs = saletxCdErs;
	}

	public String getSalesUseTxFlg() {
		return salesUseTxFlg;
	}

	public void setSalesUseTxFlg(String salesUseTxFlg) {
		this.salesUseTxFlg = salesUseTxFlg;
	}

	public String getAutoAsnFlg() {
		return autoAsnFlg;
	}

	public void setAutoAsnFlg(String autoAsnFlg) {
		this.autoAsnFlg = autoAsnFlg;
	}

	public String getSaletxTolFlg() {
		return saletxTolFlg;
	}

	public void setSaletxTolFlg(String saletxTolFlg) {
		this.saletxTolFlg = saletxTolFlg;
	}

	public String getShipLocFlg() {
		return shipLocFlg;
	}

	public void setShipLocFlg(String shipLocFlg) {
		this.shipLocFlg = shipLocFlg;
	}

	public String getWthdCd() {
		return wthdCd;
	}

	public void setWthdCd(String wthdCd) {
		this.wthdCd = wthdCd;
	}

	public String getWthdSw() {
		return wthdSw;
	}

	public void setWthdSw(String wthdSw) {
		this.wthdSw = wthdSw;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocTypeFlg() {
		return docTypeFlg;
	}

	public void setDocTypeFlg(String docTypeFlg) {
		this.docTypeFlg = docTypeFlg;
	}

	public String getRtvDispatchMeth() {
		return rtvDispatchMeth;
	}

	public void setRtvDispatchMeth(String rtvDispatchMeth) {
		this.rtvDispatchMeth = rtvDispatchMeth;
	}

	public String getRtvNotifyMeth() {
		return rtvNotifyMeth;
	}

	public void setRtvNotifyMeth(String rtvNotifyMeth) {
		this.rtvNotifyMeth = rtvNotifyMeth;
	}

	public String getRtvDebitOpt() {
		return rtvDebitOpt;
	}

	public void setRtvDebitOpt(String rtvDebitOpt) {
		this.rtvDebitOpt = rtvDebitOpt;
	}

	public String getVndrSbiFlg() {
		return vndrSbiFlg;
	}

	public void setVndrSbiFlg(String vndrSbiFlg) {
		this.vndrSbiFlg = vndrSbiFlg;
	}

	public String getSbiApprovalFlg() {
		return sbiApprovalFlg;
	}

	public void setSbiApprovalFlg(String sbiApprovalFlg) {
		this.sbiApprovalFlg = sbiApprovalFlg;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAltacct() {
		return altacct;
	}

	public void setAltacct(String altacct) {
		this.altacct = altacct;
	}

	public String getDeptid() {
		return deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getOperatingUnit() {
		return operatingUnit;
	}

	public void setOperatingUnit(String operatingUnit) {
		this.operatingUnit = operatingUnit;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getClassFld() {
		return classFld;
	}

	public void setClassFld(String classFld) {
		this.classFld = classFld;
	}

	public String getProgramCode() {
		return programCode;
	}

	public void setProgramCode(String programCode) {
		this.programCode = programCode;
	}

	public String getBudgetRef() {
		return budgetRef;
	}

	public void setBudgetRef(String budgetRef) {
		this.budgetRef = budgetRef;
	}

	public String getAffiliate() {
		return affiliate;
	}

	public void setAffiliate(String affiliate) {
		this.affiliate = affiliate;
	}

	public String getAffiliateIntra1() {
		return affiliateIntra1;
	}

	public void setAffiliateIntra1(String affiliateIntra1) {
		this.affiliateIntra1 = affiliateIntra1;
	}

	public String getAffiliateIntra2() {
		return affiliateIntra2;
	}

	public void setAffiliateIntra2(String affiliateIntra2) {
		this.affiliateIntra2 = affiliateIntra2;
	}

	public String getChartfield1() {
		return chartfield1;
	}

	public void setChartfield1(String chartfield1) {
		this.chartfield1 = chartfield1;
	}

	public String getChartfield2() {
		return chartfield2;
	}

	public void setChartfield2(String chartfield2) {
		this.chartfield2 = chartfield2;
	}

	public String getChartfield3() {
		return chartfield3;
	}

	public void setChartfield3(String chartfield3) {
		this.chartfield3 = chartfield3;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getConsignedFlag() {
		return consignedFlag;
	}

	public void setConsignedFlag(String consignedFlag) {
		this.consignedFlag = consignedFlag;
	}

	public String getVchrConsignOpt() {
		return vchrConsignOpt;
	}

	public void setVchrConsignOpt(String vchrConsignOpt) {
		this.vchrConsignOpt = vchrConsignOpt;
	}

	public String getBankAcctSeqNbr() {
		return bankAcctSeqNbr;
	}

	public void setBankAcctSeqNbr(String bankAcctSeqNbr) {
		this.bankAcctSeqNbr = bankAcctSeqNbr;
	}

	public String getAcctTemplFlg() {
		return acctTemplFlg;
	}

	public void setAcctTemplFlg(String acctTemplFlg) {
		this.acctTemplFlg = acctTemplFlg;
	}

	public String getPayTrmBseDtDft() {
		return payTrmBseDtDft;
	}

	public void setPayTrmBseDtDft(String payTrmBseDtDft) {
		this.payTrmBseDtDft = payTrmBseDtDft;
	}

	public String getRecvOnlyMtchFlg() {
		return recvOnlyMtchFlg;
	}

	public void setRecvOnlyMtchFlg(String recvOnlyMtchFlg) {
		this.recvOnlyMtchFlg = recvOnlyMtchFlg;
	}

	public String getVchrMtchAdjDflt() {
		return vchrMtchAdjDflt;
	}

	public void setVchrMtchAdjDflt(String vchrMtchAdjDflt) {
		this.vchrMtchAdjDflt = vchrMtchAdjDflt;
	}

	public String getErsInvDtOpt() {
		return ersInvDtOpt;
	}

	public void setErsInvDtOpt(String ersInvDtOpt) {
		this.ersInvDtOpt = ersInvDtOpt;
	}

	public String getErsInvDtDflt() {
		return ersInvDtDflt;
	}

	public void setErsInvDtDflt(String ersInvDtDflt) {
		this.ersInvDtDflt = ersInvDtDflt;
	}

	public String getErsTaxTypeDflt() {
		return ersTaxTypeDflt;
	}

	public void setErsTaxTypeDflt(String ersTaxTypeDflt) {
		this.ersTaxTypeDflt = ersTaxTypeDflt;
	}

	public String getErsTaxCdOpt() {
		return ersTaxCdOpt;
	}

	public void setErsTaxCdOpt(String ersTaxCdOpt) {
		this.ersTaxCdOpt = ersTaxCdOpt;
	}

	public String getLastSbiNum() {
		return lastSbiNum;
	}

	public void setLastSbiNum(String lastSbiNum) {
		this.lastSbiNum = lastSbiNum;
	}

	public String getSbiDocDflt() {
		return sbiDocDflt;
	}

	public void setSbiDocDflt(String sbiDocDflt) {
		this.sbiDocDflt = sbiDocDflt;
	}

	public String getSbiPrintOpt() {
		return sbiPrintOpt;
	}

	public void setSbiPrintOpt(String sbiPrintOpt) {
		this.sbiPrintOpt = sbiPrintOpt;
	}

	public String getVchrTaxAdjDft() {
		return vchrTaxAdjDft;
	}

	public void setVchrTaxAdjDft(String vchrTaxAdjDft) {
		this.vchrTaxAdjDft = vchrTaxAdjDft;
	}

	public String getRtvVchrAdjDflt() {
		return rtvVchrAdjDflt;
	}

	public void setRtvVchrAdjDflt(String rtvVchrAdjDflt) {
		this.rtvVchrAdjDflt = rtvVchrAdjDflt;
	}

	public String getVatSuspensionFlg() {
		return vatSuspensionFlg;
	}

	public void setVatSuspensionFlg(String vatSuspensionFlg) {
		this.vatSuspensionFlg = vatSuspensionFlg;
	}

	public String getVatRoundRule() {
		return vatRoundRule;
	}

	public void setVatRoundRule(String vatRoundRule) {
		this.vatRoundRule = vatRoundRule;
	}

	public String getReplDispMethod() {
		return replDispMethod;
	}

	public void setReplDispMethod(String replDispMethod) {
		this.replDispMethod = replDispMethod;
	}

	public String getVndrUpnFlg() {
		return vndrUpnFlg;
	}

	public void setVndrUpnFlg(String vndrUpnFlg) {
		this.vndrUpnFlg = vndrUpnFlg;
	}

	public String getComments2000() {
		return comments2000;
	}

	public void setComments2000(String comments2000) {
		this.comments2000 = comments2000;
	}

	public String getDispCoFlag() {
		return dispCoFlag;
	}

	public void setDispCoFlag(String dispCoFlag) {
		this.dispCoFlag = dispCoFlag;
	}

	public String getDateCalcBasis() {
		return dateCalcBasis;
	}

	public void setDateCalcBasis(String dateCalcBasis) {
		this.dateCalcBasis = dateCalcBasis;
	}

	public String getPayScheduleType() {
		return payScheduleType;
	}

	public void setPayScheduleType(String payScheduleType) {
		this.payScheduleType = payScheduleType;
	}

	public String getFederalIndicator() {
		return federalIndicator;
	}

	public void setFederalIndicator(String federalIndicator) {
		this.federalIndicator = federalIndicator;
	}

	public String getTradingPartner() {
		return tradingPartner;
	}

	public void setTradingPartner(String tradingPartner) {
		this.tradingPartner = tradingPartner;
	}

	public String getAlc() {
		return alc;
	}

	public void setAlc(String alc) {
		this.alc = alc;
	}

	public String getWorkflowOpt() {
		return workflowOpt;
	}

	public void setWorkflowOpt(String workflowOpt) {
		this.workflowOpt = workflowOpt;
	}

	public String getPhysicalNature() {
		return physicalNature;
	}

	public void setPhysicalNature(String physicalNature) {
		this.physicalNature = physicalNature;
	}

	public String getVatSvcPerfrmFlg() {
		return vatSvcPerfrmFlg;
	}

	public void setVatSvcPerfrmFlg(String vatSvcPerfrmFlg) {
		this.vatSvcPerfrmFlg = vatSvcPerfrmFlg;
	}

	public String getUltimateUseCd() {
		return ultimateUseCd;
	}

	public void setUltimateUseCd(String ultimateUseCd) {
		this.ultimateUseCd = ultimateUseCd;
	}

	public String getAddrSeqNumShfr() {
		return addrSeqNumShfr;
	}

	public void setAddrSeqNumShfr(String addrSeqNumShfr) {
		this.addrSeqNumShfr = addrSeqNumShfr;
	}

	public String getPoaRequired() {
		return poaRequired;
	}

	public void setPoaRequired(String poaRequired) {
		this.poaRequired = poaRequired;
	}

	public String getAckAlertDisp() {
		return ackAlertDisp;
	}

	public void setAckAlertDisp(String ackAlertDisp) {
		this.ackAlertDisp = ackAlertDisp;
	}

	public String getAckAlertShip() {
		return ackAlertShip;
	}

	public void setAckAlertShip(String ackAlertShip) {
		this.ackAlertShip = ackAlertShip;
	}

	public String getPoaCoRequired() {
		return poaCoRequired;
	}

	public void setPoaCoRequired(String poaCoRequired) {
		this.poaCoRequired = poaCoRequired;
	}

	public String getPoaTolFlag() {
		return poaTolFlag;
	}

	public void setPoaTolFlag(String poaTolFlag) {
		this.poaTolFlag = poaTolFlag;
	}

	public String getPoaSchedEarly() {
		return poaSchedEarly;
	}

	public void setPoaSchedEarly(String poaSchedEarly) {
		this.poaSchedEarly = poaSchedEarly;
	}

	public String getPoaSchedLate() {
		return poaSchedLate;
	}

	public void setPoaSchedLate(String poaSchedLate) {
		this.poaSchedLate = poaSchedLate;
	}

	public String getPoaQtyOver() {
		return poaQtyOver;
	}

	public void setPoaQtyOver(String poaQtyOver) {
		this.poaQtyOver = poaQtyOver;
	}

	public String getPoaQtyUnder() {
		return poaQtyUnder;
	}

	public void setPoaQtyUnder(String poaQtyUnder) {
		this.poaQtyUnder = poaQtyUnder;
	}

	public String getPoaPriceOver() {
		return poaPriceOver;
	}

	public void setPoaPriceOver(String poaPriceOver) {
		this.poaPriceOver = poaPriceOver;
	}

	public String getPoaPriceUnder() {
		return poaPriceUnder;
	}

	public void setPoaPriceUnder(String poaPriceUnder) {
		this.poaPriceUnder = poaPriceUnder;
	}

	public String getCcAcceptCc() {
		return ccAcceptCc;
	}

	public void setCcAcceptCc(String ccAcceptCc) {
		this.ccAcceptCc = ccAcceptCc;
	}

	public String getCcDispOption() {
		return ccDispOption;
	}

	public void setCcDispOption(String ccDispOption) {
		this.ccDispOption = ccDispOption;
	}

	public String getCcAllowOverride() {
		return ccAllowOverride;
	}

	public void setCcAllowOverride(String ccAllowOverride) {
		this.ccAllowOverride = ccAllowOverride;
	}

	public String getCcSecurityId() {
		return ccSecurityId;
	}

	public void setCcSecurityId(String ccSecurityId) {
		this.ccSecurityId = ccSecurityId;
	}

	public String getCcUseFlag() {
		return ccUseFlag;
	}

	public void setCcUseFlag(String ccUseFlag) {
		this.ccUseFlag = ccUseFlag;
	}

	public String getMatchDelayFlg() {
		return matchDelayFlg;
	}

	public void setMatchDelayFlg(String matchDelayFlg) {
		this.matchDelayFlg = matchDelayFlg;
	}

	public String getMatchDelayDays() {
		return matchDelayDays;
	}

	public void setMatchDelayDays(String matchDelayDays) {
		this.matchDelayDays = matchDelayDays;
	}

	public String getDisbursingOffice() {
		return disbursingOffice;
	}

	public void setDisbursingOffice(String disbursingOffice) {
		this.disbursingOffice = disbursingOffice;
	}

	public String getGen1099Rpt() {
		return gen1099Rpt;
	}

	public void setGen1099Rpt(String gen1099Rpt) {
		this.gen1099Rpt = gen1099Rpt;
	}

	public FfVewthdTmp getFfVewthdTmp() {
		return ffVewthdTmp;
	}

	public void setFfVewthdTmp(FfVewthdTmp ffVewthdTmp) {
		this.ffVewthdTmp = ffVewthdTmp;
	}

	public FfVndbnkTmp getFfVndbnkTmp() {
		return ffVndbnkTmp;
	}

	public void setFfVndbnkTmp(FfVndbnkTmp ffVndbnkTmp) {
		this.ffVndbnkTmp = ffVndbnkTmp;
	}

	public FfVndrpyTmp getFfVndrpyTmp() {
		return ffVndrpyTmp;
	}

	public void setFfVndrpyTmp(FfVndrpyTmp ffVndrpyTmp) {
		this.ffVndrpyTmp = ffVndrpyTmp;
	}

	public FfVndtypTmp getFfVndtypTmp() {
		return ffVndtypTmp;
	}

	public void setFfVndtypTmp(FfVndtypTmp ffVndtypTmp) {
		this.ffVndtypTmp = ffVndtypTmp;
	}

	public FfWthjurTmp getFfWthjurTmp() {
		return ffWthjurTmp;
	}

	public void setFfWthjurTmp(FfWthjurTmp ffWthjurTmp) {
		this.ffWthjurTmp = ffWthjurTmp;
	}
	
	
}
