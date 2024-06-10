/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author manoj aberathna
 */
public class DBSearch {
    private Statement stmt;
    private ResultSet rs;
    
    public ResultSet searchLogin(String UserName){
        
        try{
            stmt = DBConnection.getStatementConnection();
            String name = UserName;
            
            //execute the query
            rs = stmt.executeQuery("SELECT * FROM login where UserName='" + name + "'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
    public ResultSet searchUserLogin(String UserName){
        
        try{
            stmt = DBConnection.getStatementConnection();
            String name = UserName;
            
            //execute the query
            rs = stmt.executeQuery("SELECT * FROM newaccount where UserName='" + name + "'");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    
    public ResultSet SearchCode(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
        
  }      
      
    
    
    public ResultSet SearchBook() {
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM newbook");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public static int getMquantity(String c) throws Exception{
        return DBConnection.getStatementConnection().executeUpdate(c);
  }
    
    public ResultSet SearchIssue() {
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM issuebook");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
     public ResultSet SearchIssue1() {
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM issuebook1");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
    
     public ResultSet SearchReturn() {
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM returnbook");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
     
     public ResultSet SearchReturn1() {
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM returnbook1");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
     
     public ResultSet SearchStudent() {
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM newstudent");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
    }
     
     public ResultSet SearchLecturer() {
        try{
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM newlecturer");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return rs;
        
      
        
    
        
        
        
    }
     
     public ResultSet SearchBom(String c) throws Exception{
        return DBConnection.getStatementConnection().executeQuery(c);
  }
}
