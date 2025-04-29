package fatura;

public class Main {

	public static void main(String[] args) {
		
        Fatura fatura1 = new Fatura("123", "Mouse", 2, 25.0);

        System.out.println("Número: " + fatura1.getNumero());
        System.out.println("Descrição: " + fatura1.getDescricao());
        System.out.println("Quantidade: " + fatura1.getQuantidadeComprada());
        System.out.println("Preço por item: " + fatura1.getPrecoItem());
        System.out.println("Total da fatura: " + fatura1.getTotalFatura());

        fatura1.setQuantidadeComprada(3);
        fatura1.setPrecoItem(30.0);

        System.out.println("\nInformações atualizadas:");
        System.out.println("Quantidade: " + fatura1.getQuantidadeComprada());
        System.out.println("Preço por item: " + fatura1.getPrecoItem());
        System.out.println("Total da fatura: " + fatura1.getTotalFatura());


	}

}
