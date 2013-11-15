package com.viviano.imcarm.entidades;

public class GovernoGeralBean {
	
	private int idGoverno;
	private int congregacao;
	private double MadreGeral, ViceGeral, EconomaGeral;
	public GovernoGeralBean(int idGoverno, int congregacao, double madreGeral,
			double viceGeral, double economaGeral) {
		
		this.idGoverno = idGoverno;
		this.congregacao = congregacao;
		MadreGeral = madreGeral;
		ViceGeral = viceGeral;
		EconomaGeral = economaGeral;
		
	}
	
	public GovernoGeralBean(){
		
	}
	
	
	public int getIdGoverno() {
		return idGoverno;
	}
	public void setIdGoverno(int idGoverno) {
		this.idGoverno = idGoverno;
	}
	public int getCongregacao() {
		return congregacao;
	}
	public void setIdCongregacao(int congregacao) {
		this.congregacao = congregacao;
	}
	public double getMadreGeral() {
		return MadreGeral;
	}
	public void setMadreGeral(double madreGeral) {
		MadreGeral = madreGeral;
	}
	public double getViceGeral() {
		return ViceGeral;
	}
	public void setViceGeral(double viceGeral) {
		ViceGeral = viceGeral;
	}
	public double getEconomaGeral() {
		return EconomaGeral;
	}
	public void setEconomaGeral(double economaGeral) {
		EconomaGeral = economaGeral;
	}


	
	
}

