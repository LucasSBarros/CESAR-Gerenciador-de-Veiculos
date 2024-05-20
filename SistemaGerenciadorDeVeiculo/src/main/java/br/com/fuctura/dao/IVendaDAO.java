package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Venda;

public interface IVendaDAO {

	void salvar(Connection conn, Venda venda);

	void excluir(Connection conn, Venda venda);

	void alterar(Connection conn, Venda venda);

	void buscar(Connection conn, Venda venda);

}