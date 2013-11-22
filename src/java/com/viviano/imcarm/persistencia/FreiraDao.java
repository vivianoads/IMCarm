package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.FreiraBean;



public class FreiraDao {
	
	private InterfaceConexao conexao;
	
	public FreiraDao(){
		conexao = new Conexao();
	}

	public void gravaFreira(FreiraBean freira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO freira (cpf, nome_civil, nome_religioso, rg, data_nascimento, nome_pai, nome_mae, data_aspirantado, data_postulantado, data_noviciado_canonico, data_profissao_temporaria, data_profissao_perpetua) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setDouble(1, freira.getCpf());
		ps.setString(2, freira.getNomeCivil());
		ps.setString(3, freira.getNomeReligioso());
		ps.setDouble(4, freira.getRg());
		ps.setString(5, freira.getDataNascimento());
		ps.setString(6, freira.getNomePai());
		ps.setString(7, freira.getNomeMae());
		ps.setString(8, freira.getDataAspirantado());
		ps.setString(9, freira.getDataPostulantado());
		ps.setString(10, freira.getDataNoviciadoCanonico());
		ps.setString(11, freira.getDataProfissaoTemporaria());
		ps.setString(12, freira.getDataProfissaoPerpetua());
		
		ps.execute();
		ps.close();
		con.close();
	}
	
	public FreiraBean getFreiraBean(double cpf) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira WHERE cpf ='" + cpf + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		FreiraBean freiraBean = null;
		
		if (rs.next()){
			freiraBean = new FreiraBean();
                        freiraBean.setId(rs.getInt("id"));
			freiraBean.setCpf(rs.getDouble("cpf"));
			freiraBean.setNomeCivil(rs.getString("nome_civil"));
			freiraBean.setNomeReligioso(rs.getString("nome_religioso"));
			freiraBean.setRg(rs.getDouble("rg"));
			freiraBean.setDataNascimento(rs.getString("data_nascimento"));
			freiraBean.setNomePai(rs.getString("nome_pai"));
			freiraBean.setNomeMae(rs.getString("nome_mae"));
			freiraBean.setDataAspirantado(rs.getString("data_aspirantado"));
			freiraBean.setDataPostulantado(rs.getString("data_postulantado"));
			freiraBean.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
			freiraBean.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
			freiraBean.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freiraBean.setTelefone(rs.getString("telefone"));
                        freiraBean.setEmail(rs.getString("email"));
                        freiraBean.setTipoAtivo(rs.getString("tipo_ativo"));
                        freiraBean.setAtivo(rs.getString("ativo"));
                        freiraBean.setRuaFamilia(rs.getString("rua_familia"));
                        freiraBean.setNumeroFamilia(rs.getString("numero_familia"));
                        freiraBean.setBairroFamilia(rs.getString("bairro_familia"));
                        freiraBean.setCidadeFamilia(rs.getString("cidade_familia"));
                        freiraBean.setTipoInativo(rs.getString("tipo_inativo"));
                        freiraBean.setDiocese(rs.getString("diocese"));
                        freiraBean.setCepFamilia(rs.getString("cep_familia"));
                        freiraBean.setEstadoFamilia(rs.getString("estado_familia"));
			
		}
		
		stat.close();
		rs.close();
		con.close();
		
