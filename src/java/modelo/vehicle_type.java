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
public class vehicle_type {
    private int idvehicle_type;
    private String name;
    private String descri;

    public int getIdvehicle_type() {
        return idvehicle_type;
    }

    public void setIdvehicle_type(int idvehicle_type) {
        this.idvehicle_type = idvehicle_type;
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

    public vehicle_type() {
    }

    public vehicle_type(int idvehicle_type, String name, String descri) {
        this.idvehicle_type = idvehicle_type;
        this.name = name;
        this.descri = descri;
    }
    
    
}
