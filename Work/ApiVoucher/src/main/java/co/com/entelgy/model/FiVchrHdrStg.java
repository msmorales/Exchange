package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FiVchrHdrStg {

	@JsonProperty("BUSINESS_UNIT")
	@NotNull(message = "BUSINESS_UNIT no puede ser nulo")
	@NotEmpty(message = "BUSINESS_UNIT no puede ser vacio")
	@Size(max = 1024, message = "BUSINESS_UNIT debe ser de maximo 1024 caracteres")
	private String businessUnit;
	
	@JsonProperty("VCHR_BLD_KEY_N2")
	@NotNull(message = "VCHR_BLD_KEY_N2 no puede ser nulo")
	@NotEmpty(message = "VCHR_BLD_KEY_N2 no puede ser vacio")
	//@Size(max = 10, message = "VCHR_BLD_KEY_N2 debe ser de 10 caracteres")
	@Pattern(regexp = "^-?[0-9]{01,10}+|()$", message = "El campo VCHR_BLD_KEY_N2 es numero entero de maximo 10 caracteres")
	private String vchrBldKeyN2;
	
	@JsonProperty("VOUCHER_ID")
	@NotNull(message = "VOUCHER_ID no puede ser nulo")	
	private String voucherId;
	
	@JsonProperty("LEASE_PYMNT_DT")
	@NotNull(message = "LEASE_PYMNT_DT no puede ser nulo")
	@Size(max = 10, message = "LEASE_PYMNT_DT debe ser de 10 caracteres")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])|()$", message = "formato de LEASE_PYMNT_DT incorrecto, debe ser yyyy-MM-dd")
	private String leasePymntDt;
	
	@JsonProperty("ORIGIN")
	@NotNull(message = "ORIGIN no puede ser nulo")
	private String origin;
	
	@JsonProperty("POST_VOUCHER")
	@NotNull(message = "POST_VOUCHER no puede ser nulo")
	private String postVoucher;
	
	@JsonProperty("TAX_EXEMPT")
	@NotNull(message = "TAX_EXEMPT no puede ser nulo")
	private String taxExempt;
	
	@JsonProperty("RT_TYPE")
	@NotNull(message = "RT_TYPE no puede ser nulo")
	private String rtType;
	
	@JsonProperty("RATE_MULT")
	@NotNull(message = "RATE_MULT no puede ser nulo")
	private String rateMult;
	
	@JsonProperty("RATE_DIV")
	@NotNull(message = "RATE_DIV no puede ser nulo")
	private String rateDiv;
	
	@JsonProperty("MATCH_ACTION")
	@NotNull(message = "MATCH_ACTION no puede ser nulo")
	private String matchAction;
	
	@JsonProperty("VCHR_SRC")
	@NotNull(message = "VCHR_SRC no puede ser nulo")
	private String vchrSrc;
	
	@JsonProperty("ACCOUNTING_DT")
	@NotNull(message = "ACCOUNTING_DT no puede ser nulo")	
	@Size(max = 10, message = "ACCOUNTING_DT debe ser de 10 caracteres")
	@Pattern(regexp = "^(((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01]))|()$", message = "formato de ACCOUNTING_DT incorrecto, debe ser yyyy-MM-dd")
	private String accountingDt;
	
	@JsonProperty("GROSS_AMT")
	@NotNull(message = "GROSS_AMT no puede ser nulo")	
	//@Size(max = 25, message = "GROSS_AMT debe ser de 22.2 caracteres")
	@Pattern(regexp = "^(-?[0-9]{01,20}+(\\.[0-9][0-9]?)?)|()$", message = "El campo GROSS_AMT es numerico de menor o igual a 20 caracteres y con maximo dos decimales")
	private String grossAmt;
	
	@JsonProperty("VENDOR_SETID")
	@NotNull(message = "VENDOR_SETID no puede ser nulo")
	private String vendorSetid;
	
	@JsonProperty("VENDOR_ID")
	@NotNull(message = "VENDOR_ID no puede ser nulo")
	@Size(max = 4000, message = "VENDOR_ID debe ser de maximo 4000 caracteres")	
	private String vendorId;
	
	@JsonProperty("VNDR_LOC")
	@NotNull(message = "VNDR_LOC no puede ser nulo")
	private String vndrLoc;
	
	@JsonProperty("COUNTRY_VAT_PERFRM")
	@NotNull(message = "COUNTRY_VAT_PERFRM no puede ser nulo")	
	private String countryVatPerfrm;
	
	@JsonProperty("TXN_CURRENCY_CD")
	@NotNull(message = "TXN_CURRENCY_CD no puede ser nulo")		
	private String txnCurrencyCd;
	
	@JsonProperty("DESCR254_MIXED")
	@NotNull(message = "DESCR254_MIXED no puede ser nulo")	
	@Size(max = 4000, message = "DESCR254_MIXED debe ser de maximo 4000 caracteres")	
	private String descr254Mixed;
	
	@JsonProperty("DOC_TYPE")
	@NotNull(message = "DOC_TYPE no puede ser nulo")	
	private String docType;
	
	@JsonProperty("VOUCHER_STYLE")
	@NotNull(message = "VOUCHER_STYLE no puede ser nulo")	
	private String voucherStyle;
	
	@JsonProperty("VAT_ENTRD_AMT")
	@NotNull(message = "VAT_ENTRD_AMT no puede ser nulo")	
	@Pattern(regexp = "^-?[0-9]+|()$", message = "El campo VAT_ENTRD_AMT es numero entero")
	private String vatEntrdAmt;
		
	
	@JsonProperty("VAT_CALC_TYPE")
	@NotNull(message = "VAT_CALC_TYPE no puede ser nulo")		
	private String vatCalcType;
	
	@JsonProperty("PYMNT_TERMS_CD")
	@NotNull(message = "PYMNT_TERMS_CD no puede ser nulo")	
	private String pymntTermsCd;
	
	@JsonProperty("DST_CNTRL_ID")
	@NotNull(message = "DST_CNTRL_ID no puede ser nulo")	
	private String dstCntrlId;
	
	@JsonProperty("INVOICE_ID")
	@NotNull(message = "INVOICE_ID no puede ser nulo")	
	private String invoiceId;
	
	@JsonProperty("LINEAS")
	@NotNull(message = "lineas no puede ser nulo")	
	@Valid
	private Lineas lineas;

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getVchrBldKeyN2() {
		return vchrBldKeyN2;
	}

	public void setVchrBldKeyN2(String vchrBldKeyN2) {
		this.vchrBldKeyN2 = vchrBldKeyN2;
	}

	public String getVoucherId() {
		return voucherId;
	}

	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

	public String getLeasePymntDt() {
		return leasePymntDt;
	}

	public void setLeasePymntDt(String leasePymntDt) {
		this.leasePymntDt = leasePymntDt;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getPostVoucher() {
		return postVoucher;
	}

	public void setPostVoucher(String postVoucher) {
		this.postVoucher = postVoucher;
	}

	public String getTaxExempt() {
		return taxExempt;
	}

	public void setTaxExempt(String taxExempt) {
		this.taxExempt = taxExempt;
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

	public String getMatchAction() {
		return matchAction;
	}

	public void setMatchAction(String matchAction) {
		this.matchAction = matchAction;
	}

	public String getVchrSrc() {
		return vchrSrc;
	}

	public void setVchrSrc(String vchrSrc) {
		this.vchrSrc = vchrSrc;
	}

	public String getAccountingDt() {
		return accountingDt;
	}

	public void setAccountingDt(String accountingDt) {
		this.accountingDt = accountingDt;
	}

	public String getGrossAmt() {
		return grossAmt;
	}

	public void setGrossAmt(String grossAmt) {
		this.grossAmt = grossAmt;
	}

	public String getVendorSetid() {
		return vendorSetid;
	}

	public void setVendorSetid(String vendorSetid) {
		this.vendorSetid = vendorSetid;
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

	public String getCountryVatPerfrm() {
		return countryVatPerfrm;
	}

	public void setCountryVatPerfrm(String countryVatPerfrm) {
		this.countryVatPerfrm = countryVatPerfrm;
	}

	public String getTxnCurrencyCd() {
		return txnCurrencyCd;
	}

	public void setTxnCurrencyCd(String txnCurrencyCd) {
		this.txnCurrencyCd = txnCurrencyCd;
	}

	public String getDescr254Mixed() {
		return descr254Mixed;
	}

	public void setDescr254Mixed(String descr254Mixed) {
		this.descr254Mixed = descr254Mixed;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getVoucherStyle() {
		return voucherStyle;
	}

	public void setVoucherStyle(String voucherStyle) {
		this.voucherStyle = voucherStyle;
	}

	public String getVatEntrdAmt() {
		return vatEntrdAmt;
	}

	public void setVatEntrdAmt(String vatEntrdAmt) {
		this.vatEntrdAmt = vatEntrdAmt;
	}

	public String getVatCalcType() {
		return vatCalcType;
	}

	public void setVatCalcType(String vatCalcType) {
		this.vatCalcType = vatCalcType;
	}

	public String getPymntTermsCd() {
		return pymntTermsCd;
	}

	public void setPymntTermsCd(String pymntTermsCd) {
		this.pymntTermsCd = pymntTermsCd;
	}

	public String getDstCntrlId() {
		return dstCntrlId;
	}

	public void setDstCntrlId(String dstCntrlId) {
		this.dstCntrlId = dstCntrlId;
	}

	public String getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Lineas getLineas() {
		return lineas;
	}

	public void setLineas(Lineas lineas) {
		this.lineas = lineas;
	}	
}
