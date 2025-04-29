package encapsulamento.contaBancaria;

public class Main {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria("7869", " Carla Souza");
		
		conta1.depositar(456.24);
		
		System.out.println(conta1.getSaldo());
		
		conta1.sacar(127.57);
		
		System.out.println(conta1.getSaldo());

	}

}
