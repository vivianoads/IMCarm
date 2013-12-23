package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.viviano.imcarm.entidades.CongregacaoBean;


public class CongregacaoDao {

	private InterfaceConexao conexao;

	public CongregacaoDao() {
		conexao = new Conexao();
	}

	public void GravaCongregacao(CongregacaoBean congregacao)
			throws ClassNotFoundException, SQLException {

		Connection con = conexao.getConnection();

                
		String sqlInsercao = "INSERT INTO Congregacao (Nome, Carisma, Lema, Data_fundacao, Data_agregacao_ordem, Data_erecao_canonica, Cidade_fundacao, Fundador, Co_fundador) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		PreparedStatement ps = con.prepareStatement(sqlInsercao);

		ps.setString(1, congregacao.getNome());
		ps.setString(2, congregacao.getCarisma());
		ps.setString(3, congregacao.getLema());
		ps.setString(4, congregacao.getDataFundacao());
		ps.setString(5, congregacao.getDataAgregacaoOrdem());
		ps.setString(6, congregacao.getDataErecaoCanonica());
		ps.setString(7, congregacao.getCidadeFundacao());
		ps.setString(8, congregacao.getFundador());
		ps.setString(9, congregacao.getCoFundador());

                if(this.getCountCongregacao() == 0){
                    ps.execute();
                }else{
                    throw new SQLException("Congregação Já está cadastrada");
                }
		ps.close();
		con.close();
	}
        
        public Integer getCountCongregacao() throws ClassNotFoundException, SQLException{
		
		Connection con = conexao.getConnection();
		
		String sql = "SELECT COUNT(*) FROM congregacao";
		PreparedStatement stat = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery();
		Integer countCongregacao = 0;
		if(rs.first()){
                    countCongregacao = rs.getInt(1);
		}
		rs.close();
		stat.close();
		con.close();
		
		return countCongregacao;
	}
	
	public CongregacaoBean getCongregacao(int id_congregacao) throws ClassNotFoundException, SQLException{
		
		Connection con = conexao.getConnection();
		
		String sql = "SELECT * FROM congregacao WHERE id_congregacao = '" + id_congregacao + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		CongregacaoBean congregacaoBean = new CongregacaoBean();
		while (rs.next()){
			congregacaoBean.setIdCongregacao(rs.getInt("id_congregacao"));
			congregacaoBean.setNome(rs.getString("nome"));
			congregacaoBean.setCarisma(rs.getString("carisma"));
			congregacaoBean.setLema(rs.getString("lema"));
			congregacaoBean.setDataFundacao(rs.getString("data_fundacao"));
			congregacaoBean.setDataAgregacaoOrdem(rs.getString("data_agregacao_ordem"));
			congregacaoBean.setDataErecaoCanonica(rs.getString("data_erecao_canonica"));
			congregacaoBean.setFundador(rs.getString("fundador"));
			congregacaoBean.setCoFundador(rs.getString("co_fundador"));
			congregacaoBean.setCidadeFundacao(rs.getString("cidade_fundacao"));
		}
		rs.close();
		stat.close();
		con.close();
		
		return congregacaoBean;
	}
        
        public CongregacaoBean getCongregacao() throws ClassNotFoundException, SQLException{
		
		Connection con = conexao.getConnection();
		
		String sql = "SELECT * FROM congregacao";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		CongregacaoBean congregacaoBean = new CongregacaoBean();
		while (rs.next()){
			congregacaoBean.setIdCongregacao(rs.getInt("id_congregacao"));
			congregacaoBean.setNome(rs.getString("nome"));
			congregacaoBean.setCarisma(rs.getString("carisma"));
			congregacaoBean.setLema(rs.getString("lema"));
			congregacaoBean.setDataFundacao(rs.getString("data_fundacao"));
			congregacaoBean.setDataAgregacaoOrdem(rs.getString("data_agregacao_ordem"));
			congregacaoBean.setDataErecaoCanonica(rs.getString("data_erecao_canonica"));
			congregacaoBean.setFundador(rs.getString("fundador"));
			congregacaoBean.setCoFundador(rs.getString("co_fundador"));
			congregacaoBean.setCidadeFundacao(rs.getString("cidade_fundacao"));
		}
		rs.close();
		stat.close();
		con.close();
		System.out.println(congregacaoBean.getIdCongregacao());
		return congregacaoBean;
	}
	
	public List<CongregacaoBean> getAllCongregacao() throws ClassNotFoundException, SQLException{
			
			Connection con = conexao.getConnection();
			
			String sql = "SELECT * FROM congregacao ";
			Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stat.executeQuery(sql);
			List<CongregacaoBean> congregacoes = new ArrayList<CongregacaoBean>();
			while (rs.next()){
				CongregacaoBean congregacaoBean = new CongregacaoBean();
				congregacaoBean.setIdCongregacao(rs.getInt("id_congregacao"));
				congregacaoBean.setNome(rs.getString("nome"));
				congregacaoBean.setCarisma(rs.getString("carisma"));
				congregacaoBean.setLema(rs.getString("lema"));
				congregacaoBean.setDataFundacao(rs.getString("data_fundacao"));
				congregacaoBean.setDataAgregacaoOrdem(rs.getString("data_agregacao_ordem"));
				congregacaoBean.setDataErecaoCanonica(rs.getString("data_erecao_canonica"));
				congregacaoBean.setFundador(rs.getString("fundador"));
				congregacaoBean.setCoFundador(rs.getString("co_fundador"));
				congregacaoBean.setCidadeFundacao(rs.getString("cidade_fundacao"));
				congregacoes.add(congregacaoBean);
			}
			rs.close();
			stat.close();
			con.close();
			
			return congregacoes;
		}
	
	public void alteraCongregacao(int idCongregacao, CongregacaoBean congregacaoBean) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "UPDATE congregacao SET nome = ?, carisma = ?, lema = ?, data_fundacao = ?, data_agregacao_ordem = ?, data_erecao_canonica = ?, cidade_fundacao = ?, fundador = ?, co_fundador = ? WHERE id_congregacao = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, congregacaoBean.getNome());
		ps.setString(2, congregacaoBean.getCarisma());
		ps.setString(3, congregacaoBean.getLema());
		ps.setString(4, congregacaoBean.getDataFundacao());
		ps.setString(5, congregacaoBean.getDataAgregacaoOrdem());
		ps.setString(6, congregacaoBean.getDataErecaoCanonica());
		ps.setString(7, congregacaoBean.getCidadeFundacao());
		ps.setString(8, congregacaoBean.getFundador());
		ps.setString(9, congregacaoBean.getCoFundador());
                ps.setInt(10, idCongregacao);
                
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	
	public void apagaCongregacao(Integer idCongregacao) throws ClassNotFoundException, SQLException{
		Connection con = conexao.getConnection();
		String sql = "DELETE FROM congregacao WHERE id_congregacao = ?";
		PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, idCongregacao);
		ps.executeUpdate();
		ps.close();
		con.close();
	}
	/*
		id_congregacao serial NOT NULL,
		nome character varying(254),
		carisma character varying(254),
		lema character varying(254),
		data_fundacao date,
		data_agregacao_ordem date,
		data_erecao_canonica date,
		cidade_fundacao character varying(254),
		fundador character varying(254),
		co_fundador character varying(254),
	 */
}
