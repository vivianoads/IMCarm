package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.MembrosEquipeFormandaBean;


public class MembrosEquipeFormandaDao {
	private InterfaceConexao conexao;
	
	public MembrosEquipeFormandaDao(){
		conexao = new Conexao();
	}
	
	public void gravaMembrosEquipeFormanda(MembrosEquipeFormandaBean membrosEquipeFormandaBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO membros_equipe_formanda (id_equipe, id_formanda) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, membrosEquipeFormandaBean.getEquipe());
		ps.setInt(2, membrosEquipeFormandaBean.getFormanda());
		
		ps.execute();
		ps.close();
		con.close();
	}
	
	public MembrosEquipeFormandaBean getMembrosEquipeFormandaBean(int idEquipe, int idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM membros_equipe_formanda WHERE id_equipe = '" + idEquipe + "' AND id_formanda = '" + idFormanda + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		MembrosEquipeFormandaBean membrosEquipeFormandaBean = new MembrosEquipeFormandaBean();
		if (rs.next()){
			membrosEquipeFormandaBean.setEquipe(rs.getInt("id_equipe"));
			membrosEquipeFormandaBean.setFormanda(rs.getInt("id_formanda"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return membrosEquipeFormandaBean;
		
	}
	
	public List<MembrosEquipeFormandaBean> getAllMembrosEquipeFormandaBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM membros_equipe_formanda";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<MembrosEquipeFormandaBean> membros = new ArrayList<MembrosEquipeFormandaBean>();
		if (rs.next()){
			MembrosEquipeFormandaBean membrosEquipeFormandaBean = new MembrosEquipeFormandaBean();
			membrosEquipeFormandaBean.setEquipe(rs.getInt("id_equipe"));
			membrosEquipeFormandaBean.setFormanda(rs.getInt("id_formanda"));
			membros.add(membrosEquipeFormandaBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return membros;
		
	}
	
	public void alteraMembrosEquipeFormanda(int idEquipe, int idFormanda, MembrosEquipeFormandaBean membrosEquipeFormandaBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE membros_equipe_formanda SET id_equipe = ?, id_formanda = ? WHERE id_equipe = '" + idEquipe + "' AND id_formanda = '" + idFormanda + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, membrosEquipeFormandaBean.getEquipe());
		ps.setInt(2, membrosEquipeFormandaBean.getFormanda());
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaMembrosEquipeFormanda(int idEquipe, int idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM membros_equipe_formanda WHERE id_equipe = '" + idEquipe + "' AND id_formanda = '" + idFormanda + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}

	
	/*
	 membros_equipe_formanda
(
  id_equipe integer NOT NULL,
  id_formanda integer NOT NULL
	 */
}
