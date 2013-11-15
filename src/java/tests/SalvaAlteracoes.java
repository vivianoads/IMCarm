package tests;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.persistencia.FreiraDao;



public class SalvaAlteracoes extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		Double cpf = new Double(request.getParameter("cpforigem"));
		String acao = request.getParameter("acao");
		FreiraDao freiraDao = new FreiraDao();
		
		if (acao.equalsIgnoreCase("apagar")){
			try {
				freiraDao.apagaFreira(cpf);
				response.sendRedirect("/ImCarm/cadastrodeirmas.jsp");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
		FreiraBean freiraBean = new FreiraBean(new Double(request.getParameter("cpf")), new Double(request.getParameter("rg")), request.getParameter("nome_civil"), request.getParameter("nome_religioso"), request.getParameter("nome_pai"), request.getParameter("nome_mae"), request.getParameter("data_nascimento"), request.getParameter("data_aspirantado"), request.getParameter("data_postulantado"), request.getParameter("data_noviciado"), request.getParameter("data_profissao_temporaria"), request.getParameter("data_profissao_perpetua"));
		
		try {
			freiraDao.alteraFreira(cpf, freiraBean);
			request.setAttribute("irmagravar", freiraBean);
			RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/cadastrairma.jsp");
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
