package com.viviano.imcarm.entidades;

public class LoginBean {
	private double cpfFreira;
	private String senha;
	
	public LoginBean(){
		
	}

	public LoginBean(double cpfFreira, String senha) {
		this.cpfFreira = cpfFreira;
		this.senha = senha;
	}

	public double getCpfFreira() {
		return cpfFreira;
	}

	public void setCpfFreira(double cpfFreira) {
		this.cpfFreira = cpfFreira;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
