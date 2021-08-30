
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DATADAO {
	String str;
	String str1;
	public int j;
	public DATADAO(String userName, String password) {
		str=userName;
		str1=password;
	}
		

	/*public static void main(String[] args) {
//		try {
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
//			System.out.println(connection);
//			java.sql.Statement statement= connection.createStatement();
////			int result=statement.executeUpdate("insert into account values(1,'Rohan','Kulkarni','50')");
////			System.out.println(result+" WOOOH");
////			int result=statement.executeUpdate("update account set bal=5 where accno=1");
////			System.out.println(result+" WOOOH");
////			int result=statement.executeUpdate("delete from account where accno=1");
////			System.out.println(result+" WOOOH");
//			ResultSet rs =statement.executeQuery("select * from dataB");
//			while (rs.next())
//			{
//				System.out.print(rs.getString(1)+" ");
//				System.out.print(rs.getString(2)+" ");
//				
//				System.out.println();
//			}
//		} 
//		catch (SQLException e) {
//			e.printStackTrace();
//		}
		}*/


	public int geti() {
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","admin");
			System.out.println(connection);
			java.sql.Statement statement= connection.createStatement();
			ResultSet rs =statement.executeQuery("select * from dataB");
			while (rs.next())
			{
				if(rs.getString(1).equals(str))
				{
					if(rs.getString(1).equals(str1))
					{
						j=1;
					}
				}	
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return j;
	}
}