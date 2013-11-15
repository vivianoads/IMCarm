package com.viviano.imcarm.commands;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class SalvaAlteracoesCasasDeMissaoCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "";
		
		String acao = request.getParameter("acao");
		int id = new Integer(request.getParameter("dados"));
		
		if(acao.equalsIgnoreCase("alterar")){
			FraternidadeDao fraternidadeDao = new FraternidadeDao();
			FraternidadeBean fraternidadeBean = new FraternidadeBean();
			try {
				fraternidadeBean = fraternidadeDao.getFraternidade(id);
				nextPage = "/formalteradadosfraternidade.jsp";
				request.setAttribute("fraternidade", fraternidadeBean);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
		}
		else if(acao.equalsIgnoreCase("salvar")){
			FraternidadeBean fraternidadeBean = new FraternidadeBean(request.getParameter("nome"), request.getParameter("status"), request.getParameter("rua"), request.getParameter("bairro"), request.getParameter("cidade"), request.getParameter("uf"), request.getParameter("diocese"), request.getParameter("bispo"), request.getParameter("numero"), request.getParameter("data_fundacao"));
			FraternidadeDao fraternidadeDao = new FraternidadeDao();
			nextPage = "/cadastracasasdemissao.jsp";
			fraternidadeBean.setIdFraternidade(id);
			request.setAttribute("fraternidadebean", fraternidadeBean);
			
			try {
				fraternidadeDao.alteraFraternidade(id, fraternidadeBean);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			
		}
		else if(acao.equalsIgnoreCase("apagarfinal")){
			FraternidadeDao fraternidadeDao = new FraternidadeDao();
			try {
				fraternidadeDao.apagaFraternidade(id);
				nextPage = "/casasdemissaoapagadacomsucesso.jsp";
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		else{
			FraternidadeBean fraternidadeBean = new FraternidadeBean();
			FraternidadeDao fraternidadeDao = new FraternidadeDao();
			nextPage = "/cadastracasasdemissao.jsp";
			
			
			try {
				fraternidadeBean = fraternidadeDao.getFraternidade(id);
				request.setAttribute("fraternidadebean", fraternidadeBean);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			
		}
		return nextPage;
	}

}
