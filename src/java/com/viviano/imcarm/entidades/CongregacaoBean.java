package com.viviano.imcarm.entidades;

import java.util.Date;

public class CongregacaoBean {
	
	private int idCongregacao;
	private String nome, carisma, lema, cidadeFundacao, fundador, coFundador;
	private Date dataFundacao, dataAgregacaoOrdem, DataErecaoCanonica;
	
	public CongregacaoBean(int idCongregacao, String nome, String carisma,
			String lema, String cidadeFundacao, String fundador,
			String coFundador, Date dataFundacao, Date dataAgregacaoOrdem,
			Date dataErecaoCanonica) {
		this.idCongregacao = idCongregacao;
		this.nome = nome;
		this.carisma = carisma;
		this.lema = lema;
		this.cidadeFundacao = cidadeFundacao;
		this.fundador = fundador;
		this.coFundador = coFundador;
		this.dataFundacao = dataFundacao;
		this.dataAgregacaoOrdem = dataAgregacaoOrdem;
		DataErecaoCanonica = dataErecaoCanonica;
		
	}

	
	public CongregacaoBean(){
		
	}
	public int getIdCongregacao() {
		return idCongregacao;
	}

	public void setIdCongregacao(int idCongregacao) {
		this.idCongregacao = idCongregacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCarisma() {
		return carisma;
	}

	public void setCarisma(String carisma) {
		this.carisma = carisma;
	}

	public String getLema() {
		return lema;
	}

	public void setLema(String lema) {
		this.lema = lema;
	}

	public String getCidadeFundacao() {
		return cidadeFundacao;
	}

	public void setCidadeFundacao(String cidadeFundacao) {
		this.cidadeFundacao = cidadeFundacao;
	}

	public String getFundador() {
		return fundador;
	}

	public void setFundador(String fundador) {
		this.fundador = fundador;
	}

	public String getCoFundador() {
		return coFundador;
	}

	public void setCoFundador(String coFundador) {
		this.coFundador = coFundador;
	}

	public Date getDataFundacao() {
		return dataFundacao;
	}

	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}

	public Date getDataAgregacaoOrdem() {
		return dataAgregacaoOrdem;
	}

	public void setDataAgregacaoOrdem(Date dataAgregacaoOrdem) {
		this.dataAgregacaoOrdem = dataAgregacaoOrdem;
	}

	public Date getDataErecaoCanonica() {
		return DataErecaoCanonica;
	}

	public void setDataErecaoCanonica(Date dataErecaoCanonica) {
		DataErecaoCanonica = dataErecaoCanonica;
	}

}
