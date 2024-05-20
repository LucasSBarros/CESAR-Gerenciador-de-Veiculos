package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Vendedor;

public interface IVendedorDAO {

	void salvar(Connection conn, Vendedor vendedor);

	void excluir(Connection conn, Vendedor vendedor);

	void alterar(Connection conn, Vendedor vendedor);

	void buscar(Connection conn, Vendedor vendedor);

}