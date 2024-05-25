package br.com.fuctura.controlador;

import br.com.fuctura.entidade.Tipo;
import br.com.fuctura.entidade.Veiculo;

public interface ITipoCRUD {

	public Tipo cadastrar(Veiculo veiculo);

	public Tipo buscar(Veiculo veiculo);

	public Tipo alterar(Veiculo veiculo);

	public Tipo excluir(Veiculo veiculo);

}
