package polimorfismo.lojaCD;

public class DVD extends Midia {

	private int nFaixas;

	public DVD() {
		super();
		
		this.nFaixas = 0;
	}

	public DVD(int codigo, double preco, String nome, int nFaixas) {
		super(codigo, preco, nome);
		
		this.nFaixas = nFaixas;
	}

	public int getnFaixas() {
		return nFaixas;
	}

	public void setnFaixas(int nFaixas) {
		this.nFaixas = nFaixas;
	}
	
	@Override
	public String getTipo() {
		return "DVD";
	}

	@Override
	public String getDetalhes() {
		return super.getDetalhes() + "Faixas: " + getnFaixas() + "\n";
	}

	@Override
	public void inserirDados() {
		super.inserirDados();
		
		System.out.println("Digite o nímero de faixas: ");
		this.nFaixas = entrada.nextInt();
		entrada.nextLine();
	}
}
