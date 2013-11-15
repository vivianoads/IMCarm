package com.viviano.imcarm.commands;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class GravaCasaDeMissaoCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		
		FraternidadeDao fraternidadeDao = new FraternidadeDao();
		
		String nextPage = "";
		
		String nome = request.getParameter("nome"); 
		String status = request.getParameter("status");
		String rua = request.getParameter("rua"); 
		String bairro = request.getParameter("bairro"); 
		String cidade = request.getParameter("cidade"); 
		String uf = request.getParameter("uf"); 
		String diocese = request.getParameter("diocese"); 
		String bispo = request.getParameter("bispo"); 
		String numeroCasa = request.getParameter("numero"); 
		String dataFundacao = request.getParameter("data_fundacao");
				
		FraternidadeBean fraternidadeBean = new FraternidadeBean();
		fraternidadeBean.setNome(nome);
		fraternidadeBean.setStatus(status);
		fraternidadeBean.setRua(rua);
		fraternidadeBean.setBairro(bairro);
		fraternidadeBean.setCidade(cidade);
		fraternidadeBean.setUf(uf);
		fraternidadeBean.setDiocese(diocese);
		fraternidadeBean.setBispo(bispo);
		fraternidadeBean.setNumeroCasa(numeroCasa);
		fraternidadeBean.setDataFundacao(dataFundacao);
		
		try {
			if((!fraternidadeBean.getNome().isEmpty()) || (fraternidadeDao.getFraternidadePorNome(nome) == null)){
				
				try {
					fraternidadeDao.gravaFraternidade(fraternidadeBean);
					List<FraternidadeBean> fraternidades = fraternidadeDao.getAllFraternidade();
					FraternidadeBean fraternidadeBeanGravada = fraternidadeDao.getFraternidade(fraternidades.get(fraternidades.size() - 1).getIdFraternidade());
					request.setAttribute("fraternidadebean", fraternidadeBeanGravada);
					nextPage = "/cadastracasasdemissao.jsp";
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			else{
				nextPage = "/erronomefraternidadenaoinformado.html";
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nextPage;
	}

}
