package tests;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.FormandaBean;
import com.viviano.imcarm.persistencia.FormandaDao;



public class GravaFormanda extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
//		FormandaBean formandaBean = new FormandaBean(request.getParameter("nome_civil"), request.getParameter("nome_pai"), request.getParameter("nome_mae"), request.getParameter("rua"), request.getParameter("bairro"), request.getParameter("cidade"), request.getParameter("uf"), request.getParameter("diocese"), request.getParameter("numero"));
		
		FormandaDao formandaDao = new FormandaDao();
//		if (!formandaBean.getNome().isEmpty()){
//		PrintWriter out = response.getWriter();
//		try {
//			formandaDao.gravaFormanda(formandaBean);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Teste</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<p>Data " + formandaBean.getNome() + "</p>");
//		out.println("</body>");
//		out.println("</html>");
//		}
//		if (!formandaBean.getNome().isEmpty())
//		try {
//			formandaDao.gravaFormanda(formandaBean);
//			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastraformanda.jsp");
//			request.setAttribute("formandagravada", formandaBean);
//			dispatcher.forward(request, response);
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ServletException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		else{
//			response.sendRedirect("/ImCarm/erronomeformandanaoinformado.html");
//		}
	}

}
