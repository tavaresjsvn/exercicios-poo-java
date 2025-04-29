package polimorfismo.calcular_area;

public class Quadrado implements AreaCalculavel {
	
	private double lado;

	@Override
	public double calculaArea() {
		return lado * lado;
	}

}
