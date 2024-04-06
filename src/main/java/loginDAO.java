import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class loginDAO {

	public static boolean checks(String uname, String upass){
		
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String pass = "1234";
		String query = "Select * from users where Name = ? and Password = ?";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.getCause();
		}
		
		try {
			
			
			Connection con = DriverManager.getConnection(url,username,pass);
			PreparedStatement pd = con.prepareStatement(query);
			
			pd.setString(1, uname);
			pd.setString(2, upass);
			
			ResultSet rs = pd.executeQuery();
			
			
			
			if(rs.next()) {
				return true;
			}
			
		}catch(Exception e){
			e.getStackTrace();
		}
		
		
		
		return false;
	}
}
