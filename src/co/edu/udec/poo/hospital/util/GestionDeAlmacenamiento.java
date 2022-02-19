/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udec.poo.hospital.util;

import java.sql.*;

/**
 *
 * @author nicolas
 */
public class GestionDeAlmacenamiento {
    
    
    public static boolean dbExists(String puerto, String db, String pass) {
        boolean exist = false;
        try {
            Connection conn = null;
            Statement st = null;
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/BDP" + puerto + "/" + db, "root", pass);
            st = conn.createStatement();
            String sql = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = '" + db + "'";
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                //JOptionPane.showMessageDialog(main, "La base de datos existe.");
                exist = true;
            }
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(main, "La base de datos no existe.");
            exist = false;
        }
        return exist;
    }
    
    
    
}

