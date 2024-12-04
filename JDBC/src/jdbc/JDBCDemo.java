package jdbc;

import java.sql.*;

public class JDBCDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JDBC", "root", "root");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//			String[] arg= {"5","Kumar","Abhishek","UP","Ballia"};
//			CallableStatement cstmt=con.prepareCall("insert into Persons values (?,?,?,?,?)");
//			cstmt.setInt(1, Integer.parseInt(arg[0]));
//			cstmt.setString(2, arg[1]);
//			cstmt.setString(3, arg[2]);
//			cstmt.setString(4, arg[3]);
//			cstmt.setString(5, arg[4]);
//			cstmt.execute();
//			ResultSet rs = stmt.executeQuery("select * from Persons;");
			ResultSet rs=stmt.executeQuery("select * from Persons");
//			System.out.println("error occured2");
			rs.absolute(2);
//			System.out.println("record inserted successfully.");
			System.out.println(rs.getInt("PersonID"));
			System.out.println(rs.getString("FirstName"));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("error occured");
		}
	}
}
