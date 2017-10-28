/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.Decoder;

/**
 *
 * @author vinet
 */
public class service {

    public String addRecord(binclass objbin) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        String result = "";
        Connection cnn1, cnn2, cnn3 = null;
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        cnn2 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        cnn3 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        String rollno = objbin.getRollno(), email = objbin.getUserid(), temp_email = "", temp_rollno = "";
        Statement ss1 = cnn2.createStatement();
        Statement ss2 = cnn3.createStatement();
        ResultSet rs1 = ss1.executeQuery("select * from login_student where email='" + email + "'");
        ResultSet rs2 = ss2.executeQuery("select * from login_student where rollno='" + rollno + "'");
        System.out.print(rollno);
        System.out.print(email);

        while (rs1.next()) {
            temp_email = rs1.getString("email");

        }
        while (rs2.next()) {
            temp_rollno = rs2.getString("rollno");
        }
        if (temp_rollno.equals(rollno)) {
            System.out.print(email);
            result = "Roll No is already existing.";
        } else if (temp_email.equals(email)) {
            System.out.print(rollno);
            result = "E-Mail is already existing.";
        } else {
            cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
            PreparedStatement pst = cnn1.prepareStatement("insert into login_student values (?,?,?,?,?,?)");
            pst.setString(1, objbin.getFname());
            pst.setString(2, objbin.getLname());
            pst.setString(3, objbin.getRollno());
            pst.setString(4, objbin.getUserid());
            pst.setString(5, objbin.getPassword());
            pst.setString(6, objbin.getGender());
            pst.executeUpdate();
            result = "Account is successfully created.";
        }
        return result;
    }

    public String updateRecord(binclass objbin) {
        Connection cnn1;
        String result = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
            PreparedStatement pst = cnn1.prepareStatement("update login_student set fname=?,lname=?,email=? where rollno=?");
            pst.setString(1, objbin.getFname());
            pst.setString(2, objbin.getLname());
            pst.setString(3, objbin.getUserid());
            pst.setString(4, objbin.getRollno());
            int i = pst.executeUpdate();
            if (i > 0) {
                System.out.print("not done");
                result = "Update Done";
                return result;
            }
        } catch (Exception e) {

        }
        return result;
    }
                                                                   
    public binclass viewRecord(int name) throws ClassNotFoundException, SQLException {
        Connection cnn1;
        binclass objbin = new binclass();
        Class.forName("com.mysql.jdbc.Driver");
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
//        PreparedStatement pst = cnn1.prepareStatement("insert into abc values (?,?)");
//        pst.setString(1, objbin.getName());
//        pst.setString(2, objbin.getPass());
//        pst.executeUpdate();
        Statement ss1 = cnn1.createStatement();
        ResultSet rs1 = ss1.executeQuery("select * from login_student where id=" + name);
        while (rs1.next()) {
            // objbin.setName(rs1.getString("id"));
        }
        return objbin;
    }

    public binclass login_permission(String userid, String password) throws ClassNotFoundException, SQLException {
        String email = "", pass = "";
        Connection cnn1;
        Connection cnn2;
        binclass objbin = new binclass();
        Class.forName("com.mysql.jdbc.Driver");
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        cnn2 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        Statement ss1 = cnn1.createStatement();
        Statement ss2 = cnn2.createStatement();
        ResultSet rs1 = ss1.executeQuery("select * from login_student where email='" + userid + "'");
        ResultSet rs2 = ss2.executeQuery("select * from login_student where password='" + password + "'");
        while (rs1.next()) {
            email = rs1.getString("email");
            pass = rs1.getString("password");
            objbin.setUserid(rs1.getString("email"));
            objbin.setPassword(rs1.getString("password"));
            objbin.setFname(rs1.getString("fname"));
            objbin.setRollno(rs1.getString("rollno"));
        }
        return objbin;
    }
