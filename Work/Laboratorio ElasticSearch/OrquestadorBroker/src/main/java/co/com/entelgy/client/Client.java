package co.com.entelgy.client;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * 
 * @author Miguel Pinzon
 *
 */
@Path("/")
public interface Client {

	@POST
	@Path("/enviarLog")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void enviarLog(String Log);
	
	@GET
	@Path("/nombreProyecto")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void nombreProyecto();

}