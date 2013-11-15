package tests;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FreiraDao;



public class AlteraIrma extends HttpServlet{
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
		String opcao = request.getParameter("tipo_consulta");
		String acao = request.getParameter("acao");
		FreiraDao freiraDao = new FreiraDao();
		if (opcao.equalsIgnoreCase("cpf")){
			double cpf = new Double(request.getParameter("dados"));
			
			try {
				
				FreiraBean freiraAux = freiraDao.getFreiraBean(cpf);
				
				if((cpf == 0)||(freiraAux == null)){
					response.sendRedirect("/ImCarm/errousuarionaoencontrado.html");
				}
				else{
					
					if(acao.equalsIgnoreCase("apagar")){
						RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastrairma.jsp");
						request.setAttribute("irmagravar", freiraAux);
						try {
							dispatcher.forward(request, response);
						} catch (ServletException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					else{
					RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/formalteradadosirma.jsp");
					request.setAttribute("freiracpf", freiraAux);
					try {
						dispatcher.forward(request, response);
					} catch (ServletException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
				}
			} catch (ClassNotFoundException e) {
				response.sendRedirect("/ImCarm/errousuarionaoencontrado.html");
			} catch (SQLException e) {
				response.sendRedirect("/ImCarm/errousuarionaoencontrado.html");
				
			}
			
		}
		else{
			String dados = request.getParameter("dados");
			try {
				List<FreiraBean> freiras = freiraDao.getAllFreiraBean();
				request.setAttribute("freiras", freiras);
				RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/exibeirmas.jsp");
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
		
		
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>Teste</title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<p>Tipo da Consulta: " + opcao + "</p>");
//		out.println("</body>");
//		out.println("</html>");
	}

}
