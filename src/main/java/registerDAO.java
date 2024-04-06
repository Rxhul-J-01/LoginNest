import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class registerDAO {

	public static boolean add(String name, String pass, String email) {
		
		String url = "jdbc:mysql://localhost:3306/mydatabase";
		String username = "root";
		String dpass = "1234";
		String query = "insert into users values(?, ?, ?)";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(Exception e) {
			e.getCause();
		}
		
		try {
			Connection con = DriverManager.getConnection(url,username,dpass);
			PreparedStatement pd = con.prepareStatement(query);
			
			pd.setString(1, name);
			pd.setString(2, pass);
			pd.setString(3, email);
			
			int rowsAffected = pd.executeUpdate();
			
			if(rowsAffected > 0) {
				return true;
			}
			
		}catch(Exception e) {
			e.getMessage();
		}
		
		return false;
	}
}
