/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bin;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Desmon
 */
public class fetchpdf {
    
    
      public void download(String ss,String ss2)
      {
		System.out.println("Retrive Image Example!");
		String driverName = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/";
		String dbName = "notes";
		String userName = "root";
		String password = "";
                System.out.print(ss);
		Connection con = null;
		try{
			Class.forName(driverName);
                        String sem = ss;
                        String branch = ss2;
			con = DriverManager.getConnection(url+dbName,userName,password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select pdf from notes_table where semester='" + sem + "'and branch='" + branch + "'");
			int i = 0;
			while (rs.next()) {
				InputStream in = rs.getBinaryStream(1);
				File file = new File("D://pdf/"+sem+""+branch+"" + i + ".pdf");
                                OutputStream f = new FileOutputStream(file);
				i++;
				int c = 0;
				while ((c = in.read()) > -1) {
					f.write(c);
				}
				f.close();
				in.close();
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	
      }
}
