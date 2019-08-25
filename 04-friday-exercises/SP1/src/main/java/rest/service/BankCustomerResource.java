package rest.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.BankCustomer;
import facades.BankCustomerFacade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("bankcustomer")
public class BankCustomerResource {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu"); 
    BankCustomerFacade facade =  BankCustomerFacade.getBankCustomerFacade(emf);
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public String demo() {
        return "{\"msg\":\"succes\"}";
    }

//    @POST
//    @Consumes({MediaType.APPLICATION_JSON})
//    public void create(BankCustomer entity) {
//        throw new UnsupportedOperationException();
//    }
    
    @GET
    @Path("/{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public String getCustomerFromID(BankCustomer entity, @PathParam("id") int id) {
        return gson.toJson(facade.getCustomerByID(id));
    }
    @GET
    @Path("/all")
    @Consumes({MediaType.APPLICATION_JSON})
    public String getAddCustomers() {
        return gson.toJson(facade.getAllBankCustomers());
    }
}
