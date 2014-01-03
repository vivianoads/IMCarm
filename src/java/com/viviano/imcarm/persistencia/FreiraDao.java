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
		String sql = "INSERT INTO freira (cpf, nome_civil, nome_religioso, rg,data_nascimento, nome_pai, nome_mae, data_aspirantado, data_postulantado, data_noviciado_canonico, data_profissao_temporaria, data_profissao_perpetua, telefone, email, tipo_ativo, ativo, rua_familia, numero_familia, bairro_familia, cidade_familia, diocese, cep_familia, estado_familia, data_noviciado_apostolico, data_juniorado, data_juniorado_renovacao_1, data_juniorado_renovacao_2, data_juniorado_renovacao_3, data_juniorado_renovacao_4, data_juniorado_renovacao_5, data_juniorado_renovacao_6, data_juniorado_renovacao_7, data_juniorado_renovacao_8, data_juniorado_renovacao_9) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, freira.getCpf());
                ps.setString(2, freira.getNomeCivil());
                ps.setString(3, freira.getNomeReligioso());
                ps.setString(4, freira.getRg());
                ps.setString(5, freira.getDataNascimento());
                ps.setString(6, freira.getNomePai());
                ps.setString(7, freira.getNomeMae());
                ps.setString(8, freira.getDataAspirantado());
                ps.setString(9, freira.getDataPostulantado());
                ps.setString(10, freira.getDataNoviciadoCanonico());
                ps.setString(11, freira.getDataProfissaoTemporaria());
                ps.setString(12, freira.getDataProfissaoPerpetua());
                ps.setString(13, freira.getTelefone());
                ps.setString(14, freira.getEmail());
                ps.setString(15, freira.getTipoAtivo());
                ps.setString(16, freira.getAtivo());
                ps.setString(17, freira.getRuaFamilia());
                ps.setString(18, freira.getNumeroFamilia());
                ps.setString(19, freira.getBairroFamilia());
                ps.setString(20, freira.getCidadeFamilia());
                ps.setString(21, freira.getDiocese());
                ps.setString(22, freira.getCepFamilia());
                ps.setString(23, freira.getEstadoFamilia());
                ps.setString(24, freira.getDataNoviciadoApostolico());
                ps.setString(25, freira.getDatasJuniorado());
                ps.setString(26, freira.getDatasJunioradoI());
                ps.setString(27, freira.getDatasJunioradoII());
                ps.setString(28, freira.getDatasJunioradoIII());
                ps.setString(29, freira.getDatasJunioradoIV());
                ps.setString(30, freira.getDatasJunioradoV());
                ps.setString(31, freira.getDatasJunioradoVI());
                ps.setString(32, freira.getDatasJunioradoVII());
                ps.setString(33, freira.getDatasJunioradoVIII());
                ps.setString(34, freira.getDatasJunioradoIX());
		
		ps.execute();
		ps.close();
		con.close();
	}
        
        public List<FreiraBean> getAllFreiraBeanComAgregacaoEspecifica(Integer idFraternidade) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT DISTINCT f.* FROM (freira f join agregacao a on f.id = a.id_freira) WHERE a.id_fraternidade = ?";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idFraternidade);
                ResultSet rs = stat.executeQuery();
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
                        freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		          System.out.println(freiras.size());
		return freiras;
	}
        
        public List<FreiraBean> getAllFreiraBeanComStringNoNome(String nome) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT distinct * FROM freira where nome_civil ilike ?";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
                stat.setString(1, "%" + nome + "%");
                ResultSet rs = stat.executeQuery();
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
                        freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		          System.out.println(freiras.size());
		return freiras;
	}
        public List<FreiraBean> getAllFreiraBeanComStringNoNomeReligioso(String nome) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT distinct * FROM freira where nome_religioso ilike ?";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
                stat.setString(1, "%" + nome + "%");
                ResultSet rs = stat.executeQuery();
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
                        freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		          System.out.println(freiras.size());
		return freiras;
	}
        
	
