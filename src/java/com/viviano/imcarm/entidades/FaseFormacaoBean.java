package com.viviano.imcarm.entidades;

public class FaseFormacaoBean {
	
	private int idFase;
	private String nome;
	
	public FaseFormacaoBean(){
		
	}
	
	public FaseFormacaoBean(int idFase, String nome) {
	
		this.idFase = idFase;
		this.nome = nome;
	}


	public int getIdFase() {
		return idFase;
	}


	public void setIdFase(int idFase) {
		this.idFase = idFase;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
