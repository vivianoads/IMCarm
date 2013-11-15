package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.AgregacaoBean;



public class AgregacaoDao {

	private InterfaceConexao conexao;

	public AgregacaoDao() {
		conexao = new Conexao();
	}
	
	public void gravaAgregacao(AgregacaoBean agregacaoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO agregacao (id_fraternidade, cpf_freira) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, agregacaoBean.getFraternidade());
		ps.setDouble(2, agregacaoBean.getFreira());
		
		ps.execute();
		ps.close();
		con.close();
	}	
	
	
	public AgregacaoBean getAgregacao(int idFraternidade, double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM agregacao WHERE id_fraternidade = '" + idFraternidade + "' AND cpf_freira = '" + cpfFreira + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		AgregacaoBean agregacaoBean = new AgregacaoBean();
		if (rs.next()){
			agregacaoBean.setFraternidade(rs.getInt("id_fraternidade"));
			agregacaoBean.setFreira(rs.getDouble("cpf_freira"));
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return agregacaoBean;
	}
	
	public AgregacaoBean getAgregacaoFreira(double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM agregacao WHERE cpf_freira = '" + cpfFreira + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		AgregacaoBean agregacaoBean = null;
		if (rs.next()){
			agregacaoBean = new AgregacaoBean();
			agregacaoBean.setFraternidade(rs.getInt("id_fraternidade"));
			agregacaoBean.setFreira(rs.getDouble("cpf_freira"));
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return agregacaoBean;
	}
	
	public List<AgregacaoBean> getAllAgregacao() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM agregacao";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<AgregacaoBean> agregacoes = new ArrayList<AgregacaoBean>();
		
		while (rs.next()){
			AgregacaoBean agregacaoBean = new AgregacaoBean();
			agregacaoBean.setCongregacao(rs.getInt("id_congregacao"));
			agregacaoBean.setFraternidade(rs.getInt("id_fraternidade"));
			agregacaoBean.setFreira(rs.getDouble("cpf_freira"));
			agregacoes.add(agregacaoBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return agregacoes;
	}
	
	public void alteraAgregacoes(int idCongregacao, int idFraternidade, double cpfFreira, AgregacaoBean agregacaoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE agregacao SET id_congregacao = ?, id_fraternidade = ?, cpf_freira = ? WHERE  id_congregacao = '" + idCongregacao + "' AND id_fraternidade = '" + idFraternidade + "' AND cpf_freira = '" + cpfFreira + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, agregacaoBean.getCongregacao());
		ps.setInt(2, agregacaoBean.getFraternidade());
		ps.setDouble(3, agregacaoBean.getFreira());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaAgregacao(int idCongregacao, int idFraternidade, double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM agregacao WHERE  id_congregacao = '" + idCongregacao + "' AND id_fraternidade = '" + idFraternidade + "' AND cpf_freira = '" + cpfFreira + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
		
	}
	/*
	  id_congregacao integer,
  id_fraternidade integer,
  cpf_freira double precision,
	 */
}
