package br.com.fuctura.controlador;

import java.util.Scanner;

import br.com.fuctura.entidade.Tipo;
import br.com.fuctura.entidade.Veiculo;

public class ControladorTipo implements ITipoCRUD {

	@Override
	public Tipo cadastrar(Veiculo veiculo) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a descrição do veículo: ");
		String descricao = sc.nextLine();

		while (!Validadores.validarDescricao(descricao)) {
			System.out.println("Descricao inválida, tente novamente: ");
			descricao = sc.nextLine();
		}

		Tipo tipo = new Tipo();

		tipo.setCodigo_veiculo(veiculo.getCodigo());
		tipo.setDescricao(descricao);

		System.out.println("Tipo cadastrado com sucesso!\n");
		
		return tipo;

	}

	@Override
	public Tipo buscar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do tipo que deseja buscar: ");

		while (!sc.hasNextInt()) {
			System.out.println("ID inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Tipo tipo = new Tipo();

		tipo.setCodigo(codigo);
		
		return tipo;

	}

	@Override
	public Tipo alterar(Veiculo veiculo) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do tipo que deseja alterar: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		sc.nextLine();

		System.out.println("Digite a descrição do veículo: ");
		String descricao = sc.nextLine();

		while (!Validadores.validarDescricao(descricao)) {
			System.out.println("Descricao inválida, tente novamente: ");
			descricao = sc.nextLine();
		}

		Tipo tipo = new Tipo();

		tipo.setCodigo_veiculo(veiculo.getCodigo());
		tipo.setDescricao(descricao);
		veiculo.setCodigo(codigo);

		System.out.println("Tipo alterado com sucesso!\n");
		
		return tipo;

	}

	@Override
	public Tipo excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do tipo que deseja excluir: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Tipo tipo = new Tipo();
		tipo.setCodigo(codigo);

		System.out.println("Tipo excluído com sucesso!\n");
		
		return tipo;

	}

}
