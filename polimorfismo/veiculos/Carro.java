package polimorfismo.veiculos;

public class Carro extends Veiculos {
	
	protected double km;

	public Carro() {
		super();
		
		this.km = 0.0;
	}

	public Carro(String modelo, double preco, double km) {
		super(modelo, preco);
		
		this.km = km;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}
	
	@Override
	public void printDados() {
        System.out.println("Carro");
		super.printDados();
		System.out.println("KM: " + getKm());
	}

	public void inserirDados() {
		
		System.out.println("Digite o modelo do carro: ");
		this.modelo = entrada.nextLine();
		
		System.out.println("Digite o preço: ");
		this.preco = entrada.nextDouble();
		
		System.out.println("Digite a quantidade de km: ");
		this.km = entrada.nextDouble();
		entrada.nextLine();
	}
}
