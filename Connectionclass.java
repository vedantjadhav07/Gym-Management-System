package gym_management_system;
import java.sql.*;
public class Connectionclass {
	Connection conn;
	Statement stm;
	public Connectionclass() {
		// TODO Auto-generated constructor stub
		try
		{
			//Class.forName("com.mysql.jdbc.Driver");
		 conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/microproject_ajp","root","vedant07");
		  stm= conn.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           new Connectionclass();
	}

}
