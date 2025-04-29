package polimorfismo.calcular_area;

public class Circulo implements AreaCalculavel {

	private double raio;

	@Override
	public double calculaArea() {
		
		return Math.PI * (raio * raio);
	}
	
	
}
