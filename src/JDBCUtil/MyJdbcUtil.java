package JDBCUtil;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class MyJdbcUtil {
	private static String url;
	private static String driverClass;
	private static String user;
	private static String password;
	static {
		try {
			ResourceBundle p = ResourceBundle.getBundle("a");
			url = p.getString("url");
			driverClass = p.getString("driverClass");
			user = p.getString("user");
			password = p.getString("password");
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnetion() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			return conn;
		}

	}

}
