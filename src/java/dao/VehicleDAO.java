/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controle.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Vehicle;
import modelo.vehicle_type;

/**
 *
 * @author Leonardo
 */
public class VehicleDAO {

    private PreparedStatement pst;
    private ResultSet rs;
    private Connection con;
    private String sql;

    public List<Vehicle> selectVehicle() throws ClassNotFoundException, SQLException {
        List<Vehicle> veiculos = new ArrayList<>();
        Vehicle v = null;

        sql = "select * from vehicle;";
        con = Conexao.cb();
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            v = new Vehicle();
            v.setIdvehicle(rs.getInt("idvehicle"));
            v.setName(rs.getString("name"));
            v.setDescri(rs.getString("descri"));
            v.setVehicle_type_idvehicle_type(rs.getInt("vehicle_type_idvehicle_type"));
            v.setPlate(rs.getString("plate"));

            veiculos.add(v);

        }
        Conexao.db();
        return veiculos;
    }

    public boolean insertVehicle(Vehicle v) {
        try {
            sql = "insert into vehicle (name, descri, vehicle_type_idvehicle_type, plate) value(?,?,?,?);";
            con = Conexao.cb();
            pst = con.prepareStatement(sql);
            pst.setString(1, v.getName());
            pst.setString(2, v.getDescri());
            pst.setInt(3, v.getVehicle_type_idvehicle_type());
            pst.setString(4, v.getPlate());
            pst.execute();
            Conexao.db();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean updateVehicle(Vehicle v) {
        try {
            sql = "update vehicle set name = ?, descri = ?, vehicle_type_idvehicle_type = ?, plate = ? where id = ?;";
            con = Conexao.cb();
            pst = con.prepareStatement(sql);
            pst.setString(1, v.getName());
            pst.setString(2, v.getDescri());
            pst.setInt(3, v.getVehicle_type_idvehicle_type());
            pst.setString(4, v.getPlate());
            pst.setInt(5, v.getIdvehicle());
            pst.executeUpdate();
            Conexao.db();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
        public boolean deleteVehicle(int idvehicle){
        try {
            sql = "delete from vehicle where idvehicle = ?;";
            con = Conexao.cb();
            pst = con.prepareStatement(sql);
            pst.setInt(1, idvehicle);
            pst.execute();
            Conexao.db();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
//------------------------------------------------------------------------------------
  public List<vehicle_type> selectVehicle_type() throws ClassNotFoundException, SQLException {
        List<vehicle_type> veiculos_tipos = new ArrayList<>();
        vehicle_type vt = null;

        sql = "select * from vehicle_type;";
        con = Conexao.cb();
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        while (rs.next()) {
            vt = new vehicle_type();
            vt.setIdvehicle_type(rs.getInt("idvehicle_type"));
            vt.setName(rs.getString("name"));
            vt.setDescri(rs.getString("descri"));
           
            veiculos_tipos.add(vt);

        }
        Conexao.db();
        return veiculos_tipos;
    }

    public boolean insertVehicle_type(vehicle_type vt) {
        try {
            sql = "insert into vehicle_type(name, descri) value (?,?);";
            con = Conexao.cb();
            pst = con.prepareStatement(sql);
            pst.setString(1, vt.getName());
            pst.setString(2, vt.getDescri());
            pst.execute();
            Conexao.db();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean updateVehicle_type(vehicle_type vt) {
        try {
            sql = "update vehicle_type set name = ?, descri = ? where id = ?;";
            con = Conexao.cb();
            pst = con.prepareStatement(sql);
            pst.setString(1, vt.getName());
            pst.setString(2, vt.getDescri());
            pst.setInt(3, vt.getIdvehicle_type());
            pst.executeUpdate();
            Conexao.db();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
    
        public boolean deleteVehicle_type(int idvehicle_type){
        try {
            sql = "delete from vehicle_type where idvehicle_type = ?;";
            con = Conexao.cb();
            pst = con.prepareStatement(sql);
            pst.setInt(1, idvehicle_type);
            pst.execute();
            Conexao.db();
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VehicleDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
        
    
}