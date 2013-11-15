package com.viviano.imcarm.persistencia;

import java.lang.Thread.State;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.FormacaoBean;


public class FormacaoDao {
	
	private InterfaceConexao conexao;
	
	public FormacaoDao(){
		conexao = new Conexao();	
	}
	
	public void gravaFormacao(FormacaoBean formacaoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO formacao (id_congregacao, id_fase, id_formanda, data_entrada, data_saida) VALUES (?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, formacaoBean.getCongregacao());
		ps.setInt(2, formacaoBean.getFase());
		ps.setInt(3, formacaoBean.getFormanda());
		ps.setDate(4, new Date(formacaoBean.getDataEntrada().getTime()));
		ps.setDate(5, new Date(formacaoBean.getDataSaida().getTime()));
		
		ps.execute();
		ps.close();
		con.close();
	}
	
	public FormacaoBean getFormacao(int idcongregacao, int idFase, int idFormanda) throws ClassNotFoundException, SQLException{
	
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formacao WHERE id_congregacao = '" + idcongregacao + " AND id_fase = '" + idFase + "AND id_formanda = '" + idFormanda + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		FormacaoBean formacaoBean = new FormacaoBean();
		if (rs.next()){
			formacaoBean.setCongregacao(rs.getInt("id_congregacao"));
			formacaoBean.setFase(rs.getInt("id_fase"));
			formacaoBean.setFormanda(rs.getInt("id_formanda"));
			formacaoBean.setDataEntrada(rs.getDate("data_entrada"));
			formacaoBean.setDataSaida(rs.getDate("data_saida"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return formacaoBean;
	}
	
	public List<FormacaoBean> getAllFormacao() throws ClassNotFoundException, SQLException{
		
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formacao";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<FormacaoBean> formacoes = new ArrayList<FormacaoBean>();
		if (rs.next()){
			FormacaoBean formacaoBean = new FormacaoBean();
			formacaoBean.setCongregacao(rs.getInt("id_congregacao"));
			formacaoBean.setFase(rs.getInt("id_fase"));
			formacaoBean.setFormanda(rs.getInt("id_formanda"));
			formacaoBean.setDataEntrada(rs.getDate("data_entrada"));
			formacaoBean.setDataSaida(rs.getDate("data_saida"));
			formacoes.add(formacaoBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return formacoes;
	}
	
	public void alteraFormacao(int idcongregacao, int idFase, int idFormanda, FormacaoBean formacaoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE formacao WHERE id_congregacao = '" + idcongregacao + " AND id_fase = '" + idFase + "AND id_formanda = '" + idFormanda + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, formacaoBean.getCongregacao());
		ps.setInt(2, formacaoBean.getFase());
		ps.setInt(3, formacaoBean.getFormanda());
		ps.setDate(4, new Date(formacaoBean.getDataEntrada().getTime()));
		ps.setDate(5, new Date(formacaoBean.getDataSaida().getTime()));
		
		ps.executeUpdate();
		ps.close();
		con.close();
		
		
	}
	
	
	public void apagaFormacao(int idcongregacao, int idFase, int idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM formacao WHERE id_congregacao = '" + idcongregacao + " AND id_fase = '" + idFase + "AND id_formanda = '" + idFormanda + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	/*
	 id_congregacao integer NOT NULL,
  id_fase integer NOT NULL,
  id_formanda integer NOT NULL,
  data_entrada date,
  data_saida date,
	 */

}
