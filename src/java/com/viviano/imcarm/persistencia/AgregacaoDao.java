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
		String sql = "INSERT INTO agregacao (id_fraternidade, id_freira) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, agregacaoBean.getFraternidade());
		ps.setInt(2, agregacaoBean.getFreira());
		
		ps.execute();
		ps.close();
		con.close();
	}	
	
	
	public AgregacaoBean getAgregacao(Integer idFraternidade, Integer idFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM agregacao WHERE id_fraternidade = ? AND id_freira = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idFraternidade);
                stat.setInt(2, idFreira);
                ResultSet rs = stat.executeQuery();
		AgregacaoBean agregacaoBean = new AgregacaoBean();
		if (rs.next()){
			agregacaoBean.setFraternidade(rs.getInt("id_fraternidade"));
			agregacaoBean.setFreira(rs.getInt("id_freira"));
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return agregacaoBean;
	}
	
	public AgregacaoBean getAgregacaoFreira(Integer idFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM agregacao WHERE id_freira = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idFreira);
                ResultSet rs = stat.executeQuery();
		AgregacaoBean agregacaoBean = null;
		if (rs.next()){
			agregacaoBean = new AgregacaoBean();
			agregacaoBean.setFraternidade(rs.getInt("id_fraternidade"));
			agregacaoBean.setFreira(rs.getInt("id_freira"));
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
			agregacaoBean.setFraternidade(rs.getInt("id_fraternidade"));
			agregacaoBean.setFreira(rs.getInt("id_freira"));
			agregacoes.add(agregacaoBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return agregacoes;
	}
	
	public void alteraAgregacoes(Integer idFraternidade, Integer idFreira, AgregacaoBean agregacaoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE agregacao SET id_fraternidade = ?, id_freira = ? WHERE  id_fraternidade = ? AND id_freira = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, agregacaoBean.getFraternidade());
		ps.setInt(2, agregacaoBean.getFreira());
                ps.setInt(3, idFraternidade);
                ps.setInt(4, idFreira);
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaAgregacao(Integer idFraternidade, Integer idFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM agregacao WHERE id_fraternidade = ? AND id_freira = ?";
		PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idFraternidade);
                ps.setInt(2, idFreira);
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
