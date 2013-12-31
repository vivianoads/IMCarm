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
                ps.setString(10, formandaBean.getTelefone());
                ps.setString(11, formandaBean.getCep());
                ps.setString(12, formandaBean.getEmail());
                ps.setString(13, formandaBean.getEstado());
                ps.setString(14, formandaBean.getMotivoEstadoInativo());
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
                        formandaBean.setTelefone(rs.getString("telefone"));
                        formandaBean.setCep(rs.getString("cep"));
                        formandaBean.setEmail(rs.getString("email"));
                        formandaBean.setEstado(rs.getString("ativo"));
                        formandaBean.setMotivoEstadoInativo(rs.getString("inativo_motivo"));
		}
		rs.close();
		stat.close();
		con.close();
		return formandaBean;
	}
	
	public List<FormandaBean> getAllFormandaBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery();
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
                        formandaBean.setTelefone(rs.getString("telefone"));
                        formandaBean.setCep(rs.getString("cep"));
                        formandaBean.setEmail(rs.getString("email"));
                        formandaBean.setEstado(rs.getString("ativo"));
                        formandaBean.setMotivoEstadoInativo(rs.getString("inativo_motivo"));
			formandas.add(formandaBean);
		}
		rs.close();
		stat.close();
		con.close();
		return formandas;
	}
	
	public void alteraFormanda(int idFormanda, FormandaBean formandaBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE formanda SET nome = ?, nome_pai = ?, nome_mae = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, diocese = ?, telefone = ?, cep = ?, email = ?, ativo = ?, inativo_motivo = ? WHERE id_formanda = ?";
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
                ps.setString(10, formandaBean.getTelefone());
                ps.setString(11, formandaBean.getCep());
                ps.setString(12, formandaBean.getEmail());
                ps.setString(13, formandaBean.getEstado());
                ps.setString(14, formandaBean.getMotivoEstadoInativo());
                ps.setInt(15, idFormanda);
		
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
