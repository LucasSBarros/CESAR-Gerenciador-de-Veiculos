package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Endereco;

public interface IEnderecoDAO {

	void salvarLoja(Connection conn, Endereco endereco);

	void salvarCliente(Connection conn, Endereco endereco);

	void excluirLoja(Connection conn, Endereco endereco);
	
	void excluirCliente(Connection conn, Endereco endereco);

	void alterarLoja(Connection conn, Endereco endereco);

	void alterarCliente(Connection conn, Endereco endereco);

	void buscarLoja(Connection conn, Endereco endereco);
	
	void buscarCliente(Connection conn, Endereco endereco);

}