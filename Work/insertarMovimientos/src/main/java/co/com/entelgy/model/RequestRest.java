package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestRest {

    @Size(max = 4000, message = "auxi debe ser de 4000 caracteres")
	private String auxi;

    @NotNull(message = "cias no puede ser nulo")
    @NotEmpty(message = "cias no puede estar vacio")
    @Size(max = 4000, message = "cias debe ser de 4000 caracteres")
	private String cias;
    
    @NotNull(message = "ciasDest no puede ser nulo")
    @NotEmpty(message = "ciasDest no puede estar vacio")
    @Size(max = 4000, message = "ciasDest debe ser de 4000 caracteres")
	private String ciasDest;
    
    @Size(max = 4000, message = "descri debe ser de 4000 caracteres")
	private String descri;
    
    @Size(max = 4000, message = "encargo debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "encargo debe ser double")
	private String encargo;
    
    @Size(max = 4000, message = "encargoDest debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "encargoDest debe ser double")
	private String encargoDest;
    
    @Size(max = 4000, message = "entidad debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "entidad debe ser double")
	private String entidad;
	
    @Size(max = 10, message = "fecha debe ser de 10 caracteres")
    @Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])|()$", message = "formato de fecha incorrecto, debe ser yyyy-MM-dd")
    private String fecha;
    
    @Size(max = 4000, message = "pFpago debe ser de 4000 caracteres")
	private String pFpago;
    
    @Size(max = 4000, message = "pOrpaVigencia debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "pOrpaVigencia debe ser double")
	private String pOrpaVigencia;
    
    @Size(max = 4000, message = "pOrpaNumero debe ser de 4000 caracteres")
	private String pOrpaNumero;
    
    @Size(max = 4000, message = "pValor debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "pValor debe ser double")
	private String pValor;
    
    @Size(max = 4000, message = "pGravamen debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "pGravamen debe ser double")
	private String pGravamen;
    
    @Size(max = 4000, message = "pCuenta debe ser de 4000 caracteres")
	private String pCuenta;
    
    @Size(max = 4000, message = "pMoviCtaDest debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "pMoviCtaDest debe ser double")
	private String pMoviCtaDest;
    
    @Size(max = 4000, message = "pMoviTpctDest debe ser de 4000 caracteres")
	private String pMoviTpctDest;
    
    @Size(max = 4000, message = "pMoviTpctPag debe ser de 4000 caracteres")
	private String pMoviTpctPag;
    
    @Size(max = 4000, message = "pFondo debe ser de 4000 caracteres")
	private String pFondo;
    
    @NotNull(message = "pTipoReg no puede ser nulo")
    @NotEmpty(message = "pTipoReg no puede estar vacio")
    @Size(max = 4000, message = "pTipoReg debe ser de 4000 caracteres")
	private String pTipoReg;

	public String getAuxi() {
		return auxi;
	}

	public void setAuxi(String auxi) {
		this.auxi = auxi;
	}

	public String getCias() {
		return cias;
	}

	public void setCias(String cias) {
		this.cias = cias;
	}

	public String getCiasDest() {
		return ciasDest;
	}

	public void setCiasDest(String ciasDest) {
		this.ciasDest = ciasDest;
	}

	public String getDescri() {
		return descri;
	}

	public void setDescri(String descri) {
		this.descri = descri;
	}

	public String getEncargo() {
		return encargo;
	}

	public void setEncargo(String encargo) {
		this.encargo = encargo;
	}

	public String getEncargoDest() {
		return encargoDest;
	}

	public void setEncargoDest(String encargoDest) {
		this.encargoDest = encargoDest;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getpFpago() {
		return pFpago;
	}

	public void setpFpago(String pFpago) {
		this.pFpago = pFpago;
	}

	public String getpOrpaVigencia() {
		return pOrpaVigencia;
	}

	public void setpOrpaVigencia(String pOrpaVigencia) {
		this.pOrpaVigencia = pOrpaVigencia;
	}

	public String getpOrpaNumero() {
		return pOrpaNumero;
	}

	public void setpOrpaNumero(String pOrpaNumero) {
		this.pOrpaNumero = pOrpaNumero;
	}

	public String getpValor() {
		return pValor;
	}

	public void setpValor(String pValor) {
		this.pValor = pValor;
	}

	public String getpGravamen() {
		return pGravamen;
	}

	public void setpGravamen(String pGravamen) {
		this.pGravamen = pGravamen;
	}

	public String getpCuenta() {
		return pCuenta;
	}

	public void setpCuenta(String pCuenta) {
		this.pCuenta = pCuenta;
	}

	public String getpMoviCtaDest() {
		return pMoviCtaDest;
	}

	public void setpMoviCtaDest(String pMoviCtaDest) {
		this.pMoviCtaDest = pMoviCtaDest;
	}

	public String getpMoviTpctDest() {
		return pMoviTpctDest;
	}

	public void setpMoviTpctDest(String pMoviTpctDest) {
		this.pMoviTpctDest = pMoviTpctDest;
	}

	public String getpMoviTpctPag() {
		return pMoviTpctPag;
	}

	public void setpMoviTpctPag(String pMoviTpctPag) {
		this.pMoviTpctPag = pMoviTpctPag;
	}

	public String getpFondo() {
		return pFondo;
	}

	public void setpFondo(String pFondo) {
		this.pFondo = pFondo;
	}

	public String getpTipoReg() {
		return pTipoReg;
	}

	public void setpTipoReg(String pTipoReg) {
		this.pTipoReg = pTipoReg;
	}
}
