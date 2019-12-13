package co.com.entelgy.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Lineas {

	@JsonProperty("FI_VCHR_LIN_STG")
	@NotNull(message = "FI_VCHR_LIN_STG no puede ser nulo")	
	@Valid
	private FiVchrLinStg fiVchrLinStg;
	
	@JsonProperty("FI_VCHR_PYM_STG")
	@NotNull(message = "FI_VCHR_PYM_STG no puede ser nulo")	
	@Valid
	private FiVchrPymStg fiVchrPymStg;

	public FiVchrLinStg getFiVchrLinStg() {
		return fiVchrLinStg;
	}

	public void setFiVchrLinStg(FiVchrLinStg fiVchrLinStg) {
		this.fiVchrLinStg = fiVchrLinStg;
	}

	public FiVchrPymStg getFiVchrPymStg() {
		return fiVchrPymStg;
	}

	public void setFiVchrPymStg(FiVchrPymStg fiVchrPymStg) {
		this.fiVchrPymStg = fiVchrPymStg;
	}
	
	
}
