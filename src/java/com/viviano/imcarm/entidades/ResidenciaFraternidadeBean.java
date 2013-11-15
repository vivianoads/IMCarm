package com.viviano.imcarm.entidades;

import java.util.Date;

public class ResidenciaFraternidadeBean {
	
	private int fraternidade;
	private double freira;
	private String atividade, status;
	private Date dataEntrada, dataSaida;
	
	public ResidenciaFraternidadeBean(){
		
	}
	
	public ResidenciaFraternidadeBean(int fraternidade, double freira,
			String atividade, String status, Date dataEntrada, Date dataSaida) {
	
		this.fraternidade = fraternidade;
		this.freira = freira;
		this.atividade = atividade;
		this.status = status;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
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


	public String getAtividade() {
		return atividade;
	}


	public void setAtividade(String atividade) {
		this.atividade = atividade;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getDataEntrada() {
		return dataEntrada;
	}


	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}


	public Date getDataSaida() {
		return dataSaida;
	}


	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
	
}
