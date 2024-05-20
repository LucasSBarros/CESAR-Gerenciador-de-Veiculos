package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Tipo;

public interface ITipoDAO {

	void salvar(Connection conn, Tipo tipo);

	void excluir(Connection conn, Tipo tipo);

	void alterar(Connection conn, Tipo tipo);

	void buscar(Connection conn, Tipo tipo);

}