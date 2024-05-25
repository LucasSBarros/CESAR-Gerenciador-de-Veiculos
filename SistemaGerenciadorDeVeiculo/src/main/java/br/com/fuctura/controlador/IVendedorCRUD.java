package br.com.fuctura.controlador;

import br.com.fuctura.entidade.Vendedor;

public interface IVendedorCRUD {

	public Vendedor cadastrar();

	public Vendedor buscar();

	public Vendedor alterar();

	public Vendedor excluir();

}
