package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Tipo;

public class TipoDAOimpl implements ITipoDAO {

	@Override
	public void salvar(Connection conn, Tipo tipo) {
		
		try {

			String comandoInsert = "INSERT INTO tipo (codigo_veiculo, descricao)\r\n" + "VALUES (?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setInt(1, tipo.getCodigo_veiculo());
			pstm.setString(2, tipo.getDescricao());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Connection conn, Tipo tipo) {
		
		try {

			String comandoDelete = "DELETE FROM tipo WHERE codigo_tipo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setInt(1, tipo.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Connection conn, Tipo tipo) {
		
		try {

			String comandoAlterar = "UPDATE tipo SET codigo_veiculo = ?, descricao = ? WHERE codigo_tipo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setInt(1, tipo.getCodigo_veiculo());
			pstm.setString(2, tipo.getDescricao());
			pstm.setInt(3, tipo.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Tipo tipo) {
		
		try {

			String comandoBuscar = "SELECT codigo_tipo, codigo_veiculo, descricao FROM tipo WHERE codigo_tipo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, tipo.getCodigo());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_tipo");
				int codigo_veiculo = rs.getInt("codigo_veiculo");
				String descricao = rs.getString("descricao");

				System.out.println("Código: " + codigo 
						+ ", Codigo do Veículo: " + codigo_veiculo 
						+ ", Descrição: " + descricao);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
