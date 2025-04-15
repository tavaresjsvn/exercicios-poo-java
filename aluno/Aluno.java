package aluno;

public class Aluno {
	
	private String nome;
	private int matricula;
    private double[] notas = new double[3];
	
	public Aluno (String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public double calcularMedia() {
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma = soma + notas[i];
		}
		return soma / notas.length;
	}
	
	public String verificarSituacao() {
		double media = calcularMedia();
		
		if (media > 6 && media <= 10) {
			return "Aluno Aprovado";
		} else if (media < 6 && media > 3) {
			return "Aluno em recuperação";
		}
		
		return "Aluno reprovado";
		
	}
	
	public void setNota(int indice, double nota) {
		if (indice >= 1 && indice <= 3) {
			if (nota >= 0 && nota <=10) {
				notas[indice - 1] = nota;
			} else {
				System.out.println("Nota inválida! esolha entre 1 e 10.");
			}
		} else {
			System.out.println("Índice de nota inválido, esolha entre 1,2 ou 3.");
		} 
	}
	
	public double getNota(int indice) {
		if (indice >= 1 && indice <= 3) {
				return notas[indice - 1];
		} else {
			System.out.println("Índice inválido, tente 1, 2 ou 3");
		}
		
		return -1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	
}