package tests;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.persistencia.FormandaDao;



public class SalvaAlteracoesFormanda extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String acao = request.getParameter("acao");
		Integer dados = new Integer(request.getParameter("dados"));
		FormandaDao formandaDao = new FormandaDao();
		
		if(acao.equalsIgnoreCase("alterar")){
		try {
			FormandaBean formandaBean = formandaDao.getFormandaBean(dados);
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/formalteradadosformanda.jsp");
			request.setAttribute("formanda", formandaBean);
			try {
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		}
		
		else if(acao.equalsIgnoreCase("apagar")){
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastraformanda.jsp");
			FormandaBean formandaBean;
			try {
				formandaBean = formandaDao.getFormandaBean(dados);
				request.setAttribute("formandagravada", formandaBean);
				dispatcher.forward(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if(acao.equalsIgnoreCase("apagarfinal")){
			try {
				formandaDao.apagaFormandaBean(dados);
				response.sendRedirect("/ImCarm/cadastrodeformandas.jsp");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else if (acao.equalsIgnoreCase("salvar")) {
			FormandaBean formandaBean = new FormandaBean(dados, request.getParameter("numero"), request.getParameter("nome_civil"), request.getParameter("nome_pai"), request.getParameter("nome_mae"), request.getParameter("rua"), request.getParameter("bairro"), request.getParameter("cidade"), request.getParameter("uf"), request.getParameter("diocese"));
			                            
			try {
				formandaDao.alteraFormanda(dados, formandaBean);
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastraformanda.jsp");
				request.setAttribute("formandagravada", formandaBean);
				dispatcher.forward(request, response);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
