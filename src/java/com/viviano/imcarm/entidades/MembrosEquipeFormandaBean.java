package com.viviano.imcarm.entidades;

public class MembrosEquipeFormandaBean {
	
	private int idEquipe;
	private int idFormanda;
	
	
	public MembrosEquipeFormandaBean(){
		
	}
	
	public MembrosEquipeFormandaBean(int equipe, int formanda) {
	
		this.idEquipe = equipe;
		this.idFormanda = formanda;
	}


	public int getEquipe() {
		return idEquipe;
	}


	public void setEquipe(int equipe) {
		this.idEquipe = equipe;
	}


	public int getFormanda() {
		return idFormanda;
	}


	public void setFormanda(int formanda) {
		this.idFormanda = formanda;
	}
	
	

}
