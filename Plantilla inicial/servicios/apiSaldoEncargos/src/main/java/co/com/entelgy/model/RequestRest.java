package co.com.entelgy.model;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class RequestRest {

    @NotNull(message = "pMoviCias no puede ser nulo")
    @NotEmpty(message = "pMoviCias no puede estar vacio")
    @Size(max = 4000, message = "pMoviCias debe ser de 4000 caracteres")
	private String pMoviCias;
    
    @NotNull(message = "pMoviCiasOrig no puede ser nulo")
    @NotEmpty(message = "pMoviCiasOrig no puede estar vacio")
    @Size(max = 4000, message = "pMoviCiasOrig debe ser de 4000 caracteres")
	private String pMoviCiasOrig;
    
	@NotNull(message = "pMoviOficina no puede ser nulo")
    @NotEmpty(message = "pMoviOficina no puede estar vacio")
	@Size(max = 10, message = "pMoviOficina debe ser de 10 caracteres")
	private int pMoviOficina;
	
    @NotNull(message = "pMoviNumero no puede ser nulo")
    @NotEmpty(message = "pMoviNumero no puede estar vacio")
    @Size(max = 10, message = "pMoviNumero debe ser de 10 caracteres")
	private int pMoviNumero;
    
    @NotNull(message = "pMoviOrpaVigencia no puede ser nulo")
    @NotEmpty(message = "pMoviOrpaVigencia no puede estar vacio")
    @Size(max = 10, message = "pMoviOrpaVigencia debe ser de 10 caracteres")
	private int pMoviOrpaVigencia;
    
	@NotNull(message = "pMoviAuxiliar no puede ser nulo")
    @NotEmpty(message = "pMoviAuxiliar no puede estar vacio")
	@Size(max = 4000, message = "pMoviAuxiliar debe ser de 4000 caracteres")
	private String pMoviAuxiliar;
	
    @NotNull(message = "pMoviFpag no puede ser nulo")
    @NotEmpty(message = "pMoviFpag no puede estar vacio")
    @Size(max = 4000, message = "pMoviFpag debe ser de 4000 caracteres")
	private String pMoviFpag;
    
    @NotNull(message = "pMoviDescripcion no puede ser nulo")
    @NotEmpty(message = "pMoviDescripcion no puede estar vacio")
    @Size(max = 4000, message = "pMoviDescripcion debe ser de 4000 caracteres")
	private String pMoviDescripcion;
    
	@NotNull(message = "pMoviUsuaCrea no puede ser nulo")
    @NotEmpty(message = "pMoviUsuaCrea no puede estar vacio")
	@Size(max = 10, message = "pMoviUsuaCrea debe ser de 10 caracteres")
	private int pMoviUsuaCrea;
	
    @NotNull(message = "pMoviFecha no puede ser nulo")
    @NotEmpty(message = "pMoviFecha no puede estar vacio")
    @Size(max = 12, message = "pMoviFecha debe ser de 12 caracteres")
	private Date pMoviFecha;
    
    @NotNull(message = "pMoviCuenta no puede ser nulo")
    @NotEmpty(message = "pMoviCuenta no puede estar vacio")
    @Size(max = 10, message = "pMoviCuenta debe ser de 10 caracteres")
	private int pMoviCuenta;
    
	@NotNull(message = "pMoviValor no puede ser nulo")
    @NotEmpty(message = "pMoviValor no puede estar vacio")
	@Size(max = 10, message = "pMoviValor debe ser de 10 caracteres")
	private int pMoviValor;

	private String getpMoviCias() {
		return pMoviCias;
	}

	private void setpMoviCias(String pMoviCias) {
		this.pMoviCias = pMoviCias;
	}

	private String getpMoviCiasOrig() {
		return pMoviCiasOrig;
	}

	private void setpMoviCiasOrig(String pMoviCiasOrig) {
		this.pMoviCiasOrig = pMoviCiasOrig;
	}

}