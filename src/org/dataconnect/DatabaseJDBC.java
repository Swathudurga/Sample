package org.dataconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseJDBC {
	public static String dataBaseConnect(String queryValues) {
	
		Connection con=null;
		String value=null;
		//1.classname to confique
		
		
      try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.connecting database
		//copy paste                              username     ,password
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "Hr", "admin");
		
		
		//3.write the Queries
		String Query = queryValues;  //"Select * from greensstudent";
		
		
		//4.prepare the ststement
		PreparedStatement prepare = con.prepareStatement(Query);
		
		
		//5.Execute Query
		ResultSet r = prepare.executeQuery(Query);
		
		//6.Iterate the results
		while (r.next()) {
			
//			int int1 = r.getInt("employee_Id");
//			System.out.println(int1);
			value = r.getString("first_name");
			System.out.println(value);
		}
		//7.close the db connection
		
		//con.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
      finally {
    	  
    	  try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
      return value;
	}
	
	public static void main(String[] args) {
	dataBaseConnect("select first_name from employees where first_name ='Steven'");	
	
}}

