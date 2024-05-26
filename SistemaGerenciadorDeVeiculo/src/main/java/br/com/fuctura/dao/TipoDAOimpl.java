package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Tipo;

public class TipoDAOimpl implements ITipoDAO {

	@Override
	public void salvar(Connection conn, Tipo tipo) {

		try {

			String comandoInsert = "INSERT INTO tipo (codigo_veiculo, descricao) VALUES (?, ?);";

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

			String comandoDelete = "DELETE FROM tipo WHERE codigo_veiculo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);
			
			System.out.println(tipo.getCodigo_veiculo());

			pstm.setInt(1, tipo.getCodigo_veiculo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Connection conn, Tipo tipo) {

		try {

			String comandoAlterar = "UPDATE tipo SET descricao = ? WHERE codigo_veiculo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setString(1, tipo.getDescricao());
			pstm.setInt(2, tipo.getCodigo_veiculo());
		
			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Tipo tipo) {

		try {

			String comandoBuscar = "SELECT Veiculo.codigo_veiculo, "
					+ "Veiculo.codigo_loja, "
					+ "Veiculo.placa, "
					+ "Veiculo.marca, "
					+ "Veiculo.modelo, "
					+ "Veiculo.ano, "
					+ "Veiculo.valor, "
					+ "Tipo.codigo_tipo, "
					+ "Tipo.codigo_veiculo, "
					+ "Tipo.descricao "
					+ "FROM Veiculo INNER JOIN Tipo ON Veiculo.codigo_veiculo = Tipo.codigo_veiculo "
					+ "WHERE Tipo.codigo_veiculo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, tipo.getCodigo_veiculo());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_tipo");
				int codigo_veiculo = rs.getInt("codigo_veiculo");
				int codigo_loja = rs.getInt("codigo_loja");
				String placa = rs.getString("placa");
				String marca = rs.getString("marca");
				String modelo = rs.getString("modelo");
				String ano = rs.getString("ano");
				Double valor = rs.getDouble("valor");
				String descricao = rs.getString("descricao");

				System.out.println(
						 "\nCodigo do Veículo: " + codigo_veiculo + 
						 "\nCódigo do Tipo: " + codigo +
						 "\nCodigo da Loja: " + codigo_loja + 
						 "\nPlaca: " + placa + 
						 "\nMarca: " + marca + 
						 "\nModelo: " + modelo + 
						 "\nAno: " + ano + 
						 "\nValor: " + valor + 
						 "\nDescrição: " + descricao + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}