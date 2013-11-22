package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao implements InterfaceConexao {

	private String driver;
	private String url;
	private String user;
	private String password;

	public Conexao() {
		this.driver = "org.postgresql.Driver";
		this.url = "jdbc:postgresql://localhost:5433/postgres";
		this.user = "postgres";
		this.password = "123";
	}

	public Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;

	}

}
