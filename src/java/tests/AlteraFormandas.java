package tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.persistencia.FormandaDao;



public class AlteraFormandas extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		FormandaDao formandaDao = new FormandaDao();
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
		try {
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/exibeformandas.jsp");
			formandas = formandaDao.getAllFormandaBean();
			request.setAttribute("formandas", formandas);
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
