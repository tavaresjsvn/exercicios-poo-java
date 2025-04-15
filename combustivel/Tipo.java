package combustivel;

public enum Tipo {
	
	GASOLINA_COMUM("Gasolina Comum"),
	GASOLINA_ADITIVADA("Gasolina Aditivada"),
	ETANOL("Etanol"),
	DIESEL("Diesel");
	
	private final String nome;
	
	Tipo(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	@Override
    public String toString() {
        return nome;
    }
}
