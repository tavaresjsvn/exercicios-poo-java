package heranca.ingresso;

public class IngressoVIP extends Ingresso {
	
	private double valorAdicional;

	public IngressoVIP(double valor, double valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
	}
	
	public double calcularIngressoVIP() {
		return getValor() + valorAdicional;
	}

	@Override
	public void imprimirValor() {
		System.out.println("Valor do ingresso: R$" + calcularIngressoVIP());
		System.out.println("Valor base: R$" + getValor() + " + Adicional: R$" + valorAdicional);
	}
	
	
	
	
}
