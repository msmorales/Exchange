package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestRest{
	
	@NotNull(message = "pTipoId no puede ser nulo")
	@NotEmpty(message = "pTipoId no puede estar vacio")
	@Size(max = 200, message = "pTipoId debe ser de 200 caracteres")
	private String pTipoId;
	
	@NotNull(message = "pNumeroId no puede ser nulo")
	@NotEmpty(message = "pNumeroId no puede estar vacio")
	@Size(max = 200, message = "pNumeroId debe ser de 200 caracteres")
	private String pNumeroId;
	
	@NotNull(message = "pBanco no puede ser nulo")
	@NotEmpty(message = "pBanco no puede estar vacio")
	@Pattern(regexp = "-?([0-9]{01,3}+)|()$", message = "El campo pBanco debe ser entero de maximo 3 digitos")
	private String pBanco;
	
	@NotNull(message = "pSucursal no puede ser nulo")
	@Size(max = 5, message = "pSucursal debe ser de 5 caracteres")
	private String pSucursal;
	
	@NotNull(message = "pNumeroCuenta no puede ser nulo")
	@Size(max = 20, message = "pNumeroCuenta debe ser de 20 caracteres")
	private String pNumeroCuenta;
	
	@NotNull(message = "pTpoCuenta no puede ser nulo")
	@Size(max = 2, message = "pTpoCuenta debe ser de 2 caracteres")
	private String pTpoCuenta;
	
	@NotNull(message = "pFormaPago no puede ser nulo")
	@Size(max = 10, message = "pFormaPago debe ser de 10 caracteres")
	private String pFormaPago;

	public String getpTipoId() {
		return pTipoId;
	}

	public void setpTipoId(String pTipoId) {
		this.pTipoId = pTipoId;
	}

	public String getpNumeroId() {
		return pNumeroId;
	}

	public void setpNumeroId(String pNumeroId) {
		this.pNumeroId = pNumeroId;
	}

	public String getpBanco() {
		return pBanco;
	}

	public void setpBanco(String pBanco) {
		this.pBanco = pBanco;
	}

	public String getpSucursal() {
		return pSucursal;
	}

	public void setpSucursal(String pSucursal) {
		this.pSucursal = pSucursal;
	}

	public String getpNumeroCuenta() {
		return pNumeroCuenta;
	}

	public void setpNumeroCuenta(String pNumeroCuenta) {
		this.pNumeroCuenta = pNumeroCuenta;
	}

	public String getpTpoCuenta() {
		return pTpoCuenta;
	}

	public void setpTpoCuenta(String pTpoCuenta) {
		this.pTpoCuenta = pTpoCuenta;
	}

	public String getpFormaPago() {
		return pFormaPago;
	}

	public void setpFormaPago(String pFormaPago) {
		this.pFormaPago = pFormaPago;
	}

	

	}
