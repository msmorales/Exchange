package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestRest{

	@NotNull(message = "pMoviAuxiliar no puede ser nulo")
	@NotEmpty(message = "pMoviAuxiliar no puede estar vacio")
	@Size(max = 4000, message = "pMoviAuxiliar debe ser de 4000 caracteres")
	private String pMoviAuxiliar;

	@NotNull(message = "pMoviCias no puede ser nulo")
	@NotEmpty(message = "pMoviCias no puede estar vacio")
	@Size(max = 4000, message = "pMoviCias debe ser de 4000 caracteres")
	private String pMoviCias;

	@NotNull(message = "pMoviCiasOrig no puede ser nulo")
	@NotEmpty(message = "pMoviCiasOrig no puede estar vacio")
	@Size(max = 4000, message = "pMoviCiasOrig debe ser de 4000 caracteres")
	private String pMoviCiasOrig;
 
	@NotNull(message = "pMoviCuenta no puede ser nulo")
	@Pattern(regexp = "^[0-9]*$",message = "El campo pMoviCuenta debe ser numerico")
	private String pMoviCuenta;

	@NotNull(message = "pMoviDescripcion no puede ser nulo")
	@NotEmpty(message = "pMoviDescripcion no puede estar vacio")
	@Size(max = 4000, message = "pMoviDescripcion debe ser de 4000 caracteres")
	private String pMoviDescripcion;

	@NotNull(message = "pMoviFecha no puede ser nulo")
	//@Pattern(regexp = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$",message = "El campo pMoviFecha debe ser numerico")
	private String pMoviFecha;

	@NotNull(message = "pMoviFpag no puede ser nulo")
	@NotEmpty(message = "pMoviFpag no puede estar vacio")
	@Size(max = 4000, message = "pMoviFpag debe ser de 4000 caracteres")
	private String pMoviFpag;

	@NotNull(message = "pMoviNumero no puede ser nulo")
	@Pattern(regexp = "^[0-9]*$",message = "El campo pMoviNumero debe ser numerico")
	private String pMoviNumero;

	@NotNull(message = "pMoviOficina no puede ser nulo")
	@Pattern(regexp = "^[0-9]*$",message = "El campo pMoviOficina debe ser numerico")
	private String pMoviOficina;

	@NotNull(message = "pMoviOrpaVigencia no puede ser nulo")
	@Pattern(regexp = "^[0-9]*$",message = "El campo pMoviOrpaVigencia debe ser numerico")
	private String pMoviOrpaVigencia;

	@NotNull(message = "pMoviUsuaCrea no puede ser nulo")
	@Pattern(regexp = "^[0-9]*$",message = "El campo pMoviUsuaCrea debe ser numerico")
	private String pMoviUsuaCrea;

	@NotNull(message = "pMoviValor no puede ser nulo")
	@Pattern(regexp = "^[0-9]*$",message = "El campo pMoviValor debe ser numerico")
	private String pMoviValor;

	public String getpMoviAuxiliar() {
		return pMoviAuxiliar;
	}

	public void setpMoviAuxiliar(String pMoviAuxiliar) {
		this.pMoviAuxiliar = pMoviAuxiliar;
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

	public String getpMoviCuenta() {
		return pMoviCuenta;
	}

	public void setpMoviCuenta(String pMoviCuenta) {
		this.pMoviCuenta = pMoviCuenta;
	}

	public String getpMoviDescripcion() {
		return pMoviDescripcion;
	}

	public void setpMoviDescripcion(String pMoviDescripcion) {
		this.pMoviDescripcion = pMoviDescripcion;
	}

	public String getpMoviFecha() {
		return pMoviFecha;
	}

	public void setpMoviFecha(String pMoviFecha) {
		this.pMoviFecha = pMoviFecha;
	}

	public String getpMoviFpag() {
		return pMoviFpag;
	}

	public void setpMoviFpag(String pMoviFpag) {
		this.pMoviFpag = pMoviFpag;
	}

	public String getpMoviNumero() {
		return pMoviNumero;
	}

	public void setpMoviNumero(String pMoviNumero) {
		this.pMoviNumero = pMoviNumero;
	}

	public String getpMoviOficina() {
		return pMoviOficina;
	}

	public void setpMoviOficina(String pMoviOficina) {
		this.pMoviOficina = pMoviOficina;
	}

	public String getpMoviOrpaVigencia() {
		return pMoviOrpaVigencia;
	}

	public void setpMoviOrpaVigencia(String pMoviOrpaVigencia) {
		this.pMoviOrpaVigencia = pMoviOrpaVigencia;
	}

	public String getpMoviUsuaCrea() {
		return pMoviUsuaCrea;
	}

	public void setpMoviUsuaCrea(String pMoviUsuaCrea) {
		this.pMoviUsuaCrea = pMoviUsuaCrea;
	}

	public String getpMoviValor() {
		return pMoviValor;
	}

	public void setpMoviValor(String pMoviValor) {
		this.pMoviValor = pMoviValor;
	}

		
}
