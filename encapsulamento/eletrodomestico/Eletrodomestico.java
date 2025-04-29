package encapsulamento.eletrodomestico;

public class Eletrodomestico {
	private String nome;
	private double potencia;
	private double tempoDiario;
	
	public Eletrodomestico() {
		this.nome = "Nome não definido";
		this.potencia = 0.0;
		this.tempoDiario = 0.0;
	}
	
	public Eletrodomestico(String nome, double potencia, double tempoDiario) {
		this.nome = nome;
		this.potencia = potencia;
		this.tempoDiario = tempoDiario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public double getTempoDiario() {
		return tempoDiario;
	}

	public void setTempoDiario(double tempoDiario) {
		this.tempoDiario = tempoDiario;
	}
	
	public double wattsDia () {
		return potencia * tempoDiario;
	}
	
	public double wattsMes() {
		return wattsDia() * 30;
	}
	
	public double wattsAno() {
		return wattsMes() * 12;
	}
	
	public double gastoMes(double precoKwatts) {
		return (wattsMes() / 1000) * precoKwatts;
	}
	
	public void exibirRelatorio(double precoKwatts) {
		System.out.println("Eletrodoméstico: " + nome + "\nPotência do aparelho: P=" + potencia + "watts\nTempo de utilização do aparelho: " + tempoDiario);
		System.out.println("Watts/Dia = " + wattsDia() + "W\nWatts/Mês = " + wattsMes() + "W\nWatts/Ano = " + wattsAno() + "W");
		System.out.println("Preço do Kwatt: R$" + precoKwatts + "\nGasto mensal é: R$" + gastoMes(precoKwatts));
	}
	

}
