package creational.singleton;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DbDerbySingletonDemo {

	public static void main(String[] args) {
		
		long timeBefore = 0;
		long timeAfter	= 0;
		
		DbDerbySingleton instance = DbDerbySingleton.getInstance();
		
		timeBefore	= System.currentTimeMillis();
		Connection conn = instance.getConnection();
		timeAfter	= System.currentTimeMillis();
		System.out.println("First  Connection: " + (timeAfter - timeBefore) + " ms" );
		
		Statement sta;
		try {
			sta = conn.createStatement();
			int count = sta.executeUpdate(
				"CREATE TABLE Address (ID INT, StreeName VARCHAR(20), City VARCHAR(20))");
			
			System.out.println("Table created. Count: " + count);
			sta.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		timeBefore	= System.currentTimeMillis();
		conn = instance.getConnection();
		timeAfter	= System.currentTimeMillis();
		
		System.out.println("Second Connection: " + (timeAfter - timeBefore) + " ms" );
		
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
