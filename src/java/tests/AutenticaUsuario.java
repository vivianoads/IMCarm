package tests;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.LoginDao;

public class AutenticaUsuario extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
//		LoginBean loginBean = new LoginBean(request.getParameter("usuario"), request.getParameter("senha"));
//		LoginDao loginDao = new LoginDao();
//		String mensagemDeErro = new String();
//		LoginBean loginBean2 = new LoginBean();
//				
//		try {
//			loginBean2 = loginDao.getLoginBean(loginBean.getLoginFreira(), loginBean.getSenha());
//			if (loginBean2 != null){
//				request.getSession().setAttribute("usuarioLogado", loginBean2);
//				response.sendRedirect("/ImCarm/usuariologado.jsp");
//			}
//			else{response.sendRedirect("/ImCarm/errologin.html");
//			
//			}
//		} catch (SQLException e) {
//			response.sendRedirect("/ImCarm/erro.html");
//		}
		
		
		
	}

}
