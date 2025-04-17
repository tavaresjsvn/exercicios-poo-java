package polimorfismo.lojaVirtualMusica;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Cadastro de MP3:");
		
		MP3 mp3 = new MP3();
		mp3.inserirDados();
		
		System.out.println("Cadastro de MP4:");
		
		MP4 mp4 = new MP4();
		mp4.inserirDados();
		
		System.out.println("Arquivos cadastrados:");
		
		mp3.printDados();
		mp4.printDados();
	}

}
