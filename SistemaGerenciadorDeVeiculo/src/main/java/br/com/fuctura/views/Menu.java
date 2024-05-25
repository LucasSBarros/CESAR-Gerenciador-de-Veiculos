package br.com.fuctura.views;

import java.sql.Connection;
import java.util.Scanner;
import br.com.fuctura.controlador.*;
import br.com.fuctura.dao.ClienteDAOImpl;
import br.com.fuctura.dao.EnderecoDAOImpl;
import br.com.fuctura.dao.IClienteDAO;
import br.com.fuctura.dao.IEnderecoDAO;
import br.com.fuctura.dao.ILojaDAO;
import br.com.fuctura.dao.ITipoDAO;
import br.com.fuctura.dao.IVeiculoDAO;
import br.com.fuctura.dao.IVendaDAO;
import br.com.fuctura.dao.IVendedorDAO;
import br.com.fuctura.dao.LojaDAOimpl;
import br.com.fuctura.dao.TipoDAOimpl;
import br.com.fuctura.dao.VeiculoDAOimpl;
import br.com.fuctura.dao.VendaDAOimpl;
import br.com.fuctura.dao.VendedorDAOimpl;
import br.com.fuctura.entidade.*;

public class Menu {

	private Connection conn;

	public Menu(Connection conn) {
		this.conn = conn;
	}

	ControladorCliente controladorCliente = new ControladorCliente();
	ControladorVendedor controladorVendedor = new ControladorVendedor();
	ControladorLoja controladorLoja = new ControladorLoja();
	ControladorVeiculos controladorVeiculos = new ControladorVeiculos();
	ControladorVenda controladorVenda = new ControladorVenda();
	ControladorEndereco controladorEndereco = new ControladorEndereco();
	ControladorTipo controladorTipo = new ControladorTipo();

	IClienteDAO daoCliente = new ClienteDAOImpl();
	IEnderecoDAO daoEndereco = new EnderecoDAOImpl();
	ILojaDAO daoLoja = new LojaDAOimpl();
	ITipoDAO daoTipo = new TipoDAOimpl();
	IVeiculoDAO daoVeiculo = new VeiculoDAOimpl();
	IVendaDAO daoVenda = new VendaDAOimpl();
	IVendedorDAO daoVendedor = new VendedorDAOimpl();

