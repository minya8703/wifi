package zerobase.web.wifi.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqliteConnection {

	static {
		try {
			Class.forName("org.sqlite.JDBC");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected Connection getConnect() {

		// SQLite connection string
		String url = "jdbc:sqlite:/Users/kyutaepark/Desktop/zerobase-mission3/db/db1.sqlite";
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		return connection;
	}

}