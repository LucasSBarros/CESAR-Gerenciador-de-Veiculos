package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Endereco;

public class EnderecoDAOImpl implements IEnderecoDAO {

	@Override
	public void salvarLoja(Connection conn, Endereco endereco) {

		try {

			String comandoInsert = "INSERT INTO endereco (codigo_loja, cep, logradouro, complemento, numero) VALUES (?, ?, ?, ?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setInt(1, endereco.getCodigo_loja());
			pstm.setString(2, endereco.getCep());
			pstm.setString(3, endereco.getLogradouro());
			pstm.setString(4, endereco.getComplemento());
			pstm.setInt(5, endereco.getNumero());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void salvarCliente(Connection conn, Endereco endereco) {

		try {

			String comandoInsert = "INSERT INTO endereco (codigo_cliente, cep, logradouro, complemento, numero)\r\n"
					+ "VALUES (?, ?, ?, ?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setInt(1, endereco.getCodigo_cliente());
			pstm.setString(2, endereco.getCep());
			pstm.setString(3, endereco.getLogradouro());
			pstm.setString(4, endereco.getComplemento());
			pstm.setInt(5, endereco.getNumero());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Connection conn, Endereco endereco) {

		try {

			String comandoDelete = "DELETE FROM endereco WHERE codigo_endereco = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setInt(1, endereco.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterarLoja(Connection conn, Endereco endereco) {

		try {

			String comandoAlterar = "UPDATE endereco SET codigo_loja = ?, cep = ?, logradouro = ?, complemento = ?, numero = ? WHERE codigo_endereco = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setInt(1, endereco.getCodigo_loja());
			pstm.setString(2, endereco.getCep());
			pstm.setString(3, endereco.getLogradouro());
			pstm.setString(4, endereco.getComplemento());
			pstm.setInt(5, endereco.getNumero());
			pstm.setInt(6, endereco.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterarCliente(Connection conn, Endereco endereco) {

		try {

			String comandoAlterar = "UPDATE endereco SET codigo_cliente = ?, cep = ?, logradouro = ?, complemento = ?, numero = ? WHERE codigo_endereco = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setInt(1, endereco.getCodigo_cliente());
			pstm.setString(2, endereco.getCep());
			pstm.setString(3, endereco.getLogradouro());
			pstm.setString(4, endereco.getComplemento());
			pstm.setInt(5, endereco.getNumero());
			pstm.setInt(6, endereco.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Endereco endereco) {

		try {

			String comandoBuscar = "SELECT codigo_endereco, codigo_loja, codigo_cliente, cep, logradouro, complemento, numero FROM endereco WHERE codigo_endereco = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, endereco.getCodigo());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_cliente");
				int codigo_loja = rs.getInt("codigo_loja");
				int codigo_cliente = rs.getInt("codigo_cliente");
				String cep = rs.getString("cep");
				String logradouro = rs.getString("logradouro");
				String complemento = rs.getString("complemento");
				int numero = rs.getInt("numero");

				System.out.println("Código: " + codigo + ",Código da Loja: " + codigo_loja + ",Código do Cliente: "
						+ codigo_cliente + ", CEP: " + cep + ", Logradouro: " + logradouro + ", Complemento: "
						+ complemento + ", Número: " + numero);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
