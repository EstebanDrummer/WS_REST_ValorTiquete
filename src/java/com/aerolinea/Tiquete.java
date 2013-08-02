/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aerolinea;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

/**
 *
 * @author yepesk8r
 */
@Stateless
//con la siguiente anotación se indica que este recurso se accesará vía web desde la ruta /factorial
@Path("/valortiquete")
public class Tiquete {
    
//Se crea el método GET que recibe el parámetro numero.
    @GET
    public String valortiquete(@QueryParam("sillas")int csillas, @QueryParam("valor")int valorIndividual ) {
            String total =Integer.toString(valorIndividual*csillas);//operación que realiza el servicio que se invocó
        return total;
    }
    
    @Path("/comprademillas") 
    @GET
    public String compramillas(@QueryParam("monto")int monto, @QueryParam("TipoSocio")String socio) {
        return "";
    }
     
   @Path("/calculodemillas")
    @GET
    public String vehiculo(@QueryParam("monto")int monto) {
       return "";
    }

}