	public void interfaceUsuario() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma das seguintes opções:\n" + "Opção 1: Frente de Loja\n"
				+ "Opção 2: Manutenção no Cadastro\n" + "Opção 3: Sair\n");

		String opcao = sc.nextLine();

		if (opcao.equals("1")) {

			frenteDeLoja();

		} else if (opcao.equals("2")) {

			manutencaoNoCadastro();

		} else if (opcao.equals("3")) {

			System.out.println("Encerramento ...");

		} else {

			System.out.println("Opção inválida, tente novamente! \n");

			interfaceUsuario();

		}

	}

	public void frenteDeLoja() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite uma das seguintes opções:\n" + "Opção 1: Gerenciar Veículo\n"
				+ "Opção 2: Gerenciar Loja\n" + "Opção 3: Gerenciar Vendedor\n" + "Opção 4: Gerenciar Cliente\n"
				+ "Opção 5: Gerenciar Venda\n" + "Opção 6: Voltar para o menu superior\n");

		String opcao = sc.nextLine();

		if (opcao.equals("1")) {

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Consultar Veículo por código\n"
					+ "Opção b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Veiculo veiculo = controladorVeiculos.buscar();
				daoVeiculo.buscar(conn, veiculo);
				daoVeiculo.instruir(conn, veiculo);

				Tipo tipo = controladorTipo.buscar();
				daoTipo.buscar(conn, tipo);

				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao.equals("2")) {

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Buscar Loja por código\n"
					+ "Opção b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Loja loja = controladorLoja.buscar();
				daoLoja.buscar(conn, loja);

				Endereco endereco = controladorEndereco.buscar();
				daoEndereco.buscar(conn, endereco);

				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao.equals("3")) {

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Consultar Vendedor por código\n"
					+ "Opção b: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Vendedor vendedor = controladorVendedor.buscar();
				daoVendedor.buscar(conn, vendedor);
				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao.equals("4")) {

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Cliente\n"
					+ "Opção b: Consultar Cliente por código\n" + "Opção c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Cliente cliente = controladorCliente.cadastrar();
				daoCliente.salvar(conn, cliente);
				daoCliente.instruir(conn, cliente);

				Endereco endereco = controladorEndereco.cadastrar(cliente);
				daoEndereco.salvarCliente(conn, endereco);

				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				Cliente cliente = controladorCliente.buscar();
				daoCliente.buscar(conn, cliente);

				Endereco endereco = controladorEndereco.buscar();
				daoEndereco.buscar(conn, endereco);

				frenteDeLoja();

			} else if (op.equalsIgnoreCase("c")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao.equals("5")) {

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar venda\n"
					+ "Opção b: Consultar Venda por código\n" + "Opção c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Venda venda = controladorVenda.cadastrar();
				daoVenda.salvar(conn, venda);

				frenteDeLoja();

			} else if (op.equalsIgnoreCase("b")) {

				Venda venda = controladorVenda.buscar();
				daoVenda.buscar(conn, venda);

				frenteDeLoja();

			} else if (op.equalsIgnoreCase("c")) {

				frenteDeLoja();

			} else {

				System.out.println("Opcao inválida!\n");
				frenteDeLoja();

			}

		} else if (opcao.equals("6")) {

			interfaceUsuario();

		} else {

			System.out.println("Opcao inválida!\n");
			frenteDeLoja();

		}

	}

	public void manutencaoNoCadastro() {

		System.out.println("Digite uma das seguintes opções:\n" + "Opção 1: Gerenciar Veículo\n"
				+ "Opção 2: Gerenciar Loja\n" + "Opção 3: Gerenciar Vendedor\n" + "Opção 4: Gerenciar Cliente\n"
				+ "Opção 5: Gerenciar Venda\n" + "Opção 6: Voltar para o menu superior\n");

		Scanner sc = new Scanner(System.in);

		String opcao = sc.nextLine();

		if (opcao.equals("1")) {

			System.out.println(
					"Digite uma das seguintes opções:\n" + "Opção a: Cadastrar veículo\n" + "Opção b: Excluir veículo\n"
							+ "Opção c: Alterar dados do veículo\n" + "Opção d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Veiculo veiculo = controladorVeiculos.cadastrar();
				daoVeiculo.salvar(conn, veiculo);
				daoVeiculo.instruir(conn, veiculo);

				Tipo tipo = controladorTipo.cadastrar(veiculo);
				daoTipo.salvar(conn, tipo);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("b")) {

				Veiculo veiculo = controladorVeiculos.excluir();
				daoVeiculo.excluir(conn, veiculo);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("c")) {

				Veiculo veiculo = controladorVeiculos.alterar();
				daoVeiculo.alterar(conn, veiculo);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao.equals("2")) {

			System.out.println(
					"Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Loja\n" + "Opção b: Excluir Loja\n"
							+ "Opção c: Alterar dados da Loja\n" + "Opção d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Loja loja = controladorLoja.cadastrar();
				daoLoja.salvar(conn, loja);
				daoLoja.instruir(conn, loja);

				Endereco endereco = controladorEndereco.cadastrar(loja);
				daoEndereco.salvarLoja(conn, endereco);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("b")) {

				Loja loja = controladorLoja.excluir();
				daoLoja.excluir(conn, loja);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("c")) {

				Loja loja = controladorLoja.alterar();
				daoLoja.alterar(conn, loja);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao.equals("3")) {

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Vendedor\n"
					+ "Opção b: Excluir Vendedor\n" + "Opção c: Alterar dados do Vendedor\n"
					+ "Opção d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Vendedor vendedor = controladorVendedor.cadastrar();
				daoVendedor.salvar(conn, vendedor);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("b")) {

				Vendedor vendedor = controladorVendedor.excluir();
				daoVendedor.excluir(conn, vendedor);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("c")) {

				Vendedor vendedor = controladorVendedor.alterar();
				daoVendedor.alterar(conn, vendedor);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao.equals("4")) {

			System.out.println(
					"Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Cliente\n" + "Opção b: Excluir Cliente\n"
							+ "Opção c: Alterar dados do Cliente\n" + "Opção d: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equalsIgnoreCase("a")) {

				Cliente cliente = controladorCliente.cadastrar();
				daoCliente.salvar(conn, cliente);
				daoCliente.instruir(conn, cliente);

				Endereco endereco = controladorEndereco.cadastrar(cliente);
				daoEndereco.salvarCliente(conn, endereco);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("b")) {

				Cliente cliente = controladorCliente.excluir();
				daoCliente.excluir(conn, cliente);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("c")) {

				Cliente cliente = controladorCliente.alterar();
				daoCliente.alterar(conn, cliente);

				manutencaoNoCadastro();

			} else if (op.equalsIgnoreCase("d")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao.equals("5")) {

			System.out.println("Digite uma das seguintes opções:\n" + "Opção a: Cadastrar Venda\n"
					+ "Opção b: Excluir Venda\n" + "Opção c: Voltar para o menu superior\n");

			String op = sc.nextLine();

			if (op.equals("a")) {

				Venda venda = controladorVenda.cadastrar();
				daoVenda.salvar(conn, venda);

				manutencaoNoCadastro();

			} else if (op.equals("b")) {

				Venda venda = controladorVenda.excluir();
				daoVenda.excluir(conn, venda);

				manutencaoNoCadastro();

			} else if (op.equals("c")) {

				manutencaoNoCadastro();

			} else {

				System.out.println("Opcao inválida!\n");
				manutencaoNoCadastro();

			}

		} else if (opcao.equals("6")) {

			interfaceUsuario();

		} else {

			System.out.println("Opcao inválida!\n");
			manutencaoNoCadastro();

		}

	}

}
