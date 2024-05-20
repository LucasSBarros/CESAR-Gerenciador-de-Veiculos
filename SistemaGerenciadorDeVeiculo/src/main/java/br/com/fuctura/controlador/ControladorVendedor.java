package br.com.fuctura.controlador;

import java.util.Scanner;

import br.com.fuctura.entidade.Vendedor;

public class ControladorVendedor implements IVendedorCRUD {

	@Override
	public Vendedor cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do vendedor: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Digite o CPF do vendedor: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		System.out.println("Digite o celular do vendedor: ");
		String celular = sc.nextLine();

		while (!Validadores.validarCelular(celular)) {
			System.out.println("Celular inválido, tente novamente: ");
			celular = sc.nextLine();
		}

		Vendedor vendedor = new Vendedor();

		vendedor.setNome(nome);
		vendedor.setCpf(cpf);
		vendedor.setCelular(celular);

		System.out.println("Vendedor cadastrado com sucesso!\n");

		return vendedor;

	}

	@Override
	public Vendedor buscar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do vendedor que deseja buscar: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Vendedor vendedor = new Vendedor();

		vendedor.setCodigo(codigo);

		return vendedor;

	}

	@Override
	public Vendedor alterar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do vendedor que deseja alterar: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		sc.nextLine();

		System.out.println("Altere o nome do vendedor: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Altere o CPF do vendedor: ");
		String cpf = sc.nextLine();

		while (!Validadores.validarCPF(cpf)) {
			System.out.println("CPF inválido, tente novamente: ");
			cpf = sc.nextLine();
		}

		System.out.println("Altere o celular do vendedor: ");
		String celular = sc.nextLine();

		while (!Validadores.validarCelular(celular)) {
			System.out.println("Celular inválido, tente novamente: ");
			celular = sc.nextLine();
		}

		Vendedor vendedor = new Vendedor();

		vendedor.setNome(nome);
		vendedor.setCpf(cpf);
		vendedor.setCelular(celular);
		vendedor.setCodigo(codigo);

		System.out.println("Vendedor alterado com sucesso!\n");

		return vendedor;

	}

	@Override
	public Vendedor excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do vendedor que deseja excluir: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Vendedor vendedor = new Vendedor();

		vendedor.setCodigo(codigo);

		System.out.println("Vendedor excluído com sucesso!\n");

		return vendedor;

	}

}
