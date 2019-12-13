package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.HeaderParam;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Miguel Pinzón
 *
 */

public class RequestRest {	

	@JsonProperty("DESCR")
	@NotNull(message = "DESCR no puede ser nulo")		
	private String descr;
	
	@JsonProperty("ORIGEN")
	@NotNull(message = "ORIGEN no puede ser nulo")	
	private String origen;
	
	@JsonProperty("FI_VCHR_HDR_STG")
	@NotNull(message = "FI_VCHR_HDR_STG no puede ser nulo")	
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
