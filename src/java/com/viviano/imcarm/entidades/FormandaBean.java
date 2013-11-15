package com.viviano.imcarm.entidades;

public class FormandaBean {
	private int idFormanda;
	private String nome, nomePai, nomeMae, rua, bairro, cidade, uf, diocese, numeroCasa;
	public FormandaBean(int idFormanda, String numeroCasa, String nome,
			String nomePai, String nomeMae, String rua, String bairro,
			String cidade, String uf, String diocese) {
		
		this.idFormanda = idFormanda;
		this.numeroCasa = numeroCasa;
		this.nome = nome;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.diocese = diocese;
	}
	
	
	
	public FormandaBean(String nome, String nomePai, String nomeMae,
			String rua, String bairro, String cidade, String uf,
			String diocese, String numeroCasa) {
		super();
		this.nome = nome;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.diocese = diocese;
		this.numeroCasa = numeroCasa;
	}



	public FormandaBean(){
		
	}
	
	public int getIdFormanda() {
		return idFormanda;
	}
	public void setIdFormanda(int idFormanda) {
		this.idFormanda = idFormanda;
	}
	public String getNumeroCasa() {
		return numeroCasa;
	}
	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public String getDiocese() {
		return diocese;
	}
	public void setDiocese(String diocese) {
		this.diocese = diocese;
	}

	

	
}
