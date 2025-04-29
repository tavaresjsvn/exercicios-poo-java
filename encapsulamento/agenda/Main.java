package encapsulamento.agenda;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
	      Agenda minhaAgenda = new Agenda("José");
	        
	        minhaAgenda.armazenarPessoa("João", LocalDate.of(1990, 7, 14), 1.75);
	        minhaAgenda.armazenarPessoa("Maria", LocalDate.of(2000, 8, 3), 1.65);
	        
	        minhaAgenda.imprimirAgenda();
	        
	        int posicao = minhaAgenda.buscarPessoa("João");
	        System.out.println("João está na posição: " + posicao);

	        minhaAgenda.imprimirPessoa(posicao);
	        
	        minhaAgenda.removerPessoa("João");
	        
	        minhaAgenda.imprimirAgenda();
	}

}
