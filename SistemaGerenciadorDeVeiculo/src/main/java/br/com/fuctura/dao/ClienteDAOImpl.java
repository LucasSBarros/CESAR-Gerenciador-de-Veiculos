package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Cliente;

public class ClienteDAOImpl implements IClienteDAO {

	@Override
	public void salvar(Connection conn, Cliente cliente) {

		try {

			String comandoInsert = "INSERT INTO cliente (nome, cpf, celular) VALUES (?, ?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getCelular());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Connection conn, Cliente cliente) {

		try {

			String comandoDelete = "DELETE FROM cliente WHERE cpf = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setString(1, cliente.getCpf());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void alterar(Connection conn, Cliente cliente) {

		try {

			String comandoAlterar = "UPDATE cliente SET nome = ?, cpf = ?, celular = ? WHERE codigo_cliente = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setString(1, cliente.getNome());
			pstm.setString(2, cliente.getCpf());
			pstm.setString(3, cliente.getCelular());
			pstm.setInt(4, cliente.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Cliente cliente) {

		try {

			String comandoBuscar = "SELECT codigo_cliente, nome, cpf, celular FROM cliente WHERE cpf = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setString(1, cliente.getCpf());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_cliente");
				String nome = rs.getString("nome");
				String cpf = rs.getString("cpf");
				String celular = rs.getString("celular");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public Cliente instruir(Connection conn, Cliente cliente) {

		try {

			String comandoBuscar = "SELECT codigo_cliente FROM cliente WHERE cpf = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setString(1, cliente.getCpf());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {

				int codigo = rs.getInt("codigo_cliente");

				cliente.setCodigo(codigo);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return cliente;

	}

}
