package polimorfismo.veiculos;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Cadastro de moto");
		
		Moto moto = new Moto();
		moto.inserirDados();
		
		System.out.println("Cadastro de carro");
		
		Carro carro = new Carro();
		carro.inserirDados();
		
		System.out.println("Veículos cadastrados");
		
		moto.printDados();
		carro.printDados();

	}

}
