package com.viviano.imcarm.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.viviano.imcarm.entidades.LoginBean;


public class LoginDao {
	private InterfaceConexao conexao;
	
	public LoginDao(){
		conexao = new Conexao();
	}
	
	public LoginBean getLoginBean(double cpfFreira, String senha) throws SQLException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM login WHERE id_freira = '" + cpfFreira + "' AND senha ILIKE'" + senha + "'";
		Statement stat = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ResultSet rs = stat.executeQuery(sql);
		LoginBean loginBean = null;
		if (rs.next()){
			loginBean = new LoginBean();
			loginBean.setCpfFreira(rs.getDouble("id_freira"));
			loginBean.setSenha(rs.getString("senha"));
		}
		rs.close();
		stat.close();
		con.close();
		return loginBean;
	}

/*
 * id_freira double precision NOT NULL,
  senha character varying,
 */
}
