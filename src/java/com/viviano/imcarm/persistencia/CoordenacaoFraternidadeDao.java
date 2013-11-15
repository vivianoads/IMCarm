package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.CoordenacaoFraternidadeBean;


public class CoordenacaoFraternidadeDao {

	private InterfaceConexao conexao;
	
	public CoordenacaoFraternidadeDao(){
		conexao = new Conexao();
	}
	
	public void gravaCoordenacaoFraternidade(CoordenacaoFraternidadeBean coordenacaoFraternidadeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO coordenacao_fraternidade (coordenadora,  tesoureira, secretaria, data_inicio, data_termino, id_fraternidade) VALUES (?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDouble(1, coordenacaoFraternidadeBean.getCpfCoordenadora());
		ps.setDouble(2, coordenacaoFraternidadeBean.getCpfTesoureira());
		ps.setDouble(3, coordenacaoFraternidadeBean.getCpfSecretaria());
		ps.setDate(4, new Date(coordenacaoFraternidadeBean.getDataInicio().getTime()));
		ps.setDate(5, new Date(coordenacaoFraternidadeBean.getDataTermino().getTime()));
		ps.setInt(6, coordenacaoFraternidadeBean.getIdFraternidade());
		
		ps.execute();
		ps.close();
		con.close();
	}
	
	public CoordenacaoFraternidadeBean getCoordenacaoFraternidadeBean(int idCoordenacaoFraternidade) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM coordenacao_fraternidade WHERE id_coordenacao = '" + idCoordenacaoFraternidade + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		CoordenacaoFraternidadeBean coordenacaoFraternidadeBean = new CoordenacaoFraternidadeBean();
		if (rs.next()){
			coordenacaoFraternidadeBean.setIdCoordenacao(rs.getInt("id_coordenacao"));
			coordenacaoFraternidadeBean.setCpfCoordenadora(rs.getDouble("coordenadora"));
			coordenacaoFraternidadeBean.setCpfTesoureira(rs.getDouble("tesoureira"));
			coordenacaoFraternidadeBean.setCpfSecretaria(rs.getDouble("secretaria"));
			coordenacaoFraternidadeBean.setDataInicio(rs.getDate("data_inicio"));
			coordenacaoFraternidadeBean.setDataTermino(rs.getDate("data_termino"));
			coordenacaoFraternidadeBean.setIdFraternidade(rs.getInt("id_fraternidade"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return coordenacaoFraternidadeBean;
	}
	public List<CoordenacaoFraternidadeBean> getAllCoordenacaoFraternidadeBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM coordenacao_fraternidade";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<CoordenacaoFraternidadeBean> coordenacoes = new ArrayList<CoordenacaoFraternidadeBean>();
		while (rs.next()){
			CoordenacaoFraternidadeBean coordenacaoFraternidadeBean = new CoordenacaoFraternidadeBean();
			coordenacaoFraternidadeBean.setIdCoordenacao(rs.getInt("id_coordenacao"));
			coordenacaoFraternidadeBean.setCpfCoordenadora(rs.getDouble("coordenadora"));
			coordenacaoFraternidadeBean.setCpfTesoureira(rs.getDouble("tesoureira"));
			coordenacaoFraternidadeBean.setCpfSecretaria(rs.getDouble("secretaria"));
			coordenacaoFraternidadeBean.setDataInicio(rs.getDate("data_inicio"));
			coordenacaoFraternidadeBean.setDataTermino(rs.getDate("data_termino"));
			coordenacaoFraternidadeBean.setIdFraternidade(rs.getInt("id_fraternidade"));
			coordenacoes.add(coordenacaoFraternidadeBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return coordenacoes;
	}
	
	public void alteraCoordenacaoFraternidade(int idCoordenacao, CoordenacaoFraternidadeBean coordenacaoFraternidadeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE coordenacao_fraternidade SET id_coordenacao = ?, coordenadora = ?, tesoureira = ?, secretaria = ?, data_inicio = ?, data_termino = ?, id_fraternidade = ? WHERE id_coordenacao = '" + idCoordenacao + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, coordenacaoFraternidadeBean.getIdCoordenacao());
		ps.setDouble(2, coordenacaoFraternidadeBean.getCpfCoordenadora());
		ps.setDouble(3, coordenacaoFraternidadeBean.getCpfTesoureira());
		ps.setDouble(4, coordenacaoFraternidadeBean.getCpfSecretaria());
		ps.setDate(5, new Date(coordenacaoFraternidadeBean.getDataInicio().getTime()));
		ps.setDate(6, new Date(coordenacaoFraternidadeBean.getDataTermino().getTime()));
		ps.setInt(7, coordenacaoFraternidadeBean.getIdFraternidade());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaCoordenacaoFraternidade(int idCoordenacao) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM coordenacao_fraternidade WHERE id_coordenacao = '" + idCoordenacao + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
				/*
				 coordenacao_fraternidade
				 id_coordenacao serial NOT NULL,
  coordenadora double precision,
  tesoureira double precision,
  secretaria double precision,
  data_inicio date,
  data_termino date,
  id_fraternidade integer,
				 */
	
}
