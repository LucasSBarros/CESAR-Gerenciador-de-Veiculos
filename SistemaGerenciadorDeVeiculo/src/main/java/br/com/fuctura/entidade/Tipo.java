package br.com.fuctura.entidade;

public class Tipo {

	private int codigo;
	private int codigo_veiculo;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCodigo_veiculo() {
		return codigo_veiculo;
	}

	public void setCodigo_veiculo(int codigo_veiculo) {
		this.codigo_veiculo = codigo_veiculo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}