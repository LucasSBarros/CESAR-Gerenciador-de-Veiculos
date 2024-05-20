package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Cliente;

public interface IClienteDAO {

	void salvar(Connection conn, Cliente cliente);

	void excluir(Connection conn, Cliente cliente);

	void alterar(Connection conn, Cliente cliente);

	void buscar(Connection conn, Cliente cliente);

}