package utility;

import java.io.InputStream;
import java.util.Properties;

public class ConnectionManager {
//    public static Connection getConnection() throws ClassNotFoundException, SQLException {
//	Class.forName("Oracle.jdbc.OracleDriver");
//	Connection con = null;
//	con=DriverManager.getConnection("jdbc:pracle:thin:@localhost:1521:orcl","SYSTEM","admin");
//	if(con !=null) {
//		System.out.println("Established");
//	}
//	return con;
//    }
    
    
    public static Properties loadPropertiesFile() throws Exception{
	Properties prop = new Properties();
	InputStream in = ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
	prop.load(in);
	in.close();
	return prop;
    }
}
