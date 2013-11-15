package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.FreiraEquipeBean;


public class FreiraEquipeDao {
	private InterfaceConexao conexao;

	public FreiraEquipeDao(){
		conexao = new Conexao();
	}
	
	public void gravaFreiraEquipe(FreiraEquipeBean freiraEquipeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO freira_equipe (cpf_freira, id_equipe, funcao) VALUES (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDouble(1, freiraEquipeBean.getFreira());
		ps.setInt(2, freiraEquipeBean.getEquipe());
		ps.setString(3, freiraEquipeBean.getFuncao());
		ps.execute();
		ps.close();
		con.close();
	}
	
	public FreiraEquipeBean getFreiraEquipeBean(double cpfFreira, int idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira_equipe WHERE cpf_freira = '" + cpfFreira + "' AND id_equipe = '" + idEquipe + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		FreiraEquipeBean freiraEquipeBean = new FreiraEquipeBean();
		if (rs.next()){
			freiraEquipeBean.setFreira(rs.getDouble("cpf_freira"));
			freiraEquipeBean.setEquipe(rs.getInt("id_equipe"));
			freiraEquipeBean.setFuncao(rs.getString("funcao"));
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return freiraEquipeBean;
	}
	
	
	public List<FreiraEquipeBean> getAllFreiraEquipeBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira_equipe";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<FreiraEquipeBean> freirasEquipe = new ArrayList<FreiraEquipeBean>();
		while (rs.next()){
			FreiraEquipeBean freiraEquipeBean = new FreiraEquipeBean();
			freiraEquipeBean.setFreira(rs.getDouble("cpf_freira"));
			freiraEquipeBean.setEquipe(rs.getInt("id_equipe"));
			freiraEquipeBean.setFuncao(rs.getString("funcao"));
			freirasEquipe.add(freiraEquipeBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return freirasEquipe;
	}
	
	public void alteraFreiraEquipeBean(double cpfFreira, int idEquipe, FreiraEquipeBean freiraEquipeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE freira_equipe SET cpf_freira = ?, id_equipe = ?, funcao = ? WHERE cpf_freira = '" + cpfFreira + "' AND id_equipe = '" + idEquipe + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDouble(1, freiraEquipeBean.getFreira());
		ps.setInt(2, freiraEquipeBean.getEquipe());
		ps.setString(3, freiraEquipeBean.getFuncao());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaFreiraEquipeBean(double cpfFreira, int idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM freira_equipe WHERE cpf_freira = '" + cpfFreira + "' AND id_equipe = '" + idEquipe + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	
	/*
	 * freira_equipe
	 cpf_freira double precision NOT NULL,
  id_equipe integer NOT NULL,
  funcao character varying(254)
	 */
}
