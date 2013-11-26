package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.FraternidadeBean;


public class FraternidadeDao {
	
	private InterfaceConexao conexao;

	public FraternidadeDao(){
		conexao = new Conexao();
	}
	
	public void gravaFraternidade(FraternidadeBean fraternidade) throws SQLException, ClassNotFoundException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO fraternidade (nome, status, data_fundacao, rua, numero, bairro, cidade, uf, diocese, bispo, cep, telefone, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, fraternidade.getNome());
		ps.setString(2, fraternidade.getStatus());
		ps.setString(3, fraternidade.getDataFundacao());
		ps.setString(4, fraternidade.getRua());
		ps.setString(5, fraternidade.getNumeroCasa());
		ps.setString(6, fraternidade.getBairro());
		ps.setString(7, fraternidade.getCidade());
		ps.setString(8, fraternidade.getUf());
		ps.setString(9, fraternidade.getDiocese());
		ps.setString(10, fraternidade.getBispo());
                ps.setString(11, fraternidade.getCep());
                ps.setString(12, fraternidade.getTelefone());
                ps.setString(13, fraternidade.getEmail());
		ps.execute();
		ps.close();
		con.close();
	}
	
	public FraternidadeBean getFraternidade(int idFraternidade) throws SQLException, ClassNotFoundException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM fraternidade WHERE id_fraternidade = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idFraternidade);
                ResultSet rs = stat.executeQuery();
		FraternidadeBean fraternidadeBean = new FraternidadeBean();
		if (rs.next()){
			fraternidadeBean.setIdFraternidade(rs.getInt("id_fraternidade"));
			fraternidadeBean.setNome(rs.getString("nome"));
			fraternidadeBean.setStatus(rs.getString("status"));
			fraternidadeBean.setDataFundacao(rs.getString("data_fundacao"));
			fraternidadeBean.setRua(rs.getString("rua"));
			fraternidadeBean.setNumeroCasa(rs.getString("numero"));
			fraternidadeBean.setBairro(rs.getString("bairro"));
			fraternidadeBean.setCidade(rs.getString("cidade"));
			fraternidadeBean.setUf(rs.getString("uf"));
			fraternidadeBean.setDiocese(rs.getString("diocese"));
			fraternidadeBean.setBispo(rs.getString("bispo"));
                        fraternidadeBean.setCep(rs.getString("cep"));
                        fraternidadeBean.setTelefone(rs.getString("telefone"));
                        fraternidadeBean.setEmail(rs.getString("email"));
		}
		
		stat.close();
		rs.close();
		con.close();
		return fraternidadeBean;
	}
	
	public FraternidadeBean getFraternidadePorNome(String nomeFraternidade) throws SQLException, ClassNotFoundException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM fraternidade WHERE nome like ?";
		PreparedStatement stat = con.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setString(1, nomeFraternidade);
                ResultSet rs = stat.executeQuery();
		FraternidadeBean fraternidadeBean = null;
		if (rs.next()){
			fraternidadeBean = new FraternidadeBean();
			fraternidadeBean.setIdFraternidade(rs.getInt("id_fraternidade"));
			fraternidadeBean.setNome(rs.getString("nome"));
			fraternidadeBean.setStatus(rs.getString("status"));
			fraternidadeBean.setDataFundacao(rs.getString("data_fundacao"));
			fraternidadeBean.setRua(rs.getString("rua"));
			fraternidadeBean.setNumeroCasa(rs.getString("numero"));
			fraternidadeBean.setBairro(rs.getString("bairro"));
			fraternidadeBean.setCidade(rs.getString("cidade"));
			fraternidadeBean.setUf(rs.getString("uf"));
			fraternidadeBean.setDiocese(rs.getString("diocese"));
			fraternidadeBean.setBispo(rs.getString("bispo"));
                        fraternidadeBean.setCep(rs.getString("cep"));
                        fraternidadeBean.setTelefone(rs.getString("telefone"));
                        fraternidadeBean.setEmail(rs.getString("email"));
		}
		
		stat.close();
		rs.close();
		con.close();
		return fraternidadeBean;
	}
	
	public List<FraternidadeBean> getAllFraternidade() throws SQLException, ClassNotFoundException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM fraternidade";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<FraternidadeBean> fraternidades = new ArrayList<FraternidadeBean>();
		while (rs.next()){
			FraternidadeBean fraternidadeBean = new FraternidadeBean();
			fraternidadeBean.setIdFraternidade(rs.getInt("id_fraternidade"));
			fraternidadeBean.setNome(rs.getString("nome"));
			fraternidadeBean.setStatus(rs.getString("status"));
			fraternidadeBean.setDataFundacao(rs.getString("data_fundacao"));
			fraternidadeBean.setRua(rs.getString("rua"));
			fraternidadeBean.setNumeroCasa(rs.getString("numero"));
			fraternidadeBean.setBairro(rs.getString("bairro"));
			fraternidadeBean.setCidade(rs.getString("cidade"));
			fraternidadeBean.setUf(rs.getString("uf"));
			fraternidadeBean.setDiocese(rs.getString("diocese"));
			fraternidadeBean.setBispo(rs.getString("bispo"));
                        fraternidadeBean.setCep(rs.getString("cep"));
                        fraternidadeBean.setTelefone(rs.getString("telefone"));
                        fraternidadeBean.setEmail(rs.getString("email"));
			
			fraternidades.add(fraternidadeBean);
		}
		
		stat.close();
		rs.close();
		con.close();
		return fraternidades;
	}
	
	public void alteraFraternidade(int idFraternidade, FraternidadeBean fraternidade) throws SQLException, ClassNotFoundException{
		Connection con  = conexao.getConnection();
		String sql = "UPDATE fraternidade SET nome = ?, status = ?, data_fundacao = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, diocese = ?, bispo = ?, cep = ?, telefone = ?, email = ? WHERE id_fraternidade = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, fraternidade.getNome());
		ps.setString(2, fraternidade.getStatus());
		ps.setString(3, fraternidade.getDataFundacao());
		ps.setString(4, fraternidade.getRua());
		ps.setString(5, fraternidade.getNumeroCasa());
		ps.setString(6, fraternidade.getBairro());
		ps.setString(7, fraternidade.getCidade());
		ps.setString(8, fraternidade.getUf());
		ps.setString(9, fraternidade.getDiocese());
		ps.setString(10, fraternidade.getBispo());
                ps.setString(11, fraternidade.getCep());
                ps.setString(12, fraternidade.getTelefone());
                ps.setString(13, fraternidade.getEmail());
                ps.setInt(14, idFraternidade);
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaFraternidade(int idFraternidade) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM fraternidade WHERE id_fraternidade ='" + idFraternidade + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	/*
		id_fraternidade serial NOT NULL,
	  	nome character varying(254),
	 	status character varying(7),
	  	data_fundacao date,
	  	rua character varying(254),
	  	numero integer,
	  	bairro character varying(254),
	  	cidade character varying(254),
	  	uf character varying(254),
	  	diocese character varying(254),
	  	bispo character varying(254),
	 */
}

