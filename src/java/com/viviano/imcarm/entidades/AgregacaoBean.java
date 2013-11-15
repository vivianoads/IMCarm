package com.viviano.imcarm.entidades;

public class AgregacaoBean {
	
	private int congregacao;
	private int fraternidade;
	private double freira;
	
	
	public AgregacaoBean(){
		
	}
	public AgregacaoBean(int congregacao, int fraternidade,
			double freira) {
		
		this.congregacao = congregacao;
		this.fraternidade = fraternidade;
		this.freira = freira;
	}


	public int getCongregacao() {
		return congregacao;
	}


	public void setCongregacao(int congregacao) {
		this.congregacao = congregacao;
	}


	public int getFraternidade() {
		return fraternidade;
	}


	public void setFraternidade(int fraternidade) {
		this.fraternidade = fraternidade;
	}


	public double getFreira() {
		return freira;
	}


	public void setFreira(double freira) {
		this.freira = freira;
	}
	
	
	
	

}
