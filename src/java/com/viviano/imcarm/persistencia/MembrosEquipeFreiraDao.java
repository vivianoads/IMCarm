package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.MembrosEquipeFreiraBean;


public class MembrosEquipeFreiraDao {
	private InterfaceConexao conexao;
	
	public MembrosEquipeFreiraDao(){
		conexao = new Conexao();
	}
	
	public void gravaMembrosEquipeFreira(MembrosEquipeFreiraBean membrosEquipeFreiraBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO membros_equipe_freira (id_equipe, cpf_freira) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, membrosEquipeFreiraBean.getEquipe());
		ps.setDouble(2, membrosEquipeFreiraBean.getFreira());
		ps.execute();
		ps.close();
		con.close();
	}
	
	public MembrosEquipeFreiraBean getMembrosEquipeFreiraBean(int idEquipe, double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM membros_equipe_freira WHERE id_equipe = '" + idEquipe + "' AND cpf_freira = '" + cpfFreira + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		MembrosEquipeFreiraBean membrosEquipeFreiraBean = new MembrosEquipeFreiraBean();
		if (rs.next()){
			membrosEquipeFreiraBean.setEquipe(rs.getInt("id_equipe"));
			membrosEquipeFreiraBean.setFreira(rs.getDouble("cpf_freira"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return membrosEquipeFreiraBean;
	}
	
	
	public List<MembrosEquipeFreiraBean> getAllMembrosEquipeFreiraBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM membros_equipe_freira";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<MembrosEquipeFreiraBean> membros = new ArrayList<MembrosEquipeFreiraBean>();
		if (rs.next()){
			MembrosEquipeFreiraBean membrosEquipeFreiraBean = new MembrosEquipeFreiraBean();
			membrosEquipeFreiraBean.setEquipe(rs.getInt("id_equipe"));
			membrosEquipeFreiraBean.setFreira(rs.getDouble("cpf_freira"));
			membros.add(membrosEquipeFreiraBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return membros;
	}
	
	public void alteraMembrosEquipeFreiraBean(int idEquipe, double cpfFreira, MembrosEquipeFreiraBean membrosEquipeFreiraBean) throws ClassNotFoundException, SQLException{
		Connection con  = conexao.getConnection();
		String sql = "UPDATE membros_equipe_freira SET id_equipe = ?, cpf_freira = ? WHERE id_equipe = '" + idEquipe + "' AND cpf_freira = '" + cpfFreira + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, membrosEquipeFreiraBean.getEquipe());
		ps.setDouble(2, membrosEquipeFreiraBean.getFreira());
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaMembrosEquipeFreiraBean(int idEquipe, double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM membros_equipe_freira WHERE id_equipe = '" + idEquipe + "' AND cpf_freira = '" + cpfFreira + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	/*
	 membros_equipe_freira
(
  id_equipe integer NOT NULL,
  cpf_freira double precision NOT NULL,
	 */

}
