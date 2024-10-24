package com.krakedev.persintencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionBDD {
	public Connection conectar() {
		private final String DRIVER="org.postgresql.Driver";
		Connection connection=null;	
		try {
			Class.forName();
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"Erii2007.");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
		
	
}
