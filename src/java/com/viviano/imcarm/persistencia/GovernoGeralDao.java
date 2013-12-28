package com.viviano.imcarm.persistencia;

import com.viviano.imcarm.entidades.FreiraBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.GovernoGeralBean;


public class GovernoGeralDao {
	private InterfaceConexao conexao;
	
	public GovernoGeralDao(){
		conexao = new Conexao();
	}
	
	public void gravaGovernoGeral(GovernoGeralBean governoGeralBean) throws ClassNotFoundException, SQLException{
                
		Connection con = conexao.getConnection();
		String sql = "INSERT INTO governo_geral (madre_geral, vice_geral, economa_geral, secretaria_geral, conselheira_titular_1, conselheira_titular_2, conselheira_titular_3, conselheira_titular_4, conselheira_suplente_1, conselheira_suplente_2, conselheira_fiscal_1, conselheira_fiscal_2, conselheira_fiscal_3, isatual, data_inicio, data_termino) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
                if(governoGeralBean.getMadreGeral()!= null){
                    ps.setInt(1, governoGeralBean.getMadreGeral().getId());
                }else{
                    ps.setInt(1, 0);
                }
		if(governoGeralBean.getViceGeral()!= null){
                    ps.setInt(2, governoGeralBean.getViceGeral().getId());
                }else{
                    ps.setInt(2, 0);
                }
		if(governoGeralBean.getEconomaGeral()!= null){
                    ps.setInt(3, governoGeralBean.getEconomaGeral().getId());
                }else{
                    ps.setInt(3, 0);
                }
                if(governoGeralBean.getSecretariaGeral()!= null){
                    ps.setInt(4, governoGeralBean.getSecretariaGeral().getId());
                }else{
                    ps.setInt(4, 0);
                }
                
                for(int i = 0; i<governoGeralBean.getConselheirasTitulares().length; i++){
                    System.out.println("Entrou no for");
                    if(governoGeralBean.getConselheirasTitulares()[i]!= null){
                        System.out.println("parametro ConselheirasTitulares = " + (5+i));
                        ps.setInt(5+i, governoGeralBean.getConselheirasTitulares()[i].getId());
                    }else{
                    ps.setInt(5+i, 0);
                    System.out.println("parametro ConselheirasTitulares = " + (5+i));
                }
                }
                for(int i = 0; i< governoGeralBean.getConselheirasSuplentes().length; i++){
                    if(governoGeralBean.getConselheirasSuplentes()[i]!= null){
                        ps.setInt(9+i, governoGeralBean.getConselheirasSuplentes()[i].getId());
                    }else{
                    ps.setInt(9+i, 0);
                }
                }
                for(int i = 0; i < governoGeralBean.getConselhoFiscal().length; i++){
                    if(governoGeralBean.getConselhoFiscal()[i]!= null){
                        ps.setInt(11+i, governoGeralBean.getConselhoFiscal()[i].getId());
                    }else{
                    ps.setInt(11+i, 0);
                }
                }
                
                ps.setString(14, governoGeralBean.getIsaAtual());
                ps.setString(15, governoGeralBean.getDataInicio());
                ps.setString(16, governoGeralBean.getDataTermino());
		                
		ps.execute();
		ps.close();
		con.close();
	}
        
