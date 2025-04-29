package polimorfismo.banco;

public class SeguroDeVida implements Tributavel{

	@Override
	public double calculaTributos() {
		return 42;
	}

}
