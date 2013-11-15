package tests;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;



public class SalvaAlteracoesCasasDeMissao extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		String acao = request.getParameter("acao");
		int id = new Integer(request.getParameter("dados"));
		
		if(acao.equalsIgnoreCase("alterar")){
			FraternidadeDao fraternidadeDao = new FraternidadeDao();
			FraternidadeBean fraternidadeBean = new FraternidadeBean();
			try {
				fraternidadeBean = fraternidadeDao.getFraternidade(id);
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/formalteradadosfraternidade.jsp");
				request.setAttribute("fraternidade", fraternidadeBean);
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
		else if(acao.equalsIgnoreCase("salvar")){
			FraternidadeBean fraternidadeBean = new FraternidadeBean(request.getParameter("nome"), request.getParameter("status"), request.getParameter("rua"), request.getParameter("bairro"), request.getParameter("cidade"), request.getParameter("uf"), request.getParameter("diocese"), request.getParameter("bispo"), request.getParameter("numero"), request.getParameter("data_fundacao"));
			FraternidadeDao fraternidadeDao = new FraternidadeDao();
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastracasasdemissao.jsp");
			request.setAttribute("id", id);
			request.setAttribute("fraternidadebean", fraternidadeBean);
			
			try {
				fraternidadeDao.alteraFraternidade(id, fraternidadeBean);
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
			FraternidadeDao fraternidadeDao = new FraternidadeDao();
			try {
				fraternidadeDao.apagaFraternidade(id);
				response.sendRedirect("/ImCarm/cadastrodecasasdemissao.jsp");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			FraternidadeBean fraternidadeBean = new FraternidadeBean();
			FraternidadeDao fraternidadeDao = new FraternidadeDao();
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastracasasdemissao.jsp");
			
			
			try {
				fraternidadeBean = fraternidadeDao.getFraternidade(id);
				request.setAttribute("fraternidadebean", fraternidadeBean);
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
