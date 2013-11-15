package com.viviano.imcarm.entidades;

public class ConselhoFiscalBean {
	
	private int governoGeral;
	private double freira;
	
	
	
	public ConselhoFiscalBean() {
		super();
	}


	public ConselhoFiscalBean(int governoGeral, double freira) {
		
		this.governoGeral = governoGeral;
		this.freira = freira;
	}


	public int getGovernoGeral() {
		return governoGeral;
	}


	public void setGovernoGeral(int governoGeral) {
		this.governoGeral = governoGeral;
	}


	public double getFreira() {
		return freira;
	}


	public void setFreira(double freira) {
		this.freira = freira;
	}
	
	

}
