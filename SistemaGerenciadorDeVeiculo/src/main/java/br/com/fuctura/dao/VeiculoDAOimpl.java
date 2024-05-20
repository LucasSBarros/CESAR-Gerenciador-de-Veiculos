package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Veiculo;

public class VeiculoDAOimpl implements IVeiculoDAO {

	@Override
	public void salvar(Connection conn, Veiculo veiculo) {
		
		try {

			String comandoInsert = "INSERT INTO veiculo (codigo_loja, placa, modelo, ano, valor)\r\n" + "VALUES (?, ?, ?, ?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setInt(1, veiculo.getCodigo_loja());
			pstm.setString(2, veiculo.getPlaca());
			pstm.setString(3, veiculo.getModelo());
			pstm.setInt(4, veiculo.getAno());
			pstm.setDouble(5, veiculo.getValor());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Connection conn, Veiculo veiculo) {
		
		try {

			String comandoDelete = "DELETE FROM veiculo WHERE codigo_veiculo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setInt(1, veiculo.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Connection conn, Veiculo veiculo) {
		
		try {

			String comandoAlterar = "UPDATE veiculo SET codigo_loja = ?, placa = ?, modelo = ?, ano = ?, valor = ? WHERE codigo_veiculo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setInt(1, veiculo.getCodigo_loja());
			pstm.setString(2, veiculo.getPlaca());
			pstm.setString(3, veiculo.getModelo());
			pstm.setInt(4, veiculo.getAno());
			pstm.setDouble(5, veiculo.getValor());
			pstm.setInt(6, veiculo.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Veiculo veiculo) {
		
		try {

			String comandoBuscar = "SELECT codigo_veiculo, codigo_loja, placa, modelo, ano, valor FROM veiculo WHERE codigo_veiculo = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, veiculo.getCodigo());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_veiculo");
				int codigo_loja = rs.getInt("codigo_loja");
				String placa = rs.getString("placa");
				String modelo = rs.getString("modelo");
				int ano = rs.getInt("ano");
				double valor = rs.getDouble("valor");

				System.out.println("Código do Veículo: " + codigo 
						+ ", Codigo da Loja: " + codigo_loja 
						+ ", Placa: " + placa 
						+ ", Modelo: " + modelo 
						+ ", Ano: " + ano 
						+ ", Valor: " + valor);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
