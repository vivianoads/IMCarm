package com.viviano.imcarm.commands;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class SalvaAlteracoesIrmaCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "";
		VerificaUsuario verificaUsuario = new VerificaUsuario();
		
		Double cpf = new Double(request.getParameter("cpforigem"));
		String acao = request.getParameter("acao");
		FreiraDao freiraDao = new FreiraDao();
//		
//		if (acao.equalsIgnoreCase("apagar")){
//			try {
//				freiraDao.apagaFreira(cpf);
//				nextPage = "/irmaapagadacomsucesso.html";
//			} catch (ClassNotFoundException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		else{
//		FreiraBean freiraBean = new FreiraBean(new Double(request.getParameter("cpf")), new Double(request.getParameter("rg")), request.getParameter("nome_civil"), request.getParameter("nome_religioso"), request.getParameter("nome_pai"), request.getParameter("nome_mae"), request.getParameter("data_nascimento"), request.getParameter("data_aspirantado"), request.getParameter("data_postulantado"), request.getParameter("data_noviciado"), request.getParameter("data_profissao_temporaria"), request.getParameter("data_profissao_perpetua"));
//		
//		try {
//			freiraDao.alteraFreira(cpf, freiraBean);
//			request.setAttribute("irmagravar", freiraBean);
//			nextPage = "/cadastrairma.jsp";
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}

		
		return nextPage;
	}

}
