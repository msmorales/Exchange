package co.com.entelgy.model;

import java.util.ArrayList;

import javax.validation.Valid;
import javax.validation.constraints.Digits.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class RequestRest {
	
	@JsonProperty("ID_NEGOCIO")
	@NotNull(message = "idNegocio no puede ser nulo")	
	@Size(max = 5, message = "idNegocio debe ser de 5 caracteres")
	private String idNegocio;
	
	@JsonProperty("ACCOUNTING_PERIOD")
	@NotNull(message = "accountingPeriod no puede ser nulo")	
	@Pattern(regexp = "-?([0-9]{01,3}+)|()$", message = "El campo accountingPeriod debe ser entero de maximo 3 caracteres")
	private String accountingPeriod;
	
	@JsonProperty("FECHA_ASIENTO")
	@NotNull(message = "fechaAsiento no puede ser nulo")
	@Size(max = 10, message = "fechaAsiento debe ser de 10 caracteres maximo")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])|()$", message = "El campo fechaAsiento debe ser yyyy-MM-dd")
	private String fechaAsiento;
	
	@JsonProperty("DESCR")
	@NotNull(message = "descr no puede ser nulo")
	@Size(max = 254, message = "descr debe ser de 254 caracteres")
	private String descr;
	
	@JsonProperty("ORIGEN")
	@NotNull(message = "origen no puede ser nulo")
	@Size(max = 3, message = "origen debe ser de 3 caracteres")
	private String origen;
	
	@JsonProperty("LINEAS")
	@NotNull(message = "lineas no puede ser nulo")
	@NotEmpty(message = "lineas no puede ser vacio")
	@Valid
	private ArrayList<Linea> lineas;

	

	public ArrayList<Linea> getLineas() {
		return lineas;
	}

	public void setLineas(ArrayList<Linea> lineas) {
		this.lineas = lineas;
	}

	public String getIdNegocio() {
		return idNegocio;
	}

	public void setIdNegocio(String idNegocio) {
		this.idNegocio = idNegocio;
	}

	public String getAccountingPeriod() {
		return accountingPeriod;
	}

	public void setAccountingPeriod(String accountingPeriod) {
		this.accountingPeriod = accountingPeriod;
	}

	public String getFechaAsiento() {
		return fechaAsiento;
	}

	public void setFechaAsiento(String fechaAsiento) {
		this.fechaAsiento = fechaAsiento;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}


	
	
}
