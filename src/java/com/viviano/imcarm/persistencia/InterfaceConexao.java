package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.SQLException;


public interface InterfaceConexao {
	
	
	public Connection getConnection() throws SQLException;
		

}
