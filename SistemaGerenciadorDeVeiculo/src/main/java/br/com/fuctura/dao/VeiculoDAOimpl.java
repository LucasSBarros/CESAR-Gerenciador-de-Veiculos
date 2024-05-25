package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Veiculo;

public class VeiculoDAOimpl implements IVeiculoDAO {

	@Override
	public void salvar(Connection conn, Veiculo veiculo) {

		try {

			String comandoInsert = "INSERT INTO veiculo (codigo_loja, placa, marca, modelo, ano, valor) VALUES (?, ?, ?, ?, ?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setInt(1, veiculo.getCodigo_loja());
			pstm.setString(2, veiculo.getPlaca());
			pstm.setString(3, veiculo.getMarca());
			pstm.setString(4, veiculo.getModelo());
			pstm.setInt(5, veiculo.getAno());
			pstm.setDouble(6, veiculo.getValor());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Connection conn, Veiculo veiculo) {

		try {

			String comandoDelete = "DELETE FROM veiculo WHERE placa = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setString(1, veiculo.getPlaca());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Connection conn, Veiculo veiculo) {

		try {

			String comandoAlterar = "UPDATE veiculo SET codigo_loja = ?, placa = ?, marca = ?, modelo = ?, ano = ?, valor = ? WHERE codigo_veiculo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setInt(1, veiculo.getCodigo_loja());
			pstm.setString(2, veiculo.getPlaca());
			pstm.setString(3, veiculo.getMarca());
			pstm.setString(4, veiculo.getModelo());
			pstm.setInt(5, veiculo.getAno());
			pstm.setDouble(6, veiculo.getValor());
			pstm.setInt(7, veiculo.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Veiculo veiculo) {

		try {

			String comandoBuscar = "SELECT codigo_veiculo, codigo_loja, placa, modelo, ano, valor FROM veiculo WHERE placa = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setString(1, veiculo.getPlaca());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_veiculo");
				int codigo_loja = rs.getInt("codigo_loja");
				String placa = rs.getString("placa");
				String modelo = rs.getString("modelo");
				int ano = rs.getInt("ano");
				double valor = rs.getDouble("valor");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Veiculo instruir(Connection conn, Veiculo veiculo) {

		try {

			String comandoBuscar = "SELECT codigo_veiculo FROM veiculo WHERE placa = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setString(1, veiculo.getPlaca());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {

				int codigo = rs.getInt("codigo_veiculo");

				veiculo.setCodigo(codigo);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return veiculo;

	}

}
