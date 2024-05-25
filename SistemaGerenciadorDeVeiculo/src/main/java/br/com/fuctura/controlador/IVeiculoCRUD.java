package br.com.fuctura.controlador;

import br.com.fuctura.entidade.Veiculo;

public interface IVeiculoCRUD {

	public Veiculo cadastrar();

	public Veiculo buscar();

	public Veiculo alterar();

	public Veiculo excluir();

}
