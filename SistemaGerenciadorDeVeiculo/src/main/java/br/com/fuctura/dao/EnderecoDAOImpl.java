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
	public void excluirLoja(Connection conn, Endereco endereco) {

		try {

			String comandoDelete = "DELETE FROM endereco WHERE codigo_loja = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setInt(1, endereco.getCodigo_loja());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluirCliente(Connection conn, Endereco endereco) {

		try {

			String comandoDelete = "DELETE FROM endereco WHERE codigo_cliente = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setInt(1, endereco.getCodigo_cliente());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterarLoja(Connection conn, Endereco endereco) {

		try {

			String comandoAlterar = "UPDATE endereco SET cep = ?, logradouro = ?, complemento = ?, numero = ? WHERE codigo_loja = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setString(1, endereco.getCep());
			pstm.setString(2, endereco.getLogradouro());
			pstm.setString(3, endereco.getComplemento());
			pstm.setInt(4, endereco.getNumero());
			pstm.setInt(5, endereco.getCodigo_loja());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterarCliente(Connection conn, Endereco endereco) {

		try {

			String comandoAlterar = "UPDATE endereco SET cep = ?, logradouro = ?, complemento = ?, numero = ? WHERE codigo_cliente = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setString(1, endereco.getCep());
			pstm.setString(2, endereco.getLogradouro());
			pstm.setString(3, endereco.getComplemento());
			pstm.setInt(4, endereco.getNumero());
			pstm.setInt(5, endereco.getCodigo_cliente());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscarLoja(Connection conn, Endereco endereco) {

		try {

			String comandoBuscar = "SELECT Loja.codigo_loja, " + "Loja.nome, " + "Loja.cnpj, " + "Loja.telefone, "
					+ "Endereco.codigo_endereco, " + "Endereco.cep, " + "Endereco.logradouro, "
					+ "Endereco.complemento, " + "Endereco.numero "
					+ "FROM Loja INNER JOIN Endereco ON Loja.codigo_loja = Endereco.codigo_loja "
					+ "WHERE Endereco.codigo_loja = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, endereco.getCodigo_loja());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_endereco");
				int codigo_loja = rs.getInt("codigo_loja");
				String nome = rs.getString("nome");
				String cnpj = rs.getString("cnpj");
				String telefone = rs.getString("telefone");
				String cep = rs.getString("cep");
				String logradouro = rs.getString("logradouro");
				String complemento = rs.getString("complemento");
				int numero = rs.getInt("numero");

				System.out.println("\nCódigo da Loja: " + codigo_loja + "\nCódigo do endereço: " + codigo + "\nNome: "
						+ nome + "\nCNPJ: " + cnpj + "\nTelefone: " + telefone + "\nCEP: " + cep + "\nLogradouro: "
						+ logradouro + "\nComplemento: " + complemento + "\nNúmero: " + numero + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscarCliente(Connection conn, Endereco endereco) {

		try {

			String comandoBuscar = "SELECT Cliente.codigo_cliente, "+ "Cliente.nome, " + "Cliente.cpf, " + "Cliente.celular, "
					+ "Endereco.codigo_endereco, " + "Endereco.cep, " + "Endereco.logradouro, "
					+ "Endereco.complemento, " + "Endereco.numero "
					+ "FROM Cliente INNER JOIN Endereco ON Cliente.codigo_cliente = Endereco.codigo_cliente "
					+ "WHERE Endereco.codigo_cliente = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, endereco.getCodigo_cliente());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_endereco");
				int codigo_cliente = rs.getInt("codigo_cliente");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String celular = rs.getString("celular");
				String cep = rs.getString("cep");
				String logradouro = rs.getString("logradouro");
				String complemento = rs.getString("complemento");
				int numero = rs.getInt("numero");

				System.out.println("\nCódigo do Cliente: " + codigo_cliente + "\nCódigo do endereço: " + codigo
						+ "\nNome: " + nome + "\nCPF: " + cpf + "\nCelular: " + celular + "\nCEP: " + cep
						+ "\nLogradouro: " + logradouro + "\nComplemento: " + complemento + "\nNúmero: " + numero + "");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
