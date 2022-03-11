package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.google.gson.Gson;

import java.util.List;



@Path("")
public class GreetingResource {

	
	Model model = new Model();
	

	@GET
	@Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
	
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("livro/{obra}/{editora}/{autor}/")
    public Response livro2(@PathParam String obra, @PathParam String editora, @PathParam String autor) {	
		List<Livro> livrosEncontrados = model.buscarEspecificacao(new Especificacao(obra, editora, autor));	
		String json = new Gson().toJson(livrosEncontrados);
    	return Response.status(200).entity(json).build();	
    }
    
    
}