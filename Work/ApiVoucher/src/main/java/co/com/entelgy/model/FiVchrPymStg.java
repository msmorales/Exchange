package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FiVchrPymStg {

	@JsonProperty("BUSINESS_UNIT")
	@NotNull(message = "BUSINESS_UNIT no puede ser nulo")
	@NotEmpty(message = "BUSINESS_UNIT no puede ser vacio")
	@Size(max = 1024, message = "BUSINESS_UNIT debe ser de maximo 1024 caracteres")
	private String businessUnit;

	@JsonProperty("VCHR_BLD_KEY_N2")
	@NotNull(message = "VCHR_BLD_KEY_N2 no puede ser nulo")
	@NotEmpty(message = "VCHR_BLD_KEY_N2 no puede ser vacio")
	@Pattern(regexp = "^-?[0-9]{01,10}+|()$", message = "El campo vchrBldKeyN2 es numero entero de maximo 10 caracteres")
	private String vchrBldKeyN2;

	@JsonProperty("VOUCHER_ID")
	@NotNull(message = "VOUCHER_ID no puede ser nulo")
	private String voucherId;

	@JsonProperty("LEASE_PYMNT_DT")
	@NotNull(message = "LEASE_PYMNT_DT no puede ser nulo")
	@Size(max = 10, message = "LEASE_PYMNT_DT debe ser de 10 caracteres")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])|()$", message = "formato de LEASE_PYMNT_DT incorrecto, debe ser yyyy-MM-dd")
	private String leasePymntDt;

	@JsonProperty("PYMNT_CNT")
	@NotNull(message = "PYMNT_CNT no puede ser nulo")
	@Pattern(regexp = "(-?[0-9]+)|()", message = "El campo PYMNT_CNT es numero entero")
	private String pymntCnt; 
	
	@JsonProperty("BANK_CD")
	@NotNull(message = "BANK_CD no puede ser nulo")
	private String bankCd; 
	
	@JsonProperty("BANK_ACCT_KEY")
	@NotNull(message = "BANK_ACCT_KEY no puede ser nulo")	
	private String bankAcctKey;
	
	@JsonProperty("PYMNT_METHOD")
	@NotNull(message = "PYMNT_METHOD no puede ser nulo")
	@Size(max = 10, message = "PYMNT_METHOD debe ser de maximo 10 caracteres")	
	private String pymntMethod;
	
	@JsonProperty("FF_DET_PAGO")
	@NotNull(message = "FF_DET_PAGO no puede ser nulo")
	@Size(max = 10, message = "ffDetPago debe ser de maximo 10 caracteres")	
	private String ffDetPago;
	
	@JsonProperty("FF_TIPOTRANSACCION")
	@NotNull(message = "FF_TIPOTRANSACCION no puede ser nulo")
	@Size(max = 10, message = "FF_TIPOTRANSACCION debe ser de maximo 10 caracteres")	
	private String ffTipotransaccion;
	
	@JsonProperty("REMIT_SETID")
	@NotNull(message = "REMIT_SETID no puede ser nulo")
	@Size(max = 10, message = "REMIT_SETID debe ser de maximo 10 caracteres")	
	private String remitSetid; 
		
	
	@JsonProperty("REMIT_VENDOR")
	@NotNull(message = "REMIT_VENDOR no puede ser nulo")
	@Size(max = 10, message = "REMIT_VENDOR debe ser de maximo 10 caracteres")	
	private String remitVendor;
	
	@JsonProperty("BANK_ACCT_SEQ_NBR")
	@NotNull(message = "BANK_ACCT_SEQ_NBR no puede ser nulo")
	//@Size(max = 10, message = "BANK_ACCT_SEQ_NBR debe ser de 10 caracteres")
	@Pattern(regexp = "^-?[0-9]{01,10}+|()$", message = "El campo BANK_ACCT_SEQ_NBR es numero entero de 10 caracteres")
	private String bankAcctSeqNbr;
	
	@JsonProperty("VNDR_LOC")
	@NotNull(message = "VNDR_LOC no puede ser nulo")
	@Size(max = 10, message = "VNDR_LOC debe ser de maximo 10 caracteres")	
	private String vndrLoc; 
	
	@JsonProperty("PYMNT_GROUP_CD")
	@NotNull(message = "PYMNT_GROUP_CD no puede ser nulo")
	private String pymntGroupCd; 
	
	@JsonProperty("PYMNT_MESSAGE")
	@NotNull(message = "PYMNT_MESSAGE no puede ser nulo")
	@Size(max = 4000, message = "PYMNT_MESSAGE debe ser de maximo 4000 caracteres")	
	private String pymntMessage;
	
	@JsonProperty("FF_GMF_PAGO")
	@NotNull(message = "FF_GMF_PAGO no puede ser nulo")	
	private String ffGmfPago;
	
	@JsonProperty("FF_TARIFA_GMF")
	@NotNull(message = "FF_TARIFA_GMF no puede ser nulo")	
	@Pattern(regexp = "^-?[0-9]+|()$", message = "El campo FF_TARIFA_GMF es numero entero")
	private String ffTarifaGmf;

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

	public String getPymntCnt() {
		return pymntCnt;
	}

	public void setPymntCnt(String pymntCnt) {
		this.pymntCnt = pymntCnt;
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

	public String getPymntMethod() {
		return pymntMethod;
	}

	public void setPymntMethod(String pymntMethod) {
		this.pymntMethod = pymntMethod;
	}

	public String getFfDetPago() {
		return ffDetPago;
	}

	public void setFfDetPago(String ffDetPago) {
		this.ffDetPago = ffDetPago;
	}

	public String getFfTipotransaccion() {
		return ffTipotransaccion;
	}

	public void setFfTipotransaccion(String ffTipotransaccion) {
		this.ffTipotransaccion = ffTipotransaccion;
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

	public String getBankAcctSeqNbr() {
		return bankAcctSeqNbr;
	}

	public void setBankAcctSeqNbr(String bankAcctSeqNbr) {
		this.bankAcctSeqNbr = bankAcctSeqNbr;
	}

	public String getVndrLoc() {
		return vndrLoc;
	}

	public void setVndrLoc(String vndrLoc) {
		this.vndrLoc = vndrLoc;
	}

	public String getPymntGroupCd() {
		return pymntGroupCd;
	}

	public void setPymntGroupCd(String pymntGroupCd) {
		this.pymntGroupCd = pymntGroupCd;
	}

	public String getPymntMessage() {
		return pymntMessage;
	}

	public void setPymntMessage(String pymntMessage) {
		this.pymntMessage = pymntMessage;
	}

	public String getFfGmfPago() {
		return ffGmfPago;
	}

	public void setFfGmfPago(String ffGmfPago) {
		this.ffGmfPago = ffGmfPago;
	}

	public String getFfTarifaGmf() {
		return ffTarifaGmf;
	}

	public void setFfTarifaGmf(String ffTarifaGmf) {
		this.ffTarifaGmf = ffTarifaGmf;
	}
	
}
