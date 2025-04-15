package fatura;

public class Fatura {
	private String numero;
	private String descricao;
	private int quantidadeComprada;
	private double precoItem;
	
	public Fatura(String numero, String descricao, int quantidadeComprada, double precoItem) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidadeComprada = quantidadeComprada > 0 ? quantidadeComprada : 0;
		this.precoItem = precoItem > 0.0 ? precoItem : 0.0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidadeComprada() {
		return quantidadeComprada;
	}

	public void setQuantidadeComprada(int quantidadeComprada) {
		this.quantidadeComprada = quantidadeComprada;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}
	
	public double getTotalFatura() {
		return quantidadeComprada * precoItem;
	}

}

