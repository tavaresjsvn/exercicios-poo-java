package abstracao.combustivel;

public class BombaCombustivel {

	private Tipo tipo;
	private double valorLitro;
	private double quantidadeCombustivel;
	
	public BombaCombustivel(Tipo tipo, double valorLitro, double quantidadeCombustivel) {
		this.tipo = tipo;
		this.valorLitro = valorLitro;
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	public void abastecerPorValor(double valor) {
		double abastecimento = valor / valorLitro;
		
		if (abastecimento > quantidadeCombustivel) {
			System.out.println("Não há combustível suficiente");
			
		} else if (quantidadeCombustivel >= abastecimento) {
			quantidadeCombustivel -= abastecimento;
			
			System.out.printf("Abastecimeneto de %.2f litros\n", abastecimento);
		}
	}
	
	public void abastecerPorLitro(double litros) {
		if (litros > quantidadeCombustivel) {
			System.out.println("Não há combustível suficiente");
		} else if (quantidadeCombustivel >= litros) {
			
			double valorPagar = valorLitro * litros;
			quantidadeCombustivel -= litros;
			
			System.out.printf("Valor a ser pagoR$%.2f\n", valorPagar);
		}
	}
	
	public void alterarValor(double novoValor) {
		valorLitro = novoValor;
	}
	
	public void alterarCombustivel(Tipo novoCombustivel) {
		tipo = novoCombustivel;
	}
	
	public void alterarQuantidadeCombustivel(double novaQuantidade) {
		quantidadeCombustivel = novaQuantidade;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public double getValorLitro() {
		return valorLitro;
	}

	public void setValorLitro(double valorLitro) {
		this.valorLitro = valorLitro;
	}

	public double getQuantidade() {
		return quantidadeCombustivel;
	}

	public void setQuantidade(double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	@Override
    public String toString() {
        return "BombaCombustivel{" +
               "tipo=" + tipo.getNome() +
               ", valorLitro=" + String.format("%.2f", valorLitro) +
               ", quantidadeCombustivel=" + String.format("%.2f", quantidadeCombustivel) +
               '}';
    }
}
