package jdbc;

import java.io.FileInputStream;
import java.sql.*;

public class BlobDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into images values (?,?)");
			stmt.setString(1, "pic1");
			FileInputStream fis=new FileInputStream("C:\\Users\\mevis\\Pictures\\Picture1.png");
			stmt.setBinaryStream(2, fis, fis.available());
			stmt.executeUpdate();
			System.out.println("Record inserted succesfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}