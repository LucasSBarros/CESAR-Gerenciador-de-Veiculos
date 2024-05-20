package br.com.fuctura.controlador;

import java.util.Scanner;

import br.com.fuctura.entidade.Veiculo;

public class ControladorVeiculos implements IVeiculoCRUD {

	@Override
	public Veiculo cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a marca do veículo: ");
		String marca = sc.nextLine();

		while (!Validadores.validarMarca(marca)) {
			System.out.println("Marca inválida, tente novamente: ");
			marca = sc.nextLine();
		}

		System.out.println("Digite o modelo do veículo: ");
		String modelo = sc.nextLine();

		while (!Validadores.validarModelo(modelo)) {
			System.out.println("Modelo inválido, tente novamente: ");
			modelo = sc.nextLine();
		}

		System.out.println("Digite a placa do veículo: ");
		String placa = sc.nextLine().toUpperCase();

		while (!Validadores.validarPlaca(placa)) {
			System.out.println("Placa inválida, tente novamente: ");
			placa = sc.nextLine().toUpperCase();
		}

		System.out.println("Digite a categoria do veículo: ");
		String categoria = sc.nextLine();

		while (!Validadores.validarCategoria(categoria)) {
			System.out.println("Categoria inválida, tente novamente: ");
			categoria = sc.nextLine();
		}

		System.out.println("Digite o ano do veículo: ");

		while (!sc.hasNextInt()) {
			System.out.println("Ano inválido, tente novamente: ");
			sc.next();
		}

		int ano = sc.nextInt();

		while (!Validadores.validarAno(ano)) {
			System.out.println("Ano inválido, tente novamente: ");
			ano = sc.nextInt();
		}

		System.out.println("Digite o valor do veículo: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Valor inválido, tente novamente: ");
			sc.next();
		}

		double valor = sc.nextDouble();

		while (!Validadores.validarValor(valor)) {
			System.out.println("Preço inválido, tente novamente: ");
			valor = sc.nextDouble();
		}

		Veiculo veiculo = new Veiculo();

		veiculo.setPlaca(placa);
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setAno(ano);
		veiculo.setValor(valor);

		System.out.println("Veículo cadastrado com sucesso!\n");

		return veiculo;

	}

	@Override
	public Veiculo buscar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do veículo que deseja alterar: ");

		while (!sc.hasNextInt()) {
			System.out.println("ID inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Veiculo veiculo = new Veiculo();

		veiculo.setCodigo(codigo);

		return veiculo;

	}

	@Override
	public Veiculo alterar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do veículo que deseja alterar: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		sc.nextLine();

		System.out.println("Altere a marca do veículo: ");
		String marca = sc.nextLine();

		while (!Validadores.validarMarca(marca)) {
			System.out.println("Marca inválida, tente novamente: ");
			marca = sc.nextLine();
		}

		System.out.println("Altere o modelo do veículo: ");
		String modelo = sc.nextLine();

		while (!Validadores.validarModelo(modelo)) {
			System.out.println("Modelo inválido, tente novamente: ");
			modelo = sc.nextLine();
		}

		System.out.println("Altere a placa do veículo: ");
		String placa = sc.nextLine().toUpperCase();

		while (!Validadores.validarPlaca(placa)) {
			System.out.println("Placa inválida, tente novamente: ");
			placa = sc.nextLine().toUpperCase();
		}

		System.out.println("Altere a categoria do veículo: ");
		String categoria = sc.nextLine();

		while (!Validadores.validarCategoria(categoria)) {
			System.out.println("Categoria inválida, tente novamente: ");
			categoria = sc.nextLine();
		}

		System.out.println("Altere o ano do veículo: ");
		int ano = sc.nextInt();

		while (!Validadores.validarAno(ano)) {
			System.out.println("Ano inválido, tente novamente: ");
			ano = sc.nextInt();
		}

		System.out.println("Altere o valor do veículo: ");
		double valor = sc.nextDouble();

		while (!Validadores.validarValor(valor)) {
			System.out.println("Valor inválido, tente novamente: ");
			valor = sc.nextDouble();
		}

		Veiculo veiculo = new Veiculo();

		veiculo.setPlaca(placa);
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setAno(ano);
		veiculo.setValor(valor);
		veiculo.setCodigo(codigo);

		System.out.println("Veículo alterado com sucesso!\n");

		return veiculo;

	}

	@Override
	public Veiculo excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código do veículo que deseja excluir: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Veiculo veiculo = new Veiculo();
		veiculo.setCodigo(codigo);

		System.out.println("Veículo excluído com sucesso!\n");

		return veiculo;

	}

}
