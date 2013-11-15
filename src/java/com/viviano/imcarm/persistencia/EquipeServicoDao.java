package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.EquipeServicoBean;


public class EquipeServicoDao {
	
	private InterfaceConexao conexao;
	
	public EquipeServicoDao(){
		conexao = new Conexao();
	}
	
	public void gravaEquipeServico(EquipeServicoBean equipeServicoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO equipe_servico (coordenadora, nome character, id_governo) VALUES (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDouble(1, equipeServicoBean.getCoordenadora());
		ps.setString(2, equipeServicoBean.getNome());
		ps.setInt(3, equipeServicoBean.getgovernoGeral());
		
		ps.execute();
		ps.close();
		con.close();
	}
	
	public EquipeServicoBean getEquipeServicoBean(int idEquipeServico) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM equipe_servico WHERE id_equipe = '" + idEquipeServico + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		EquipeServicoBean equipeServicoBean = new EquipeServicoBean();
		if (rs.next()){
			equipeServicoBean.setIdEquipe(rs.getInt("id_equipe"));
			equipeServicoBean.setCoordenadora(rs.getDouble("coordenadora"));
			equipeServicoBean.setNome(rs.getString("nome"));
			equipeServicoBean.setIdGoverno(rs.getInt("id_governo"));
		}
		
		rs.close();
		rs.close();
		con.close();
		
		return equipeServicoBean;
	}
	
	public List<EquipeServicoBean> getAllEquipeServicoBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM equipe_servico";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<EquipeServicoBean> equipes = new ArrayList<EquipeServicoBean>();
		if (rs.next()){
			EquipeServicoBean equipeServicoBean = new EquipeServicoBean();
			equipeServicoBean.setIdEquipe(rs.getInt("id_equipe"));
			equipeServicoBean.setCoordenadora(rs.getDouble("coordenadora"));
			equipeServicoBean.setNome(rs.getString("nome"));
			equipeServicoBean.setIdGoverno(rs.getInt("id_governo"));
			equipes.add(equipeServicoBean);
		}
		
		rs.close();
		rs.close();
		con.close();
		
		return equipes;
	}
	
	public void alteraEquipeServico(int idEquipe, EquipeServicoBean equipeServicoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE FROM equipe_servico SET id_equipe = ?, coordenadora = ?, nome = ?, id_governo = ? WHERE id_equipe ='" + idEquipe + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, equipeServicoBean.getIdEquipe());
		ps.setDouble(2, equipeServicoBean.getCoordenadora());
		ps.setString(3, equipeServicoBean.getNome());
		ps.setInt(4, equipeServicoBean.getIdEquipe());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaEquipeServico(int idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM equipe_servico WHERE id_equipe ='" + idEquipe + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	/*
	 equipe_servico
	(
	  id_equipe serial NOT NULL,
	  coordenadora double precision,
	  nome character varying(254),
	  id_governo integer,
	 */

}
