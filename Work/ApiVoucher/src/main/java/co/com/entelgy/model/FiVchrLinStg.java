package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FiVchrLinStg {

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
	
	@JsonProperty("VOUCHER_LINE_NUM")
	@NotNull(message = "VOUCHER_LINE_NUM no puede ser nulo")
	private String voucherLineNum;
	
	@JsonProperty("MERCHANDISE_AMT")
	@NotNull(message = "MERCHANDISE_AMT no puede ser nulo")
	//@Size(max = 25, message = "MERCHANDISE_AMT debe ser de 22,2 caracteres")
	@Pattern(regexp = "^(-?[0-9]{01,20}+(\\.[0-9][0-9]?)?)|()$", message = "El campo MERCHANDISE_AMT es numerico de menor o igual a 20 caracteres y con maximo dos decimales")
	private String merchandiseAmt;
	
	@JsonProperty("VAT_USE_ID")
	@NotNull(message = "VAT_USE_ID no puede ser nulo")
	private String vatUseId;
	
	@JsonProperty("VAT_APPLICABILITY")
	@NotNull(message = "VAT_APPLICABILITY no puede ser nulo")
	private String vatApplicability;
	
	@JsonProperty("VAT_TXN_TYPE_CD")
	@NotNull(message = "VAT_TXN_TYPE_CD no puede ser nulo")
	private String vatTxnTypeCd;
	
	@JsonProperty("COUNTRY_VAT_PERFRM")
	@NotNull(message = "COUNTRY_VAT_PERFRM no puede ser nulo")
	private String countryVatPerfrm;
	
	@JsonProperty("DESCR")
	@NotNull(message = "DESCR no puede ser nulo")	
	@Size(max = 4000, message = "DESCR debe ser de maximo 4000 caracteres")
	private String descr;
	
	@JsonProperty("WTHD_SW")
	@NotNull(message = "WTHD_SW no puede ser nulo")	
	private String wthdSw;
	
	@JsonProperty("VOUCHER_LINE_DESCR")
	@NotNull(message = "VOUCHER_LINE_DESCR no puede ser nulo")	
	@Size(max = 4000, message = "VOUCHER_LINE_DESCR debe ser de maximo 4000 caracteres")
	private String voucherLineDescr;

	@JsonProperty("FI_VCHR_DST_STG")
	@NotNull(message = "FI_VCHR_DST_STG no puede ser nulo")
	@Valid
	private FiVchrDstStg fiVchrDstStg;
	
	
	public FiVchrDstStg getFiVchrDstStg() {
		return fiVchrDstStg;
	}

	public void setFiVchrDstStg(FiVchrDstStg fiVchrDstStg) {
		this.fiVchrDstStg = fiVchrDstStg;
	}

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

	public String getVoucherLineNum() {
		return voucherLineNum;
	}

	public void setVoucherLineNum(String voucherLineNum) {
		this.voucherLineNum = voucherLineNum;
	}

	public String getMerchandiseAmt() {
		return merchandiseAmt;
	}

	public void setMerchandiseAmt(String merchandiseAmt) {
		this.merchandiseAmt = merchandiseAmt;
	}

	public String getVatUseId() {
		return vatUseId;
	}

	public void setVatUseId(String vatUseId) {
		this.vatUseId = vatUseId;
	}

	public String getVatApplicability() {
		return vatApplicability;
	}

	public void setVatApplicability(String vatApplicability) {
		this.vatApplicability = vatApplicability;
	}

	public String getVatTxnTypeCd() {
		return vatTxnTypeCd;
	}

	public void setVatTxnTypeCd(String vatTxnTypeCd) {
		this.vatTxnTypeCd = vatTxnTypeCd;
	}

	public String getCountryVatPerfrm() {
		return countryVatPerfrm;
	}

	public void setCountryVatPerfrm(String countryVatPerfrm) {
		this.countryVatPerfrm = countryVatPerfrm;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getWthdSw() {
		return wthdSw;
	}

	public void setWthdSw(String wthdSw) {
		this.wthdSw = wthdSw;
	}

	public String getVoucherLineDescr() {
		return voucherLineDescr;
	}

	public void setVoucherLineDescr(String voucherLineDescr) {
		this.voucherLineDescr = voucherLineDescr;
	} 
		
}
