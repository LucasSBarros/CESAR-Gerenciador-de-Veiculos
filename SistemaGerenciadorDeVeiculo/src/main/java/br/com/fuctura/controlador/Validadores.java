package br.com.fuctura.controlador;

import br.com.fuctura.entidade.*;

public class Validadores {

	public static boolean validarNome(String nome) {
		return nome != null && !nome.isBlank();

	}

	public static boolean validarCPF(String cpf) {
		return cpf != null && !cpf.isBlank() && cpf.matches("\\d{11}");

	}

	public static boolean validarCnpj(String cnpj) {
		return cnpj != null && !cnpj.isBlank() && cnpj.matches("\\d{14}");

	}

	public static boolean validarLogradouro(String logradouro) {
		return logradouro != null && !logradouro.isBlank();

	}

	public static boolean validarComplemento(String complemento) {
		return complemento != null && !complemento.isBlank();

	}

	public static boolean validarCEP(String cep) {
		return cep != null && !cep.isBlank() && cep.matches("\\d{8}");

	}

	public static boolean validarNumero(int numero) {
		return numero > 0.0;

	}

	public static boolean validarCelular(String celular) {
		return celular != null && !celular.isBlank() && celular.matches("\\d{11}");

	}

	public static boolean validarTelefone(String telefone) {
		return telefone != null && !telefone.isBlank() && telefone.matches("\\d{10}");

	}

	public static boolean validarMarca(String marca) {
		return marca != null && !marca.isBlank();

	}

	public static boolean validarModelo(String modelo) {
		return modelo != null && !modelo.isBlank();

	}

	public static boolean validarPlaca(String placa) {
		return placa != null && !placa.isBlank()
				&& (placa.matches("[A-Z]{3}-\\d{4}") || placa.matches("[A-Z]{3}\\d{4}"));

	}

	public static boolean validarCategoria(String categoria) {
		return categoria != null && !categoria.isBlank();

	}

	public static boolean validarAno(int ano) {
		return ano > 0;

	}

	public static boolean validarValor(double valor) {
		return valor > 0.0;

	}

	public static boolean validarDescricao(String decricao) {
		return decricao != null && !decricao.isBlank();

	}

	public static boolean validarLoja(Loja loja) {
		return loja != null;

	}

	public static boolean validarVendedor(Vendedor vendedor) {
		return vendedor != null;

	}

	public static boolean validarCliente(Cliente cliente) {
		return cliente != null;

	}

}
