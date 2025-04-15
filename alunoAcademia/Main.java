package alunoAcademia;

public class Main {

	public static void main(String[] args) {
		
		AlunoAcademia aluno1 = new AlunoAcademia("Carla Souza", 27, 65.0, 1.75);
		
		System.out.println("Aluno: " + aluno1.getNome() + "\nMaior de Idade: " + aluno1.maiorDeIdade() + ", " + aluno1.getIdade() + " Anos");
		System.out.println("Peso: " + aluno1.getPeso() + " Altura: " + aluno1.getAltura() + "\nIMC: " + aluno1.calcularImc());
	}

}
