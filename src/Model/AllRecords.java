/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import java.time.Year;
import sun.security.util.Password;

/**
 *
 * @author manoj aberathna
 */
public class AllRecords {
    Statement stmt;
    
    public void LoginU(String UserName, String Password){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO login VALUES('"+UserName+"', '"+Password+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
   
    
    public void NewAccount(String UserName, String FullName, String Password, String SQuestion, String Answer){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO newaccount VALUES('"+UserName+"', '"+FullName+"', '"+Password+"', '"+SQuestion+"', '"+Answer+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
   
    public void NewBook(String BookID, String Name, String Edition, String Publisher, String Price, String Pages){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO newbook VALUES('"+BookID+"', '"+Name+"', '"+Edition+"', '"+Publisher+"', '"+Price+"', '"+Pages+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void NewStudent(String Student_ID, String Full_Name, String Guidance_Name, String Course, String Branch, String Year, String Semester){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO newstudent VALUES('"+Student_ID+"', '"+Full_Name+"', '"+Guidance_Name+"', '"+Course+"', '"+Branch+"', '"+Year+"', '"+Semester+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public void NewLecturer(String Lecturer_ID, String Lecturer_Name, String Telephone, String Address, String Course, String Branch){
        
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO newlecturer VALUES('"+Lecturer_ID+"', '"+Lecturer_Name+"', '"+Telephone+"', '"+Address+"','"+Course+"', '"+Branch+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
   
     public void IssueBook(String BID, String Name, String Edition, String Publisher, String Price, String Pages, String SID, String Fname, String Gname, String Course, String Branch, String Year, String Semester, String IssueBook){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO issuebook VALUES('"+BID+"', '"+Name+"', '"+Edition+"', '"+Publisher+"', '"+Price+"', '"+Pages+"', '"+SID+"', '"+Fname+"', '"+Gname+"', '"+Course+"', '"+Branch+"', '"+Year+"', '"+Semester+"', '"+IssueBook+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
     public void IssueBook1(String BID, String Name, String Edition, String Publisher, String Price, String Pages, String Lecturer_ID, String Lecturer_Name, String Telephone, String Address, String Course, String Branch, String IssueBook){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO issuebook1 VALUES('"+BID+"', '"+Name+"', '"+Edition+"', '"+Publisher+"', '"+Price+"', '"+Pages+"', '"+Lecturer_ID+"', '"+Lecturer_Name+"', '"+Telephone+"', '"+Address+"','"+Course+"', '"+Branch+"', '"+IssueBook+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
     public void ReturnBook(String SID, String Fname, String Gname, String Course, String Branch, String Year, String Semester, String IssueDate, String BID, String Bname, String Edition, String Publisher, String Price, String Pages,  String ReturnDate){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO returnbook VALUES('"+SID+"', '"+Fname+"', '"+Gname+"', '"+Course+"', '"+Branch+"', '"+Year+"', '"+Semester+"', '"+IssueDate+"', '"+BID+"', '"+Bname+"', '"+Edition+"', '"+Publisher+"', '"+Price+"', '"+Pages+"', '"+ReturnDate+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
     public void ReturnBook1(String Lecturer_ID, String Lecturer_Name, String Telephone, String Address, String Course, String Branch, String IssueDate, String BID, String Bname, 
              String Edition, String Publisher, String Price, String Pages,  String ReturnDate){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO Returnbook1 VALUES('"+Lecturer_ID+"', '"+Lecturer_Name+"', '"+Telephone+"', '"+Address+"', '"+Course+"', '"+Branch+"', '"+IssueDate+"', '"+BID+"', '"+Bname+"', '"+Edition+"', '"+Publisher+"', '"+Price+"', '"+Pages+"', '"+ReturnDate+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
     public void DamagedBook(String SID, String BID, String Fname, String Branch, String Price, String Fine){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO damagedbook VALUES('"+SID+"','"+BID+"', '"+Fname+"', '"+Branch+"',  '"+Price+"', '"+Fine+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
     
     public void OutofDate(String SID, String BID, String IssueDate, String ReturnDate, String Days, String Fine){
        try{
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO outofdate VALUES('"+SID+"','"+BID+"', '"+IssueDate+"', '"+ReturnDate+"',  '"+Days+"', '"+Fine+"')");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
