package polimorfismo.lojaCD;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Cadastro do cd 1:");
		
		CD cd1 = new CD();
		cd1.inserirDados();
		cd1.printDados();
		
		System.out.println("Cadastro do cd 2: ");
		
		CD cd2 = new CD(2, 15.5, "Xuxa", 12);
		cd2.printDados();
		
		System.out.println("Atualizando dados do cd 2");
		
		cd2.inserirDados();
		cd2.printDados();
		
		System.out.println("Cadastro de dvd:");
		
		DVD dvd1 = new DVD();
		dvd1.inserirDados();
		dvd1.printDados();

	}

}
