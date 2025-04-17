package polimorfismo.lojaVirtualMusica;

public class MP3 extends Arquivo {

	protected int nDownloads;
	
	public MP3() {
		super();
		
		this.nDownloads = 0;
	}

	public MP3(int kbytes, double preco, String autor, int nDownloads) {
		super(kbytes, preco, autor);

		this.nDownloads = nDownloads;
	}

	public int getnDownloads() {
		return nDownloads;
	}

	public void setnDownloads(int nDownloads) {
		this.nDownloads = nDownloads;
	}

	@Override
	public String getTipo() {
		return "MP3";
	}

	@Override
	public String getDetalhes() {
		return super.getDetalhes() + "Número de downloads: " + getnDownloads() + "\n";
	}

	@Override
	public void inserirDados() {
		super.inserirDados();
		
		System.out.println("Digite o número de downloads: ");
		this.nDownloads = entrada.nextInt();
		entrada.nextLine();
	}

}
