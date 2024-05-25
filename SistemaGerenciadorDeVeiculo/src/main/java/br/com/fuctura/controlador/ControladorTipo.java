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

		System.out.println("Veículo cadastrado com sucesso!\n");

		return tipo;

	}

	@Override
	public Tipo buscar(Veiculo veiculo) {

		int codigo_veiculo = veiculo.getCodigo();

		Tipo tipo = new Tipo();

		tipo.setCodigo_veiculo(codigo_veiculo);

		return tipo;

	}

	@Override
	public Tipo alterar(Veiculo veiculo) {

		Scanner sc = new Scanner(System.in);

		int codigo_veiculo = veiculo.getCodigo();

		System.out.println("Digite a descrição do veículo: ");
		String descricao = sc.nextLine();

		while (!Validadores.validarDescricao(descricao)) {
			System.out.println("Descricao inválida, tente novamente: ");
			descricao = sc.nextLine();
		}

		Tipo tipo = new Tipo();

		tipo.setCodigo_veiculo(codigo_veiculo);
		tipo.setDescricao(descricao);

		System.out.println("Veículo alterado com sucesso!\n");

		return tipo;

	}

	@Override
	public Tipo excluir(Veiculo veiculo) {

		int codigo_veiculo = veiculo.getCodigo();

		Tipo tipo = new Tipo();

		tipo.setCodigo_veiculo(codigo_veiculo);

		return tipo;

	}

}
