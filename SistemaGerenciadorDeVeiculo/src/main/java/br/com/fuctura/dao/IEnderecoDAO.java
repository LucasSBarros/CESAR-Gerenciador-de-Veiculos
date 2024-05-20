package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Endereco;

public interface IEnderecoDAO {

	void salvar(Connection conn, Endereco endereco);

	void excluir(Connection conn, Endereco endereco);

	void alterar(Connection conn, Endereco endereco);

	void buscar(Connection conn, Endereco endereco);

}