package co.com.entelgy.client;

import javax.validation.Valid;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.camel.Body;
import org.apache.camel.Header;

import co.com.entelgy.model.RequestRest;


/**
 * 
 * @author Miguel Pinzon
 *
 */
@Path("/")
public interface Client {

	@POST
	@Path("/crearVoucher")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
//	public void crearVoucher(RequestRest body, @HeaderParam);
	public void crearVoucher(@Body RequestRest body);

	@GET
	@Path("/nombreProyecto")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void nombreProyecto();

}