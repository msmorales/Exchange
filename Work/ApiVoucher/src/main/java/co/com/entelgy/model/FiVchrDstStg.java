package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FiVchrDstStg {
	
	@JsonProperty("BUSINESS_UNIT")
	@NotNull(message = "BUSINESS_UNIT no puede ser nulo")
	@NotEmpty(message = "BUSINESS_UNIT no puede ser vacio")
	@Size(max = 1024, message = "BUSINESS_UNIT debe ser de maximo 1024 caracteres")
	private String businessUnit;
	
	@JsonProperty("BUSINESS_UNIT_GL")
	@NotNull(message = "BUSINESS_UNIT_GL no puede ser nulo")
	@Size(max = 1024, message = "BUSINESS_UNIT_GL debe ser de maximo 1024 caracteres")	
	private String businessUnitGl;
	
	@JsonProperty("VCHR_BLD_KEY_N2")
	@NotNull(message = "VCHR_BLD_KEY_N2 no puede ser nulo")
	@NotEmpty(message = "VCHR_BLD_KEY_N2 no puede ser vacio")
	//@Size(max = 10, message = "VCHR_BLD_KEY_N2 debe ser de 10 caracteres")
	@Pattern(regexp = "^-?[0-9]{01,10}+|()$", message = "El campo VCHR_BLD_KEY_N2 es numero entero de maximo 10 caracteres")
	private String vchrBldKeyN2;
	
	@JsonProperty("MERCHANDISE_AMT")
	@NotNull(message = "MERCHANDISE_AMT no puede ser nulo")
	//@Size(max = 25, message = "MERCHANDISE_AMT debe ser de 22.2 caracteres")
	@Pattern(regexp = "^(-?[0-9]{01,20}+(\\.[0-9][0-9]?)?)|()$", message = "El campo MERCHANDISE_AMT es numerico de menor o igual a 20 caracteres y con maximo dos decimales")
	private String merchandiseAmt; 

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
	
	@JsonProperty("DISTRIB_LINE_NUM")
	@NotNull(message = "DISTRIB_LINE_NUM no puede ser nulo")
	private String distribLineNum;
	
	@JsonProperty("ACCOUNT")
	@NotNull(message = "ACCOUNT no puede ser nulo")
	@Size(max = 16, message = "ACCOUNT debe ser de maximo 16 caracteres")	
	private String account;
	
	@JsonProperty("FUND_CODE")
	@NotNull(message = "FUND_CODE no puede ser nulo")
	@Size(max = 5, message = "FUND_CODE debe ser de maximo 5 caracteres")	
	private String fundCode;
		
	@JsonProperty("VAT_TXN_TYPE_CD")
	@NotNull(message = "VAT_TXN_TYPE_CD no puede ser nulo")	
	private String vatTxnTypeCd;
	
	@JsonProperty("CHARTFIELD2")
	@NotNull(message = "CHARTFIELD2 no puede ser nulo")
	@Size(max = 10, message = "CHARTFIELD2 debe ser de maximo 10 caracteres")	
	private String chartfield2;
	
	@JsonProperty("CHARTFIELD3")
	@NotNull(message = "CHARTFIELD3 no puede ser nulo")
	private String chartfield3;

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getBusinessUnitGl() {
		return businessUnitGl;
	}

	public void setBusinessUnitGl(String businessUnitGl) {
		this.businessUnitGl = businessUnitGl;
	}

	public String getVchrBldKeyN2() {
		return vchrBldKeyN2;
	}

	public void setVchrBldKeyN2(String vchrBldKeyN2) {
		this.vchrBldKeyN2 = vchrBldKeyN2;
	}

	public String getMerchandiseAmt() {
		return merchandiseAmt;
	}

	public void setMerchandiseAmt(String merchandiseAmt) {
		this.merchandiseAmt = merchandiseAmt;
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

	public String getDistribLineNum() {
		return distribLineNum;
	}

	public void setDistribLineNum(String distribLineNum) {
		this.distribLineNum = distribLineNum;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getFundCode() {
		return fundCode;
	}

	public void setFundCode(String fundCode) {
		this.fundCode = fundCode;
	}

	public String getVatTxnTypeCd() {
		return vatTxnTypeCd;
	}

	public void setVatTxnTypeCd(String vatTxnTypeCd) {
		this.vatTxnTypeCd = vatTxnTypeCd;
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
