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

		System.out.println("Endereço cadastrado com sucesso!\n");
		
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

		System.out.println("Endereço cadastrado com sucesso!\n");
		
		return endereco;

	}

	@Override
	public Endereco buscar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do endereço que deseja buscar: ");

		while (!sc.hasNextInt()) {
			System.out.println("ID inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Endereco endereco = new Endereco();

		endereco.setCodigo(codigo);
		
		return endereco;

	}

	@Override
	public Endereco alterar(Cliente cliente) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do endereco que deseja alterar: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		sc.nextLine();

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
		endereco.setCodigo(codigo);

		System.out.println("Endereço alterado com sucesso!\n");
		
		return endereco;

	}

	@Override
	public Endereco alterar(Loja loja) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do endereco que deseja alterar: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		sc.nextLine();

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
		endereco.setCodigo(codigo);

		System.out.println("Endereço alterado com sucesso!\n");
		
		return endereco;

	}

	@Override
	public Endereco excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do endereço que deseja excluir: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Endereco endereco = new Endereco();
		endereco.setCodigo(codigo);

		System.out.println("Endereço excluído com sucesso!\n");

		return endereco;

	}

}
