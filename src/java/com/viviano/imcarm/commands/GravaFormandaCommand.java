package com.viviano.imcarm.commands;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FormandaDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class GravaFormandaCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "";
		VerificaUsuario verificaUsuario = new VerificaUsuario();
		
FormandaBean formandaBean = new FormandaBean(request.getParameter("nome_civil"), request.getParameter("nome_pai"), request.getParameter("nome_mae"), request.getParameter("rua"), request.getParameter("bairro"), request.getParameter("cidade"), request.getParameter("uf"), request.getParameter("diocese"), request.getParameter("numero"));
		
		FormandaDao formandaDao = new FormandaDao();
		if (!formandaBean.getNome().isEmpty())
		try {
			formandaDao.gravaFormanda(formandaBean);
			List<FormandaBean> formandas = formandaDao.getAllFormandaBean();
			FormandaBean formandaBeanGravada = formandaDao.getFormandaBean(formandas.get(formandas.size() - 1).getIdFormanda());
			request.setAttribute("formandagravada", formandaBeanGravada);
			nextPage = "/cadastraformanda.jsp";
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		else{
			nextPage = "/erronomeformandanaoinformado.html";
		}
		return nextPage;
	}
	

}
