package com.studentapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "root");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}

}
