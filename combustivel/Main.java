package combustivel;

public class Main {

	public static void main(String[] args) {
		BombaCombustivel gasolina = new BombaCombustivel(Tipo.GASOLINA_COMUM, 5.80, 100.0);
        BombaCombustivel etanol = new BombaCombustivel(Tipo.ETANOL, 4.50, 50.0);

        System.out.println("Gasolina inicial: " + gasolina.getQuantidade() + "L");
        gasolina.abastecerPorValor(20.0);
        System.out.println("Gasolina após R$20: " + gasolina.getQuantidade() + "L");
        gasolina.abastecerPorLitro(10.0);
        System.out.println("Gasolina após 10L: " + gasolina.getQuantidade() + "L");

        System.out.println("\nEtanol inicial: " + etanol.getQuantidade() + "L");
        etanol.abastecerPorValor(10.0);
        System.out.println("Etanol após R$10: " + etanol.getQuantidade() + "L");

        gasolina.alterarValor(6.00);
        etanol.alterarCombustivel(Tipo.GASOLINA_ADITIVADA);

        System.out.println("\nGasolina final (R$): " + gasolina.getValorLitro());
        System.out.println("Etanol final (tipo): " + etanol.getTipo());

	}

}
