package polimorfismo.lojaCD;

import java.util.Scanner;
public class Midia {

	protected int codigo;
	protected double preco;
	protected String nome;
	
	protected static final Scanner entrada = new Scanner(System.in);
	
	public Midia() {
		this.codigo = 0;
		this.preco = 0.0;
		this.nome = "";
	}

	public Midia(int codigo, double preco, String nome) {
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTipo() {
		return "Mídia";
	}
	
	public String getDetalhes() {
		return "Código: " + getCodigo() + "\n" +
				"Preço: " + getPreco() + "\n" + 
				"Nome: " + getNome() + "\n";
	}
	
	public void printDados() {
		System.out.println(getTipo());
		System.out.println(getDetalhes());
	}
	
	public void inserirDados() {
	
		System.out.println("Digite o código: ");
		this.codigo = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Digite o preço: ");
		this.preco = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Digite o nome: ");
		this.nome =entrada.nextLine();
	}	
}
