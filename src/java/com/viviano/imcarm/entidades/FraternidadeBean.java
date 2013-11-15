package com.viviano.imcarm.entidades;

import java.util.Date;

public class FraternidadeBean { 
	
	private int idFraternidade;
	private String nome, status, rua, bairro, cidade, uf, diocese, bispo, numeroCasa, dataFundacao;
	
	
	public FraternidadeBean() {
		
	}
	
	public FraternidadeBean(String nome, String status, String rua,
			String bairro, String cidade, String uf, String diocese,
			String bispo, String numeroCasa, String dataFundacao) {
		
		this.nome = nome;
		this.status = status;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.diocese = diocese;
		this.bispo = bispo;
		this.numeroCasa = numeroCasa;
		this.dataFundacao = dataFundacao;
	}



	public FraternidadeBean(int idFraternidade, String numeroCasa, String nome,
			String status, String rua, String bairro, String cidade, String uf,
			String diocese, String bispo, String dataFundacao) {
		
		this.idFraternidade = idFraternidade;
		this.numeroCasa = numeroCasa;
		this.nome = nome;
		this.status = status;
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.diocese = diocese;
		this.bispo = bispo;
		this.dataFundacao = dataFundacao;
	}


	public int getIdFraternidade() {
		return idFraternidade;
	}


	public void setIdFraternidade(int idFraternidade) {
		this.idFraternidade = idFraternidade;
	}


	public String getNumeroCasa() {
		return numeroCasa;
	}


	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getUf() {
		return uf;
	}


	public void setUf(String uf) {
		this.uf = uf;
	}


	public String getDiocese() {
		return diocese;
	}


	public void setDiocese(String diocese) {
		this.diocese = diocese;
	}


	public String getBispo() {
		return bispo;
	}


	public void setBispo(String bispo) {
		this.bispo = bispo;
	}


	public String getDataFundacao() {
		return dataFundacao;
	}


	public void setDataFundacao(String dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	
	

}
