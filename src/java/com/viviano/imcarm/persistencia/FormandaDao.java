package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.FormandaBean;


public class FormandaDao {
	private InterfaceConexao conexao;
	
	public FormandaDao(){
		conexao = new Conexao();
	}

	public void gravaFormanda(FormandaBean formandaBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO formanda (nome, nome_pai, nome_mae, rua, numero, bairro, cidade, uf, diocese) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, formandaBean.getNome());
		ps.setString(2, formandaBean.getNomePai());
		ps.setString(3, formandaBean.getNomeMae());
		ps.setString(4, formandaBean.getRua());
		ps.setString(5, formandaBean.getNumeroCasa());
		ps.setString(6, formandaBean.getBairro());
		ps.setString(7, formandaBean.getCidade());
		ps.setString(8, formandaBean.getUf());
		ps.setString(9, formandaBean.getDiocese());
		ps.execute();
		ps.close();
		con.close();
	}
	
	public FormandaBean getFormandaBean(int idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda WHERE id_formanda = '" + idFormanda + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		FormandaBean formandaBean = new FormandaBean();
		if (rs.next()){
			formandaBean.setIdFormanda(rs.getInt("id_formanda"));
			formandaBean.setNome(rs.getString("nome"));
			formandaBean.setNomePai(rs.getString("nome_pai"));
			formandaBean.setNomeMae(rs.getString("nome_mae"));
			formandaBean.setRua(rs.getString("rua"));
			formandaBean.setNumeroCasa(rs.getString("numero"));
			formandaBean.setBairro(rs.getString("bairro"));
			formandaBean.setCidade(rs.getString("cidade"));
			formandaBean.setUf(rs.getString("uf"));
			formandaBean.setDiocese(rs.getString("diocese"));
		}
		rs.close();
		stat.close();
		con.close();
		return formandaBean;
	}
	
	public List<FormandaBean> getAllFormandaBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
		while (rs.next()){
			FormandaBean formandaBean = new FormandaBean();
			formandaBean.setIdFormanda(rs.getInt("id_formanda"));
			formandaBean.setNome(rs.getString("nome"));
			formandaBean.setNomePai(rs.getString("nome_pai"));
			formandaBean.setNomeMae(rs.getString("nome_mae"));
			formandaBean.setRua(rs.getString("rua"));
			formandaBean.setNumeroCasa(rs.getString("numero"));
			formandaBean.setBairro(rs.getString("bairro"));
			formandaBean.setCidade(rs.getString("cidade"));
			formandaBean.setUf(rs.getString("uf"));
			formandaBean.setDiocese(rs.getString("diocese"));
			formandas.add(formandaBean);
		}
		rs.close();
		stat.close();
		con.close();
		return formandas;
	}
	
	public void alteraFormanda(int idFormanda, FormandaBean formandaBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE formanda SET id_formanda = ?, nome = ?, nome_pai = ?, nome_mae = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, diocese = ? WHERE id_formanda = '" + idFormanda + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, formandaBean.getIdFormanda());
		ps.setString(2, formandaBean.getNome());
		ps.setString(3, formandaBean.getNomePai());
		ps.setString(4, formandaBean.getNomeMae());
		ps.setString(5, formandaBean.getRua());
		ps.setString(6, formandaBean.getNumeroCasa());
		ps.setString(7, formandaBean.getBairro());
		ps.setString(8, formandaBean.getCidade());
		ps.setString(9, formandaBean.getUf());
		ps.setString(10, formandaBean.getDiocese());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaFormandaBean(int idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM formanda WHERE id_formanda = '" + idFormanda + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	
	/*
	  character varying(254),
	 */
}
