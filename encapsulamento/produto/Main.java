package encapsulamento.produto;

public class Main {

	public static void main(String[] args) {
        Produto produto1 = new Produto("meia", 45.7, 12);
		
		System.out.println("Produto: " + produto1.getNome() + "\nValor em estoque: R$" + produto1.calcularValorEstoque());
		
		System.out.println(produto1.verificarDisponibilidade()); 
		
		produto1.setQuantidade(0);
		
		System.out.println(produto1.calcularValorEstoque());
		
		System.out.println(produto1.verificarDisponibilidade()); 


	}

}
