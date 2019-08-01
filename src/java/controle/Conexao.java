/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Leonardo
 */
public class Conexao {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/mydb";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "usuario";
    private static final String SENHA = "usuario123";
    
    private static Connection con;
    public static Connection cb() throws ClassNotFoundException, SQLException{
        Class.forName(DRIVER);
        con = DriverManager.getConnection(URL, USER, SENHA);
        return con;
    }
    
    public static void db(){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
