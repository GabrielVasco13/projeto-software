package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
	private static final String URL = "jdbc:mysql://localhost:3306/sistema";

	// informa o usario e a senha do B.D
	private static final String USER = "root";
	private static final String PASSWORD = "";
	
	// metodo estatico que retorna conexão
	
	public static Connection conectar() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}
}
