package br.com.fuctura.controlador;

import br.com.fuctura.entidade.Cliente;
import br.com.fuctura.entidade.Endereco;
import br.com.fuctura.entidade.Loja;

public interface IEnderecoCRUD {

	public Endereco cadastrar(Cliente cliente);

	public Endereco cadastrar(Loja loja);

	public Endereco buscar();

	public Endereco alterar(Cliente cliente);

	public Endereco alterar(Loja loja);

	public Endereco excluir();

}
