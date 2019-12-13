package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestRest {

    @NotNull(message = "pMoviTipoDoc no puede ser nulo")
    @NotEmpty(message = "pMoviTipoDoc no puede estar vacio")
    @Size(max = 4000, message = "pMoviTipoDoc debe ser de 4000 caracteres")
	private String pMoviTipoDoc;

    @NotNull(message = "pMoviCias no puede ser nulo")
    @NotEmpty(message = "pMoviCias no puede estar vacio")
    @Size(max = 4000, message = "pMoviCias debe ser de 4000 caracteres")
	private String pMoviCias;
	
    @Size(max = 4000, message = "pMoviCiasOrig debe ser de 4000 caracteres")
	private String pMoviCiasOrig;
	
    @NotNull(message = "pMoviOficina no puede ser nulo")
    @NotEmpty(message = "pMoviOficina no puede estar vacio")
    @Size(max = 4000, message = "pMoviOficina debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "pMoviOficina debe ser double")
	private String pMoviOficina;
	
    @NotNull(message = "pMoviNumero no puede ser nulo")
    @NotEmpty(message = "pMoviNumero no puede estar vacio")
    @Size(max = 4000, message = "pMoviNumero debe ser de 4000 caracteres")
	private String pMoviNumero;
	
    @Size(max = 4000, message = "pMoviRenglon debe ser de 38 caracteres")
    @Pattern(regexp = "^([0-9]+\\.?[0-9]*)|()$", message = "pMoviRenglon debe ser double")
	private String pMoviRenglon;
	
    @Size(max = 4000, message = "p1AplicaNx1000 debe ser de 4000 caracteres")
	private String p1AplicaNx1000;
	
    @Size(max = 4000, message = "iMensajeTercero_inout debe ser de 4000 caracteres")
	private String iMensajeTercero_inout;

	public String getpMoviTipoDoc() {
		return pMoviTipoDoc;
	}

	public void setpMoviTipoDoc(String pMoviTipoDoc) {
		this.pMoviTipoDoc = pMoviTipoDoc;
	}

	public String getpMoviCias() {
		return pMoviCias;
	}

	public void setpMoviCias(String pMoviCias) {
		this.pMoviCias = pMoviCias;
	}

	public String getpMoviCiasOrig() {
		return pMoviCiasOrig;
	}

	public void setpMoviCiasOrig(String pMoviCiasOrig) {
		this.pMoviCiasOrig = pMoviCiasOrig;
	}

	public String getpMoviOficina() {
		return pMoviOficina;
	}

	public void setpMoviOficina(String pMoviOficina) {
		this.pMoviOficina = pMoviOficina;
	}

	public String getpMoviNumero() {
		return pMoviNumero;
	}

	public void setpMoviNumero(String pMoviNumero) {
		this.pMoviNumero = pMoviNumero;
	}

	public String getpMoviRenglon() {
		return pMoviRenglon;
	}

	public void setpMoviRenglon(String pMoviRenglon) {
		this.pMoviRenglon = pMoviRenglon;
	}

	public String getP1AplicaNx1000() {
		return p1AplicaNx1000;
	}

	public void setP1AplicaNx1000(String p1AplicaNx1000) {
		this.p1AplicaNx1000 = p1AplicaNx1000;
	}

	public String getiMensajeTercero_inout() {
		return iMensajeTercero_inout;
	}

	public void setiMensajeTercero_inout(String iMensajeTercero_inout) {
		this.iMensajeTercero_inout = iMensajeTercero_inout;
	}

}
