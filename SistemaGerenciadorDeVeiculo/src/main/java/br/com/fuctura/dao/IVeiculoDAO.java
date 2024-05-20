package br.com.fuctura.dao;

import java.sql.Connection;

import br.com.fuctura.entidade.Veiculo;

public interface IVeiculoDAO {

	void salvar(Connection conn, Veiculo veiculo);

	void excluir(Connection conn, Veiculo veiculo);

	void alterar(Connection conn, Veiculo veiculo);

	void buscar(Connection conn, Veiculo veiculo);

}