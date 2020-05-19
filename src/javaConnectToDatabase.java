/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Abhishek
 */
import java.sql.*;
import javax.swing.JOptionPane;
import static java.sql.DriverManager.*;
import java.sql.Statement;;

public class javaConnectToDatabase {
    //method
    public Connection ConnecrDB(){ 
    {
        Connection conn;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","12345678");
            Statement stmt=conn.createStatement();
            System.out.println("connected!");
            return conn;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }
    
    }
}


