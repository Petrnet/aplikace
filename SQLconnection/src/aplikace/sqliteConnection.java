package aplikace;
import java.sql.*;
public class sqliteConnection {
	
	public static Connection dbConnector()
	{	
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Petr\\git\\aplikace\\SQLconnection\\src\\aplikace\\Zamestnanec.sqlite");
			return conn;
}catch(Exception e)
		{
	System.out.println(e);
	return null;
		}
}
}

