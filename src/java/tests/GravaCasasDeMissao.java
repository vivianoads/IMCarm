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



public class GravaCasasDeMissao extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		FraternidadeBean fraternidadeBean = new FraternidadeBean(request.getParameter("nome"), request.getParameter("status"), request.getParameter("rua"), request.getParameter("bairro"), request.getParameter("cidade"), request.getParameter("uf"), request.getParameter("diocese"), request.getParameter("bispo"), request.getParameter("numero"), request.getParameter("data_fundacao"));
		FraternidadeDao fraternidadeDao = new FraternidadeDao();
		
		if(!fraternidadeBean.getNome().isEmpty()){
			try {
				fraternidadeDao.gravaFraternidade(fraternidadeBean);
				request.setAttribute("fraternidadebean", fraternidadeBean);
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastracasasdemissao.jsp");
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
		else{
			response.sendRedirect("/ImCarm/erronomefraternidadenaoinformado.html");
		}
	}

}
