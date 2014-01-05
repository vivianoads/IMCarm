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
		String sql = "INSERT INTO formanda (nome, nome_pai, nome_mae, rua, numero, bairro, cidade, uf, diocese, telefone, cep, email, ativo, inativo_motivo, data_etapa_atual, data_nascimento, etapa_formacao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, formandaBean.getNome());
		ps.setString(2, formandaBean.getPai());
		ps.setString(3, formandaBean.getMae());
		ps.setString(4, formandaBean.getRua());
		ps.setString(5, formandaBean.getNumero());
		ps.setString(6, formandaBean.getBairro());
		ps.setString(7, formandaBean.getCidade());
		ps.setString(8, formandaBean.getUf());
		ps.setString(9, formandaBean.getDiocese());
                ps.setString(10, formandaBean.getTelefone());
                ps.setString(11, formandaBean.getCep());
                ps.setString(12, formandaBean.getEmail());
                ps.setString(13, formandaBean.getAtividade());
                ps.setString(14, formandaBean.getMotivoInatividade());
                ps.setString(15, formandaBean.getDataEtapaAtual());
                ps.setString(16, formandaBean.getDataNascimento());
                ps.setString(17, formandaBean.getEtapa());
		
                ps.execute();
		ps.close();
		con.close();
	}
	
	public FormandaBean getFormandaBeanPorEquipe(Integer idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT DISTINCT f.* FROM (formanda f join formanda_equipe fe on f.id_formanda = fe.id_formanda) where fe.id_equipe = ?";
		PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ps.setInt(1, idEquipe);
                ResultSet rs = ps.executeQuery();
		FormandaBean formandaBean = new FormandaBean();
		if (rs.next()) {
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
            }
		rs.close();
		ps.close();
		con.close();
                
		return formandaBean;
	}
        
        public FormandaBean getFormandaBean(Integer idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda WHERE id_formanda = ?";
		PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ps.setInt(1, idFormanda);
                ResultSet rs = ps.executeQuery();
		FormandaBean formandaBean = new FormandaBean();
		if (rs.next()) {
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
            }
		rs.close();
		ps.close();
		con.close();
                
		return formandaBean;
	}
        public FormandaBean getUltimaFormandaBeanCadastrada() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda order by id_formanda ASC";
		PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
		FormandaBean formandaBean = null;
		while(rs.next()) {
                    formandaBean = new FormandaBean();
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
            }
		rs.close();
		ps.close();
		con.close();
                
		return formandaBean;
	}
	
	public List<FormandaBean> getAllFormandaBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery();
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
                FormandaBean formandaBean = null;
		while (rs.next()){
                    formandaBean = new FormandaBean();
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
                    formandas.add(formandaBean);
		}
		rs.close();
		stat.close();
		con.close();
		return formandas;
	}
        
        public List<FormandaBean> getAllFormandaBeanPorEtapa(String etapa) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda WHERE etapa_formacao like ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setString(1, etapa);
                ResultSet rs = stat.executeQuery();
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
                FormandaBean formandaBean = null;
		while (rs.next()){
                    formandaBean = new FormandaBean();
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
                    formandas.add(formandaBean);
		}
		rs.close();
		stat.close();
		con.close();
		return formandas;
	}
        
        public List<FormandaBean> getAllFormandaBeanPorEquipe(Integer idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT distinct * FROM (formanda f join formanda_equipe  fe on f.id_formanda = fe.id_formanda) where fe.id_equipe = ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idEquipe);
                ResultSet rs = stat.executeQuery();
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
                FormandaBean formandaBean = null;
		while (rs.next()){
                    formandaBean = new FormandaBean();
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
                    formandas.add(formandaBean);
		}
		rs.close();
		stat.close();
		con.close();
		return formandas;
	}
        
        public List<FormandaBean> getAllFormandaBeanPorNome(String nome) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda WHERE nome ilike ?";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setString(1, "%" + nome + "%");
                ResultSet rs = stat.executeQuery();
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
                FormandaBean formandaBean = null;
		while (rs.next()){
                    formandaBean = new FormandaBean();
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
                    formandas.add(formandaBean);
		}
		rs.close();
		stat.close();
		con.close();
		return formandas;
	}
        
        public List<FormandaBean> getAllFormandaBeanAtivas() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda WHERE ativo = 'sim'";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery();
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
                FormandaBean formandaBean = null;
		while (rs.next()){
                    formandaBean = new FormandaBean();
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
                    formandas.add(formandaBean);
		}
		rs.close();
		stat.close();
		con.close();
		return formandas;
	}
        
	public List<FormandaBean> getAllFormandaBeanDadoBaixa() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM formanda WHERE ativo LIKE 'nao'";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery();
		List<FormandaBean> formandas = new ArrayList<FormandaBean>();
                FormandaBean formandaBean = null;
		while (rs.next()){
                    formandaBean = new FormandaBean();
                    formandaBean.setIdFormanda(rs.getInt("id_formanda"));
                    formandaBean.setNome(rs.getString("nome"));
                    formandaBean.setPai(rs.getString("nome_pai"));
                    formandaBean.setMae(rs.getString("nome_mae"));
                    formandaBean.setRua(rs.getString("rua"));
                    formandaBean.setNumero(rs.getString("numero"));
                    formandaBean.setBairro(rs.getString("bairro"));
                    formandaBean.setCidade(rs.getString("cidade"));
                    formandaBean.setUf(rs.getString("uf"));
                    formandaBean.setDiocese(rs.getString("diocese"));
                    formandaBean.setTelefone(rs.getString("telefone"));
                    formandaBean.setCep(rs.getString("cep"));
                    formandaBean.setEmail(rs.getString("email"));
                    formandaBean.setAtividade(rs.getString("ativo"));
                    formandaBean.setMotivoInatividade(rs.getString("inativo_motivo"));
                    formandaBean.setDataEtapaAtual(rs.getString("data_etapa_atual"));
                    formandaBean.setDataNascimento(rs.getString("data_nascimento"));
                    formandaBean.setEtapa(rs.getString("etapa_formacao"));
                    formandas.add(formandaBean);
		}
		rs.close();
		stat.close();
		con.close();
		return formandas;
	}
	public void alteraFormanda(int idFormanda, FormandaBean formandaBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE formanda SET nome = ?, nome_pai = ?, nome_mae = ?, rua = ?, numero = ?, bairro = ?, cidade = ?, uf = ?, diocese = ?, telefone = ?, cep = ?, email = ?, ativo = ?, inativo_motivo = ?, data_etapa_atual = ?, data_nascimento = ?, etapa_formacao = ? WHERE id_formanda = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, formandaBean.getNome());
		ps.setString(2, formandaBean.getPai());
		ps.setString(3, formandaBean.getMae());
		ps.setString(4, formandaBean.getRua());
		ps.setString(5, formandaBean.getNumero());
		ps.setString(6, formandaBean.getBairro());
		ps.setString(7, formandaBean.getCidade());
		ps.setString(8, formandaBean.getUf());
		ps.setString(9, formandaBean.getDiocese());
                ps.setString(10, formandaBean.getTelefone());
                ps.setString(11, formandaBean.getCep());
                ps.setString(12, formandaBean.getEmail());
                ps.setString(13, formandaBean.getAtividade());
                ps.setString(14, formandaBean.getMotivoInatividade());
                ps.setString(15, formandaBean.getDataEtapaAtual());
                ps.setString(16, formandaBean.getDataNascimento());
                ps.setString(17, formandaBean.getEtapa());
                ps.setInt(18, idFormanda);
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
        
        public void DarBaixaFormandaBean(Integer idFormanda, String motivo) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE formanda SET ativo = ?, inativo_motivo = ? WHERE id_formanda = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "nao");
		ps.setString(2, motivo);
		ps.setInt(3, idFormanda);
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
        public void CancelarBaixaFormandaBean(Integer idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE formanda SET ativo = ?, inativo_motivo = ? WHERE id_formanda = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "sim");
		ps.setString(2, "");
		ps.setInt(3, idFormanda);
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaFormandaBean(int idFormanda) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM formanda WHERE id_formanda = ?";
		PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idFormanda);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	
	/*
	  character varying(254),
	 */
}
