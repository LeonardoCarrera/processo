/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Leonardo
 */
public class Vehicle {
    private int idvehicle;
    private String name;
    private String descri;
    private int vehicle_type_idvehicle_type;
    private String plate;

    public int getIdvehicle() {
        return idvehicle;
    }

    public void setIdvehicle(int idvehicle) {
        this.idvehicle = idvehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescri() {
        return descri;
    }

    public void setDescri(String descri) {
        this.descri = descri;
    }

    public int getVehicle_type_idvehicle_type() {
        return vehicle_type_idvehicle_type;
    }

    public void setVehicle_type_idvehicle_type(int vehicle_type_idvehicle_type) {
        this.vehicle_type_idvehicle_type = vehicle_type_idvehicle_type;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public Vehicle() {
    }

    public Vehicle(int idvehicle, String name, String descri, int vehicle_type_idvehicle_type, String plate) {
        this.idvehicle = idvehicle;
        this.name = name;
        this.descri = descri;
        this.vehicle_type_idvehicle_type = vehicle_type_idvehicle_type;
        this.plate = plate;
    }
    
    
    
    
    
    
}
