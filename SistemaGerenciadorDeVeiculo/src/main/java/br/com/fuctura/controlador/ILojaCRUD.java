package br.com.fuctura.controlador;

import br.com.fuctura.entidade.Loja;

public interface ILojaCRUD {

	public Loja cadastrar();
	
	public Loja buscar();

	public Loja alterar();

	public Loja excluir();

}
