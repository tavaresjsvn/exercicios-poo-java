package polimorfismo.veiculos;

import java.util.Scanner;

public class Veiculos {
	
	protected String modelo;
	protected double preco;
	
	protected static final Scanner entrada = new Scanner(System.in);
	
	public Veiculos() {
		this.modelo = "";
		this.preco = 0.0;
	}

	public Veiculos(String modelo, double preco) {
		this.modelo = modelo;
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void printDados() {
		System.out.println("Modelo: " + getModelo());
		System.out.printf("Preco: R$%.2f ", getPreco());
	}
}
