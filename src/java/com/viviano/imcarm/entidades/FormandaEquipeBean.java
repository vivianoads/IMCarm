package com.viviano.imcarm.entidades;

public class FormandaEquipeBean {
	
	private int formanda;
	private int equipeServico;
	private String funcao;
	
	public FormandaEquipeBean(){
		
	}
	
	public FormandaEquipeBean(int formanda, int equipe, String funcao) {
	
		this.formanda = formanda;
		this.equipeServico = equipe;
		this.funcao = funcao;
	}


	public int getFormanda() {
		return formanda;
	}


	public void setFormanda(int formanda) {
		this.formanda = formanda;
	}


	public int getEquipe() {
		return equipeServico;
	}


	public void setEquipe(int equipe) {
		this.equipeServico = equipe;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	
	

}
