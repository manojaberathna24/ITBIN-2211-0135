/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DBConnection;
import Model.DBSearch;
import View.AdminLogin;
import View.Home;
import View.UserLogin;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author manoj aberathna
 */
public class AllController {
    
    public static void Login(String UserName, String Password){
        try {
            String username = null; //initial value of the username
            String password = null; //initial value of the password
            
            ResultSet rs = new DBSearch().searchLogin(UserName);
            //process the query
            while(rs.next()){
                //assign database username to the variable
                username = rs.getString("UserName");
                //assign database password to the variable
                password = rs.getString("Password");
            }
            if(username != null && password != null){
                if(password.equals(Password)) {
                    System.out.println("Login Successful!");
                AdminLogin.getFrames()[0].dispose();
                new Home().setVisible(true);
                
                }
                else {
                    JOptionPane.showMessageDialog(null,"Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
             else {
                JOptionPane.showMessageDialog(null,"Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex){
            Logger.getLogger(AllController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   /*
    public static void NewLogin(String usName, String pass){
        try {
            String username = null; //initial value of the username
            String password = null; //initial value of the username
            
            ResultSet rs = new DBSearch().searchLogin(usName);
            //process the query
            while(rs.next()){
                //assign database username to the variable
                username = rs.getString("UserName");
                //assign database password to the variable
                password = rs.getString("Password");
            }
            if(username != null && password != null){
                if(password.equals(pass)) {
                    System.out.println("Login Successful!");
                NewLogin.getFrames()[1].dispose();
                new Home().setVisible(true);
                
                }
                else {
                    JOptionPane.showMessageDialog(null,"Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            else {
                JOptionPane.showMessageDialog(null,"Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex){
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */
    
    
    
    public static void UserLogin(String UserName, String Password){
        try {
            String username = null; //initial value of the username
            String password = null; //initial value of the password
            
            ResultSet rs = new DBSearch().searchUserLogin(UserName);
            //process the query
            while(rs.next()){
                //assign database username to the variable
                username = rs.getString("UserName");
                //assign database password to the variable
                password = rs.getString("Password");
            }
            if(username != null && password != null){
                if(password.equals(Password)) {
                    System.out.println("Login Successful!");
                UserLogin.getFrames()[0].dispose();
                new Home().setVisible(true);
                
                }
                else {
                    JOptionPane.showMessageDialog(null,"Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
             else {
                JOptionPane.showMessageDialog(null,"Please check the credentials", "Error", JOptionPane.ERROR_MESSAGE);
            }
            DBConnection.closeCon();
        }
        catch (SQLException ex){
            Logger.getLogger(AllController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    public static void NewAccount(String UserName, String FullName, String Password, String SQuestion, String Answer) {
       new Model.AllRecords().NewAccount(UserName, FullName, Password, SQuestion, Answer);
       JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
     public static void LoginU(String UserName, String Password) {
       new Model.AllRecords().LoginU(UserName, Password);
       JOptionPane.showMessageDialog(null,"New User Account Created Successfully..!", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void NewBook(String BookID, String Name, String Edition, String Publisher, String Price, String Pages) {
        new Model.AllRecords().NewBook(BookID, Name, Edition, Publisher, Price, Pages);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
  public static void NewStudent(String Student_ID, String Full_Name, String Guidance_Name, String Course, String Branch, String Year, String Semester) {
        new Model.AllRecords().NewStudent(Student_ID, Full_Name, Guidance_Name, Course, Branch, Year, Semester);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
  
  public static void NewLecturer(String Lecturer_ID, String Lecturer_Name, String Telephone, String Address, String Course, String Branch) {
        new Model.AllRecords().NewLecturer(Lecturer_ID, Lecturer_Name, Telephone, Address, Course, Branch);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
    
      public static void IssueBook(String BID, String Name, String Edition, String Publisher, String Price, String Pages, String SID, String Fname, String Gname, String Course, 
  String Branch, String Year, String Semester, String IssueBook) {
        new Model.AllRecords().IssueBook(BID, Name, Edition, Publisher, Price, Pages, SID, Fname, Gname, Course, Branch, Year, Semester, IssueBook);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
      
      public static void IssueBook1(String BID, String Name, String Edition, String Publisher, String Price, String Pages, String Lecturer_ID, String Lecturer_Name, 
              String Telephone, String Address, String Course, String Branch, String IssueBook) {
        new Model.AllRecords().IssueBook1(BID, Name, Edition, Publisher, Price, Pages, Lecturer_ID, Lecturer_Name, Telephone, Address, Course, Branch, IssueBook);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
      
      public static void ReturnBook(String SID, String Fname, String Gname, String Course, String Branch, String Year, String Semester, String IssueDate, String BID, String Bname, 
              String Edition, String Publisher, String Price, String Pages,  String ReturnDate){
        new Model.AllRecords().ReturnBook(SID, Fname, Gname, Course, Branch, Year, Semester, IssueDate, BID, Bname, Edition, Publisher, Price, Pages, ReturnDate); 
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
      
      public static void ReturnBook1(String Lecturer_ID, String Lecturer_Name, String Telephone, String Address, String Course, String Branch, String IssueDate, String BID, String Bname, 
              String Edition, String Publisher, String Price, String Pages,  String ReturnDate){
        new Model.AllRecords().ReturnBook1(Lecturer_ID, Lecturer_Name, Telephone, Address, Course, Branch, IssueDate, BID, Bname, Edition, Publisher, Price, Pages, ReturnDate); 
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
      
      public static void DamagedBook(String SID, String BID, String Fname, String Branch, String Price, String Fine){
        new Model.AllRecords().DamagedBook(SID,  BID, Fname, Branch, Price, Fine);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
      
    public static void OutofDate(String SID, String BID, String IssueDate, String ReturnDate, String Days, String Fine){
        new Model.AllRecords().OutofDate(SID,  BID, IssueDate, ReturnDate, Days, Fine);
        JOptionPane.showMessageDialog(null,"New REcord has been inserted", "Successfully", JOptionPane.INFORMATION_MESSAGE);
    }
}
