package servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;



public class ExibeCasasDeMissaoParaAdicionarIrmas extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		FraternidadeDao fraternidadeDao = new FraternidadeDao();
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/exibecasasdemissaoparaadicionarirmas.jsp");
		List<FraternidadeBean> fraternidades = new ArrayList<FraternidadeBean>();
		try {
			fraternidades = fraternidadeDao.getAllFraternidade();
			request.setAttribute("fraternidades", fraternidades);
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
