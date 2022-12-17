package br.com.fasda.erp.model;

public enum TipoEmpresa {
	
	MEI("Microempreendedor Individual"),
	EIRELI("Empresa individual de Reponsabilidade Limitada"),
	LTDA("Sociedade Limitada"),
	SA("Sociedade Anônima");
	
	private String descricao;
	
	TipoEmpresa(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	
}