public binclass admin_login_permission(String userid, String password) throws ClassNotFoundException, SQLException {
        String email = "", pass = "";
        Connection cnn1;
        Connection cnn2;
        binclass objbin = new binclass();
        Class.forName("com.mysql.jdbc.Driver");
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        cnn2 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        Statement ss1 = cnn1.createStatement();
        Statement ss2 = cnn2.createStatement();
        ResultSet rs1 = ss1.executeQuery("select * from login_admin where email='" + userid + "'");
        ResultSet rs2 = ss2.executeQuery("select * from login_admin where password='" + password + "'");
        while (rs1.next()) {
            objbin.setUserid(rs1.getString("email"));
            objbin.setPassword(rs1.getString("password"));
        }
        return objbin;
    }
    public binclass recover_password( int rollno) throws ClassNotFoundException, SQLException {
        Connection cnn2;
        binclass objbin = new binclass();
        Class.forName("com.mysql.jdbc.Driver");
        cnn2 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        Statement ss2 = cnn2.createStatement();
        ResultSet rs2 = ss2.executeQuery("select * from login_student where rollno='" + rollno + "'");
        while (rs2.next()) {
            objbin.setRollno(rs2.getString("rollno"));
            objbin.setPassword(rs2.getString("password"));
        }
        return objbin;
    }

    public binclass view_details(String pass) throws ClassNotFoundException, SQLException {
        Connection cnn1;
        binclass objbin = new binclass();
        Class.forName("com.mysql.jdbc.Driver");
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        Statement ss1 = cnn1.createStatement();
        ResultSet rs1 = ss1.executeQuery("select * from login_student where fname ='" + pass + "'");
        while (rs1.next()) {
            objbin.setFname(rs1.getString("fname"));
            objbin.setLname(rs1.getString("lname"));
            objbin.setRollno(rs1.getString("rollno"));
            objbin.setUserid(rs1.getString("email"));
        }
        return objbin;
    }

    public binclass view_details_admin(int pass) throws ClassNotFoundException, SQLException {
        Connection cnn1;
        binclass objbin = new binclass();
        Class.forName("com.mysql.jdbc.Driver");
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        Statement ss1 = cnn1.createStatement();
        ResultSet rs1 = ss1.executeQuery("select * from login_student where rollno =" + pass);
        while (rs1.next()) {
            objbin.setFname(rs1.getString("fname"));
            objbin.setLname(rs1.getString("lname"));
            objbin.setRollno(rs1.getString("rollno"));
            objbin.setUserid(rs1.getString("email"));
        }
        return objbin;
    }

    

    public int deleteRecord(int rollno) throws ClassNotFoundException, SQLException {
        Connection cnn1;
        binclass objbin = new binclass();
        Class.forName("com.mysql.jdbc.Driver");
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        PreparedStatement ps = cnn1.prepareStatement("delete from login_student where rollno=" + rollno);
        int i = ps.executeUpdate();
        return 0;
    }

    public String addfiles(String filename, String branchname, String samestername) throws ClassNotFoundException, SQLException, FileNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection cnn1;
        
        String file = "C:\\Users\\desmon\\Desktop\\" + filename;
        File file1 = new File(file);
        FileInputStream fin = new FileInputStream(file1);
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        PreparedStatement pre = cnn1.prepareStatement("insert into notes_table values (?,?,?)");
        pre.setString(1, branchname);
        pre.setString(2, samestername);
        pre.setBlob(3, (InputStream) fin, (int) file1.length());
        int i=pre.executeUpdate();
        if(i>0)
        {
        String result="done";
        return result;
        }
        else{
        String result="notdone";
        return result;
        }
    }
public List student_lsit() throws ClassNotFoundException, SQLException {
        Connection cnn1;
        List list = new ArrayList();
        Class.forName("com.mysql.jdbc.Driver");
        cnn1 = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        Statement ss1 = cnn1.createStatement();
        ResultSet rs1 = ss1.executeQuery("select * from login_student");
        while (rs1.next()) {
            binclass objbin = new binclass();
            objbin.setFname(rs1.getString("fname"));
            objbin.setLname(rs1.getString("lname"));
            objbin.setRollno(rs1.getString("rollno"));
            objbin.setUserid(rs1.getString("email"));
            objbin.setPassword(rs1.getString("password"));
            objbin.setGender(rs1.getString("gender"));
            list.add(objbin);
        }
        return list;
    }
    public List view_addfiles() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
        String driverName = "com.mysql.jdbc.Driver";
        List list = new ArrayList();
        Connection con = null;
        String sam = "Semester 2";
        Class.forName(driverName);
        con = DriverManager.getConnection("jdbc:mysql:///notes", "root", "");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from notes_table");
        while (rs.next()) {
            binclass objbin = new binclass();
            objbin.setBranch(rs.getString("branch"));
            objbin.setSemester(rs.getString("semester"));
            objbin.setFile(rs.getBlob("pdf"));
            list.add(objbin);
        }
        return list ;
    }
}
