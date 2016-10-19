
public enum NomeMateriaPrima {
	
	PAR("Parafuso"), //
	PRC("Porca"), //
	ARR("Arruela"), //
	CPA("Chapa de Aço"), // 
	CAL("Chapa de Alumínio"); //

	private String nome;

	private NomeMateriaPrima(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}


}
