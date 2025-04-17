package polimorfismo.lojaVirtualMusica;

import java.util.Scanner;

public class Arquivo {

	protected int kbytes;
	protected double preco;
	protected String autor;
	
	protected static final Scanner entrada = new Scanner(System.in);
	
	public Arquivo() {
		this.kbytes = 0;
		this.preco = 0.0;
		this.autor = "";
	}
	
	public Arquivo(int kbytes, double preco, String autor) {
		this.kbytes = kbytes;
		this.preco = preco;
		this.autor = autor;
	}
	
	public int getKbytes() {
		return kbytes;
	}

	public void setKbytes(int kbytes) {
		this.kbytes = kbytes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTipo(){
		return "Arquivo\n";
	}
	
	public String getDetalhes() {
		return "kbytes: " + getKbytes() + "\n" + 
			   "Preço: R$" + String.format("%.2f", getPreco()) + "\n" +
			   "Autor: " + getAutor() + "\n";
	}
	
	public void printDados() {
		System.out.println(getTipo());
		System.out.println(getDetalhes());
	}
	
	public void inserirDados() {
		
		System.out.println("Digite os kbytes: ");
		this.kbytes = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Digite o preço: ");
		this.preco = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Digite o autor: ");
		this.autor = entrada.nextLine();
	}
	
	public void aplicarReajuste(double porcentagem) {
        this.preco *= (1 + porcentagem/100);
    }
}
