package abstracao.circulo;

public class Main {
	public static void main(String[] args) {
	Circulo circulo = new Circulo(7.5);
	
	System.out.println("Área: " + circulo.calcularArea());
	System.out.println("Perímetro: " + circulo.calcularPerimetro());
	}
}
