package br.com.fuctura.entidade;

public class Venda {

	private int codigo;
	private int codigo_loja;
	private int codigo_cliente;
	private int codigo_vendedor;
	private double valor;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo_loja() {
		return codigo_loja;
	}

	public void setCodigo_loja(int codigo_loja) {
		this.codigo_loja = codigo_loja;
	}

	public int getCodigo_cliente() {
		return codigo_cliente;
	}

	public void setCodigo_cliente(int codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}

	public int getCodigo_vendedor() {
		return codigo_vendedor;
	}

	public void setCodigo_vendedor(int codigo_vendedor) {
		this.codigo_vendedor = codigo_vendedor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}