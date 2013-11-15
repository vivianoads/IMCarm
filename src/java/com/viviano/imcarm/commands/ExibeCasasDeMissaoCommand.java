package com.viviano.imcarm.commands;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class ExibeCasasDeMissaoCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = ""; 
		
		FraternidadeDao fraternidadeDao = new FraternidadeDao();
		List<FraternidadeBean> fraternidades = new ArrayList<FraternidadeBean>();
		nextPage = "/exibecasasdemissao.jsp";
		try {
			fraternidades = fraternidadeDao.getAllFraternidade();
			request.setAttribute("fraternidades", fraternidades);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nextPage;
	}

}
