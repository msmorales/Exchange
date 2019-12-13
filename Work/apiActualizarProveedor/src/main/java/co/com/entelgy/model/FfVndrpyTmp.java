package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndrpyTmp {

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

	@JsonProperty("SEQ_NUM")
	@NotNull(message = "seqNum no puede ser nulo")
	private String seqNum;

	@JsonProperty("EFF_STATUS")
	@NotNull(message = "effStatus no puede ser nulo")
	private String effStatus;

	@JsonProperty("CURRENCY_CD")
	@NotNull(message = "currencyCd no puede ser nulo")
	private String currencyCd;

	@JsonProperty("CUR_RT_TYPE")
	@NotNull(message = "curRtType no puede ser nulo")
	private String curRtType;

	@JsonProperty("PYMNT_METHOD")
	@NotNull(message = "pymntMethod no puede ser nulo")
	private String pymntMethod;

	@JsonProperty("PYMNT_HOLD")
	@NotNull(message = "pymntHold no puede ser nulo")
	private String pymntHold;

	@JsonProperty("PYMNT_GROUP_CD")
	@NotNull(message = "pymntGroupCd no puede ser nulo")
	private String pymntGroupCd;

	@JsonProperty("PYMNT_SEPARATE")
	@NotNull(message = "pymntSeparate no puede ser nulo")
	private String pymntSeparate;

	@JsonProperty("PYMNT_HANDLING_CD")
	@NotNull(message = "pymntHandlingCd no puede ser nulo")
	private String pymntHandlingCd;

	@JsonProperty("DSCNT_ALWAYS_FLG")
	@NotNull(message = "dscntAlwaysFlg no puede ser nulo")
	private String dscntAlwaysFlg;

	@JsonProperty("DELAY_DAYS_FLG")
	@NotNull(message = "delayDaysFlg no puede ser nulo")
	private String delayDaysFlg;

	@JsonProperty("DSCNT_DELAY_DAYS")
	@NotNull(message = "dscntDelayDays no puede ser nulo")
	private String dscntDelayDays;

	@JsonProperty("PYMNT_DELAY_DAYS")
	@NotNull(message = "pymntDelayDays no puede ser nulo")
	private String pymntDelayDays;

	@JsonProperty("BANK_CD")
	@NotNull(message = "bankCd no puede ser nulo")
	private String bankCd;

	@JsonProperty("BANK_ACCT_KEY")
	@NotNull(message = "bankAcctKey no puede ser nulo")
	private String bankAcctKey;

	@JsonProperty("CURRENCY_PYMNT")
	@NotNull(message = "currencyPymnt no puede ser nulo")
	private String currencyPymnt;

	@JsonProperty("CUR_RT_TYPE_PYMNT")
	@NotNull(message = "curRtTypePymnt no puede ser nulo")
	private String curRtTypePymnt;

	@JsonProperty("EFT_PYMNT_FMT_CD")
	@NotNull(message = "eftPymntFmtCd no puede ser nulo")
	private String eftPymntFmtCd;

	@JsonProperty("EFT_RTNG_FLG")
	@NotNull(message = "eftRtngFlg no puede ser nulo")
	private String eftRtngFlg;

	@JsonProperty("EFT_RTNG_STATUS")
	@NotNull(message = "eftRtngStatus no puede ser nulo")
	private String eftRtngStatus;

	@JsonProperty("EFT_TRANS_HANDLING")
	@NotNull(message = "eftTransHandling no puede ser nulo")
	private String eftTransHandling;

	@JsonProperty("PRENOTE_DATE")
	@NotNull(message = "prenoteDate no puede ser nulo")
	private String prenoteDate;

	@JsonProperty("PRENOTE_REQD")
	@NotNull(message = "prenoteReqd no puede ser nulo")
	private String prenoteReqd;

	@JsonProperty("PRENOTE_STATUS")
	@NotNull(message = "prenoteStatus no puede ser nulo")
	private String prenoteStatus;

	@JsonProperty("EFT_DOM_COSTS_CD")
	@NotNull(message = "eftDomCostsCd no puede ser nulo")
	private String eftDomCostsCd;

	@JsonProperty("EFT_CORR_COSTS_CD")
	@NotNull(message = "eftCorrCostsCd no puede ser nulo")
	private String eftCorrCostsCd;

	@JsonProperty("EFT_CROSSED_CHECK")
	@NotNull(message = "eftCrossedCheck no puede ser nulo")
	private String eftCrossedCheck;

	@JsonProperty("EFT_CHECK_FWRD_CD")
	@NotNull(message = "eftCheckFwrdCd no puede ser nulo")
	private String eftCheckFwrdCd;

	@JsonProperty("EFT_CHECK_DRAW_CD")
	@NotNull(message = "eftCheckDrawCd no puede ser nulo")
	private String eftCheckDrawCd;

	@JsonProperty("EFT_PAY_INST_CD1")
	@NotNull(message = "eftPayInstCd1 no puede ser nulo")
	private String eftPayInstCd1;

	@JsonProperty("EFT_PAY_INST_CD2")
	@NotNull(message = "eftPayInstCd2 no puede ser nulo")
	private String eftPayInstCd2;

	@JsonProperty("EFT_PAY_INST_CD3")
	@NotNull(message = "eftPayInstCd3 no puede ser nulo")
	private String eftPayInstCd3;

	@JsonProperty("EFT_PAY_INST_CD4")
	@NotNull(message = "eftPayInstCd4 no puede ser nulo")
	private String eftPayInstCd4;

	@JsonProperty("EFT_PAY_INST_REF1")
	@NotNull(message = "eftPayInstRef1 no puede ser nulo")
	private String eftPayInstRef1;

	@JsonProperty("EFT_PAY_INST_REF2")
	@NotNull(message = "eftPayInstRef2 no puede ser nulo")
	private String eftPayInstRef2;

	@JsonProperty("FACTORING_FLG")
	@NotNull(message = "factoringFlg no puede ser nulo")
	private String factoringFlg;

	@JsonProperty("HOL_PROC_OPT")
	@NotNull(message = "holProcOpt no puede ser nulo")
	private String holProcOpt;

	@JsonProperty("HOL_PROC_DAYS")
	@NotNull(message = "holProcDays no puede ser nulo")
	private String holProcDays;

	@JsonProperty("HOL_PROC_OVERFL")
	@NotNull(message = "holProcOverfl no puede ser nulo")
	private String holProcOverfl;

	@JsonProperty("DFT_VNDR_PARAMS")
	@NotNull(message = "dftVndrParams no puede ser nulo")
	private String dftVndrParams;

	@JsonProperty("DFT_OPT_FLG")
	@NotNull(message = "dftOptFlg no puede ser nulo")
	private String dftOptFlg;

	@JsonProperty("DFT_MAX_NUM")
	@NotNull(message = "dftMaxNum no puede ser nulo")
	private String dftMaxNum;

	@JsonProperty("DFT_ROUND_FLG")
	@NotNull(message = "dftRoundFlg no puede ser nulo")
	private String dftRoundFlg;

	@JsonProperty("DFT_AMT_POS")
	@NotNull(message = "dftAmtPos no puede ser nulo")
	private String dftAmtPos;

	@JsonProperty("DFT_REMAIN_OPT")
	@NotNull(message = "dftRemainOpt no puede ser nulo")
	private String dftRemainOpt;

	@JsonProperty("PYMNT_METHOD_ALT")
	@NotNull(message = "pymntMethodAlt no puede ser nulo")
	private String pymntMethodAlt;

	@JsonProperty("GRP_PYMNT_DT")
	@NotNull(message = "grpPymntDt no puede ser nulo")
	private String grpPymntDt;

	@JsonProperty("APPLY_NETTING")
	@NotNull(message = "applyNetting no puede ser nulo")
	private String applyNetting;

	@JsonProperty("DFT_SIGHT_CD")
	@NotNull(message = "dftSightCd no puede ser nulo")
	private String dftSightCd;

	@JsonProperty("BCH_TRNCOST_CD")
	@NotNull(message = "bchTrncostCd no puede ser nulo")
	private String bchTrncostCd;

	@JsonProperty("BCH_CALC_SRC")
	@NotNull(message = "bchCalcSrc no puede ser nulo")
	private String bchCalcSrc;

	@JsonProperty("BCH_CURRENCY_CD")
	@NotNull(message = "bchCurrencyCd no puede ser nulo")
	private String bchCurrencyCd;

	@JsonProperty("AMOUNT")
	@NotNull(message = "amount no puede ser nulo")
	private String amount;

	@JsonProperty("SMT_SPLIT_ID")
	@NotNull(message = "smtSplitId no puede ser nulo")
	private String smtSplitId;

	@JsonProperty("SMT_SPLIT_FLG")
	@NotNull(message = "smtSplitFlg no puede ser nulo")
	private String smtSplitFlg;

	@JsonProperty("VNDR_PYMNT_HLD_FLG")
	@NotNull(message = "vndrPymntHldFlg no puede ser nulo")
	private String vndrPymntHldFlg;

	@JsonProperty("PYMNT_HOLD_OPT")
	@NotNull(message = "pymntHoldOpt no puede ser nulo")
	private String pymntHoldOpt;

	@JsonProperty("PYMNT_HLD_DT_OPT")
	@NotNull(message = "pymntHldDtOpt no puede ser nulo")
	private String pymntHldDtOpt;

	@JsonProperty("PYMNT_HOLD_CD")
	@NotNull(message = "pymntHoldCd no puede ser nulo")
	private String pymntHoldCd;

	@JsonProperty("PYMN_HOLD_FRM_DT")
	@NotNull(message = "pymnHoldFrmDt no puede ser nulo")
	private String pymnHoldFrmDt;

	@JsonProperty("PYMN_HOLD_TO_DT")
	@NotNull(message = "pymnHoldToDt no puede ser nulo")
	private String pymnHoldToDt;

	@JsonProperty("PYMNT_HOLD_PCT")
	@NotNull(message = "pymntHoldPct no puede ser nulo")
	private String pymntHoldPct;

	@JsonProperty("PYMNT_HOLD_COMMENT")
	@NotNull(message = "pymntHoldComment no puede ser nulo")
	private String pymntHoldComment;

	@JsonProperty("PYMNT_HOLD_AMT")
	@NotNull(message = "pymntHoldAmt no puede ser nulo")
	private String pymntHoldAmt;

	@JsonProperty("HOLD_INV_MAX_AMT")
	@NotNull(message = "holdInvMaxAmt no puede ser nulo")
	private String holdInvMaxAmt;

	@JsonProperty("LATE_CHRG_FLG")
	@NotNull(message = "lateChrgFlg no puede ser nulo")
	private String lateChrgFlg;

	@JsonProperty("LATE_CHRG_OPT")
	@NotNull(message = "lateChrgOpt no puede ser nulo")
	private String lateChrgOpt;

	@JsonProperty("LATE_CHRG_CD")
	@NotNull(message = "lateChrgCd no puede ser nulo")
	private String lateChrgCd;

	@JsonProperty("APPL_CREDIT_DFLT")
	@NotNull(message = "applCreditDflt no puede ser nulo")
	private String applCreditDflt;

	@JsonProperty("GFAP_EFTDEPACCTNUM")
	@NotNull(message = "gfapEftdepacctnum no puede ser nulo")
	private String gfapEftdepacctnum;

	@JsonProperty("GFAP_EFT_TIN_CODE")
	@NotNull(message = "gfapEftTinCode no puede ser nulo")
	private String gfapEftTinCode;

	@JsonProperty("GFAP_EFT_TREASURY")
	@NotNull(message = "gfapEftTreasury no puede ser nulo")
	private String gfapEftTreasury;

	@JsonProperty("GFAP_EFT_BBK_NAME")
	@NotNull(message = "gfapEftBbkName no puede ser nulo")
	private String gfapEftBbkName;

	@JsonProperty("GFAP_EFT_BBK_REM")
	@NotNull(message = "gfapEftBbkRem no puede ser nulo")
	private String gfapEftBbkRem;

	@JsonProperty("GFAP_EFT_BBKABANUM")
	@NotNull(message = "gfapEftBbkabanum no puede ser nulo")
	private String gfapEftBbkabanum;

	@JsonProperty("GFAP_EFT_BNF_CODE")
	@NotNull(message = "gfapEftBnfCode no puede ser nulo")
	private String gfapEftBnfCode;

	@JsonProperty("GFAP_EFT_ENCL_CODE")
	@NotNull(message = "gfapEftEnclCode no puede ser nulo")
	private String gfapEftEnclCode;

	@JsonProperty("GFAP_EFT_LTD_PAY")
	@NotNull(message = "gfapEftLtdPay no puede ser nulo")
	private String gfapEftLtdPay;

	@JsonProperty("GFAP_EFT_PROD_CODE")
	@NotNull(message = "gfapEftProdCode no puede ser nulo")
	private String gfapEftProdCode;

	@JsonProperty("GFAP_EFT_RFB_INFO")
	@NotNull(message = "gfapEftRfbInfo no puede ser nulo")
	private String gfapEftRfbInfo;

	@JsonProperty("GFAP_EFT_TYPE_CODE")
	@NotNull(message = "gfapEftTypeCode no puede ser nulo")
	private String gfapEftTypeCode;

	@JsonProperty("GFAP_EFTTOP_ELGBL")
	@NotNull(message = "gfapEfttopElgbl no puede ser nulo")
	private String gfapEfttopElgbl;

	@JsonProperty("ENTITY_ID_CODE")
	@NotNull(message = "entityIdCode no puede ser nulo")
	private String entityIdCode;

	@JsonProperty("REF_ID_QUAL")
	@NotNull(message = "refIdQual no puede ser nulo")
	private String refIdQual;

	@JsonProperty("REF_ID")
	@NotNull(message = "refId no puede ser nulo")
	private String refId;

	@JsonProperty("RECV_ID_QUAL")
	@NotNull(message = "recvIdQual no puede ser nulo")
	private String recvIdQual;

	@JsonProperty("RECV_ID")
	@NotNull(message = "recvId no puede ser nulo")
	private String recvId;

	@JsonProperty("CONTACT_NAME")
	@NotNull(message = "contactName no puede ser nulo")
	private String contactName;

	@JsonProperty("COMM_QUAL")
	@NotNull(message = "commQual no puede ser nulo")
	private String commQual;

	@JsonProperty("COMM_NUM")
	@NotNull(message = "commNum no puede ser nulo")
	private String commNum;

	@JsonProperty("POLICY_TYPE")
	@NotNull(message = "policyType no puede ser nulo")
	private String policyType;

	@JsonProperty("POLICY_NUM")
	@NotNull(message = "policyNum no puede ser nulo")
	private String policyNum;

	@JsonProperty("EFT_LAYOUT_CD")
	@NotNull(message = "eftLayoutCd no puede ser nulo")
	private String eftLayoutCd;

	@JsonProperty("ALLOW_DEBIT_MEMO")
	@NotNull(message = "allowDebitMemo no puede ser nulo")
	private String allowDebitMemo;

	@JsonProperty("PYMNT_TERMS_CD")
	@NotNull(message = "pymntTermsCd no puede ser nulo")
	private String pymntTermsCd;

	@JsonProperty("USE_VCHR_DATES")
	@NotNull(message = "useVchrDates no puede ser nulo")
	private String useVchrDates;

	@JsonProperty("INV_ID_SUFFIX")
	@NotNull(message = "invIdSuffix no puede ser nulo")
	private String invIdSuffix;

	@JsonProperty("DBMEMO_PYMNT_HOLD")
	@NotNull(message = "dbmemoPymntHold no puede ser nulo")
	private String dbmemoPymntHold;

	@JsonProperty("PYMNT_HOLD_REASON")
	@NotNull(message = "pymntHoldReason no puede ser nulo")
	private String pymntHoldReason;

	@JsonProperty("PYMNT_MESSAGE")
	@NotNull(message = "pymntMessage no puede ser nulo")
	private String pymntMessage;

	@JsonProperty("DBMEMO_DISP_METHOD")
	@NotNull(message = "dbmemoDispMethod no puede ser nulo")
	private String dbmemoDispMethod;

	@JsonProperty("DBMEMO_ADDR_OPTION")
	@NotNull(message = "dbmemoAddrOption no puede ser nulo")
	private String dbmemoAddrOption;

	@JsonProperty("ADDRESS_SEQ_NUM")
	@NotNull(message = "addressSeqNum no puede ser nulo")
	private String addressSeqNum;

	@JsonProperty("CNTCT_SEQ_NUM")
	@NotNull(message = "cntctSeqNum no puede ser nulo")
	private String cntctSeqNum;

	@JsonProperty("EMAIL_ADVICE")
	@NotNull(message = "emailAdvice no puede ser nulo")
	private String emailAdvice;

	@JsonProperty("EMAILID")
	@NotNull(message = "emailid no puede ser nulo")
	private String emailid;

	@JsonProperty("REMIT_ADVISE_OPT")
	@NotNull(message = "remitAdviseOpt no puede ser nulo")
	private String remitAdviseOpt;

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

	public String getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
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

	public String getPymntMethod() {
		return pymntMethod;
	}

	public void setPymntMethod(String pymntMethod) {
		this.pymntMethod = pymntMethod;
	}

	public String getPymntHold() {
		return pymntHold;
	}

	public void setPymntHold(String pymntHold) {
		this.pymntHold = pymntHold;
	}

	public String getPymntGroupCd() {
		return pymntGroupCd;
	}

	public void setPymntGroupCd(String pymntGroupCd) {
		this.pymntGroupCd = pymntGroupCd;
	}

	public String getPymntSeparate() {
		return pymntSeparate;
	}

	public void setPymntSeparate(String pymntSeparate) {
		this.pymntSeparate = pymntSeparate;
	}

	public String getPymntHandlingCd() {
		return pymntHandlingCd;
	}

	public void setPymntHandlingCd(String pymntHandlingCd) {
		this.pymntHandlingCd = pymntHandlingCd;
	}

	public String getDscntAlwaysFlg() {
		return dscntAlwaysFlg;
	}

	public void setDscntAlwaysFlg(String dscntAlwaysFlg) {
		this.dscntAlwaysFlg = dscntAlwaysFlg;
	}

	public String getDelayDaysFlg() {
		return delayDaysFlg;
	}

	public void setDelayDaysFlg(String delayDaysFlg) {
		this.delayDaysFlg = delayDaysFlg;
	}

	public String getDscntDelayDays() {
		return dscntDelayDays;
	}

	public void setDscntDelayDays(String dscntDelayDays) {
		this.dscntDelayDays = dscntDelayDays;
	}

	public String getPymntDelayDays() {
		return pymntDelayDays;
	}

	public void setPymntDelayDays(String pymntDelayDays) {
		this.pymntDelayDays = pymntDelayDays;
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

	public String getCurrencyPymnt() {
		return currencyPymnt;
	}

	public void setCurrencyPymnt(String currencyPymnt) {
		this.currencyPymnt = currencyPymnt;
	}

	public String getCurRtTypePymnt() {
		return curRtTypePymnt;
	}

	public void setCurRtTypePymnt(String curRtTypePymnt) {
		this.curRtTypePymnt = curRtTypePymnt;
	}

	public String getEftPymntFmtCd() {
		return eftPymntFmtCd;
	}

	public void setEftPymntFmtCd(String eftPymntFmtCd) {
		this.eftPymntFmtCd = eftPymntFmtCd;
	}

	public String getEftRtngFlg() {
		return eftRtngFlg;
	}

	public void setEftRtngFlg(String eftRtngFlg) {
		this.eftRtngFlg = eftRtngFlg;
	}

	public String getEftRtngStatus() {
		return eftRtngStatus;
	}

	public void setEftRtngStatus(String eftRtngStatus) {
		this.eftRtngStatus = eftRtngStatus;
	}

	public String getEftTransHandling() {
		return eftTransHandling;
	}

	public void setEftTransHandling(String eftTransHandling) {
		this.eftTransHandling = eftTransHandling;
	}

	public String getPrenoteDate() {
		return prenoteDate;
	}

	public void setPrenoteDate(String prenoteDate) {
		this.prenoteDate = prenoteDate;
	}

	public String getPrenoteReqd() {
		return prenoteReqd;
	}

	public void setPrenoteReqd(String prenoteReqd) {
		this.prenoteReqd = prenoteReqd;
	}

	public String getPrenoteStatus() {
		return prenoteStatus;
	}

	public void setPrenoteStatus(String prenoteStatus) {
		this.prenoteStatus = prenoteStatus;
	}

	public String getEftDomCostsCd() {
		return eftDomCostsCd;
	}

	public void setEftDomCostsCd(String eftDomCostsCd) {
		this.eftDomCostsCd = eftDomCostsCd;
	}

	public String getEftCorrCostsCd() {
		return eftCorrCostsCd;
	}

	public void setEftCorrCostsCd(String eftCorrCostsCd) {
		this.eftCorrCostsCd = eftCorrCostsCd;
	}

	public String getEftCrossedCheck() {
		return eftCrossedCheck;
	}

	public void setEftCrossedCheck(String eftCrossedCheck) {
		this.eftCrossedCheck = eftCrossedCheck;
	}

	public String getEftCheckFwrdCd() {
		return eftCheckFwrdCd;
	}

	public void setEftCheckFwrdCd(String eftCheckFwrdCd) {
		this.eftCheckFwrdCd = eftCheckFwrdCd;
	}

	public String getEftCheckDrawCd() {
		return eftCheckDrawCd;
	}

	public void setEftCheckDrawCd(String eftCheckDrawCd) {
		this.eftCheckDrawCd = eftCheckDrawCd;
	}

	public String getEftPayInstCd1() {
		return eftPayInstCd1;
	}

	public void setEftPayInstCd1(String eftPayInstCd1) {
		this.eftPayInstCd1 = eftPayInstCd1;
	}

	public String getEftPayInstCd2() {
		return eftPayInstCd2;
	}

	public void setEftPayInstCd2(String eftPayInstCd2) {
		this.eftPayInstCd2 = eftPayInstCd2;
	}

	public String getEftPayInstCd3() {
		return eftPayInstCd3;
	}

	public void setEftPayInstCd3(String eftPayInstCd3) {
		this.eftPayInstCd3 = eftPayInstCd3;
	}

	public String getEftPayInstCd4() {
		return eftPayInstCd4;
	}

	public void setEftPayInstCd4(String eftPayInstCd4) {
		this.eftPayInstCd4 = eftPayInstCd4;
	}

	public String getEftPayInstRef1() {
		return eftPayInstRef1;
	}

	public void setEftPayInstRef1(String eftPayInstRef1) {
		this.eftPayInstRef1 = eftPayInstRef1;
	}

	public String getEftPayInstRef2() {
		return eftPayInstRef2;
	}

	public void setEftPayInstRef2(String eftPayInstRef2) {
		this.eftPayInstRef2 = eftPayInstRef2;
	}

	public String getFactoringFlg() {
		return factoringFlg;
	}

	public void setFactoringFlg(String factoringFlg) {
		this.factoringFlg = factoringFlg;
	}

	public String getHolProcOpt() {
		return holProcOpt;
	}

	public void setHolProcOpt(String holProcOpt) {
		this.holProcOpt = holProcOpt;
	}

	public String getHolProcDays() {
		return holProcDays;
	}

	public void setHolProcDays(String holProcDays) {
		this.holProcDays = holProcDays;
	}

	public String getHolProcOverfl() {
		return holProcOverfl;
	}

	public void setHolProcOverfl(String holProcOverfl) {
		this.holProcOverfl = holProcOverfl;
	}

	public String getDftVndrParams() {
		return dftVndrParams;
	}

	public void setDftVndrParams(String dftVndrParams) {
		this.dftVndrParams = dftVndrParams;
	}

	public String getDftOptFlg() {
		return dftOptFlg;
	}

	public void setDftOptFlg(String dftOptFlg) {
		this.dftOptFlg = dftOptFlg;
	}

	public String getDftMaxNum() {
		return dftMaxNum;
	}

	public void setDftMaxNum(String dftMaxNum) {
		this.dftMaxNum = dftMaxNum;
	}

	public String getDftRoundFlg() {
		return dftRoundFlg;
	}

	public void setDftRoundFlg(String dftRoundFlg) {
		this.dftRoundFlg = dftRoundFlg;
	}

	public String getDftAmtPos() {
		return dftAmtPos;
	}

	public void setDftAmtPos(String dftAmtPos) {
		this.dftAmtPos = dftAmtPos;
	}

	public String getDftRemainOpt() {
		return dftRemainOpt;
	}

	public void setDftRemainOpt(String dftRemainOpt) {
		this.dftRemainOpt = dftRemainOpt;
	}

	public String getPymntMethodAlt() {
		return pymntMethodAlt;
	}

	public void setPymntMethodAlt(String pymntMethodAlt) {
		this.pymntMethodAlt = pymntMethodAlt;
	}

	public String getGrpPymntDt() {
		return grpPymntDt;
	}

	public void setGrpPymntDt(String grpPymntDt) {
		this.grpPymntDt = grpPymntDt;
	}

	public String getApplyNetting() {
		return applyNetting;
	}

	public void setApplyNetting(String applyNetting) {
		this.applyNetting = applyNetting;
	}

	public String getDftSightCd() {
		return dftSightCd;
	}

	public void setDftSightCd(String dftSightCd) {
		this.dftSightCd = dftSightCd;
	}

	public String getBchTrncostCd() {
		return bchTrncostCd;
	}

	public void setBchTrncostCd(String bchTrncostCd) {
		this.bchTrncostCd = bchTrncostCd;
	}

	public String getBchCalcSrc() {
		return bchCalcSrc;
	}

	public void setBchCalcSrc(String bchCalcSrc) {
		this.bchCalcSrc = bchCalcSrc;
	}

	public String getBchCurrencyCd() {
		return bchCurrencyCd;
	}

	public void setBchCurrencyCd(String bchCurrencyCd) {
		this.bchCurrencyCd = bchCurrencyCd;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSmtSplitId() {
		return smtSplitId;
	}

	public void setSmtSplitId(String smtSplitId) {
		this.smtSplitId = smtSplitId;
	}

	public String getSmtSplitFlg() {
		return smtSplitFlg;
	}

	public void setSmtSplitFlg(String smtSplitFlg) {
		this.smtSplitFlg = smtSplitFlg;
	}

	public String getVndrPymntHldFlg() {
		return vndrPymntHldFlg;
	}

	public void setVndrPymntHldFlg(String vndrPymntHldFlg) {
		this.vndrPymntHldFlg = vndrPymntHldFlg;
	}

	public String getPymntHoldOpt() {
		return pymntHoldOpt;
	}

	public void setPymntHoldOpt(String pymntHoldOpt) {
		this.pymntHoldOpt = pymntHoldOpt;
	}

	public String getPymntHldDtOpt() {
		return pymntHldDtOpt;
	}

	public void setPymntHldDtOpt(String pymntHldDtOpt) {
		this.pymntHldDtOpt = pymntHldDtOpt;
	}

	public String getPymntHoldCd() {
		return pymntHoldCd;
	}

	public void setPymntHoldCd(String pymntHoldCd) {
		this.pymntHoldCd = pymntHoldCd;
	}

	public String getPymnHoldFrmDt() {
		return pymnHoldFrmDt;
	}

	public void setPymnHoldFrmDt(String pymnHoldFrmDt) {
		this.pymnHoldFrmDt = pymnHoldFrmDt;
	}

	public String getPymnHoldToDt() {
		return pymnHoldToDt;
	}

	public void setPymnHoldToDt(String pymnHoldToDt) {
		this.pymnHoldToDt = pymnHoldToDt;
	}

	public String getPymntHoldPct() {
		return pymntHoldPct;
	}

	public void setPymntHoldPct(String pymntHoldPct) {
		this.pymntHoldPct = pymntHoldPct;
	}

	public String getPymntHoldComment() {
		return pymntHoldComment;
	}

	public void setPymntHoldComment(String pymntHoldComment) {
		this.pymntHoldComment = pymntHoldComment;
	}

	public String getPymntHoldAmt() {
		return pymntHoldAmt;
	}

	public void setPymntHoldAmt(String pymntHoldAmt) {
		this.pymntHoldAmt = pymntHoldAmt;
	}

	public String getHoldInvMaxAmt() {
		return holdInvMaxAmt;
	}

	public void setHoldInvMaxAmt(String holdInvMaxAmt) {
		this.holdInvMaxAmt = holdInvMaxAmt;
	}

	public String getLateChrgFlg() {
		return lateChrgFlg;
	}

	public void setLateChrgFlg(String lateChrgFlg) {
		this.lateChrgFlg = lateChrgFlg;
	}

	public String getLateChrgOpt() {
		return lateChrgOpt;
	}

	public void setLateChrgOpt(String lateChrgOpt) {
		this.lateChrgOpt = lateChrgOpt;
	}

	public String getLateChrgCd() {
		return lateChrgCd;
	}

	public void setLateChrgCd(String lateChrgCd) {
		this.lateChrgCd = lateChrgCd;
	}

	public String getApplCreditDflt() {
		return applCreditDflt;
	}

	public void setApplCreditDflt(String applCreditDflt) {
		this.applCreditDflt = applCreditDflt;
	}

	public String getGfapEftdepacctnum() {
		return gfapEftdepacctnum;
	}

	public void setGfapEftdepacctnum(String gfapEftdepacctnum) {
		this.gfapEftdepacctnum = gfapEftdepacctnum;
	}

	public String getGfapEftTinCode() {
		return gfapEftTinCode;
	}

	public void setGfapEftTinCode(String gfapEftTinCode) {
		this.gfapEftTinCode = gfapEftTinCode;
	}

	public String getGfapEftTreasury() {
		return gfapEftTreasury;
	}

	public void setGfapEftTreasury(String gfapEftTreasury) {
		this.gfapEftTreasury = gfapEftTreasury;
	}

	public String getGfapEftBbkName() {
		return gfapEftBbkName;
	}

	public void setGfapEftBbkName(String gfapEftBbkName) {
		this.gfapEftBbkName = gfapEftBbkName;
	}

	public String getGfapEftBbkRem() {
		return gfapEftBbkRem;
	}

	public void setGfapEftBbkRem(String gfapEftBbkRem) {
		this.gfapEftBbkRem = gfapEftBbkRem;
	}

	public String getGfapEftBbkabanum() {
		return gfapEftBbkabanum;
	}

	public void setGfapEftBbkabanum(String gfapEftBbkabanum) {
		this.gfapEftBbkabanum = gfapEftBbkabanum;
	}

	public String getGfapEftBnfCode() {
		return gfapEftBnfCode;
	}

	public void setGfapEftBnfCode(String gfapEftBnfCode) {
		this.gfapEftBnfCode = gfapEftBnfCode;
	}

	public String getGfapEftEnclCode() {
		return gfapEftEnclCode;
	}

	public void setGfapEftEnclCode(String gfapEftEnclCode) {
		this.gfapEftEnclCode = gfapEftEnclCode;
	}

	public String getGfapEftLtdPay() {
		return gfapEftLtdPay;
	}

	public void setGfapEftLtdPay(String gfapEftLtdPay) {
		this.gfapEftLtdPay = gfapEftLtdPay;
	}

	public String getGfapEftProdCode() {
		return gfapEftProdCode;
	}

	public void setGfapEftProdCode(String gfapEftProdCode) {
		this.gfapEftProdCode = gfapEftProdCode;
	}

	public String getGfapEftRfbInfo() {
		return gfapEftRfbInfo;
	}

	public void setGfapEftRfbInfo(String gfapEftRfbInfo) {
		this.gfapEftRfbInfo = gfapEftRfbInfo;
	}

	public String getGfapEftTypeCode() {
		return gfapEftTypeCode;
	}

	public void setGfapEftTypeCode(String gfapEftTypeCode) {
		this.gfapEftTypeCode = gfapEftTypeCode;
	}

	public String getGfapEfttopElgbl() {
		return gfapEfttopElgbl;
	}

	public void setGfapEfttopElgbl(String gfapEfttopElgbl) {
		this.gfapEfttopElgbl = gfapEfttopElgbl;
	}

	public String getEntityIdCode() {
		return entityIdCode;
	}

	public void setEntityIdCode(String entityIdCode) {
		this.entityIdCode = entityIdCode;
	}

	public String getRefIdQual() {
		return refIdQual;
	}

	public void setRefIdQual(String refIdQual) {
		this.refIdQual = refIdQual;
	}

	public String getRefId() {
		return refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	public String getRecvIdQual() {
		return recvIdQual;
	}

	public void setRecvIdQual(String recvIdQual) {
		this.recvIdQual = recvIdQual;
	}

	public String getRecvId() {
		return recvId;
	}

	public void setRecvId(String recvId) {
		this.recvId = recvId;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getCommQual() {
		return commQual;
	}

	public void setCommQual(String commQual) {
		this.commQual = commQual;
	}

	public String getCommNum() {
		return commNum;
	}

	public void setCommNum(String commNum) {
		this.commNum = commNum;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public String getPolicyNum() {
		return policyNum;
	}

	public void setPolicyNum(String policyNum) {
		this.policyNum = policyNum;
	}

	public String getEftLayoutCd() {
		return eftLayoutCd;
	}

	public void setEftLayoutCd(String eftLayoutCd) {
		this.eftLayoutCd = eftLayoutCd;
	}

	public String getAllowDebitMemo() {
		return allowDebitMemo;
	}

	public void setAllowDebitMemo(String allowDebitMemo) {
		this.allowDebitMemo = allowDebitMemo;
	}

	public String getPymntTermsCd() {
		return pymntTermsCd;
	}

	public void setPymntTermsCd(String pymntTermsCd) {
		this.pymntTermsCd = pymntTermsCd;
	}

	public String getUseVchrDates() {
		return useVchrDates;
	}

	public void setUseVchrDates(String useVchrDates) {
		this.useVchrDates = useVchrDates;
	}

	public String getInvIdSuffix() {
		return invIdSuffix;
	}

	public void setInvIdSuffix(String invIdSuffix) {
		this.invIdSuffix = invIdSuffix;
	}

	public String getDbmemoPymntHold() {
		return dbmemoPymntHold;
	}

	public void setDbmemoPymntHold(String dbmemoPymntHold) {
		this.dbmemoPymntHold = dbmemoPymntHold;
	}

	public String getPymntHoldReason() {
		return pymntHoldReason;
	}

	public void setPymntHoldReason(String pymntHoldReason) {
		this.pymntHoldReason = pymntHoldReason;
	}

	public String getPymntMessage() {
		return pymntMessage;
	}

	public void setPymntMessage(String pymntMessage) {
		this.pymntMessage = pymntMessage;
	}

	public String getDbmemoDispMethod() {
		return dbmemoDispMethod;
	}

	public void setDbmemoDispMethod(String dbmemoDispMethod) {
		this.dbmemoDispMethod = dbmemoDispMethod;
	}

	public String getDbmemoAddrOption() {
		return dbmemoAddrOption;
	}

	public void setDbmemoAddrOption(String dbmemoAddrOption) {
		this.dbmemoAddrOption = dbmemoAddrOption;
	}

	public String getAddressSeqNum() {
		return addressSeqNum;
	}

	public void setAddressSeqNum(String addressSeqNum) {
		this.addressSeqNum = addressSeqNum;
	}

	public String getCntctSeqNum() {
		return cntctSeqNum;
	}

	public void setCntctSeqNum(String cntctSeqNum) {
		this.cntctSeqNum = cntctSeqNum;
	}

	public String getEmailAdvice() {
		return emailAdvice;
	}

	public void setEmailAdvice(String emailAdvice) {
		this.emailAdvice = emailAdvice;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getRemitAdviseOpt() {
		return remitAdviseOpt;
	}

	public void setRemitAdviseOpt(String remitAdviseOpt) {
		this.remitAdviseOpt = remitAdviseOpt;
	}

	
}
