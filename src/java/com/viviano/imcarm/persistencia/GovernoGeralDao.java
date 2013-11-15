package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.GovernoGeralBean;


public class GovernoGeralDao {
	private InterfaceConexao conexao;
	
	public GovernoGeralDao(){
		conexao = new Conexao();
	}
	
	public void gravaGovernoGeral(GovernoGeralBean governoGeralBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO governo_geral (madre_geral, vice_geral, economa_geral, id_congregacao) VALUES (?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDouble(1, governoGeralBean.getMadreGeral());
		ps.setDouble(2, governoGeralBean.getViceGeral());
		ps.setDouble(3, governoGeralBean.getEconomaGeral());
		ps.setInt(4, governoGeralBean.getCongregacao());
		
		ps.execute();
		ps.close();
		con.close();
	}
	
	public GovernoGeralBean getGovernoGeralBean(int idGovernoGeral) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM governo_geral WHERE id_governo = '" + idGovernoGeral + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		GovernoGeralBean governoGeralBean = new GovernoGeralBean();
		if (rs.next()){
			governoGeralBean.setIdGoverno(rs.getInt("id_governo"));
			governoGeralBean.setMadreGeral(rs.getDouble("madre_geral"));
			governoGeralBean.setViceGeral(rs.getDouble("vice_geral"));
			governoGeralBean.setEconomaGeral(rs.getDouble("economa_geral"));
			governoGeralBean.setIdCongregacao(rs.getInt("id_congregacao"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return governoGeralBean;
	}
	
	public List<GovernoGeralBean> getAllGovernoGeralBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM governo_geral";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<GovernoGeralBean> governos = new ArrayList<GovernoGeralBean>();
		while (rs.next()){
			GovernoGeralBean governoGeralBean = new GovernoGeralBean();
			governoGeralBean.setIdGoverno(rs.getInt("id_governo"));
			governoGeralBean.setMadreGeral(rs.getDouble("madre_geral"));
			governoGeralBean.setViceGeral(rs.getDouble("vice_geral"));
			governoGeralBean.setEconomaGeral(rs.getDouble("economa_geral"));
			governoGeralBean.setIdCongregacao(rs.getInt("id_congregacao"));
			governos.add(governoGeralBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return governos;
	}
	public void alteraGovernoGeral(int idGovernoGeral, GovernoGeralBean governoGeralBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE governo_geral SET id_governo = ?, madre_geral = ?, vice_geral = ?, economa_geral = ?, id_congregacao = ? WHERE id_governo = '" + idGovernoGeral + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, governoGeralBean.getIdGoverno());
		ps.setDouble(2, governoGeralBean.getMadreGeral());
		ps.setDouble(3, governoGeralBean.getViceGeral());
		ps.setDouble(4, governoGeralBean.getEconomaGeral());
		ps.setInt(5, governoGeralBean.getCongregacao());
		
		ps.executeUpdate();
		ps.close();
		con.close();
		
	}
	
	public void apagaGovernoGeral(int idGovernoGeral) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE * FROM governo_geral WHERE id_governo = '" + idGovernoGeral + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}

	/*
	 governo_geral
(
  id_governo serial NOT NULL,
  madre_geral double precision,
  vice_geral double precision,
  economa_geral double precision,
  id_congregacao integer,
	 */
}
