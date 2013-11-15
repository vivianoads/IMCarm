package com.viviano.imcarm.servicetowork;

import com.viviano.imcarm.entidades.LoginBean;

public class VerificaUsuario{

	
	public boolean verificador(LoginBean loginBean){
		if (loginBean ==  null){
			return false;
		}
		
		else return true;
	}

}
