package polimorfismo.veiculos;

public class Moto extends Veiculos {

	protected int ano;
	
	public Moto() {
		super();
		
		this.ano = 0;
	}

	public Moto(String modelo, double preco, int ano) {
		super(modelo, preco);
		
		this.ano = ano;
	}

	public double getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public void printDados() {
		System.out.println("Moto");
		super.printDados();
		System.out.println("Ano: " + getAno());
	}

	public void inserirDados() {
		System.out.println("Digite o modelo da moto: ");
		this.modelo = entrada.nextLine();
		
		System.out.println("Digite o preço: R$");
		this.preco = entrada.nextDouble();
		
		System.out.println("Digite o ano: ");
		this.ano = entrada.nextInt();
		entrada.nextLine();
	}

}
