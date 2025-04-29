package polimorfismo.calcular_area;

public class Retangulo implements AreaCalculavel{

	private double base;
	private double altura;
	
	@Override
	public double calculaArea() {
		return base * altura;
	}
	
	
}
