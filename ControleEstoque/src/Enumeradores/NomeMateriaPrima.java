
public enum NomeMateriaPrima {
	
	PAR("Parafuso"), //
	PRC("Porca"), //
	ARR("Arruela"), //
	CPA("Chapa de A�o"), // 
	CAL("Chapa de Alum�nio"); //

	private String nome;

	private NomeMateriaPrima(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}


}