		return freiraBean;
	}
	
        //
        public FreiraBean getFreiraBean(int idFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira WHERE id = ? ";
		PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ps.setInt(1, idFreira);
                ResultSet rs = ps.executeQuery();
		FreiraBean freiraBean = null;
		if (rs.next()){
			freiraBean = new FreiraBean();
                        freiraBean.setId(rs.getInt("id"));
			freiraBean.setCpf(rs.getDouble("cpf"));
			freiraBean.setNomeCivil(rs.getString("nome_civil"));
			freiraBean.setNomeReligioso(rs.getString("nome_religioso"));
			freiraBean.setRg(rs.getDouble("rg"));
			freiraBean.setDataNascimento(rs.getString("data_nascimento"));
			freiraBean.setNomePai(rs.getString("nome_pai"));
			freiraBean.setNomeMae(rs.getString("nome_mae"));
			freiraBean.setDataAspirantado(rs.getString("data_aspirantado"));
			freiraBean.setDataPostulantado(rs.getString("data_postulantado"));
			freiraBean.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
			freiraBean.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
			freiraBean.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freiraBean.setTelefone(rs.getString("telefone"));
                        freiraBean.setEmail(rs.getString("email"));
                        freiraBean.setTipoAtivo(rs.getString("tipo_ativo"));
                        freiraBean.setAtivo(rs.getString("ativo"));
                        freiraBean.setRuaFamilia(rs.getString("rua_familia"));
                        freiraBean.setNumeroFamilia(rs.getString("numero_familia"));
                        freiraBean.setBairroFamilia(rs.getString("bairro_familia"));
                        freiraBean.setCidadeFamilia(rs.getString("cidade_familia"));
                        freiraBean.setTipoInativo(rs.getString("tipo_inativo"));
                        freiraBean.setDiocese(rs.getString("diocese"));
                        freiraBean.setCepFamilia(rs.getString("cep_familia"));
                        freiraBean.setEstadoFamilia(rs.getString("estado_familia"));
			
		}
		
		ps.close();
		rs.close();
		con.close();
		
		return freiraBean;
	}
	//
	public List<FreiraBean> getAllFreiraBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()){
			FreiraBean freiraBean = new FreiraBean();
			freiraBean.setCpf(rs.getDouble("cpf"));
			freiraBean.setNomeCivil(rs.getString("nome_civil"));
			freiraBean.setNomeReligioso(rs.getString("nome_religioso"));
			freiraBean.setRg(rs.getDouble("rg"));
			freiraBean.setDataNascimento(rs.getString("data_nascimento"));
			freiraBean.setNomePai(rs.getString("nome_pai"));
			freiraBean.setNomeMae(rs.getString("nome_mae"));
			freiraBean.setDataAspirantado(rs.getString("data_aspirantado"));
			freiraBean.setDataPostulantado(rs.getString("data_postulantado"));
			freiraBean.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
			freiraBean.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
			freiraBean.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
			
			freiras.add(freiraBean);
		}
		
		stat.close();
		rs.close();
		con.close();
		
		return freiras;
	}
	
	public void alteraFreira(Double cpf, FreiraBean freiraBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE freira SET cpf = ?, nome_civil = ?, nome_religioso = ?, rg = ?, data_nascimento = ?, nome_pai = ?, nome_mae = ?, data_aspirantado = ?, data_postulantado = ?, data_noviciado_canonico = ?, data_profissao_temporaria = ?, data_profissao_perpetua = ? WHERE cpf ='" +  cpf + "'";
		PreparedStatement ps =  con.prepareStatement(sql);
		ps.setDouble(1, freiraBean.getCpf());
		ps.setString(2, freiraBean.getNomeCivil());
		ps.setString(3, freiraBean.getNomeReligioso());
		ps.setDouble(4, freiraBean.getRg());
		ps.setString(5, freiraBean.getDataNascimento());
		ps.setString(6, freiraBean.getNomePai());
		ps.setString(7, freiraBean.getNomeMae());
		ps.setString(8, freiraBean.getDataAspirantado());
		ps.setString(9, freiraBean.getDataPostulantado());
		ps.setString(10, freiraBean.getDataNoviciadoCanonico());
		ps.setString(11, freiraBean.getDataProfissaoTemporaria());
		ps.setString(12, freiraBean.getDataProfissaoPerpetua());
		
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaFreira(double cpf) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM freira WHERE cpf ='" + cpf + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	/*
	  cpf double precision NOT NULL,
  nome_civil character varying(254),
  nome_religioso character varying(254),
  rg double precision,
  data_nascimento date,
  nome_pai character varying(254),
  nome_mae character varying(254),
  data_aspirantado date,
  data_postulantado date,
  data_noviciado_canonico date,
  data_profissao_temporaria date,
  data_profissao_perpetua date,
	 */
	 
}
