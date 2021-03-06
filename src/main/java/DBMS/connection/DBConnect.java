package DBMS.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private final String serverName = "localhost";



//	private final String dbName = "HQT_tuan08";
//	private final String portNumber = "1433";
//	private final String instance = "";
//	private final String userID = "sa";
//	private final String password = "amsang2403@";







	private final String dbName = "HQT_tuan08";
	private final String portNumber = "1433";
	private final String instance = "";
	private String userID;
	private String password;

	
	public DBConnect(String userID, String password) {
		super();
		this.userID = userID;
		this.password = password;
	}

	public Connection getConnection()throws Exception {
        String url = "jdbc:sqlserver://"+serverName+":"+portNumber + "\\" + instance +";databaseName="+dbName;
        if(instance == null || instance.trim().isEmpty())
            url = "jdbc:sqlserver://"+serverName+":"+portNumber +";databaseName="+dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password); 
    }  
	
}