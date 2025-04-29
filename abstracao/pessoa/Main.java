package pessoa;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		LocalDate dataNascimento1 = LocalDate.of(1999, 7, 17);
		
		Pessoa Jose = new Pessoa("José", dataNascimento1, 1.74);
		
		Jose.imprimirDados();

	}

}
