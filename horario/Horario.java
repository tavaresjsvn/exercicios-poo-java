package horario;

public class Horario {
	private int hora;
	private int minuto;
	private int segundo;
	
	public Horario() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	
	public Horario(int hora, int minuto, int segundo) {
		if (hora >= 0 && hora <= 23) {
	        this.hora = hora;
	    } else {
	        throw new IllegalArgumentException("Hora inválida. Deve estar entre 0 e 23.");
	    }

	    if (minuto >= 0 && minuto <= 59) {
	        this.minuto = minuto;
	    } else {
	        throw new IllegalArgumentException("Minuto inválido. Deve estar entre 0 e 59.");
	    }
	    
	    if (segundo >= 0 && segundo <= 59) {
	        this.segundo = segundo;
	    } else {
	        throw new IllegalArgumentException("Segundo inválido. Deve estar entre 0 e 59.");
	    }
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void exibirHorario() {
		System.out.printf("%02d:%02d:%02d%n", hora, minuto, segundo);
	}
	
	public int calcularSegundos() {
		return hora * 3600 + minuto * 60 + segundo;
	}
	
	
}
