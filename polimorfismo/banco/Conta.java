package polimorfismo.banco;

public class Conta {

	protected double saldo;
	protected String nome;
	protected String cpf;
	
	public Conta(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void depositar(double deposito) {
		this.saldo = this.saldo + deposito;
	}
	
	public void sacar(double valorSaque) {
		if (this.saldo < valorSaque) {
			throw new IllegalArgumentException("Não há saldo suficiente para este valor de saque!");
		}
		
		this.saldo = this.saldo - valorSaque;
	}
	
	public double obterSaldo() {
		return this.saldo;
	}
}
