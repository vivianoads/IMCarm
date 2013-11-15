package com.viviano.imcarm.entidades;

import java.util.Date;

public class CoordenacaoFraternidadeBean {
	
	private int idCoordenacao;
	private int idFraternidade;
	private double cpfCoordenadora;
	private double cpfTesoureira;
	private double cpfSecretaria;
	private Date dataInicio;
	private Date dataTermino;
	
	public CoordenacaoFraternidadeBean() {
		
	}

	public int getIdCoordenacao() {
		return idCoordenacao;
	}

	public void setIdCoordenacao(int idCoordenacao) {
		this.idCoordenacao = idCoordenacao;
	}

	public int getIdFraternidade() {
		return idFraternidade;
	}

	public void setIdFraternidade(int idFraternidade) {
		this.idFraternidade = idFraternidade;
	}

	public double getCpfCoordenadora() {
		return cpfCoordenadora;
	}

	public void setCpfCoordenadora(double cpfCoordenadora) {
		this.cpfCoordenadora = cpfCoordenadora;
	}

	public double getCpfTesoureira() {
		return cpfTesoureira;
	}

	public void setCpfTesoureira(double cpfTesoureira) {
		this.cpfTesoureira = cpfTesoureira;
	}

	public double getCpfSecretaria() {
		return cpfSecretaria;
	}

	public void setCpfSecretaria(double cpfSecretaria) {
		this.cpfSecretaria = cpfSecretaria;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	
	
	
	
//	 id_coordenacao serial NOT NULL,
//	  coordenadora double precision,
//	  tesoureira double precision,
//	  secretaria double precision,
//	  data_inicio date,
//	  data_termino date,
//	  id_fraternidade integer,

}
