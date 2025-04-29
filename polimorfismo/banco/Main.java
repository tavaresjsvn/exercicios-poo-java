package polimorfismo.banco;

public class Main {
	public static void main(String[] args) {
		
		ContaCorrente contaCorrente = new ContaCorrente("José", "88800077733");
		contaCorrente.depositar(1.500);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		Tributavel[] tributaveis = new Tributavel[2];
		tributaveis[0] = contaCorrente;
		tributaveis[1] = seguroDeVida;
		
		for (Tributavel aplicaveis : tributaveis) {
            System.out.println("O tributo é: " + aplicaveis.calculaTributos());
        }
	}
}
