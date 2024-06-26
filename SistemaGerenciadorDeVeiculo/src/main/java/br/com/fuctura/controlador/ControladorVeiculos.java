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

		System.out.println("Digite o código da Loja em que se encontra o Veículo: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código da Loja inválido, tente novamente: ");
			sc.next();
		}

		int codigo_loja = sc.nextInt();

		while (!Validadores.validarValor(codigo_loja)) {
			System.out.println("Código da Loja inválido inválido, tente novamente: ");
			valor = sc.nextInt();
		}

		Veiculo veiculo = new Veiculo();

		veiculo.setCodigo_loja(codigo_loja);
		veiculo.setPlaca(placa);
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setAno(ano);
		veiculo.setValor(valor);

		return veiculo;

	}

	@Override
	public Veiculo buscar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a placa do veículo que deseja buscar: ");

		String placa = sc.nextLine().toUpperCase();

		while (!Validadores.validarPlaca(placa)) {
			System.out.println("Placa inválida, tente novamente: ");
			placa = sc.nextLine().toUpperCase();
		}

		Veiculo veiculo = new Veiculo();

		veiculo.setPlaca(placa);

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

		System.out.println("Digite o código da Loja em que se encontra o Veículo: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código da Loja inválido, tente novamente: ");
			sc.next();
		}

		int codigo_loja = sc.nextInt();

		while (!Validadores.validarValor(codigo_loja)) {
			System.out.println("Código da Loja inválido inválido, tente novamente: ");
			valor = sc.nextInt();
		}

		Veiculo veiculo = new Veiculo();

		veiculo.setCodigo_loja(codigo_loja);
		veiculo.setPlaca(placa);
		veiculo.setMarca(marca);
		veiculo.setModelo(modelo);
		veiculo.setAno(ano);
		veiculo.setValor(valor);
		veiculo.setCodigo(codigo);

		return veiculo;

	}

	@Override
	public Veiculo excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a placa do veículo que deseja excluir: ");

		String placa = sc.nextLine().toUpperCase();

		while (!Validadores.validarPlaca(placa)) {
			System.out.println("Placa inválida, tente novamente: ");
			placa = sc.nextLine().toUpperCase();
		}

		Veiculo veiculo = new Veiculo();

		veiculo.setPlaca(placa);

		System.out.println("Veículo excluído com sucesso!\n");

		return veiculo;

	}

}
