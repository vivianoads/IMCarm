package com.viviano.imcarm.entidades;

public class EquipeServicoBean {

	private int idEquipe;
	private int governo;
	private double coordenadora;
	private String nome;
	
	

	
	public EquipeServicoBean() {
	}


	public EquipeServicoBean(int idEquipe, int governo, double coordenadora,
			String nome) {
	
		this.idEquipe = idEquipe;
		this.governo = governo;
		this.coordenadora = coordenadora;
		this.nome = nome;
	}


	public int getIdEquipe() {
		return idEquipe;
	}


	public void setIdEquipe(int idEquipe) {
		this.idEquipe = idEquipe;
	}


	public int getgovernoGeral() {
		return governo;
	}


	public void setIdGoverno(int governo) {
		this.governo = governo;
	}


	public double getCoordenadora() {
		return coordenadora;
	}


	public void setCoordenadora(double coordenadora) {
		this.coordenadora = coordenadora;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
