package br.com.fuctura.controlador;

import java.util.Scanner;

import br.com.fuctura.entidade.Loja;

public class ControladorLoja implements ILojaCRUD {

	@Override
	public Loja cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome da loja: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Digite o Telefone da loja: ");
		String telefone = sc.nextLine();

		while (!Validadores.validarTelefone(telefone)) {
			System.out.println("Telefone inválido, tente novamente: ");
			telefone = sc.nextLine();
		}

		Loja loja = new Loja();

		loja.setNome(nome);
		loja.setTelefone(telefone);

		System.out.println("Loja cadastrada com sucesso!\n");

		return loja;
	}

	@Override
	public Loja buscar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da loja que deseja buscar: \n");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Loja loja = new Loja();

		loja.setCodigo(codigo);

		return loja;

	}

	@Override
	public Loja alterar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da loja que deseja alterar: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		sc.nextLine();

		System.out.println("Altere o nome da loja: ");
		String nome = sc.nextLine();

		while (!Validadores.validarNome(nome)) {
			System.out.println("Nome inválido, tente novamente: ");
			nome = sc.nextLine();
		}

		System.out.println("Altere o telefone da loja: ");
		String telefone = sc.nextLine();

		while (!Validadores.validarTelefone(telefone)) {
			System.out.println("Telefone inválido, tente novamente: ");
			telefone = sc.nextLine();
		}

		Loja loja = new Loja();

		loja.setNome(nome);
		loja.setTelefone(telefone);
		loja.setCodigo(codigo);

		System.out.println("Loja alterada com sucesso!\n");

		return loja;

	}

	@Override
	public Loja excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da loja que deseja excluir: ");

		while (!sc.hasNextInt()) {
			System.out.println("ID inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Loja loja = new Loja();
		loja.setCodigo(codigo);

		System.out.println("Loja excluída com sucesso!\n");

		return loja;

	}

}
