package agenda;

import java.time.LocalDate;
import  pessoa.Pessoa;

public class Agenda {
	
	private String dono;
	private int capacidadeMax = 10;
	private int contadorPessoas;
	private Pessoa[] pessoas = new Pessoa[10];

	public Agenda(String dono) {
		this.dono = dono;
		contadorPessoas = 0;
	}
	
	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public int getContadorPessoas() {
		return contadorPessoas;
	}

	public void armazenarPessoa(String nome, LocalDate dataNascimento, double altura) {
		
		if (contadorPessoas < capacidadeMax) {
			
			Pessoa novaPessoa = new Pessoa(nome, dataNascimento, altura);
			pessoas[contadorPessoas] = novaPessoa;
			
			contadorPessoas++;
			System.out.println("Seu contato: " + nome + " foi armazenado na agenda");
		} else {
			
			System.out.println("Sua agenda está cheia! Não é possível mais pessoas.");
		}	
	}
	
	public void removerPessoa(String nome) {
		
		int posicao = buscarPessoa(nome);
		
	  if (posicao == -1) {
            System.out.println("Pessoa não encontrada!");
            return;
	  }
		
	  for (int i = posicao; i < contadorPessoas - 1; i++) {
		  pessoas[i] = pessoas[i + 1];
	  }
	  
	  pessoas[contadorPessoas - 1] = null;
	  contadorPessoas--;
		
	}
	
	public int buscarPessoa(String nome) {
		
		for (int i = 0; i < contadorPessoas; i++) {
			if (pessoas[i].getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public void imprimirAgenda() {
		
		 if (contadorPessoas == 0) {
	            System.out.println("Agenda vazia!");
	            return;
	        }
		
		System.out.println("Agenda de " + this.dono);
		
		for (int i = 0; i < contadorPessoas; i++) {
			
			System.out.print("Contato " + (i + 1) + ": " + pessoas[i].getNome() + " | ");
			System.out.printf("Altura: %.2f | ", pessoas[i].getAltura());
			System.out.print("Idade: " + pessoas[i].calcularIdade() + " Anos (nascimento: " + pessoas[i].getDataNascimento() + ")\n");
			
			 System.out.println("______________________\n");
		}
	}
	
	public void imprimirPessoa(int indice) {
		if (indice >= 0 && indice < contadorPessoas) {
			System.out.print("Contato " + (indice + 1) + ": " + pessoas[indice].getNome() + " | ");
			System.out.printf("Altura: %.2f | ", pessoas[indice].getAltura());
			System.out.print("Idade: " + pessoas[indice].calcularIdade() + " Anos (nascimento: " + pessoas[indice].getDataNascimento() + ")\n");
		} else {
			System.out.printf("Pessoa não encontrada. Índice inválido, atualmente você tem %d pessoas na sua agenda\n", contadorPessoas);
		}
	}
	
	
}
