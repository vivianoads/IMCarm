package com.viviano.imcarm.commands;

import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class GravaIrmaCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "";
		
		FreiraDao freiraDao = new FreiraDao();
//		FreiraBean freiraBean = new FreiraBean(new Double(request.getParameter("cpf")), new Double(request.getParameter("rg")), request.getParameter("nome_civil"), request.getParameter("nome_religioso"), request.getParameter("nome_pai"), request.getParameter("nome_mae"), request.getParameter("data_nascimento"), request.getParameter("data_aspirantado"), request.getParameter("data_postulantado"), request.getParameter("data_noviciado"), request.getParameter("data_profissao_temporaria"), request.getParameter("data_profissao_perpetua"));
//		
//		
//		try {
//			if(freiraDao.getFreiraBean(freiraBean.getCpf()) == null){
//				
//				freiraDao.gravaFreira(freiraBean);
//				FreiraBean freiraBeanaux = freiraDao.getFreiraBean(freiraBean.getCpf());
//				request.setAttribute("irmagravar", freiraBeanaux);
//				
//				nextPage = "/cadastrairma.jsp";
//			}
//			
//			else{
//				nextPage = "/errousuarioduplicado.html";
//				
//			}
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		return nextPage;
	}

}
