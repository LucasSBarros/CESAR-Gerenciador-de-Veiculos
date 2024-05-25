package br.com.fuctura.controlador;

import java.util.Scanner;

import br.com.fuctura.entidade.Venda;

public class ControladorVenda implements IVendaCRUD {

	public Venda cadastrar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da Loja: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo_loja = sc.nextInt();

		System.out.println("Digite o código do cliente comprador: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo_cliente = sc.nextInt();

		System.out.println("Digite o códigodo vendedor responsável pela venda: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo_vendedor = sc.nextInt();

		System.out.println("Digite o valor da venda realizada: ");

		while (!sc.hasNextDouble()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		double valor = sc.nextDouble();

		Venda venda = new Venda();

		venda.setCodigo_loja(codigo_loja);
		venda.setCodigo_cliente(codigo_cliente);
		venda.setCodigo_vendedor(codigo_vendedor);
		venda.setValor(valor);

		System.out.println("Venda realizada com Sucesso!\n");
		
		return venda;

	}

	public Venda buscar() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da venda que deseja buscar: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Venda venda = new Venda();

		venda.setCodigo(codigo);
		
		return venda;

	}

	@Override
	public Venda alterar() {
		// TODO Auto-generated method stub
		return null;
	}

	public Venda excluir() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o código da venda que deseja excluir: ");

		while (!sc.hasNextInt()) {
			System.out.println("Código inválido, tente novamente: ");
			sc.next();
		}

		int codigo = sc.nextInt();

		Venda venda = new Venda();

		venda.setCodigo(codigo);

		System.out.println("Venda excluída com sucesso!\n");
		
		return venda;

	}

}
