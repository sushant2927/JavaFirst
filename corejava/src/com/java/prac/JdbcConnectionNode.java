package com.java.prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcConnectionNode {

	public static void main(String[] args) throws SQLException {
		String Method ="jdbc";
		String username = "sys as sysdba";
	    String password = "sushant121";
		try {
			
			//step1 load the driver class  
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(  
					
					
			"jdbc:oracle:thin:@localhost:1521:xe",username,password); 
			
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			
		//	 int  update=stmt.executeUpdate("insert into customers values (109 ,'JAY' ,'Ujjain')");
			//System.out.println(update + " 1 row updated");
			
			
			String QUERY1="select * from customer";
			ResultSet rs=stmt.executeQuery(QUERY1);  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));   
			  
			//step5 close the connection object  
			con.close(); 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
	}
}
