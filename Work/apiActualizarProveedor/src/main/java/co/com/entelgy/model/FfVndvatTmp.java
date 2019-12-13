package co.com.entelgy.model;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FfVndvatTmp {

	@JsonProperty("SETID")
	@NotNull(message = "setid no puede ser nulo")
	private String setid;

	@JsonProperty("VENDOR_ID")
	@NotNull(message = "vendorId no puede ser nulo")
	private String vendorId;

	@JsonProperty("COUNTRY")
	@NotNull(message = "country no puede ser nulo")
	private String country;

	@JsonProperty("COUNTRY_2CHAR")
	@NotNull(message = "country2Char no puede ser nulo")
	private String country2Char;

	@JsonProperty("VAT_RGSTRN_ID")
	@NotNull(message = "vatRgstrnId no puede ser nulo")
	private String vatRgstrnId;

	@JsonProperty("HOME_COUNTRY_FLG")
	@NotNull(message = "homeCountryFlg no puede ser nulo")
	private String homeCountryFlg;

	public String getSetid() {
		return setid;
	}

	public void setSetid(String setid) {
		this.setid = setid;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry2Char() {
		return country2Char;
	}

	public void setCountry2Char(String country2Char) {
		this.country2Char = country2Char;
	}

	public String getVatRgstrnId() {
		return vatRgstrnId;
	}

	public void setVatRgstrnId(String vatRgstrnId) {
		this.vatRgstrnId = vatRgstrnId;
	}

	public String getHomeCountryFlg() {
		return homeCountryFlg;
	}

	public void setHomeCountryFlg(String homeCountryFlg) {
		this.homeCountryFlg = homeCountryFlg;
	}

}
