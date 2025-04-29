package encapsulamento.eletrodomestico;

public class Main {

	public static void main(String[] args) {
		
		Eletrodomestico geladeira = new Eletrodomestico();
		
		System.out.println("Nome: " + geladeira.getNome());
		
		geladeira.setNome("Geladeira");
		geladeira.setPotencia(300.67);
		geladeira.setTempoDiario(7.5);
		
		System.out.println("Relatório");
		geladeira.exibirRelatorio(4.8);

	}

}
