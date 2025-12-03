package org.brunobranchi;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Path("/unipds")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UniPDSResource {

    private int i = 0;
    @GET
    public int getI(String parametro) {
        return i;
    }

    @GET
    @Path("/intDiferentao")
    public int getIDiferentao() {
        return LocalDateTime.now().getNano();
    }

    @POST
    public void addI() {
        i++;
    }

    @DELETE
    public void delete() {

    }

    @PUT
    public void updateI(int i) {
        this.i = i;
    }


}
