package com.mauro.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	public static void main(String[] args) {
		// 1. driver
		
		// 2. cadena de conexion
		
		// 3. usuario, contraseña, base de datos
		
		String cadena= "jdbc:mysql://localhost:3306/prueba?useLegacyDatetimeCode=false&serverTimezone=America/New_York";
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			DriverManager.getConnection(cadena, "root", "");
			System.out.println(":)");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(":(");
		}

	}

}
