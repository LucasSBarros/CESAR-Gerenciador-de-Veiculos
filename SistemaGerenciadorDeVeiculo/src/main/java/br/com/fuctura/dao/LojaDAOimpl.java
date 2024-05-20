package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Loja;

public class LojaDAOimpl implements ILojaDAO {

	@Override
	public void salvar(Connection conn, Loja loja) {
		
		try {

			String comandoInsert = "INSERT INTO loja (nome, telefone)\r\n" + "VALUES (?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setString(1, loja.getNome());
			pstm.setString(2, loja.getTelefone());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Connection conn, Loja loja) {
		
		try {

			String comandoDelete = "DELETE FROM loja WHERE codigo_loja = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setInt(1, loja.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Connection conn, Loja loja) {
		
		try {

			String comandoAlterar = "UPDATE loja SET nome = ?, telefone = ? WHERE codigo_loja = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setString(1, loja.getNome());
			pstm.setString(2, loja.getTelefone());
			pstm.setInt(3, loja.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Loja loja) {
		
		try {

			String comandoBuscar = "SELECT codigo_loja, nome, telefone FROM loja WHERE codigo_loja = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, loja.getCodigo());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_loja");
				String nome = rs.getString("nome");
				String telefone = rs.getString("telefone");

				System.out.println("Código: " + codigo 
						+ ", Nome: " + nome 
						+ ", Telefone: " + telefone);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
