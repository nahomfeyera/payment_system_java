import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connector {
	private static Connection connection;

	public static Connection getConnection() {

		connection = null;
		try {
			// Creating Connection Object
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		return connection;

	}

	public static void main(String[] args) {

	}
}
