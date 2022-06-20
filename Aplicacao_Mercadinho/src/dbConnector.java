
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bruno
 */
public class dbConnector {
    
    
    public Connection myCon(){
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/produtos?&serverTimezone=UTC";
        String user = "root";
        String password = "264148007Vi@";
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            
            //System.out.println("Conexão Realizada!");
            return con;
        } catch (Exception e) {
            //System.out.println("Problemas na conexão!");
            e.printStackTrace();
            return null;
        }
        
    }
}
