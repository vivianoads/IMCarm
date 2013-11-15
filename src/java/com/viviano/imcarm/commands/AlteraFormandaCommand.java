package com.viviano.imcarm.commands;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class AlteraFormandaCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "";
		
		FormandaDao formandaDao = new FormandaDao();
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
		try {
			
			formandas = formandaDao.getAllFormandaBean();
			request.setAttribute("formandas", formandas);
			nextPage = "/exibeformandas.jsp";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return nextPage;
	}

}
