
package DAO;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;
/**
 *
 * @author HP-
 */
public class patientDao {
    private String url= "jdbc:mysql://localhost:3306/patient_management_system_db";
    private String user= "root";
    private String pass= "";
    
    public String patisignup(Patient patobjt)
    {
        try 
        {
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "insert into patient values(?,?,?,?,?,'Patient')";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, patobjt.getFullname());
            pst.setString(2, patobjt.getLocation());
            pst.setString(3, patobjt.getEmail());
            pst.setString(4, patobjt.getPassword());
            pst.setString(5, patobjt.getGender());
            
            int rowsAffected = pst.executeUpdate();
            con.close();
            if(rowsAffected >=1)
            {
                return "Your Information Are Safe With Us";
            }
            else
                return "Try again later Something went Wrong";
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Contact Administrator for Help";
    }
    public String patiupdate(Patient patobjt)
    {
        try 
        {
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "update patient set email=?,location=?,gender=?,password=?, role='Patient' where fullname=?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            
            pst.setString(2, patobjt.getLocation());
            pst.setString(1, patobjt.getEmail());
            pst.setString(4, patobjt.getPassword());
            pst.setString(3, patobjt.getGender());
            pst.setString(5, patobjt.getFullname());
            
            int rowsAffected = pst.executeUpdate();
            con.close();
            if(rowsAffected >=1)
            {
                return "Information Changed";
            }
            else
                return "Try again later Something went Wrong";
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Contact Administrator for Help";
    }
    public String doctorlogin(Login logobj)
    {
        try
        {
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "select email, password from doctor where email=? and password=? and role=?";
            PreparedStatement pst =con.prepareStatement(sql);
            pst.setString(1, logobj.getEmail());
            pst.setString(2, logobj.getPassword());
            pst.setString(3, logobj.getRole());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
                return "You Are Welcome";
            else
                return "Username or Password is Incorrect";
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return "Try to contact Administarator";
    }
      public String patientlogin(Login logobj)
    {
        try
        {
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "select email, password from patient where email=? and password=? and role=?";
            PreparedStatement pst =con.prepareStatement(sql);
            pst.setString(1, logobj.getEmail());
            pst.setString(2, logobj.getPassword());
            pst.setString(3, logobj.getRole());
            ResultSet rs = pst.executeQuery();
            if(rs.next())
                return  "You Are Welcome";
            else
                return "Username or Password is Incorrect";
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return "Try to contact Administarator";
    }
      public Patient search(Patient patientobj)
      {
          try
          {
              Connection con = DriverManager.getConnection(url,user,pass);
              String sql = "select * from patient where fullname=?";
              PreparedStatement pst = con.prepareStatement(sql);
              pst.setString(1, patientobj.getFullname());
              ResultSet result = pst.executeQuery();
              Patient pt = new Patient();
              boolean flag = false;
              while(result.next())
              {
                  pt.setFullname(result.getString("fullname"));
                  pt.setEmail(result.getString("email"));
                  pt.setGender(result.getString("gender"));
                  pt.setLocation(result.getString("location"));
                  pt.setPassword(result.getString("password"));
                  flag =true;
              }
              con.close();
              if(flag)
              {
                  System.out.println("Patient Full Names: " +pt.getFullname());
                  return pt;
              }
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
          return null;
      }
      public String deletepatient(Patient patientobj)
      {
          try
          {
              Connection con = DriverManager.getConnection(url,user,pass);
              String sql = "delete from patient where fullname=?";
              PreparedStatement pst = con.prepareStatement(sql);
              pst.setString(1, patientobj.getFullname());
              int rowsAfected = pst.executeUpdate();
              con.close();
              if(rowsAfected >=0)
              {  
                  return "Patients Informations are deleted";
              }
              else
              {
                  return "Patients Informations are not deleted";
              }
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
          return null;
      }
      public List<Patient> alldata()
      {
          try
          {
              Connection con = DriverManager.getConnection(url,user,pass);
              String sql = "Select * from patient";
              PreparedStatement pst = con.prepareStatement(sql);
              ResultSet result = pst.executeQuery();
              List<Patient> patlist = new ArrayList<>();
              while(result.next())
              {
                  Patient pt = new Patient();
                  pt.setFullname(result.getString("fullname"));
                  pt.setEmail(result.getString("email"));
                  pt.setGender(result.getString("gender"));
                  pt.setLocation(result.getString("location"));
                  pt.setPassword(result.getString("password"));
                  patlist.add(pt);
              }
              con.close();
              return patlist;
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
          return null;
      }
             
      
}
