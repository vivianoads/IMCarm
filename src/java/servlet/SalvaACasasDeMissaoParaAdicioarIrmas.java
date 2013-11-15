package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SalvaACasasDeMissaoParaAdicioarIrmas extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		int idfraternidade = new Integer(request.getParameter("dados"));
		request.getSession().setAttribute("fraternidadeaadicionarirmas", idfraternidade);
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/ExibeIrmasParaAdicionarACasaDeMissao");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
