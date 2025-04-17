package polimorfismo.lojaVirtualMusica;

public class MP4 extends Arquivo {

	protected int nVisitas;
	
	public MP4() {
		super();
		
		this.nVisitas = 0;
	}

	public MP4(int kbytes, double preco, String autor, int nVisitas) {
		super(kbytes, preco, autor);

		this.nVisitas = nVisitas;
	}

	public int getnVisitas() {
		return nVisitas;
	}

	public void setnVisitas(int nVisitas) {
		this.nVisitas = nVisitas;
	}
	
	@Override
	public String getTipo() {
		return "MP4";
	}

	@Override
	public String getDetalhes() {
		return super.getDetalhes() + "Número de visitas: " + getnVisitas() + "\n";
	}
	
	@Override
	public void inserirDados() {
		super.inserirDados();
		
		System.out.println("Digite o número de visitas: ");
		this.nVisitas = entrada.nextInt();
		entrada.nextLine();
	}
	

}
