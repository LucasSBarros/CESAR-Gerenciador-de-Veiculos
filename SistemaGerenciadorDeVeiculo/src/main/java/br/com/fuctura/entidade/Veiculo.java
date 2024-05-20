package br.com.fuctura.entidade;

public class Veiculo {

	private int codigo;
	private int codigo_loja;
	private String placa;
	private String marca;
	private String modelo;
	private int ano;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}