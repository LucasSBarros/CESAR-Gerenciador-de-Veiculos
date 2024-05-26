package br.com.fuctura.controlador;

import java.util.Scanner;

import br.com.fuctura.entidade.Cliente;

public class ControladorCliente implements IClienteCRUD {

	@Override
	public Cliente cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do cliente: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Digite o CPF do cliente: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		System.out.println("Digite o celular do cliente: ");
		String celular = sc.nextLine();

		while (!Validadores.validarCelular(celular)) {
			System.out.println("Celular inválido, tente novamente: ");
			celular = sc.nextLine();
		}

		Cliente cliente = new Cliente();

		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setCelular(celular);

		return cliente;
	}

	@Override
	public Cliente buscar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o CPF do cliente que deseja buscar: ");

		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		Cliente cliente = new Cliente();

		cliente.setCpf(cpf);
		
		return cliente;

	}

	@Override
	public Cliente alterar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o codigo do cliente que deseja alterar: ");

		while (!sc.hasNextInt()) {
			System.out.println("ID inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		sc.nextLine();

		System.out.println("Altere o nome do cliente: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Altere o CPF do cliente: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		System.out.println("Altere o celular do cliente: ");
		String celular = sc.nextLine();

		while (!Validadores.validarCelular(celular)) {
			System.out.println("Celular inválido, tente novamente: ");
			celular = sc.nextLine();
		}

		Cliente cliente = new Cliente();

		cliente.setNome(nome);
		cliente.setCpf(cpf);
		cliente.setCelular(celular);
		cliente.setCodigo(codigo);
		
		return cliente;

	}

	@Override
	public Cliente excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o CPF do cliente que deseja excluir: ");

		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		Cliente cliente = new Cliente();

		cliente.setCpf(cpf);

		System.out.println("Cliente excluído com sucesso!\n");
		
		return cliente;

	}

}
