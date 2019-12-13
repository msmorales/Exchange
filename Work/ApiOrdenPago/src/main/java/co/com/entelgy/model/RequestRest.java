package co.com.entelgy.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author Miguel Pinzón
 *
 */
public class RequestRest {

	@NotNull(message = "moviApliOrig no puede ser nulo")
	@NotEmpty(message = "moviApliOrig no puede ser vacio")
	@Size(max = 3, message = "moviApliOrig debe ser de 3 caracteres")
	private String moviApliOrig;
	
	@NotNull(message = "moviCias no puede ser nulo")
	@NotEmpty(message = "moviCias no puede ser vacio")
	@Size(max = 1024, message = "moviCias debe ser de 1024 caracteres")
	private String moviCias;
	
	@NotNull(message = "moviCiasOrig no puede ser nulo")
	@NotEmpty(message = "moviCiasOrig no puede ser vacio")
	@Size(max = 1024, message = "moviCiasOrig debe ser de 1024 caracteres")
	private String moviCiasOrig;
	
	@NotNull(message = "moviOficina no puede ser nulo")
	@NotEmpty(message = "moviOficina no puede ser vacio")
	@Size(max = 3, message = "moviOficina debe ser de 3 caracteres")
	@Pattern(regexp = "[0-9]+", message = "El campo moviOficina es numerico")
	private String moviOficina;
	
	@NotNull(message = "moviNumero no puede ser nulo")
	@NotEmpty(message = "moviNumero no puede ser vacio")
	@Size(max = 10, message = "moviNumero debe ser de 10 caracteres")
	@Pattern(regexp = "[0-9]+", message = "El campo moviNumero es numerico")
	private String moviNumero;
	
	@NotNull(message = "moviOrpaVigencia no puede ser nulo")
	@Size(max = 10, message = "moviOrpaVigencia debe ser de 10 caracteres")
	@Pattern(regexp = "[0-9]+", message = "El campo moviOrpaVigencia es numerico")
	private String moviOrpaVigencia;
	
	@NotNull(message = "moviAuxiliar no puede ser nulo")
	@Size(max = 1024, message = "moviAuxiliar debe ser de 1024 caracteres")
	private String moviAuxiliar;
	
	@NotNull(message = "moviFpag no puede ser nulo")
	@Size(max = 10, message = "moviFpag debe ser de 10 caracteres")
	private String moviFpag;
	
	@NotNull(message = "moviDescripcion no puede ser nulo")
	@Size(max = 4000, message = "moviDescripcion debe ser de 4000 caracteres")
	private String moviDescripcion;
	
	@NotNull(message = "moviUsuaCrea no puede ser nulo")
	@Size(max = 20, message = "moviUsuaCrea debe ser de 20 caracteres")
	private String moviUsuaCrea;
	
	@NotNull(message = "moviFecha no puede ser nulo")
	@Size(max = 10, message = "moviFecha debe ser de 10 caracteres")
	@Pattern(regexp = "^((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])$", message = "formato de moviFecha incorrecto, debe ser yyyy-MM-dd")
	private String moviFecha;
	
	@NotNull(message = "moviCuenta no puede ser nulo")
	@Size(max = 16, message = "moviCuenta debe ser de 16 caracteres")
	private String moviCuenta;
	
	@NotNull(message = "moviValor no puede ser nulo")	
	@Size(max = 22, message = "moviValor debe ser de 22 caracteres")
	@Pattern(regexp = "^([0-9]+(\\.[0-9][0-9]?)?)|()$", message = "El campo moviValor es numerico")
	private String moviValor;

	public String getMoviApliOrig() {
		return moviApliOrig;
	}

	public void setMoviApliOrig(String moviApliOrig) {
		this.moviApliOrig = moviApliOrig;
	}

	public String getMoviCias() {
		return moviCias;
	}

	public void setMoviCias(String moviCias) {
		this.moviCias = moviCias;
	}

	public String getMoviCiasOrig() {
		return moviCiasOrig;
	}

	public void setMoviCiasOrig(String moviCiasOrig) {
		this.moviCiasOrig = moviCiasOrig;
	}

	public String getMoviOficina() {
		return moviOficina;
	}

	public void setMoviOficina(String moviOficina) {
		this.moviOficina = moviOficina;
	}

	public String getMoviNumero() {
		return moviNumero;
	}

	public void setMoviNumero(String moviNumero) {
		this.moviNumero = moviNumero;
	}

	public String getMoviOrpaVigencia() {
		return moviOrpaVigencia;
	}

	public void setMoviOrpaVigencia(String moviOrpaVigencia) {
		this.moviOrpaVigencia = moviOrpaVigencia;
	}

	public String getMoviAuxiliar() {
		return moviAuxiliar;
	}

	public void setMoviAuxiliar(String moviAuxiliar) {
		this.moviAuxiliar = moviAuxiliar;
	}

	public String getMoviFpag() {
		return moviFpag;
	}

	public void setMoviFpag(String moviFpag) {
		this.moviFpag = moviFpag;
	}

	public String getMoviDescripcion() {
		return moviDescripcion;
	}

	public void setMoviDescripcion(String moviDescripcion) {
		this.moviDescripcion = moviDescripcion;
	}

	public String getMoviUsuaCrea() {
		return moviUsuaCrea;
	}

	public void setMoviUsuaCrea(String moviUsuaCrea) {
		this.moviUsuaCrea = moviUsuaCrea;
	}

	public String getMoviFecha() {
		return moviFecha;
	}

	public void setMoviFecha(String moviFecha) {
		this.moviFecha = moviFecha;
	}

	public String getMoviCuenta() {
		return moviCuenta;
	}

	public void setMoviCuenta(String moviCuenta) {
		this.moviCuenta = moviCuenta;
	}

	public String getMoviValor() {
		return moviValor;
	}

	public void setMoviValor(String moviValor) {
		this.moviValor = moviValor;
	}
}
