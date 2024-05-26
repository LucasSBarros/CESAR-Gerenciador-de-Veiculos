package br.com.fuctura.controlador;

import java.util.Scanner;

import br.com.fuctura.entidade.Cliente;
import br.com.fuctura.entidade.Endereco;
import br.com.fuctura.entidade.Loja;

public class ControladorEndereco implements IEnderecoCRUD {

	@Override
	public Endereco cadastrar(Cliente cliente) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o logradouro: ");
		String logradouro = sc.nextLine();

		while (!Validadores.validarLogradouro(logradouro)) {
			System.out.println("Logradouro inválido, tente novamente: ");
			logradouro = sc.nextLine();
		}

		System.out.println("Digite o número: ");
		int numero = sc.nextInt();

		while (!Validadores.validarNumero(numero)) {
			System.out.println("Número inválido, tente novamente: ");
			numero = sc.nextInt();
		}

		sc.nextLine();

		System.out.println("Digite o complemento: ");
		String complemento = sc.nextLine();

		while (!Validadores.validarComplemento(complemento)) {
			System.out.println("Complemento inválido, tente novamente: ");
			complemento = sc.nextLine();
		}

		System.out.println("Digite o CEP: ");
		String cep = sc.nextLine();

		while (!Validadores.validarCEP(cep)) {
			System.out.println("CEP inválido, tente novamente: ");
			cep = sc.nextLine();
		}

		Endereco endereco = new Endereco();

		endereco.setCodigo_cliente(cliente.getCodigo());
		endereco.setCep(cep);
		endereco.setLogradouro(logradouro);
		endereco.setComplemento(complemento);
		endereco.setNumero(numero);

		System.out.println("Cliente cadastrado com sucesso!\n");
		
		return endereco;

	}

	@Override
	public Endereco cadastrar(Loja loja) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o logradouro: ");
		String logradouro = sc.nextLine();

		while (!Validadores.validarLogradouro(logradouro)) {
			System.out.println("Logradouro inválido, tente novamente: ");
			logradouro = sc.nextLine();
		}

		System.out.println("Digite o número: ");
		int numero = sc.nextInt();

		while (!Validadores.validarNumero(numero)) {
			System.out.println("Número inválido, tente novamente: ");
			numero = sc.nextInt();
		}

		sc.nextLine();

		System.out.println("Digite o complemento: ");
		String complemento = sc.nextLine();

		while (!Validadores.validarComplemento(complemento)) {
			System.out.println("Complemento inválido, tente novamente: ");
			complemento = sc.nextLine();
		}

		System.out.println("Digite o CEP: ");
		String cep = sc.nextLine();

		while (!Validadores.validarCEP(cep)) {
			System.out.println("CEP inválido, tente novamente: ");
			cep = sc.nextLine();
		}

		Endereco endereco = new Endereco();

		endereco.setCodigo_loja(loja.getCodigo());
		endereco.setCep(cep);
		endereco.setLogradouro(logradouro);
		endereco.setComplemento(complemento);
		endereco.setNumero(numero);

		System.out.println("Loja cadastrada com sucesso!\n");
		
		return endereco;

	}

	@Override
	public Endereco buscar(Cliente cliente) {

		int codigo_cliente = cliente.getCodigo();

		Endereco endereco = new Endereco();

		endereco.setCodigo_cliente(codigo_cliente);;
		
		return endereco;

	}
	
	@Override
	public Endereco buscar(Loja loja) {

		int codigo_loja = loja.getCodigo();

		Endereco endereco = new Endereco();

		endereco.setCodigo_loja(codigo_loja);;
		
		return endereco;

	}

	@Override
	public Endereco alterar(Cliente cliente) {

		Scanner sc = new Scanner(System.in);
		
		int codigo_cliente = cliente.getCodigo();

		System.out.println("Digite o logradouro: ");
		String logradouro = sc.nextLine();

		while (!Validadores.validarLogradouro(logradouro)) {
			System.out.println("Logradouro inválido, tente novamente: ");
			logradouro = sc.nextLine();
		}

		System.out.println("Digite o número: ");
		int numero = sc.nextInt();

		while (!Validadores.validarNumero(numero)) {
			System.out.println("Número inválido, tente novamente: ");
			numero = sc.nextInt();
		}

		sc.nextLine();

		System.out.println("Digite o complemento: ");
		String complemento = sc.nextLine();

		while (!Validadores.validarComplemento(complemento)) {
			System.out.println("Complemento inválido, tente novamente: ");
			complemento = sc.nextLine();
		}

		System.out.println("Digite o CEP: ");
		String cep = sc.nextLine();

		while (!Validadores.validarCEP(cep)) {
			System.out.println("CEP inválido, tente novamente: ");
			cep = sc.nextLine();
		}

		Endereco endereco = new Endereco();

		endereco.setCodigo_cliente(cliente.getCodigo());
		endereco.setCep(cep);
		endereco.setLogradouro(logradouro);
		endereco.setComplemento(complemento);
		endereco.setNumero(numero);
		
		System.out.println("Cliente alterado com sucesso!\n");
		
		return endereco;

	}

	@Override
	public Endereco alterar(Loja loja) {

		Scanner sc = new Scanner(System.in);

		int codigo_loja = loja.getCodigo();

		System.out.println("Digite o logradouro: ");
		String logradouro = sc.nextLine();

		while (!Validadores.validarLogradouro(logradouro)) {
			System.out.println("Logradouro inválido, tente novamente: ");
			logradouro = sc.nextLine();
		}

		System.out.println("Digite o número: ");
		int numero = sc.nextInt();

		while (!Validadores.validarNumero(numero)) {
			System.out.println("Número inválido, tente novamente: ");
			numero = sc.nextInt();
		}

		sc.nextLine();

		System.out.println("Digite o complemento: ");
		String complemento = sc.nextLine();

		while (!Validadores.validarComplemento(complemento)) {
			System.out.println("Complemento inválido, tente novamente: ");
			complemento = sc.nextLine();
		}

		System.out.println("Digite o CEP: ");
		String cep = sc.nextLine();

		while (!Validadores.validarCEP(cep)) {
			System.out.println("CEP inválido, tente novamente: ");
			cep = sc.nextLine();
		}

		Endereco endereco = new Endereco();

		endereco.setCodigo_loja(loja.getCodigo());
		endereco.setCep(cep);
		endereco.setLogradouro(logradouro);
		endereco.setComplemento(complemento);
		endereco.setNumero(numero);

		System.out.println("Loja alterada com sucesso!\n");
		
		return endereco;

	}

	@Override
	public Endereco excluir(Cliente cliente) {

		int codigo_cliente = cliente.getCodigo();

		Endereco endereco = new Endereco();

		endereco.setCodigo_cliente(codigo_cliente);;
		
		return endereco;

	}

@Override
public Endereco excluir(Loja loja) {

	int codigo_loja = loja.getCodigo();

	Endereco endereco = new Endereco();

	endereco.setCodigo_loja(codigo_loja);;
	
	return endereco;

}

}