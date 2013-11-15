package com.viviano.imcarm.entidades;

public class FreiraEquipeBean {
	
	private Double cpfFreira;
	private int equipe;
	private String funcao;
	
	public FreiraEquipeBean(){
		
	}
	
	public FreiraEquipeBean(double freira,int equipe, String funcao) {
	
		this.cpfFreira = freira;
		this.equipe = equipe;
		this.funcao = funcao;
	}


	public double getFreira() {
		return cpfFreira;
	}


	public void setFreira(double freira) {
		this.cpfFreira = freira;
	}


	public int getEquipe() {
		return equipe;
	}


	public void setEquipe(int equipe) {
		this.equipe = equipe;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	

}
