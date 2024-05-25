package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Endereco;

public interface IEnderecoDAO {

	void salvarLoja(Connection conn, Endereco endereco);

	void salvarCliente(Connection conn, Endereco endereco);

	void excluir(Connection conn, Endereco endereco);

	void alterarLoja(Connection conn, Endereco endereco);

	void alterarCliente(Connection conn, Endereco endereco);

	void buscar(Connection conn, Endereco endereco);

}