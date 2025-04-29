package empregado;

public class Main {

	public static void main(String[] args) {
		
		Empregado empregado1 = new Empregado("João", "Carlos", 1799.7);
		Empregado empregado2 = new Empregado("Alberto", "Neves", 1999.8);
		
		System.out.println("Empregado: " + empregado1.getNome() + " " + empregado1.getSobrenome() + "\nSalário: R$" + empregado1.getSalarioAnual());
		System.out.println("Salário anual: R$" + empregado1.getSalarioAnual());
		System.out.println("\n----------------\nEmpregado: " + empregado2.getNome() + " " + empregado2.getSobrenome() + "\nSalário: R$" + empregado2.getSalarioAnual());
		System.out.println("Salário anual: R$" + empregado2.getSalarioAnual());
		
		empregado1.darAumento();
		empregado2.darAumento();
		System.out.println("\n----------------\nAumento para os dois empregados\n----------------\n");
		
		System.out.println("Empregado: " + empregado1.getNome() + " " + empregado1.getSobrenome() + "\nSalário: R$" + empregado1.getSalarioAnual());
		System.out.println("Salário anual: R$" + empregado1.getSalarioAnual());
		System.out.println("\n----------------\nEmpregado: " + empregado2.getNome() + " " + empregado2.getSobrenome() + "\nSalário: R$" + empregado2.getSalarioAnual());
		System.out.println("Salário anual: R$" + empregado2.getSalarioAnual());

	}

}