//	public FreiraBean getFreiraBean(double cpf) throws ClassNotFoundException, SQLException{
//		Connection con = conexao.getConnection();
//		String sql = "SELECT * FROM freira WHERE cpf ='" + cpf + "'";
//		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
//		ResultSet rs = stat.executeQuery(sql);
//		FreiraBean freira = null;
//		
//		if (rs.next()){
//			freira = new FreiraBean();
//                        freira.setId(rs.getInt("id"));
//			freira.setCpf(rs.getString("cpf"));
//                        freira.setNomeCivil(rs.getString("nome_civil"));
//                        freira.setNomeReligioso(rs.getString("nome_religioso"));
//                        freira.setRg(rs.getString("rg"));
//                        freira.setDataNascimento(rs.getString("data_nascimento"));
//                        freira.setNomePai(rs.getString("nome_pai"));
//                        freira.setNomeMae(rs.getString("nome_mae"));
//                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
//                        freira.setDataPostulantado(rs.getString("data_postulantado"));
//                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
//                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
//                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
//                        freira.setTelefone(rs.getString("telefone"));
//                        freira.setEmail(rs.getString("email"));
//                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
//                        freira.setAtivo(rs.getString("ativo"));
//                        freira.setRuaFamilia(rs.getString("rua_familia"));
//                        freira.setNumeroFamilia(rs.getString("numero_familia"));
//                        freira.setBairroFamilia(rs.getString("bairro_familia"));
//                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
//                        freira.setDiocese(rs.getString("diocese"));
//                        freira.setCepFamilia(rs.getString("cep_familia"));
//                        freira.setEstadoFamilia(rs.getString("estado_familia"));
//                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
//                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
//                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
//                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
//                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
//                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
//                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
//                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
//                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
//                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
//                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
//			
//		}
//		
//		stat.close();
//		rs.close();
//		con.close();
//		
//		return freira;
//	}
	
        //
        public FreiraBean getFreiraBean(int idFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira WHERE id = ? ";
		PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ps.setInt(1, idFreira);
                ResultSet rs = ps.executeQuery();
		FreiraBean freira = null;
		if (rs.next()){
                    if(rs.getInt("id") != 0){
			freira = new FreiraBean();
                        freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
                    }
		}
		
		ps.close();
		rs.close();
		con.close();
		
		return freira;
	}
        public FreiraBean getUltimaFreiraBeanCadastrada() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira ORDER BY id DESC";
		PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		
                ResultSet rs = ps.executeQuery();
		FreiraBean freira = null;
		if (rs.first()){
                    if(rs.getInt("id") != 0){
			freira = new FreiraBean();
                        freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
                    }
		}
		
		ps.close();
		rs.close();
		con.close();
		
		return freira;
	}
