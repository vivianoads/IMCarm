package com.viviano.imcarm.entidades;

import java.util.Date;

public class FormacaoBean {
	
	private int congregacao;
	private int fase;
	private int formanda;
	private Date dataEntrada;
	private Date dataSaida;
	
	
	public FormacaoBean() {
	}


	public FormacaoBean(int congregacao, int fase,
			int formanda, Date dataEntrada, Date dataSaida) {
		
		this.congregacao = congregacao;
		this.fase = fase;
		this.formanda = formanda;
		this.dataEntrada = dataEntrada;
		this.dataSaida = dataSaida;
	}


	public int getCongregacao() {
		return congregacao;
	}


	public void setCongregacao(int congregacao) {
		this.congregacao = congregacao;
	}


	public int getFase() {
		return fase;
	}


	public void setFase(int fase) {
		this.fase = fase;
	}


	public int getFormanda() {
		return formanda;
	}


	public void setFormanda(int formanda) {
		this.formanda = formanda;
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
