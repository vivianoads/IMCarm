package com.viviano.imcarm.entidades;

public class MembrosEquipeFreiraBean {
	
	private int Equipe;
	private double freira;
	
	public MembrosEquipeFreiraBean(){
		
	}
	
	public MembrosEquipeFreiraBean(int equipe, double freira) {
	
		Equipe = equipe;
		this.freira = freira;
	}


	public int getEquipe() {
		return Equipe;
	}


	public void setEquipe(int equipe) {
		Equipe = equipe;
	}


	public double getFreira() {
		return freira;
	}


	public void setFreira(double freira) {
		this.freira = freira;
	}
	
	

}
