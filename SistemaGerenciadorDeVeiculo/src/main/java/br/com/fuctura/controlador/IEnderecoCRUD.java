package br.com.fuctura.controlador;

import br.com.fuctura.entidade.Cliente;
import br.com.fuctura.entidade.Endereco;
import br.com.fuctura.entidade.Loja;

public interface IEnderecoCRUD {

	public Endereco cadastrar(Cliente cliente);

	public Endereco cadastrar(Loja loja);

	public Endereco buscar(Cliente cliente);
	
	public Endereco buscar(Loja loja);

	public Endereco alterar(Cliente cliente);

	public Endereco alterar(Loja loja);

	public Endereco excluir(Cliente cliente);
	
	public Endereco excluir(Loja loja);

}
