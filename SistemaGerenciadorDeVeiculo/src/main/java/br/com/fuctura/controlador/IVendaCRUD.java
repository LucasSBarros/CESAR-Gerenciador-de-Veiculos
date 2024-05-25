package br.com.fuctura.controlador;

import br.com.fuctura.entidade.Venda;

public interface IVendaCRUD {

	public Venda cadastrar();

	public Venda buscar();

	public Venda alterar();

	public Venda excluir();

}