//        select distinct f.* from (freira f join ((select distinct id from freira) intersect (select distinct id_freira from agregacao)) d on d.id = f.id)

        public List<FreiraBean> getAllFreiraBeanComAgregacao() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "select distinct f.* from (freira f join ((select distinct id from freira) intersect (select distinct id_freira from agregacao)) d on d.id = f.id)";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
                        freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		          System.out.println(freiras.size());
		return freiras;
	}
	//(SELECT f.id FROM freira f) EXCEPT (select a.id_freira FROM agregacao a)
        public List<FreiraBean> getAllFreiraBeanSemAgregacao() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "select distinct f.* from (freira f join ((select distinct id from freira) except (select distinct id_freira from agregacao)) d on d.id = f.id)";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
                        freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		          System.out.println(freiras.size());
		return freiras;
	}
        
	public List<FreiraBean> getAllFreiraBeanPorEquipe(Integer idEquipe) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT distinct * FROM (freira f join freira_equipe  fe on f.id = fe.id_freira) where fe.id_equipe = ?";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		stat.setInt(1, idEquipe);
                ResultSet rs = stat.executeQuery();
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
			freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		
		return freiras;
	}
        
        public List<FreiraBean> getAllFreiraBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
			freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		
		return freiras;
	}
        
        public List<FreiraBean> getAllFreiraBeanAtivas() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira WHERE ativo like 'sim'";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
			freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		
		return freiras;
	}
        public List<FreiraBean> getAllFreiraBeanInativas() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM freira WHERE ativo like 'nao'";
		List<FreiraBean> freiras = new ArrayList<FreiraBean>();
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		while (rs.next()){
			FreiraBean freira = new FreiraBean();
			freira.setId(rs.getInt("id"));
			freira.setCpf(rs.getString("cpf"));
                        freira.setNomeCivil(rs.getString("nome_civil"));
                        freira.setNomeReligioso(rs.getString("nome_religioso"));
                        freira.setRg(rs.getString("rg"));
                        freira.setDataNascimento(rs.getString("data_nascimento"));
                        freira.setNomePai(rs.getString("nome_pai"));
                        freira.setNomeMae(rs.getString("nome_mae"));
                        freira.setDataAspirantado(rs.getString("data_aspirantado"));
                        freira.setDataPostulantado(rs.getString("data_postulantado"));
                        freira.setDataNoviciadoCanonico(rs.getString("data_noviciado_canonico"));
                        freira.setDataProfissaoTemporaria(rs.getString("data_profissao_temporaria"));
                        freira.setDataProfissaoPerpetua(rs.getString("data_profissao_perpetua"));
                        freira.setTelefone(rs.getString("telefone"));
                        freira.setEmail(rs.getString("email"));
                        freira.setTipoAtivo(rs.getString("tipo_ativo"));
                        freira.setAtivo(rs.getString("ativo"));
                        freira.setRuaFamilia(rs.getString("rua_familia"));
                        freira.setNumeroFamilia(rs.getString("numero_familia"));
                        freira.setBairroFamilia(rs.getString("bairro_familia"));
                        freira.setCidadeFamilia(rs.getString("cidade_familia"));
                        freira.setDiocese(rs.getString("diocese"));
                        freira.setCepFamilia(rs.getString("cep_familia"));
                        freira.setEstadoFamilia(rs.getString("estado_familia"));
                        freira.setDataNoviciadoApostolico(rs.getString("data_noviciado_apostolico"));
                        freira.setDatasJuniorado(rs.getString("data_juniorado"));
                        freira.setDatasJunioradoI(rs.getString("data_juniorado_renovacao_1"));
                        freira.setDatasJunioradoII(rs.getString("data_juniorado_renovacao_2"));
                        freira.setDatasJunioradoIII(rs.getString("data_juniorado_renovacao_3"));
                        freira.setDatasJunioradoIV(rs.getString("data_juniorado_renovacao_4"));
                        freira.setDatasJunioradoV(rs.getString("data_juniorado_renovacao_5"));
                        freira.setDatasJunioradoVI(rs.getString("data_juniorado_renovacao_6"));
                        freira.setDatasJunioradoVII(rs.getString("data_juniorado_renovacao_7"));
                        freira.setDatasJunioradoVIII(rs.getString("data_juniorado_renovacao_8"));
                        freira.setDatasJunioradoIX(rs.getString("data_juniorado_renovacao_9"));
			
			freiras.add(freira);
		}
		
		stat.close();
		rs.close();
		con.close();
		
		return freiras;
	}
	
	public void alteraFreira(Integer idFreira, FreiraBean freira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE freira SET cpf = ?, nome_civil = ?, nome_religioso = ?, rg = ?,data_nascimento = ?, nome_pai = ?, nome_mae = ?, data_aspirantado = ?, data_postulantado = ?, data_noviciado_canonico = ?, data_profissao_temporaria = ?, data_profissao_perpetua = ?, telefone = ?, email = ?, tipo_ativo = ?, ativo = ?, rua_familia = ?, numero_familia = ?, bairro_familia = ?, cidade_familia = ?, diocese = ?, cep_familia = ?, estado_familia = ?, data_noviciado_apostolico = ?, data_juniorado = ?, data_juniorado_renovacao_1 = ?, data_juniorado_renovacao_2 = ?, data_juniorado_renovacao_3 = ?, data_juniorado_renovacao_4 = ?, data_juniorado_renovacao_5 = ?, data_juniorado_renovacao_6 = ?, data_juniorado_renovacao_7 = ?, data_juniorado_renovacao_8 = ?, data_juniorado_renovacao_9 = ? WHERE id = ?";
		PreparedStatement ps =  con.prepareStatement(sql);
                
                ps.setString(1, freira.getCpf());
                ps.setString(2, freira.getNomeCivil());
                ps.setString(3, freira.getNomeReligioso());
                ps.setString(4, freira.getRg());
                ps.setString(5, freira.getDataNascimento());
                ps.setString(6, freira.getNomePai());
                ps.setString(7, freira.getNomeMae());
                ps.setString(8, freira.getDataAspirantado());
                ps.setString(9, freira.getDataPostulantado());
                ps.setString(10, freira.getDataNoviciadoCanonico());
                ps.setString(11, freira.getDataProfissaoTemporaria());
                ps.setString(12, freira.getDataProfissaoPerpetua());
                ps.setString(13, freira.getTelefone());
                ps.setString(14, freira.getEmail());
                ps.setString(15, freira.getTipoAtivo());
                ps.setString(16, freira.getAtivo());
                ps.setString(17, freira.getRuaFamilia());
                ps.setString(18, freira.getNumeroFamilia());
                ps.setString(19, freira.getBairroFamilia());
                ps.setString(20, freira.getCidadeFamilia());
                ps.setString(21, freira.getDiocese());
                ps.setString(22, freira.getCepFamilia());
                ps.setString(23, freira.getEstadoFamilia());
                ps.setString(24, freira.getDataNoviciadoApostolico());
                ps.setString(25, freira.getDatasJuniorado());
                ps.setString(26, freira.getDatasJunioradoI());
                ps.setString(27, freira.getDatasJunioradoII());
                ps.setString(28, freira.getDatasJunioradoIII());
                ps.setString(29, freira.getDatasJunioradoIV());
                ps.setString(30, freira.getDatasJunioradoV());
                ps.setString(31, freira.getDatasJunioradoVI());
                ps.setString(32, freira.getDatasJunioradoVII());
                ps.setString(33, freira.getDatasJunioradoVIII());
                ps.setString(34, freira.getDatasJunioradoIX());
                ps.setInt(35, idFreira);
                
		ps.executeUpdate();
		ps.close();
		con.close();
	}
        
        public void alteraFreira(Integer idFreira, String motivo) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE freira SET tipo_ativo = ?, ativo = ? WHERE id = ?";
		PreparedStatement ps =  con.prepareStatement(sql);
                
                
                ps.setString(1, motivo);
                ps.setString(2, "nao");
                ps.setInt(3, idFreira);
                
		ps.executeUpdate();
		ps.close();
		con.close();
	}
        public void ReativarFreira(Integer idFreira, String novoTipoAtivo) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE freira SET tipo_ativo = ?, ativo = ? WHERE id = ?";
		PreparedStatement ps =  con.prepareStatement(sql);
                
                
                ps.setString(1, novoTipoAtivo);
                ps.setString(2, "sim");
                ps.setInt(3, idFreira);
                
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaFreira(Integer idFreira) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM freira WHERE id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idFreira);
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
