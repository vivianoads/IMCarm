package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.FaseFormacaoBean;
import com.viviano.imcarm.entidades.FormandaBean;


public class FaseFormacaoDao {
	private InterfaceConexao conexao;
	
	public FaseFormacaoDao(){
		conexao = new Conexao();
	}
	
	public void gravaFaseFormacao(FaseFormacaoBean faseFormacaoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO fase_formacao (nome) VALUES (?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, faseFormacaoBean.getNome());
		ps.execute();
		ps.close();
		con.close();
	}
	
	public FaseFormacaoBean getFaseFormacaoBean(int idFaseFormacao) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM fase_formacao WHERE id_fase = '" + idFaseFormacao + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		FaseFormacaoBean faseFormacaoBean =  new FaseFormacaoBean();
		if (rs.next()){
			faseFormacaoBean.setIdFase(rs.getInt("id_fase"));
			faseFormacaoBean.setNome(rs.getString("nome"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return faseFormacaoBean;
	}
	
	public List<FaseFormacaoBean> getAllFaseFormacaoBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM fase_formacao";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<FaseFormacaoBean> fases = new ArrayList<FaseFormacaoBean>();
		while (rs.next()){
			FaseFormacaoBean faseFormacaoBean =  new FaseFormacaoBean();
			faseFormacaoBean.setIdFase(rs.getInt("id_fase"));
			faseFormacaoBean.setNome(rs.getString("nome"));
			fases.add(faseFormacaoBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return fases;
	}
        public List<FaseFormacaoBean> getAllFaseFormacaoBeanPorFormanda(Integer idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM fase_formacao WHERE id_freira = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idFormanda);
                ResultSet rs = stat.executeQuery();
		List<FaseFormacaoBean> fases = new ArrayList<FaseFormacaoBean>();
		while (rs.next()){
			FaseFormacaoBean faseFormacaoBean =  new FaseFormacaoBean();
			faseFormacaoBean.setIdFase(rs.getInt("id_fase"));
			faseFormacaoBean.setNome(rs.getString("nome"));
                        faseFormacaoBean.setFormanda(new FormandaDao().getFormandaBean(rs.getInt("id_freira")));
                        faseFormacaoBean.setDataEntrada(rs.getString("data_entrada"));
                        faseFormacaoBean.setDataSaida(rs.getString("data_saida"));
			fases.add(faseFormacaoBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return fases;
	}
	
	public void alteraFaseFormacao(int idFaseFormacao, FaseFormacaoBean faseFormacaoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE fase_formacao SET id_fase = ?, nome = ? WHERE id_fase = '" + idFaseFormacao + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, faseFormacaoBean.getIdFase());
		ps.setString(2, faseFormacaoBean.getNome());
		ps.executeUpdate();
		ps.close();
		con.close();
	}

	
	public void apagaFaseFormacao(int idFaseFormacao) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM fase_formacao WHERE id_fase = '" + idFaseFormacao + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	/*
	 fase_formacao
	 id_fase serial NOT NULL,
  nome character varying(254)
	 */
}
