package Demo;

import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.SQLException;

public class JDBCClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC","root","root");
			System.out.println("Connection established");
			Statement stmt=con.createStatement();
//			stmt.execute("CREATE TABLE Persons ( PersonID int, LastName varchar(255), FirstName varchar(255), Address varchar(255), City varchar(255) );");
//			stmt.executeUpdate("INSERT INTO Persons (PersonID, LastName, FirstName, Address, City) VALUES (2, 'Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Norway');");
			ResultSet rs=stmt.executeQuery("select * from Persons;");
			System.out.println(rs);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.print(e);
			}
	}

}
