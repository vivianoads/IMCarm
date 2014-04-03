package com.viviano.imcarm.commands;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class AlteraIrmaCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "";
		
		String opcao = request.getParameter("tipo_consulta");
		String acao = request.getParameter("acao");
		FreiraDao freiraDao = new FreiraDao();
		if (opcao.equalsIgnoreCase("cpf")){
			double cpf = new Double(request.getParameter("dados"));
			
//			try {
////				FreiraBean freiraAux = freiraDao.getFreiraBean(cpf);
//				if((cpf == 0)||(freiraAux == null)){
//					nextPage = "/errousuarionaoencontrado.html";
//				}
//				else{
//					if(acao.equalsIgnoreCase("apagar")){
//						request.setAttribute("irmagravar", freiraAux);
//						nextPage = "/cadastrairma.jsp";
//					}
//					else{
//						nextPage = "/formalteradadosirma.jsp";
//						request.setAttribute("freiracpf", freiraAux);
//					}
//				}
//			} catch (ClassNotFoundException e) {
//				nextPage = "/ImCarm/errousuarionaoencontrado.html";
//			} catch (SQLException e) {
//				nextPage = "/ImCarm/errousuarionaoencontrado.html";
//				
//			}
			
		}
		else{
			String dados = request.getParameter("dados");
			try {
				List<FreiraBean> freiras = freiraDao.getAllFreiraBean();
				request.setAttribute("freiras", freiras);
				nextPage = "/exibeirmas.jsp";
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		return nextPage;
	}

}
