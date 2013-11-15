package com.viviano.imcarm.commands;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.LoginDao;

public class LoginCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		
		LoginDao loginDao = new LoginDao();
		LoginBean  loginBean = new LoginBean();
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		String nextPage;
		
		if (usuario.isEmpty() || senha.isEmpty()){
			nextPage = "/errologin.html";
		}
		
				
		try {
			loginBean = loginDao.getLoginBean(new Double(usuario), senha);
			if (loginBean != null){
				request.getSession().setAttribute("usuarioLogado", loginBean);
				nextPage = "/usuariologado.jsp";
			}
			
			else{
				nextPage = "/errologin.html";
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
			nextPage = "/erro.html";
		}
		
		return nextPage;

	}

}
