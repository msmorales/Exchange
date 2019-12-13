package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Cabecera {

	@NotNull(message = "descr no puede ser nulo")	
	@Size(max = 30, message = "descr debe ser de maximo 30 caracteres")
	private String descr;
	
	@NotNull(message = "origen no puede ser nulo")	
	@Size(max = 3, message = "origen debe ser de maximo 3 caracteres")
	private String origen;
	
	@NotNull(message = "fiVchrHdrStg no puede ser nulo")	
	@Valid
	private FiVchrHdrStg fiVchrHdrStg;

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

	public FiVchrHdrStg getFiVchrHdrStg() {
		return fiVchrHdrStg;
	}

	public void setFiVchrHdrStg(FiVchrHdrStg fiVchrHdrStg) {
		this.fiVchrHdrStg = fiVchrHdrStg;
	}
}
