package com.practice.questions.insert_multiple_student_data_using_JDBC_into_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	Connection connection;

	public Connection getConnectionDetails() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "Justdoit@6490");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;

	}

}
