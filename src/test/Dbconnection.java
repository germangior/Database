package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection ct=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root","LbsUK##123");
		
		
		Statement st=ct.createStatement();
		ResultSet result = st.executeQuery("select * from eproduct");
		
		while (result.next()) {
			
			System.out.println("Product Id " + result.getInt("ID"));
			System.out.println("Product name " + result.getString("name"));
			
			}
		
		ct.close();
	}

}
