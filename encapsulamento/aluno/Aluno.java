package aluno;

public class Aluno {
	
	private String nome;
	private int matricula;
    private double[] notas = new double[3];
	
	public Aluno (String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		this.notas = new double[]{0.0, 0.0, 0.0};
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
	
	 public boolean setNota(int indice, double nota) {
	        if (indice < 1 || indice > 3) {
	            System.out.println("Índice inválido! Escolha entre 1, 2 ou 3.");
	            return false;
	        }
	        if (nota < 0 || nota > 10) {
	            System.out.println("Nota inválida! Escolha um valor entre 0 e 10.");
	            return false;
	        }
	        notas[indice - 1] = nota;
	        return true;
	    }
	
	 public double getNota(int indice) {
	        if (indice < 1 || indice > 3) {
	            throw new IllegalArgumentException("Índice inválido! Use 1, 2 ou 3.");
	        }
	        return notas[indice - 1];
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