package encapsulamento.aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Luís Alves", 56);
		
		aluno1.setNota(1, 5.5);
		aluno1.setNota(2, 8.0);
		aluno1.setNota(3, 7.6);
		
		System.out.println(aluno1.getNota(1));
		System.out.println(aluno1.getNota(2));
		System.out.println(aluno1.getNota(3));
		
		System.out.println("Aluno: " + aluno1.getNome() + "\nMatrícula: " + aluno1.getMatricula());
		System.out.println("Média: " + aluno1.calcularMedia() + "\nSituação: " + aluno1.verificarSituacao());

	}

}
