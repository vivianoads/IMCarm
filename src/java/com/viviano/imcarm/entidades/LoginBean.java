package com.viviano.imcarm.entidades;

public class LoginBean {
	private String loginFreira;
	private String senha;
        private Integer idFreira;
	
	public LoginBean(){
		
	}

	public LoginBean(String loginFreira, String senha) {
		this.loginFreira = loginFreira;
		this.senha = senha;
	}

	public String getLoginFreira() {
		return loginFreira;
	}

	public void setloginFreira(String loginFreira) {
		this.loginFreira = loginFreira;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

    public Integer getIdFreira() {
        return idFreira;
    }

    public void setIdFreira(Integer idFreira) {
        this.idFreira = idFreira;
    }
	
	

}
