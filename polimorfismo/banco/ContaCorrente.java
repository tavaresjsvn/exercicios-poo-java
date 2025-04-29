package polimorfismo.banco;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(String nome, String cpf) {
		super(nome, cpf);
	}

	@Override
	public double calculaTributos() {
		return this.saldo/100;
	}

}
