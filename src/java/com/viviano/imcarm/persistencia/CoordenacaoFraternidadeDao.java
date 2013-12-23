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
import java.util.Calendar;


public class CoordenacaoFraternidadeDao {

	private InterfaceConexao conexao;
	
	public CoordenacaoFraternidadeDao(){
		conexao = new Conexao();
	}
	
	public void gravaCoordenacaoFraternidade(CoordenacaoFraternidadeBean coordenacaoFraternidadeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO coordenacao_fraternidade (coordenadora,  tesoureira, secretaria, data_inicio, data_termino, id_fraternidade, isatual) VALUES (?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, coordenacaoFraternidadeBean.getIdCoordenadora());
		ps.setInt(2, coordenacaoFraternidadeBean.getIdTesoureira());
		ps.setInt(3, coordenacaoFraternidadeBean.getIdSecretaria());
		ps.setString(4, coordenacaoFraternidadeBean.getDataInicio());
		ps.setString(5, coordenacaoFraternidadeBean.getDataTermino());
		ps.setInt(6, coordenacaoFraternidadeBean.getIdFraternidade());
                ps.setString(7, coordenacaoFraternidadeBean.getIsAtual());
		
                        
		ps.execute();
		ps.close();
		con.close();
	}
	public CoordenacaoFraternidadeBean getUltimaCoordenacaoFraternidadeBeanCadastrada(Integer idCoordenadora, Integer idTesoureira, Integer idSecretaria, 
                String dataInicio, String dataTermino, String isAtual, Integer idFraternidade) throws ClassNotFoundException, SQLException{
            
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM coordenacao_fraternidade WHERE coordenadora = ? and tesoureira = ? and secretaria = ? and data_inicio = ? and data_termino = ? and id_fraternidade = ? and isatual = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idCoordenadora);
                stat.setInt(2, idTesoureira);
                stat.setInt(3, idSecretaria);
                stat.setString(4, dataInicio);
                stat.setString(5, dataTermino);
                stat.setInt(6, idFraternidade);
                stat.setString(7, isAtual);
                ResultSet rs = stat.executeQuery();
		CoordenacaoFraternidadeBean coordenacaoFraternidadeBean = null;
		if (rs.next()){
                        coordenacaoFraternidadeBean = new CoordenacaoFraternidadeBean();
			coordenacaoFraternidadeBean.setIdCoordenacao(rs.getInt("id_coordenacao"));
			coordenacaoFraternidadeBean.setIdCoordenadora(rs.getInt("coordenadora"));
			coordenacaoFraternidadeBean.setIdTesoureira(rs.getInt("tesoureira"));
			coordenacaoFraternidadeBean.setIdSecretaria(rs.getInt("secretaria"));
			coordenacaoFraternidadeBean.setDataInicio(rs.getString("data_inicio"));
			coordenacaoFraternidadeBean.setDataTermino(rs.getString("data_termino"));
			coordenacaoFraternidadeBean.setIdFraternidade(rs.getInt("id_fraternidade"));
                        coordenacaoFraternidadeBean.setIsAtual(rs.getString("isatual"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return coordenacaoFraternidadeBean;
	}
        public CoordenacaoFraternidadeBean getCoordenacaoFraternidadeAtual(Integer idFraternidade, String isAtual) throws ClassNotFoundException, SQLException{
            
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM coordenacao_fraternidade WHERE id_fraternidade = ? and isatual = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
                stat.setInt(1, idFraternidade);
                stat.setString(2, isAtual);
                ResultSet rs = stat.executeQuery();
		CoordenacaoFraternidadeBean coordenacaoFraternidadeBean = null;
		if (rs.next()){
                        coordenacaoFraternidadeBean = new CoordenacaoFraternidadeBean();
			coordenacaoFraternidadeBean.setIdCoordenacao(rs.getInt("id_coordenacao"));
			coordenacaoFraternidadeBean.setIdCoordenadora(rs.getInt("coordenadora"));
			coordenacaoFraternidadeBean.setIdTesoureira(rs.getInt("tesoureira"));
			coordenacaoFraternidadeBean.setIdSecretaria(rs.getInt("secretaria"));
			coordenacaoFraternidadeBean.setDataInicio(rs.getString("data_inicio"));
			coordenacaoFraternidadeBean.setDataTermino(rs.getString("data_termino"));
			coordenacaoFraternidadeBean.setIdFraternidade(rs.getInt("id_fraternidade"));
                        coordenacaoFraternidadeBean.setIsAtual(rs.getString("isatual"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return coordenacaoFraternidadeBean;
	}
	public CoordenacaoFraternidadeBean getCoordenacaoFraternidadeBean(int idCoordenacaoFraternidade) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM coordenacao_fraternidade WHERE id_coordenacao = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idCoordenacaoFraternidade);
                ResultSet rs = stat.executeQuery();
		CoordenacaoFraternidadeBean coordenacaoFraternidadeBean = new CoordenacaoFraternidadeBean();
		if (rs.next()){
			coordenacaoFraternidadeBean.setIdCoordenacao(rs.getInt("id_coordenacao"));
			coordenacaoFraternidadeBean.setIdCoordenadora(rs.getInt("coordenadora"));
			coordenacaoFraternidadeBean.setIdTesoureira(rs.getInt("tesoureira"));
			coordenacaoFraternidadeBean.setIdSecretaria(rs.getInt("secretaria"));
			coordenacaoFraternidadeBean.setDataInicio(rs.getString("data_inicio"));
			coordenacaoFraternidadeBean.setDataTermino(rs.getString("data_termino"));
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
			coordenacaoFraternidadeBean.setIdCoordenadora(rs.getInt("coordenadora"));
			coordenacaoFraternidadeBean.setIdTesoureira(rs.getInt("tesoureira"));
			coordenacaoFraternidadeBean.setIdSecretaria(rs.getInt("secretaria"));
			coordenacaoFraternidadeBean.setDataInicio(rs.getString("data_inicio"));
			coordenacaoFraternidadeBean.setDataTermino(rs.getString("data_termino"));
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
		ps.setInt(2, coordenacaoFraternidadeBean.getIdCoordenadora());
		ps.setInt(3, coordenacaoFraternidadeBean.getIdTesoureira());
		ps.setInt(4, coordenacaoFraternidadeBean.getIdSecretaria());
		ps.setString(5, coordenacaoFraternidadeBean.getDataInicio());
		ps.setString(6, coordenacaoFraternidadeBean.getDataTermino());
		ps.setInt(7, coordenacaoFraternidadeBean.getIdFraternidade());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaCoordenacaoFraternidade(int idCoordenacao) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM coordenacao_fraternidade WHERE id_coordenacao = ?";
		PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idCoordenacao);
                System.out.println("dentro do método de apagar coordenacao, sql = " + sql);
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
