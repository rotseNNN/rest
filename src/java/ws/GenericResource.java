/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author user
 */
@Path("/fibonacci")
public class GenericResource {
    @GET
    
    @Path("{numLimite}")
    
    public String fibonacci(@PathParam("numLimite") int numLimite) {
       int ant = 1, sig = 0;
        int serie=0;
       String rpta=null;
       int q=1;
        for (int i=0 ; i<=numLimite;i++){
            serie = ant + sig;
            ant = sig;
            sig = serie;

       }
        rpta="la serie de fibonacci de "+ numLimite+" es "+sig;
        return rpta;
    }
}
