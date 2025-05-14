package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroUsuario {

	public void cadastrarUsuario(Usuario usuario) throws SQLException {
		// Comando para inserir dados no B.D
		String sql = "INSERT INTO usuario (id, login, nome, senha) VALUES (?,?,?,?)";
		
		// Conexao com o B.D
		Connection conn = ConexaoDB.conectar();
		
		// Preparar consulta junto da conexão do D.B
		
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		// Substitui as ? pelos dados do objeto usuario
		
		stmt.setInt(1, usuario.getId());
		stmt.setString(2, usuario.getLogin());
		stmt.setString(3, usuario.getNome());
		stmt.setString(4, usuario.getSenha());
		
		// Executar a consulta
		stmt.executeUpdate();
	}
}
