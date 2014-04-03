package com.viviano.imcarm.commands;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class SalvaalteracoesFormandaCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "";
		VerificaUsuario verificaUsuario = new VerificaUsuario();
		
		String acao = request.getParameter("acao");
		Integer dados = new Integer(request.getParameter("dados"));
		FormandaDao formandaDao = new FormandaDao();
		
		if(acao.equalsIgnoreCase("alterar")){
		try {
			FormandaBean formandaBean = formandaDao.getFormandaBean(dados);
			request.setAttribute("formanda", formandaBean);
			nextPage = "/formalteradadosformanda.jsp";
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		}
		
		else if(acao.equalsIgnoreCase("apagar")){
			nextPage = "/cadastraformanda.jsp";
			FormandaBean formandaBean;
			try {
				formandaBean = formandaDao.getFormandaBean(dados);
				request.setAttribute("formandagravada", formandaBean);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 			
		}
		else if(acao.equalsIgnoreCase("apagarfinal")){
			try {
				formandaDao.apagaFormandaBean(dados);
				nextPage = "/formandaapagadacomsucesso.html";
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
//		else if (acao.equalsIgnoreCase("salvar")) {
//			FormandaBean formandaBean = new FormandaBean(dados, request.getParameter("numero"), request.getParameter("nome_civil"), request.getParameter("nome_pai"), request.getParameter("nome_mae"), request.getParameter("rua"), request.getParameter("bairro"), request.getParameter("cidade"), request.getParameter("uf"), request.getParameter("diocese"));
//			                            
//			try {
//				formandaDao.alteraFormanda(dados, formandaBean);
//				nextPage = "/cadastraformanda.jsp";
//				request.setAttribute("formandagravada", formandaBean);
//			} catch (ClassNotFoundException e) {
//				e.printStackTrace();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			} 
//		}

		return nextPage;
	}

}
