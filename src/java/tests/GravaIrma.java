package tests;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FreiraDao;



public class GravaIrma extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		FreiraBean freiraBean = new FreiraBean(new Double(request.getParameter("cpf")), new Double(request.getParameter("rg")), request.getParameter("nome_civil"), request.getParameter("nome_religioso"), request.getParameter("nome_pai"), request.getParameter("nome_mae"), request.getParameter("data_nascimento"), request.getParameter("data_aspirantado"), request.getParameter("data_postulantado"), request.getParameter("data_noviciado"), request.getParameter("data_profissao_temporaria"), request.getParameter("data_profissao_perpetua"));
		FreiraDao freiraDao = new FreiraDao();
		String mensagemDeErro = new String();
		
		try {
			if(freiraDao.getFreiraBean(freiraBean.getCpf()) == null){
				
				freiraDao.gravaFreira(freiraBean);
				FreiraBean freiraBeanaux = freiraDao.getFreiraBean(freiraBean.getCpf());
				request.setAttribute("irmagravar", freiraBeanaux);
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastrairma.jsp");
				try {
					dispatcher.forward(request, response);
				} catch (ServletException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			else{
				response.sendRedirect("/ImCarm/errousuarioduplicado.html");
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
//		Date x = new Date(request.getParameter("data_nascimento"));
//		String y = request.getParameter("data_nascimento");
//		new Date(request.getParameter("data_nascimento"));
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Teste</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<p>Data " + request.getParameter("data_nascimento") + " y =" + y + "</p>");
//		out.println("</body>");
//		out.println("</html>");
		
		
	}

}
