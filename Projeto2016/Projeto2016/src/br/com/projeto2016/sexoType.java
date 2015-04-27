package br.com.projeto2016;

public enum sexoType {
	
	F("Feminino"), M("Masculino");
	
	private String descricao;
	
	private sexoType(String descricao){
		
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
