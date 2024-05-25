package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Loja;

public interface ILojaDAO {

	void salvar(Connection conn, Loja loja);

	void excluir(Connection conn, Loja loja);

	void alterar(Connection conn, Loja loja);

	void buscar(Connection conn, Loja loja);

	Loja instruir(Connection conn, Loja loja);

}