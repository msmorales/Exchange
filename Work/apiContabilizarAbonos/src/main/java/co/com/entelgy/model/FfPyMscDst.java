package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfPyMscDst {
	
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
	private String paymentSeqNum;
	
	@JsonProperty("DST_SEQ_NUM")	
	@NotNull(message = "dstSeqNum no puede ser nulo")
	@Size(max = 1, message = "dstSeqNum debe ser de 1 caracter")
	private String dstSeqNum;
	
	@JsonProperty("BUSINESS_UNIT")
	@NotNull(message = "businessUnit no puede ser nulo")
	@NotEmpty(message = "businessUnit no puede ser vacio")
	@Size(max = 1024, message = "businessUnit debe ser de 1024 caracteres")
	private String businessUnit;
	
	@JsonProperty("FOREIGN_CURRENCY")
	@NotNull(message = "foreignCurrency no puede ser nulo")
	@Size(max = 3, message = "foreignCurrency debe ser de 3 caracteres")
	private String foreignCurrency;
	
	@JsonProperty("BUSINESS_UNIT_GL")	
	@NotNull(message = "businessUnitGl no puede ser nulo")
	@NotEmpty(message = "businessUnitGl no puede ser vacio")
	@Size(max = 1024, message = "businessUnitGl debe ser de 1024 caracteres")
	private String businessUnitGl;
	
	@JsonProperty("SPEEDTYPE_KEY")
	@NotNull(message = "speedtypeKey no puede ser nulo")
	private String speedtypeKey;
	
	@JsonProperty("ACCOUNT")
	@NotNull(message = "account no puede ser nulo")
	@Size(max = 16, message = "account debe ser de 16 caracteres")
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

	@JsonProperty("BUSINESS_UNIT_PC")
	@NotNull(message = "businessUnitPc no puede ser nulo")
	private String businessUnitPc;

	@JsonProperty("PROJECT_ID")
	@NotNull(message = "projectId no puede ser nulo")
	private String projectId;

	@JsonProperty("ACTIVITY_ID")
	@NotNull(message = "activityId no puede ser nulo")
	private String activityId;

	@JsonProperty("RESOURCE_TYPE")
	@NotNull(message = "resourceType no puede ser nulo")
	private String resourceType;

	@JsonProperty("RESOURCE_CATEGORY")
	@NotNull(message = "resourceCategory no puede ser nulo")
	private String resourceCategory;

	@JsonProperty("RESOURCE_SUB_CAT")
	@NotNull(message = "resourceSubCat no puede ser nulo")
	private String resourceSubCat;

	@JsonProperty("ANALYSIS_TYPE")
	@NotNull(message = "analysisType no puede ser nulo")
	private String analysisType;

	@JsonProperty("STATISTIC_AMOUNT")
	@NotNull(message = "statisticAmount no puede ser nulo")
	private String statisticAmount;

	@JsonProperty("CF_EDIT_STATUS")
	@NotNull(message = "cfEditStatus no puede ser nulo")
	private String cfEditStatus;

	@JsonProperty("JRNL_LN_REF")
	@NotNull(message = "jrnlLnRef no puede ser nulo")
	private String jrnlLnRef;
	
	@JsonProperty("LINE_DESCR")	
	@NotNull(message = "lineDescr no puede ser nulo")
	@Size(max = 4000, message = "lineDescr debe ser de 4000 caracteres")
	private String lineDescr;
	
	@JsonProperty("JOURNAL_ID")
	@NotNull(message = "journalId no puede ser nulo")
	private String journalId;
	
	@JsonProperty("JOURNAL_DATE")
	@NotNull(message = "journalDate no puede ser nulo")
	private String journalDate;
	
	@JsonProperty("GL_DISTRIB_STATUS")
	@NotNull(message = "glDistribStatus no puede ser nulo")
	private String glDistribStatus;
	
	@JsonProperty("APPL_JRNL_ID")	
	@NotNull(message = "applJrnlId no puede ser nulo")
	@Size(max = 10, message = "applJrnlId debe ser de 10 caracteres")
	private String applJrnlId;
	
	@JsonProperty("ACCOUNTING_DT")	
	@NotNull(message = "accountingDt no puede ser nulo")
	@Size(max = 10, message = "accountingDt debe ser de 10 caracteres")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])|()$", message = "El campo accountingDt debe ser yyyy-MM-dd")
	private String accountingDt;
	
	@JsonProperty("FOREIGN_AMOUNT")
	@NotNull(message = "foreignAmount no puede ser nulo")
	private String foreignAmount;
	
	@JsonProperty("RT_TYPE")
	@NotNull(message = "rtType no puede ser nulo")
	private String rtType;
	
	@JsonProperty("RATE_MULT")
	@NotNull(message = "rateMult no puede ser nulo")
	private String rateMult;
	
	@JsonProperty("RATE_DIV")
	@NotNull(message = "rateDiv no puede ser nulo")
	private String rateDiv;
	
	@JsonProperty("CURRENCY_CD")
	@NotNull(message = "currencyCd no puede ser nulo")
	private String currencyCd;
	
	@JsonProperty("SYSTEM_DEFINED")
	@NotNull(message = "systemDefined no puede ser nulo")
	private String systemDefined;
	
	@JsonProperty("FISCAL_YEAR")
	@NotNull(message = "fiscalYear no puede ser nulo")
	@Pattern(regexp = "-?([0-9]+)|()$", message = "El campo fiscalYear debe ser entero")
	private String fiscalYear;
	
	@JsonProperty("ACCOUNTING_PERIOD")
	@NotNull(message = "accountingPeriod no puede ser nulo")
	@Pattern(regexp = "-?([0-9]+)|()$", message = "El campo accountingPeriod debe ser entero")
	private String accountingPeriod;
	
	@JsonProperty("LEDGER_GROUP")
	@NotNull(message = "ledgerGroup no puede ser nulo")
	private String ledgerGroup;
	
	@JsonProperty("LEDGER")
	@NotNull(message = "ledger no puede ser nulo")
	private String ledger;
	
	@JsonProperty("JOURNAL_LINE")
	@NotNull(message = "journalLine no puede ser nulo")
	private String journalLine;

	@JsonProperty("DOC_TYPE")
	@NotNull(message = "docType no puede ser nulo")
	private String docType;

	@JsonProperty("DOC_SEQ_NBR")
	@NotNull(message = "docSeqNbr no puede ser nulo")
	private String docSeqNbr;

	@JsonProperty("DOC_SEQ_DATE")
	@NotNull(message = "docSeqDate no puede ser nulo")
	private String docSeqDate;

	@JsonProperty("DOC_SEQ_STATUS")
	@NotNull(message = "docSeqStatus no puede ser nulo")
	private String docSeqStatus;

	@JsonProperty("MOVEMENT_FLAG")
	@NotNull(message = "movementFlag no puede ser nulo")
	private String movementFlag;

	@JsonProperty("CC_AFFECTED")
	@NotNull(message = "ccAffected no puede ser nulo")
	private String ccAffected;

	@JsonProperty("BUDGET_DT")
	@NotNull(message = "budgetDt no puede ser nulo")
	private String budgetDt;

	@JsonProperty("BUDGET_LINE_STATUS")
	@NotNull(message = "budgetLineStatus no puede ser nulo")
	private String budgetLineStatus;

	@JsonProperty("FOREIGN_AMOUNT_CC")
	@NotNull(message = "foreignAmountCc no puede ser nulo")
	private String foreignAmountCc;

	@JsonProperty("MONETARY_AMOUNT_CC")
	@NotNull(message = "monetaryAmountCc no puede ser nulo")
	private String monetaryAmountCc;

	@JsonProperty("ENTRY_EVENT")
	@NotNull(message = "entryEvent no puede ser nulo")
	private String entryEvent;

	@JsonProperty("DEBIT_CREDIT")
	@NotNull(message = "debitCredit no puede ser nulo")
	private String debitCredit;

	@JsonProperty("IN_PROCESS_FLG")
	@NotNull(message = "inProcessFlg no puede ser nulo")
	private String inProcessFlg;

	@JsonProperty("EE_PROC_STATUS")
	@NotNull(message = "eeProcStatus no puede ser nulo")
	private String eeProcStatus;

	@JsonProperty("IU_ANCHOR_FLG")
	@NotNull(message = "iuAnchorFlg no puede ser nulo")
	private String iuAnchorFlg;

	@JsonProperty("IU_SYS_TRAN_CD")
	@NotNull(message = "iuSysTranCd no puede ser nulo")
	private String iuSysTranCd;
	

	@JsonProperty("IU_TRAN_CD")
	@NotNull(message = "iuTranCd no puede ser nulo")
	private String iuTranCd;

	@JsonProperty("OPEN_ITEM_KEY")
	@NotNull(message = "openItemKey no puede ser nulo")
	private String openItemKey;

	@JsonProperty("SEQ_NUM")
	@NotNull(message = "seqNum no puede ser nulo")
	private String seqNum;

	@JsonProperty("FED_DISTRIB_STATUS")
	@NotNull(message = "fedDistribStatus no puede ser nulo")
	private String fedDistribStatus;

	@JsonProperty("CHARTFIELD2")
	@NotNull(message = "chartfield2 no puede ser nulo")
	private String chartfield2;

	@JsonProperty("CHARTFIELD3")
	@NotNull(message = "chartfield3 no puede ser nulo")
	private String chartfield3;

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

	public String getDstSeqNum() {
		return dstSeqNum;
	}

	public void setDstSeqNum(String dstSeqNum) {
		this.dstSeqNum = dstSeqNum;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getForeignCurrency() {
		return foreignCurrency;
	}

	public void setForeignCurrency(String foreignCurrency) {
		this.foreignCurrency = foreignCurrency;
	}

	public String getBusinessUnitGl() {
		return businessUnitGl;
	}

	public void setBusinessUnitGl(String businessUnitGl) {
		this.businessUnitGl = businessUnitGl;
	}

	public String getSpeedtypeKey() {
		return speedtypeKey;
	}

	public void setSpeedtypeKey(String speedtypeKey) {
		this.speedtypeKey = speedtypeKey;
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

	public String getBusinessUnitPc() {
		return businessUnitPc;
	}

	public void setBusinessUnitPc(String businessUnitPc) {
		this.businessUnitPc = businessUnitPc;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getActivityId() {
		return activityId;
	}

	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getResourceCategory() {
		return resourceCategory;
	}

	public void setResourceCategory(String resourceCategory) {
		this.resourceCategory = resourceCategory;
	}

	public String getResourceSubCat() {
		return resourceSubCat;
	}

	public void setResourceSubCat(String resourceSubCat) {
		this.resourceSubCat = resourceSubCat;
	}

	public String getAnalysisType() {
		return analysisType;
	}

	public void setAnalysisType(String analysisType) {
		this.analysisType = analysisType;
	}

	public String getStatisticAmount() {
		return statisticAmount;
	}

	public void setStatisticAmount(String statisticAmount) {
		this.statisticAmount = statisticAmount;
	}

	public String getCfEditStatus() {
		return cfEditStatus;
	}

	public void setCfEditStatus(String cfEditStatus) {
		this.cfEditStatus = cfEditStatus;
	}

	public String getJrnlLnRef() {
		return jrnlLnRef;
	}

	public void setJrnlLnRef(String jrnlLnRef) {
		this.jrnlLnRef = jrnlLnRef;
	}

	public String getLineDescr() {
		return lineDescr;
	}

	public void setLineDescr(String lineDescr) {
		this.lineDescr = lineDescr;
	}

	public String getJournalId() {
		return journalId;
	}

	public void setJournalId(String journalId) {
		this.journalId = journalId;
	}

	public String getJournalDate() {
		return journalDate;
	}

	public void setJournalDate(String journalDate) {
		this.journalDate = journalDate;
	}

	public String getGlDistribStatus() {
		return glDistribStatus;
	}

	public void setGlDistribStatus(String glDistribStatus) {
		this.glDistribStatus = glDistribStatus;
	}

	public String getApplJrnlId() {
		return applJrnlId;
	}

	public void setApplJrnlId(String applJrnlId) {
		this.applJrnlId = applJrnlId;
	}

	public String getAccountingDt() {
		return accountingDt;
	}

	public void setAccountingDt(String accountingDt) {
		this.accountingDt = accountingDt;
	}

	public String getForeignAmount() {
		return foreignAmount;
	}

	public void setForeignAmount(String foreignAmount) {
		this.foreignAmount = foreignAmount;
	}

	public String getRtType() {
		return rtType;
	}

	public void setRtType(String rtType) {
		this.rtType = rtType;
	}

	public String getRateMult() {
		return rateMult;
	}

	public void setRateMult(String rateMult) {
		this.rateMult = rateMult;
	}

	public String getRateDiv() {
		return rateDiv;
	}

	public void setRateDiv(String rateDiv) {
		this.rateDiv = rateDiv;
	}

	public String getCurrencyCd() {
		return currencyCd;
	}

	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}

	public String getSystemDefined() {
		return systemDefined;
	}

	public void setSystemDefined(String systemDefined) {
		this.systemDefined = systemDefined;
	}

	public String getFiscalYear() {
		return fiscalYear;
	}

	public void setFiscalYear(String fiscalYear) {
		this.fiscalYear = fiscalYear;
	}

	public String getAccountingPeriod() {
		return accountingPeriod;
	}

	public void setAccountingPeriod(String accountingPeriod) {
		this.accountingPeriod = accountingPeriod;
	}

	public String getLedgerGroup() {
		return ledgerGroup;
	}

	public void setLedgerGroup(String ledgerGroup) {
		this.ledgerGroup = ledgerGroup;
	}

	public String getLedger() {
		return ledger;
	}

	public void setLedger(String ledger) {
		this.ledger = ledger;
	}

	public String getJournalLine() {
		return journalLine;
	}

	public void setJournalLine(String journalLine) {
		this.journalLine = journalLine;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocSeqNbr() {
		return docSeqNbr;
	}

	public void setDocSeqNbr(String docSeqNbr) {
		this.docSeqNbr = docSeqNbr;
	}

	public String getDocSeqDate() {
		return docSeqDate;
	}

	public void setDocSeqDate(String docSeqDate) {
		this.docSeqDate = docSeqDate;
	}

	public String getDocSeqStatus() {
		return docSeqStatus;
	}

	public void setDocSeqStatus(String docSeqStatus) {
		this.docSeqStatus = docSeqStatus;
	}

	public String getMovementFlag() {
		return movementFlag;
	}

	public void setMovementFlag(String movementFlag) {
		this.movementFlag = movementFlag;
	}

	public String getCcAffected() {
		return ccAffected;
	}

	public void setCcAffected(String ccAffected) {
		this.ccAffected = ccAffected;
	}

	public String getBudgetDt() {
		return budgetDt;
	}

	public void setBudgetDt(String budgetDt) {
		this.budgetDt = budgetDt;
	}

	public String getBudgetLineStatus() {
		return budgetLineStatus;
	}

	public void setBudgetLineStatus(String budgetLineStatus) {
		this.budgetLineStatus = budgetLineStatus;
	}

	public String getForeignAmountCc() {
		return foreignAmountCc;
	}

	public void setForeignAmountCc(String foreignAmountCc) {
		this.foreignAmountCc = foreignAmountCc;
	}

	public String getMonetaryAmountCc() {
		return monetaryAmountCc;
	}

	public void setMonetaryAmountCc(String monetaryAmountCc) {
		this.monetaryAmountCc = monetaryAmountCc;
	}

	public String getEntryEvent() {
		return entryEvent;
	}

	public void setEntryEvent(String entryEvent) {
		this.entryEvent = entryEvent;
	}

	public String getDebitCredit() {
		return debitCredit;
	}

	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}

	public String getInProcessFlg() {
		return inProcessFlg;
	}

	public void setInProcessFlg(String inProcessFlg) {
		this.inProcessFlg = inProcessFlg;
	}

	public String getEeProcStatus() {
		return eeProcStatus;
	}

	public void setEeProcStatus(String eeProcStatus) {
		this.eeProcStatus = eeProcStatus;
	}

	public String getIuAnchorFlg() {
		return iuAnchorFlg;
	}

	public void setIuAnchorFlg(String iuAnchorFlg) {
		this.iuAnchorFlg = iuAnchorFlg;
	}

	public String getIuSysTranCd() {
		return iuSysTranCd;
	}

	public void setIuSysTranCd(String iuSysTranCd) {
		this.iuSysTranCd = iuSysTranCd;
	}

	public String getIuTranCd() {
		return iuTranCd;
	}

	public void setIuTranCd(String iuTranCd) {
		this.iuTranCd = iuTranCd;
	}

	public String getOpenItemKey() {
		return openItemKey;
	}

	public void setOpenItemKey(String openItemKey) {
		this.openItemKey = openItemKey;
	}

	public String getSeqNum() {
		return seqNum;
	}

	public void setSeqNum(String seqNum) {
		this.seqNum = seqNum;
	}

	public String getFedDistribStatus() {
		return fedDistribStatus;
	}

	public void setFedDistribStatus(String fedDistribStatus) {
		this.fedDistribStatus = fedDistribStatus;
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
	
	
	
	
	
	
	
	
	
	
	
}
