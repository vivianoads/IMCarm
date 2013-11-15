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

import com.viviano.imcarm.entidades.AgregacaoBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.persistencia.AgregacaoDao;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.persistencia.FreiraDao;



public class SalvarIrmasParaAdicioarACasasDeMissao extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
	 String[] irmas = request.getParameterValues("irmas");
         Integer id = (Integer) request.getSession().getAttribute("fraternidadeaadicionarirmas");
	 request.getSession().setAttribute("irmas", irmas);
	 AgregacaoDao agregacaoDao = new AgregacaoDao();
	 AgregacaoBean agregacaoBean = new AgregacaoBean();
	 FraternidadeDao fraternidadeDao = new FraternidadeDao();
	 FraternidadeBean fraternidadeBean = new FraternidadeBean();
	 List<AgregacaoBean> agregacoesPossiveis = new ArrayList<AgregacaoBean>();
	 List<AgregacaoBean> agregacoesImpossiveis = new ArrayList<AgregacaoBean>();
	 List<String> nomeIrmas = new ArrayList<String>();
	 FreiraDao freiraDao = new FreiraDao();
	 try {
		fraternidadeBean = fraternidadeDao.getFraternidade(id);
	} catch (ClassNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	} catch (SQLException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	 for(int i = 0; i < irmas.length; i++){
		 agregacaoBean.setFraternidade(id);
		 agregacaoBean.setFreira(new Double(irmas[i]));		 
		 try {
			if (agregacaoDao.getAgregacaoFreira(agregacaoBean.getFreira()) == null){
				agregacoesPossiveis.add(agregacaoBean);
			 }
			
			else{
				agregacoesImpossiveis.add(agregacaoBean); 
			 }
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		 		 
	 }
//	 for(int i = 0; i < irmas.length; i++){
//		 agregacaoBean.setFraternidade(id);
//		 agregacaoBean.setFreira(new Double(irmas[i]));	
	 
	if(agregacoesImpossiveis.isEmpty()){
		
		try {
			for (int i = 0; i < agregacoesPossiveis.size();i++){
			agregacaoDao.gravaAgregacao(agregacoesPossiveis.get(i));
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	else {
		
		try {for (int i = 0; i < agregacoesPossiveis.size();i++){
			agregacaoDao.gravaAgregacao(agregacoesPossiveis.get(i));
			nomeIrmas.add(freiraDao.getFreiraBean(agregacoesPossiveis.get(i).getFreira()).getNomeCivil());
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/irmasadicionadascomsucesso.jsp");
	String casa = fraternidadeBean.getNome();
	request.setAttribute("casa", casa);
	request.setAttribute("nomes", nomeIrmas);
	try {
		dispatcher.forward(request, response);
	} catch (ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	 }
	}

