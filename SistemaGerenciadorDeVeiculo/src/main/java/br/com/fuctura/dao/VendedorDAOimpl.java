package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Vendedor;

public class VendedorDAOimpl implements IVendedorDAO {

	@Override
	public void salvar(Connection conn, Vendedor vendedor) {

		try {

			String comandoInsert = "INSERT INTO vendedor (nome, cpf, celular) VALUES (?, ?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setString(1, vendedor.getNome());
			pstm.setString(2, vendedor.getCpf());
			pstm.setString(3, vendedor.getCelular());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Connection conn, Vendedor vendedor) {

		try {

			String comandoDelete = "DELETE FROM vendedor WHERE codigo_vendedor = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setInt(1, vendedor.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Connection conn, Vendedor vendedor) {

		try {

			String comandoAlterar = "UPDATE vendedor SET nome = ?, cpf = ?, celular = ? WHERE codigo_vendedor = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setString(1, vendedor.getNome());
			pstm.setString(2, vendedor.getCpf());
			pstm.setString(3, vendedor.getCelular());
			pstm.setInt(4, vendedor.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Vendedor vendedor) {

		try {

			String comandoBuscar = "SELECT codigo_vendedor, nome, cpf, celular FROM vendedor WHERE codigo_vendedor = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, vendedor.getCodigo());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_vendedor");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String celular = rs.getString("celular");

				System.out.println("Código: " + codigo + ", Nome: " + nome + ", CPF: " + cpf + ", Celular: " + celular);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
