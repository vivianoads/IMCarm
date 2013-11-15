package com.viviano.imcarm.entidades;

import java.util.Date;

public class FreiraBean {

	private double cpf, rg;
	private String nomeCivil, nomeReligioso, nomePai, nomeMae;
	private String dataNascimento, dataAspirantado, dataPostulantado,
			dataNoviciadoCanonico, dataProfissaoTemporaria,
			dataProfissaoPerpetua;
	
	
	
	public FreiraBean() {
	}


	public FreiraBean(double cpf, double rg, String nomeCivil,
			String nomeReligioso, String nomePai, String nomeMae,
			String dataNascimento, String dataAspirantado, String dataPostulantado,
			String dataNoviciadoCanonico, String dataProfissaoTemporaria,
			String dataProfissaoPerpetua) {

		
		this.cpf = cpf;
		this.rg = rg;
		this.nomeCivil = nomeCivil;
		this.nomeReligioso = nomeReligioso;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.dataNascimento = dataNascimento;
		this.dataAspirantado = dataAspirantado;
		this.dataPostulantado = dataPostulantado;
		this.dataNoviciadoCanonico = dataNoviciadoCanonico;
		this.dataProfissaoTemporaria = dataProfissaoTemporaria;
		this.dataProfissaoPerpetua = dataProfissaoPerpetua;
	}
	
	
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public double getRg() {
		return rg;
	}
	public void setRg(double rg) {
		this.rg = rg;
	}
	public String getNomeCivil() {
		return nomeCivil;
	}
	public void setNomeCivil(String nomeCivil) {
		this.nomeCivil = nomeCivil;
	}
	public String getNomeReligioso() {
		return nomeReligioso;
	}
	public void setNomeReligioso(String nomeReligioso) {
		this.nomeReligioso = nomeReligioso;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}


	public String getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}


	public String getDataAspirantado() {
		return dataAspirantado;
	}


	public void setDataAspirantado(String dataAspirantado) {
		this.dataAspirantado = dataAspirantado;
	}


	public String getDataPostulantado() {
		return dataPostulantado;
	}


	public void setDataPostulantado(String dataPostulantado) {
		this.dataPostulantado = dataPostulantado;
	}


	public String getDataNoviciadoCanonico() {
		return dataNoviciadoCanonico;
	}


	public void setDataNoviciadoCanonico(String dataNoviciadoCanonico) {
		this.dataNoviciadoCanonico = dataNoviciadoCanonico;
	}


	public String getDataProfissaoTemporaria() {
		return dataProfissaoTemporaria;
	}


	public void setDataProfissaoTemporaria(String dataProfissaoTemporaria) {
		this.dataProfissaoTemporaria = dataProfissaoTemporaria;
	}


	public String getDataProfissaoPerpetua() {
		return dataProfissaoPerpetua;
	}


	public void setDataProfissaoPerpetua(String dataProfissaoPerpetua) {
		this.dataProfissaoPerpetua = dataProfissaoPerpetua;
	}
	
	
	

}
