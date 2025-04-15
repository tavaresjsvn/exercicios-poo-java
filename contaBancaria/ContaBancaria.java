package contaBancaria;

public class ContaBancaria {
	
	private String numeroConta;
	private String nomeTitular;
	private double saldo;
	
	public ContaBancaria (String numeroConta, String nomeTitular) {
		this.setNumeroConta(numeroConta);
		this.setNomeTitular(nomeTitular);
		this.saldo = 0;
	}
	
	public void depositar (double deposito) {
		if (deposito < 0) {
			System.out.println("Valor de depósito unválido");
		} else {
			saldo = saldo + deposito;
			System.out.println("Depósito de R$" + deposito + " realizado com sucesso!");
		}
	}
	
	public void sacar (double saque) {
		if (saque > saldo) {
			System.out.println("Operação falhou, não há saldo suficiente!");
		} else if (saque < saldo && saque > 0) {
			saldo = saldo - saque;
			System.out.println("Saque de R$" + saque + " realizado com sucesso!");
		} else {
			System.out.println("Valor de saque inválido!");
		}
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getSaldo() {
		return saldo;
	}

}