        public GovernoGeralBean getGovernoGeralAtual() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM governo_geral WHERE isatual LIKE 'sim'";
                GovernoGeralBean governoGeralBean = null;
                FreiraDao freiraDao = new FreiraDao();
		PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
                if(rs.first()){
                    governoGeralBean = new GovernoGeralBean();
                    governoGeralBean.setMadreGeral(freiraDao.getFreiraBean(rs.getInt("madre_geral")));
                    governoGeralBean.setViceGeral(freiraDao.getFreiraBean(rs.getInt("vice_geral")));
                    governoGeralBean.setEconomaGeral(freiraDao.getFreiraBean(rs.getInt("economa_geral")));
                    governoGeralBean.setSecretariaGeral(freiraDao.getFreiraBean(rs.getInt("secretaria_geral")));
                    
                    FreiraBean[]  titulares = new FreiraBean[4];
                    for(int i = 0; i < 4; i++){
                        titulares[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_titular_"+(i+1)));
                    }
                    governoGeralBean.setConselheirasTitulares(titulares);
                    
                    
                    FreiraBean[] suplentes = new FreiraBean[2];
                    for(int i = 0; i < 2; i++){
                        suplentes[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_suplente_"+(i+1)));
                    }
                    governoGeralBean.setConselhoFiscal(suplentes);
                    
                    FreiraBean[] fiscal = new FreiraBean[3];
                    for(int i = 0; i < 3; i++){
                        fiscal[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_fiscal_"+(i+1)));
                    }
                    governoGeralBean.setConselhoFiscal(fiscal);
                    governoGeralBean.setDataInicio(rs.getString("data_inicio"));
                    governoGeralBean.setDataTermino(rs.getString("data_termino"));
                    governoGeralBean.setIsaAtual(rs.getString("isatual"));
                    governoGeralBean.setIdGoverno(rs.getInt("id_governo"));
                }
		ps.close();
		con.close();
                return governoGeralBean;
	}
        public GovernoGeralBean getUltimoGovernoGeralCadastrado() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM governo_geral";
                GovernoGeralBean governoGeralBean = null;
                FreiraDao freiraDao = new FreiraDao();
		PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    governoGeralBean = new GovernoGeralBean();
                    governoGeralBean.setMadreGeral(freiraDao.getFreiraBean(rs.getInt("madre_geral")));
                    governoGeralBean.setViceGeral(freiraDao.getFreiraBean(rs.getInt("vice_geral")));
                    governoGeralBean.setEconomaGeral(freiraDao.getFreiraBean(rs.getInt("economa_geral")));
                    governoGeralBean.setSecretariaGeral(freiraDao.getFreiraBean(rs.getInt("secretaria_geral")));
                    
                    FreiraBean[]  titulares = new FreiraBean[4];
                    for(int i = 0; i < 4; i++){
                        titulares[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_titular_"+(i+1)));
                    }
                    governoGeralBean.setConselheirasTitulares(titulares);
                    
                    
                    FreiraBean[] suplentes = new FreiraBean[2];
                    for(int i = 0; i < 2; i++){
                        suplentes[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_suplente_"+(i+1)));
                    }
                    governoGeralBean.setConselhoFiscal(suplentes);
                    
                    FreiraBean[] fiscal = new FreiraBean[3];
                    for(int i = 0; i < 3; i++){
                        fiscal[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_fiscal_"+(i+1)));
                    }
                    governoGeralBean.setConselhoFiscal(fiscal);
                    governoGeralBean.setDataInicio(rs.getString("data_inicio"));
                    governoGeralBean.setDataTermino(rs.getString("data_termino"));
                    governoGeralBean.setIsaAtual(rs.getString("isatual"));
                    governoGeralBean.setIdGoverno(rs.getInt("id_governo"));
                }
		ps.close();
		con.close();
                return governoGeralBean;
	}
        public void alteraGovernoGeralAtual(int idGovernoGeral, String isatual) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE governo_geral SET isatual = ? WHERE id_governo = ?";
		PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1, isatual);
		ps.setInt(2, idGovernoGeral);
                
		ps.executeUpdate();
		ps.close();
		con.close();
		
	}
	
	public GovernoGeralBean getGovernoGeralBean(int idGovernoGeral) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM governo_geral WHERE id_governo = '" + idGovernoGeral + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		GovernoGeralBean governoGeralBean = new GovernoGeralBean();
		if (rs.next()){
//			governoGeralBean.setIdGoverno(rs.getInt("id_governo"));
//			governoGeralBean.setMadreGeral(rs.getDouble("madre_geral"));
//			governoGeralBean.setViceGeral(rs.getDouble("vice_geral"));
//			governoGeralBean.setEconomaGeral(rs.getDouble("economa_geral"));
//			governoGeralBean.setIdCongregacao(rs.getInt("id_congregacao"));
		}
		
		rs.close();
		stat.close();
		con.close();
		return governoGeralBean;
	}
	
	public List<GovernoGeralBean> getAllGovernoGeralBean() throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM governo_geral";
                FreiraDao freiraDao = new FreiraDao();
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		List<GovernoGeralBean> governos = new ArrayList<GovernoGeralBean>();
		while (rs.next()){
                    GovernoGeralBean governoGeralBean = new GovernoGeralBean();
                    governoGeralBean.setMadreGeral(freiraDao.getFreiraBean(rs.getInt("madre_geral")));
                    governoGeralBean.setViceGeral(freiraDao.getFreiraBean(rs.getInt("vice_geral")));
                    governoGeralBean.setEconomaGeral(freiraDao.getFreiraBean(rs.getInt("economa_geral")));
                    governoGeralBean.setSecretariaGeral(freiraDao.getFreiraBean(rs.getInt("secretaria_geral")));
                    
                    FreiraBean[]  titulares = new FreiraBean[4];
                    for(int i = 0; i < 4; i++){
                        titulares[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_titular_"+(i+1)));
                    }
                    governoGeralBean.setConselheirasTitulares(titulares);
                    
                    
                    FreiraBean[] suplentes = new FreiraBean[2];
                    for(int i = 0; i < 2; i++){
                        suplentes[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_suplente_"+(i+1)));
                    }
                    governoGeralBean.setConselhoFiscal(suplentes);
                    
                    FreiraBean[] fiscal = new FreiraBean[3];
                    for(int i = 0; i < 3; i++){
                        fiscal[i] = freiraDao.getFreiraBean(rs.getInt("conselheira_fiscal_"+(i+1)));
                    }
                    governoGeralBean.setConselhoFiscal(fiscal);
                    governoGeralBean.setDataInicio(rs.getString("data_inicio"));
                    governoGeralBean.setDataTermino(rs.getString("data_termino"));
                    governoGeralBean.setIsaAtual(rs.getString("isatual"));
                    governoGeralBean.setIdGoverno(rs.getInt("id_governo"));
                    governos.add(governoGeralBean);
		}
		
		rs.close();
		stat.close();
		con.close();
		return governos;
	}
	public void alteraGovernoGeral(int idGovernoGeral, GovernoGeralBean governoGeralBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE governo_geral SET id_governo = ?, madre_geral = ?, vice_geral = ?, economa_geral = ?, id_congregacao = ? WHERE id_governo = '" + idGovernoGeral + "'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, governoGeralBean.getIdGoverno());
//		ps.setDouble(2, governoGeralBean.getMadreGeral());
//		ps.setDouble(3, governoGeralBean.getViceGeral());
//		ps.setDouble(4, governoGeralBean.getEconomaGeral());
//		ps.setInt(5, governoGeralBean.getCongregacao());
		
		ps.executeUpdate();
		ps.close();
		con.close();
		
	}
	
	public void apagaGovernoGeral(Integer idGovernoGeral) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM governo_geral WHERE id_governo = ?";
		PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idGovernoGeral);
		ps.executeUpdate();
		ps.close();
		con.close();
	}

	/*
	 governo_geral
(
  id_governo serial NOT NULL,
  madre_geral double precision,
  vice_geral double precision,
  economa_geral double precision,
  id_congregacao integer,
	 */
}
