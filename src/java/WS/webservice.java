/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import com.google.gson.Gson;
import dao.VehicleDAO;
import java.sql.SQLException;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import modelo.Vehicle;
import modelo.vehicle_type;

/**
 * REST Web Service
 *
 * @author Leonardo
 */
@Path("webservice")
public class webservice {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of webservice
     */
    public webservice() {
    }

    /**
     * Retrieves representation of an instance of WS.webservice
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }
    @GET
    @Produces("application/json")
    @Path("get/vehicle")
    public String selectVehicle() throws ClassNotFoundException, SQLException {
        Gson g = new Gson();
        VehicleDAO dao = new VehicleDAO();
        List<Vehicle> vehicle = dao.selectVehicle();
        
        return g.toJson(vehicle);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insertVehicle")
    public boolean insertVehicle(String content){
        Gson g = new Gson();
        Vehicle v = (Vehicle) g.fromJson(content, Vehicle.class);
        VehicleDAO dao = new VehicleDAO();
        return dao.insertVehicle(v);
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/deleteVehicle/{idvehicle}")
    public String deleteVehicle(@PathParam("idvehicle") int idvehicle){
        VehicleDAO dao = new VehicleDAO();
        if (dao.deleteVehicle(idvehicle)) {
            return "true";
        }else{
            return "false";
        }
        
    }
    
     @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/updateVehicle")
    public boolean updateVehicle(String content){
        Gson g = new Gson();
        Vehicle v = (Vehicle) g.fromJson(content, Vehicle.class);
        VehicleDAO dao = new VehicleDAO();
        return dao.updateVehicle(v);
        
    }
    
        @GET
    @Produces("application/json")
    @Path("get/vehicle")
    public String selectVehicle_type() throws ClassNotFoundException, SQLException {
        Gson g = new Gson();
        VehicleDAO dao = new VehicleDAO();
        List<vehicle_type> vehicle_type = dao.selectVehicle_type();
        
        return g.toJson(vehicle_type);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/insertVehicle")
    public boolean insertVehicleType(String content){
        Gson g = new Gson();
        vehicle_type vt = (vehicle_type) g.fromJson(content, vehicle_type.class);
        VehicleDAO dao = new VehicleDAO();
        return dao.insertVehicle_type(vt);
        
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/deleteVehicleType/{idvehicle_type}")
    public String deleteVehicleType(@PathParam("idvehicle_type") int idvehicle_type){
        VehicleDAO dao = new VehicleDAO();
        if (dao.deleteVehicle_type(idvehicle_type)) {
            return "true";
        }else{
            return "false";
        }
        
    }
    
     @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/updateVehicle")
    public boolean updateVehicleType(String content){
        Gson g = new Gson();
        vehicle_type vt = (vehicle_type) g.fromJson(content, vehicle_type.class);
        VehicleDAO dao = new VehicleDAO();
        return dao.updateVehicle_type(vt);
        
    }

    /**
     * PUT method for updating or creating an instance of webservice
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/json")
    public void putJson(String content) {
    }
}
