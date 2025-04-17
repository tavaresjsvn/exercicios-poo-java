package polimorfismo.lojaCD;

public class CD extends Midia {

	private int nMusicas;
	
	public CD() {
		super();
		
		this.nMusicas = 0;
	}

	public CD(int codigo, double preco, String nome, int nMusicas) {
		super(codigo, preco, nome);
		
		this.nMusicas = nMusicas;
	}

	public int getnMusicas() {
		return nMusicas;
	}

	public void setnMusicas(int nMusicas) {
		this.nMusicas = nMusicas;
	}

	@Override
	public String getTipo() {
		return "CD";
	}

	@Override
	public String getDetalhes() {
		return super.getDetalhes() + "Número de músicas: " + getnMusicas() + "\n";
	}

	@Override
	public void inserirDados() {
		super.inserirDados();
		
		System.out.println("Digite o número de músicas: ");
		this.nMusicas = entrada.nextInt();
		entrada.nextLine();
	}	
}
