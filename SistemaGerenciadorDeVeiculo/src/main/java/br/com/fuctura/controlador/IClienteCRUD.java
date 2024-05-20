package br.com.fuctura.controlador;

import br.com.fuctura.entidade.Cliente;

public interface IClienteCRUD {

	public Cliente cadastrar();
	
	public Cliente buscar();

	public Cliente alterar();

	public Cliente excluir();

}
