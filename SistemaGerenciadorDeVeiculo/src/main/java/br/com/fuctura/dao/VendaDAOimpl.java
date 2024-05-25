package br.com.fuctura.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.fuctura.entidade.Venda;

public class VendaDAOimpl implements IVendaDAO {

	@Override
	public void salvar(Connection conn, Venda venda) {

		try {

			String comandoInsert = "INSERT INTO venda (codigo_loja, codigo_cliente, codigo_vendedor, valor) VALUES (?, ?, ?, ?);";

			PreparedStatement pstm = conn.prepareStatement(comandoInsert);

			pstm.setInt(1, venda.getCodigo_loja());
			pstm.setInt(2, venda.getCodigo_cliente());
			pstm.setInt(3, venda.getCodigo_vendedor());
			pstm.setDouble(4, venda.getValor());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void excluir(Connection conn, Venda venda) {

		try {

			String comandoDelete = "DELETE FROM venda WHERE codigo_venda = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoDelete);

			pstm.setInt(1, venda.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void alterar(Connection conn, Venda venda) {

		try {

			String comandoAlterar = "UPDATE venda SET codigo_loja = ?, codigo_cliente = ?, codigo_vendedor = ?, valor = ? WHERE codigo_venda = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoAlterar);

			pstm.setInt(1, venda.getCodigo_loja());
			pstm.setInt(2, venda.getCodigo_cliente());
			pstm.setInt(3, venda.getCodigo_vendedor());
			pstm.setDouble(4, venda.getValor());
			pstm.setInt(5, venda.getCodigo());

			pstm.execute();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void buscar(Connection conn, Venda venda) {

		try {

			String comandoBuscar = "SELECT codigo_venda, codigo_loja, codigo_cliente, codigo_vendedor, valor FROM venda WHERE codigo_venda = ?;";

			PreparedStatement pstm = conn.prepareStatement(comandoBuscar);

			pstm.setInt(1, venda.getCodigo());

			pstm.execute();

			ResultSet rs = pstm.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_venda");
				int codigo_loja = rs.getInt("codigo_loja");
				int codigo_cliente = rs.getInt("codigo_cliente");
				int codigo_vendedor = rs.getInt("codigo_vendedor");
				double valor = rs.getDouble("valor");

				System.out.println(
						"Código da Venda: " + codigo + ", Código da Loja: " + codigo_loja + ", Código do Cliente: "
								+ codigo_cliente + ", Código do Vendedor: " + codigo_vendedor + ", Valor: " + valor);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
