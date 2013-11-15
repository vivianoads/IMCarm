package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.ResidenciaFraternidadeBean;


public class ResidenciaFraternidadeDao {
	private InterfaceConexao conexao;
	
	public ResidenciaFraternidadeDao(){
	
		conexao = new Conexao();
	}
	
	public void gravaResidenciaFraternidade(ResidenciaFraternidadeBean residenciaFraternidadeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO residencia_fraternidade (id_fraternidade, cpf_freira, atividade, data_entrada, data_saida) VALUES(?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, residenciaFraternidadeBean.getFraternidade());
		ps.setDouble(2, residenciaFraternidadeBean.getFreira());
		ps.setString(3, residenciaFraternidadeBean.getAtividade());
		ps.setDate(4, new Date(residenciaFraternidadeBean.getDataEntrada().getTime()));
		ps.setDate(5, new Date(residenciaFraternidadeBean.getDataSaida().getTime()));
		
		ps.execute();
		ps.close();
		con.close();
		
	}
	
	public ResidenciaFraternidadeBean getResidenciaFraternidadeBean(int idFraternidade, double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM residencia_fraternidade WHERE id_fraternidade = '" + idFraternidade + "' AND cpf_freira = '" + cpfFreira + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		ResidenciaFraternidadeBean residenciaFraternidadeBean = new ResidenciaFraternidadeBean();
		if (rs.next()){
			residenciaFraternidadeBean.setFraternidade(rs.getInt("id_fraternidade"));
			residenciaFraternidadeBean.setFreira(rs.getDouble("cpf_freira"));
			residenciaFraternidadeBean.setAtividade(rs.getString("atividade"));
			residenciaFraternidadeBean.setStatus(rs.getString("status"));
			residenciaFraternidadeBean.setDataEntrada(rs.getDate("data_entrada"));
			residenciaFraternidadeBean.setDataSaida(rs.getDate("data_saida"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return residenciaFraternidadeBean;
	}
	
	
	public List<ResidenciaFraternidadeBean> getAllResidenciaFraternidadeBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM residencia_fraternidade";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<ResidenciaFraternidadeBean> residencias = new ArrayList<ResidenciaFraternidadeBean>();
		if (rs.next()){
			ResidenciaFraternidadeBean residenciaFraternidadeBean = new ResidenciaFraternidadeBean();
			residenciaFraternidadeBean.setFraternidade(rs.getInt("id_fraternidade"));
			residenciaFraternidadeBean.setFreira(rs.getDouble("cpf_freira"));
			residenciaFraternidadeBean.setAtividade(rs.getString("atividade"));
			residenciaFraternidadeBean.setStatus(rs.getString("status"));
			residenciaFraternidadeBean.setDataEntrada(rs.getDate("data_entrada"));
			residenciaFraternidadeBean.setDataSaida(rs.getDate("data_saida"));
			residencias.add(residenciaFraternidadeBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return residencias;
	}
	
	public void alteraResidenciaFraternidadeBean(int idFraternidade, double cpfFreira, ResidenciaFraternidadeBean residenciaFraternidadeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE residencia_fraternidade SET id_fraternidade = ?, cpf_freira = ?, atividade = ?, status = ?, data_entrada = ?, data_saida = ? WHERE id_fraternidade = '" + idFraternidade + "' AND cpf_freira = '" + cpfFreira + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, residenciaFraternidadeBean.getFraternidade());
		ps.setDouble(2, residenciaFraternidadeBean.getFreira());
		ps.setString(3, residenciaFraternidadeBean.getAtividade());
		ps.setString(4, residenciaFraternidadeBean.getStatus());
		ps.setDate(5, new Date(residenciaFraternidadeBean.getDataEntrada().getTime()));
		ps.setDate(6, new Date(residenciaFraternidadeBean.getDataSaida().getTime()));
		
		ps.executeUpdate();
		ps.close();
		con.close();
		

	}
	
	public void apagaResidenciaFraternidadeBean(int idFraternidade, double cpfFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM residencia_fraternidade WHERE id_fraternidade = '" + idFraternidade + "' AND cpf_freira = '" + cpfFreira + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	/*
	 residencia_fraternidade
(
  id_fraternidade integer NOT NULL,
  cpf_freira double precision NOT NULL,
  atividade character varying(254),
  status character varying DEFAULT 'ativa'::character varying,
  data_entrada date,
  data_saida date,
	 */
}

