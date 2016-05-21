package creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbDerbySingleton {
	
	private static DbDerbySingleton instance = null;	// Lazy Loading
	private Connection conn = null;
	
	private DbDerbySingleton() {
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static DbDerbySingleton getInstance() {
		if(instance == null) {
			synchronized(DbDerbySingleton.class) {
				if(instance == null) {
					instance = new DbDerbySingleton();	// Lazy Loading
				}
			}
		}
		
		return instance;
	}
	
	public Connection getConnection() {
		if(conn == null) {
			synchronized(DbDerbySingleton.class) {
				if(conn == null) {
					try {
						//String dbUrl = "jdbc:derby:memory:levoDB/singletonDemo;create=true";
						String dbUrl = "jdbc:derby://localhost:1527/memory:levoDB/singletonDemo;create=true";
						
						conn = DriverManager.getConnection(dbUrl);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
	}
	
}
