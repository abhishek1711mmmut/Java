package jdbc;

import java.sql.*;

public class BatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			Statement stmt=con.createStatement();
			stmt.addBatch("insert into Persons values (3,'hathodi','Ninja','Cartoon','Network')");
			stmt.addBatch("insert into Persons values (4,'bheem','chota','Pogo','Cartoon')");
			stmt.executeBatch();
		}catch(Exception e) {
			System.err.print(e);
		}
	}
}