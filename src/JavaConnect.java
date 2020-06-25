/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dibyajit
 */

import java.sql.*;

import javax.swing.JOptionPane;


public class JavaConnect {
    Connection conn;
    
    
 public static void main(String args[])
 {
 ConnecrDb();
 }   
    
     
    
   
   
public static Connection ConnecrDb(){
    Connection conn=null;
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");  
        conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dibyajit","root","Dibyajit1011");  
        //here sonoo is database name, root is username and password  
System.out.println("connection successfull");

    }catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
       
    }
return conn;

}   


}
