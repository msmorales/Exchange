package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Linea {
	
	@JsonProperty("ID_NEGOCIO")
	@NotNull(message = "idNegocio no puede ser nulo")	
	@Size(max = 5, message = "idNegocio debe ser de 5 caracteres")
	private String idNegocio;
	
	@JsonProperty("CONSECUTIVO_LINEA")
	@NotNull(message = "consecutivoLinea no puede ser nulo")	
	@Pattern(regexp = "-?([0-9]{01,2}+)|()$", message = "El campo consecutivoLinea debe ser entero de maximo 2 digitos")
	private String consecutivoLinea;
	
	@JsonProperty("CUENTA")
	@NotNull(message = "cuenta no puede ser nulo")
	@Size(max = 10, message = "cuenta debe ser de 100 caracteres")
	private String cuenta;
	
	@JsonProperty("CUENTA_BANCARIA")
	@NotNull(message = "cuentaBancaria no puede ser nulo")
	@Size(max = 4, message = "cuentaBancaria debe ser de 4 caracteres")
	private String cuentaBancaria;
	
	@JsonProperty("TERCERO")
	@NotNull(message = "tercero no puede ser nulo")
	@Size(max = 10, message = "tercero debe ser de 10 caracteres")
	private String tercero;
	
	@JsonProperty("TIPO_DOC")
	@Size(max = 6, message = "tipoDoc debe ser de 6 caracteres")
	private String tipoDoc;
	
	@JsonProperty("SUBFIDEICOMISO")
	@NotNull(message = "subfideicomiso no puede ser nulo")
	@Size(max = 10, message = "subfideicomiso debe ser de 10 caracteres")
	private String subfideicomiso;
	
	@JsonProperty("DESCR")
	@NotNull(message = "descr no puede ser nulo")
	@Size(max = 254, message = "descr debe ser de 254 caracteres")
	private String descr;
	
	@JsonProperty("DEPARTAMENTO")
	@NotNull(message = "departamento no puede ser nulo")
	@Size(max = 10, message = "departamento debe ser de 10 caracteres")
	private String departamento;
	
	@JsonProperty("VALOR")
	@NotNull(message = "valor no puede ser nulo")
	@Pattern(regexp = "(-?[0-9]{01,20}+(\\.[0-9][0-9][0-9]?)?)|()$", message = "El campo valor debe ser numerico con maximo 20 digitos y 3 decimales")
	private String valor;
	
	@JsonProperty("CLASE")
	@NotNull(message = "clase no puede ser nulo")
	@Size(max = 5, message = "clase debe ser de 5 caracteres")
	private String clase;
	
	@JsonProperty("FONDO")
	@NotNull(message = "fondo no puede ser nulo")
	@Size(max = 5, message = "fondo debe ser de 5 caracteres")
	private String fondo;

	public String getIdNegocio() {
		return idNegocio;
	}

	public void setIdNegocio(String idNegocio) {
		this.idNegocio = idNegocio;
	}

	public String getConsecutivoLinea() {
		return consecutivoLinea;
	}

	public void setConsecutivoLinea(String consecutivoLinea) {
		this.consecutivoLinea = consecutivoLinea;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public String getTercero() {
		return tercero;
	}

	public void setTercero(String tercero) {
		this.tercero = tercero;
	}

	public String getTipoDoc() {
		return tipoDoc;
	}

	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}

	public String getSubfideicomiso() {
		return subfideicomiso;
	}

	public void setSubfideicomiso(String subfideicomiso) {
		this.subfideicomiso = subfideicomiso;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getFondo() {
		return fondo;
	}

	public void setFondo(String fondo) {
		this.fondo = fondo;
	}
	
}
