/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsbm;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class DBOperations {
    
    static String url = "jdbc:mysql://localhost:3306/nsbm";
    static String username = "root";
    static String password = "";
    static Connection con = null;
    static PreparedStatement pst = null;
    
    
    void addAdmin (AdminDetails add){
        
      try{ //get the connection
          con = (Connection) DriverManager.getConnection(url, username, password);
          String query = "INSERT INTO admin VALUES (?,?,?,?)";
          pst = (PreparedStatement)con.prepareStatement(query);
          
          pst.setString(1,add.getId()) ;
          pst.setString(2, add.getName());  //add values to query
          pst.setString(3, add.getUsername());
          pst.setString(4, add.getPassword());
          
          pst.executeUpdate(); // execute query and insert values to table
          
      }catch(Exception e) { 
          System.out.print(e);
    }
    }
    
    void registerundergraduate (RegisterUndergraduate ru){
        
      try{ //get the connection
          con = (Connection) DriverManager.getConnection(url, username, password);
          String query = "INSERT INTO undergraduate_student_details VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
          pst = (PreparedStatement)con.prepareStatement(query);
          
          pst.setString(1,ru.getId()) ;
          pst.setString(2, ru.getName());  //add values to query
          pst.setString(3, ru.getNic());
          pst.setString(4, ru.getGender());
          pst.setString(5,ru.getDob());
          pst.setString(6, ru.getEmail());
          pst.setInt(7,ru.getTp());
          pst.setString(8,ru.getFaculty());
          pst.setInt(9, ru.getAlindex());
          pst.setInt(10,ru.getRank());
          pst.setDouble(11,ru.getZscore() );
          pst.setString(12,ru.getIntake());
          
          pst.executeUpdate(); // execute query and insert values to table
          
      }catch(Exception e) { 
          System.out.print(e);
    }
    }
    
    void registerpostgraduate (RegisterPostgraduate rp){
        
      try{ //get the connection
          con = (Connection) DriverManager.getConnection(url, username, password);
          String query = "INSERT INTO postgraduate_student_details VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
          pst = (PreparedStatement)con.prepareStatement(query);
          
          pst.setString(1,rp.getId()) ;
          pst.setString(2, rp.getName());  //add values to query
          pst.setString(3, rp.getNic());
          pst.setString(4, rp.getGender());
          pst.setString(5,rp.getDob());
          pst.setString(6, rp.getEmail());
          pst.setInt(7,rp.getTp());
          pst.setString(8,rp.getFaculty());
          pst.setString(9, rp.getQualificationtittle());
          pst.setString(10,rp.getInstitute());
          pst.setString(11,rp.getYear());
          pst.setString(12,rp.getIntake());
          
          pst.executeUpdate(); // execute query and insert values to table
          
      }catch(Exception e) { 
          System.out.print(e);
        }
    }
    
    void adducourse (UndergraduateCourses ucr){
        
      try{ //get the connection
          con = (Connection) DriverManager.getConnection(url, username, password);
          String query = "INSERT INTO undergraduate_course_details VALUES (?,?,?,?,?,?,?)";
          pst = (PreparedStatement)con.prepareStatement(query);
          
          pst.setString(1,ucr.getSubcode()) ;
          pst.setString(2,ucr.getSubname());  //add values to query
          pst.setInt(3, ucr.getCredits());
          pst.setString(4, ucr.getScheme());
          pst.setBoolean(5,ucr.getCompulsory());
          pst.setString(6, ucr.getYear());
          pst.setString(7, ucr.getSem());
          
          
          pst.executeUpdate(); // execute query and insert values to table
          
      }catch(Exception e) { 
          System.out.print(e);
        }
    }
    
    void addpcourse (PostgraduateCourses upr){
        
      try{ //get the connection
          con = (Connection) DriverManager.getConnection(url, username, password);
          String query = "INSERT INTO postgraduate_course_details VALUES (?,?,?,?,?,?,?)";
          pst = (PreparedStatement)con.prepareStatement(query);
          
          pst.setString(1,upr.getSubcode()) ;
          pst.setString(2,upr.getSubname());  //add values to query
          pst.setInt(3, upr.getCredits());
          pst.setString(4, upr.getScheme());
          pst.setBoolean(5,upr.getCompulsory());
          pst.setString(6, upr.getYear());
          pst.setString(7, upr.getSem());
          
          
          pst.executeUpdate(); // execute query and insert values to table
          
      }catch(Exception e) { 
          System.out.print(e);
        }
    }
    
    
    public static ResultSet searchUcourse (String UsubCode) throws SQLException{
        
    //get the connection
       con = (Connection) DriverManager.getConnection(url, username, password);
       String query = "SELECT * FROM undergraduate_course_details WHERE sub_code='"+UsubCode+"'";
       pst = (PreparedStatement)con.prepareStatement(query);
       ResultSet resultSet=con.createStatement().executeQuery(query);
       return resultSet;
       
    }
    
    public static ResultSet searchPcourse (String UPsubCode) throws SQLException{
        
    //get the connection
       con = (Connection) DriverManager.getConnection(url, username, password);
       String query = "SELECT * FROM postgraduate_course_details WHERE sub_code='"+UPsubCode+"'";
       pst = (PreparedStatement)con.prepareStatement(query);
       ResultSet resultSet=con.createStatement().executeQuery(query);
       return resultSet;
       
    }
    
    public static boolean deleteUcourse (String UsubCode) throws SQLException{
        
    //get the connection
       con = (Connection) DriverManager.getConnection(url, username, password);
       String query = "DELETE FROM undergraduate_course_details WHERE sub_code='"+UsubCode+"'";
       
       pst = (PreparedStatement)con.prepareStatement(query);
       return pst.executeUpdate()>0;  
    }
    
    public static boolean deletePcourse (String PsubCode) throws SQLException{
        
    //get the connection
       con = (Connection) DriverManager.getConnection(url, username, password);
       String query = "DELETE FROM postgraduate_course_details WHERE sub_code='"+PsubCode+"'";
       
       pst = (PreparedStatement)con.prepareStatement(query);
       return pst.executeUpdate()>0;  
    }
    
    public static boolean LoginAdmin (String admin_name, String admin_passward) throws SQLException{
    //get the connection
       con = (Connection) DriverManager.getConnection(url, username, password);
       String query = "SELECT * FROM admin WHERE username = '"+admin_name+"' AND password='"+admin_passward+"'";
       
       pst = (PreparedStatement)con.prepareStatement(query);
       ResultSet resultSet=con.createStatement().executeQuery(query);
       return resultSet.next();
       
    }
    void payments (PaymentDetails pyd){
        
      try{ //get the connection
          con = (Connection) DriverManager.getConnection(url, username, password);
          String query = "INSERT INTO payments VALUES (?,?,?,?,?,?,?,?,?)";
          pst = (PreparedStatement)con.prepareStatement(query);
          
          pst.setString(1, pyd.getId());
          pst.setBoolean(2, pyd.isYr1sem1());  //add values to query
          pst.setBoolean(3, pyd.isYr1sem2());
          pst.setBoolean(4, pyd.isYr2sem1());
          pst.setBoolean(5, pyd.isYr2sem2());
          pst.setBoolean(6, pyd.isYr3sem1());
          pst.setBoolean(7, pyd.isYr3sem2());
          pst.setBoolean(8, pyd.isYr4sem1());
          pst.setBoolean(9, pyd.isYr4sem2());
          
          pst.executeUpdate(); // execute query and insert values to table
          
      }catch(Exception e) { 
          System.out.print(e);
    }
    
    }
}
