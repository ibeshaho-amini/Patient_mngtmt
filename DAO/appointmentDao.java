/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import model.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP-
 */
public class appointmentDao {

    public appointmentDao() {
    }
    private String url= "jdbc:mysql://localhost:3306/patient_management_system_db";
    private String user= "root";
    private String pass= "";
    private String sql;
    
    public String appointmentrequest(Appointment appoint)
    {
        try
        {
            Connection con = DriverManager.getConnection(url, user, pass);
            sql="insert into request values(?,?,'Your Request is Still Pending',?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setString(1, appoint.getFullName());
            pst.setString(2, appoint.getAppDate());
            pst.setString(3, appoint.getGender());
            pst.setString(4, appoint.getDescription());
            
            int rowsAffected = pst.executeUpdate();
            con.close();
            if(rowsAffected >=1)
            {
                return "Thank you, Your Request Received Well";
            }
            else
                return "Try again later Something went Wrong";
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return "Call The Administartor for help";
    }
    public String requestapprove(Appointment appoint)
    {
        try 
        {
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "update request set status='Your Appointment Was Approved' where patname=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, appoint.getFullName());
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
    
    public String requestdeny(Appointment appoint)
    {
        try 
        {
            Connection con = DriverManager.getConnection(url, user, pass);
            sql = "update request set status='Your Appointment Was Denied' where patname=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, appoint.getFullName());
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
    public Appointment searchpatient(Appointment appoint)
      {
          try
          {
              Connection con = DriverManager.getConnection(url,user,pass);
              sql = "select * from request where patname=?";
              PreparedStatement pst = con.prepareStatement(sql);
              pst.setString(1, appoint.getFullName());
              ResultSet result = pst.executeQuery();
              Appointment appoints = new Appointment();
              boolean flag = false;
              while(result.next())
              {
                  appoints.setGender(result.getString("gender"));
                  appoints.setDescription(result.getString("description"));
                  appoints.setAppDate(result.getString("appintdate"));
                  appoints.setFullName(result.getString("patname"));
                  appoints.setStatus(result.getString("status"));
                  flag =true;
              }
              con.close();
              if(flag)
              {
                  System.out.println("Patient Full Names: " +appoints.getFullName());
                  return appoints;
              }
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
          return null;
      }
    public List<Appointment> alldata()
      {
          try
          {
              Connection con = DriverManager.getConnection(url,user,pass);
              sql = "Select * from request";
              PreparedStatement pst = con.prepareStatement(sql);
              ResultSet result = pst.executeQuery();
              List<Appointment> appointlist = new ArrayList<>();
              while(result.next())
              {
                  Appointment app = new Appointment();
                  app.setGender(result.getString("gender"));
                  app.setFullName(result.getString("patname"));
                  app.setAppDate(result.getString("appintdate"));
                  app.setDescription(result.getString("description"));
                  app.setStatus(result.getString("status"));
                  
                  appointlist.add(app);
              }
              con.close();
              return appointlist;
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
          return null;
      }
    public List<Appointment> alldataapproved()
      {
          try
          {
              Connection con = DriverManager.getConnection(url,user,pass);
              sql = "Select * from request where status='Your Appointment Was Approved'";
              PreparedStatement pst = con.prepareStatement(sql);
              ResultSet result = pst.executeQuery();
              List<Appointment> appointlist = new ArrayList<>();
              while(result.next())
              {
                  Appointment app = new Appointment();
                  app.setGender(result.getString("gender"));
                  app.setFullName(result.getString("patname"));
                  app.setAppDate(result.getString("appintdate"));
                  app.setDescription(result.getString("description"));
                  app.setStatus(result.getString("status"));
                  
                  appointlist.add(app);
              }
              con.close();
              return appointlist;
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
          return null;
      }
    public List<Appointment> alldatadenied()
      {
          try
          {
              Connection con = DriverManager.getConnection(url,user,pass);
              sql = "Select * from request where status='Your Appointment Was Denied'";
              PreparedStatement pst = con.prepareStatement(sql);
              ResultSet result = pst.executeQuery();
              List<Appointment> appointlist = new ArrayList<>();
              while(result.next())
              {
                  Appointment app = new Appointment();
                  app.setGender(result.getString("gender"));
                  app.setFullName(result.getString("patname"));
                  app.setAppDate(result.getString("appintdate"));
                  app.setDescription(result.getString("description"));
                  app.setStatus(result.getString("status"));
                  
                  appointlist.add(app);
              }
              con.close();
              return appointlist;
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
          return null;
      }
    public Appointment patientstatus(Appointment appoint)
      {
          try
          {
              Connection con = DriverManager.getConnection(url,user,pass);
              sql = "select * from request where patname=?";
              PreparedStatement pst = con.prepareStatement(sql);
              pst.setString(1, appoint.getFullName());
              ResultSet result = pst.executeQuery();
              Appointment appoints = new Appointment();
              boolean flag = false;
              while(result.next())
              {
                  appoints.setFullName(result.getString("patname"));
                  appoints.setStatus(result.getString("status"));
                  flag =true;
              }
              con.close();
              if(flag)
              {
                  System.out.println("Patient Status: " +appoints.getStatus());
                  return appoints;
              }
          }
          catch(Exception ex)
          {
              ex.printStackTrace();
          }
          return null;
      }
}
