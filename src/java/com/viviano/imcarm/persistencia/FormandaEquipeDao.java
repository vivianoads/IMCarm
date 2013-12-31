package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.FormandaEquipeBean;


public class FormandaEquipeDao {
	private InterfaceConexao conexao;
	
	public FormandaEquipeDao(){
		conexao = new Conexao();
	}
	
	public void gravaformandaEquipe(FormandaEquipeBean formandaEquipeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO formanda_equipe (id_formanda, id_equipe, funcao) VALUES (?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, formandaEquipeBean.getFormanda());
		ps.setInt(2, formandaEquipeBean.getEquipe());
		ps.setString(3, formandaEquipeBean.getFuncao());
		
		ps.execute();
		ps.close();
		con.close();
	}
	
	public FormandaEquipeBean getFormandaEquipeBean(int idFormanda, int idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda_equipe WHERE id_formanda = '" + idFormanda + "' AND id_equipe = '" + idEquipe + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		FormandaEquipeBean formandaEquipeBean = new FormandaEquipeBean();
		
		if(rs.next()){
			formandaEquipeBean.setFormanda(rs.getInt("id_formanda"));
			formandaEquipeBean.setEquipe(rs.getInt("id_equipe"));
			formandaEquipeBean.setFuncao(rs.getString("funcao"));
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return formandaEquipeBean;
	}
        public List<FormandaEquipeBean> getFormandaEquipeBeanPorEquipe(Integer idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda_equipe WHERE id_equipe = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idEquipe);
                ResultSet rs = stat.executeQuery();
		FormandaEquipeBean formandaEquipeBean = null;
		List<FormandaEquipeBean> febs = new ArrayList<FormandaEquipeBean>();
		while(rs.next()){
                        formandaEquipeBean = new FormandaEquipeBean();
			formandaEquipeBean.setFormanda(rs.getInt("id_formanda"));
			formandaEquipeBean.setEquipe(rs.getInt("id_equipe"));
			formandaEquipeBean.setFuncao(rs.getString("funcao"));
                        febs.add(formandaEquipeBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return febs;
	}
	
	public List<FormandaEquipeBean> getAllFormandaEquipeBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda_equipe";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<FormandaEquipeBean> formandasEquipe = new ArrayList<FormandaEquipeBean>();
		
		while (rs.next()){
			FormandaEquipeBean formandaEquipeBean = new FormandaEquipeBean();
			formandaEquipeBean.setFormanda(rs.getInt("id_formanda"));
			formandaEquipeBean.setEquipe(rs.getInt("id_equipe"));
			formandaEquipeBean.setFuncao(rs.getString("funcao"));
			formandasEquipe.add(formandaEquipeBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		
		return formandasEquipe;
	}
	
	public void alteraFormandaEquipe(int idFormanda, int idEquipe, FormandaEquipeBean formandaEquipeBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE formanda_equipe SET id_formanda = ?, id_equipe = ?, funcao = ? WHERE id_formanda = '" + idFormanda + "' AND id_equipe = '" + idEquipe + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, formandaEquipeBean.getFormanda());
		ps.setInt(2, formandaEquipeBean.getEquipe());
		ps.setString(3, formandaEquipeBean.getFuncao());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaAllFormandaEquipePorEquipe(Integer idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM formanda_equipe WHERE id_equipe = ?";
		PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idEquipe);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	/*
	 formanda_equipe
(
  id_formanda integer NOT NULL,
  id_equipe integer NOT NULL,
  funcao character varying(254),
	 */

}
