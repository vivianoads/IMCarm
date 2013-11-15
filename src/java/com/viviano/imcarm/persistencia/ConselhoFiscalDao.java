package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.ConselhoFiscalBean;


public class ConselhoFiscalDao {
	private InterfaceConexao conexao;
	
	public ConselhoFiscalDao(){
		conexao = new Conexao();
	}
	
	public void insereConselhoFiscal(ConselhoFiscalBean conselhoFiscalBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO conselho_fiscal (id_governo, cpf_freira) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, conselhoFiscalBean.getGovernoGeral());
		ps.setDouble(2, conselhoFiscalBean.getFreira());
		
		ps.execute();
		ps.close();
		con.close();
	}
	
	public ConselhoFiscalBean getConselhoFiscal(int idGoverno, double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM conselho_fiscal WHERE id_governo = '" + idGoverno + "AND cpf_freira = '" + cpfFreira + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		ConselhoFiscalBean conselhoFiscalBean = new ConselhoFiscalBean();
		if (rs.next()){
			conselhoFiscalBean.setGovernoGeral(rs.getInt("id_governo"));
			conselhoFiscalBean.setFreira(rs.getDouble("cpf_freira"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return conselhoFiscalBean;
	}

	public List<ConselhoFiscalBean> getAllConselhoFiscal() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM conselho_fiscal";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<ConselhoFiscalBean> conselhos = new ArrayList<ConselhoFiscalBean>();
		
		while (rs.next()){
			ConselhoFiscalBean conselhoFiscalBean = new ConselhoFiscalBean();
			conselhoFiscalBean.setGovernoGeral(rs.getInt("id_governo"));
			conselhoFiscalBean.setFreira(rs.getDouble("cpf_freira"));
			conselhos.add(conselhoFiscalBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return conselhos;
	}
	
	
	public void alteraConselhoFiscal(int idGoverno, double cpfFreira, ConselhoFiscalBean conselhoFiscalBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE conselho_fiscal WHERE id_governo = ?, cpf_freira = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, conselhoFiscalBean.getGovernoGeral());
		ps.setDouble(2, conselhoFiscalBean.getFreira());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaConselhoFiscal(int idGoverno, double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM conselho_fiscal WHERE id_governo = '" + idGoverno + "AND cpf_freira = '" + cpfFreira + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	/*
	   id_governo integer NOT NULL,
  cpf_freira double precision NOT NULL,
	 */
	 
	
}
