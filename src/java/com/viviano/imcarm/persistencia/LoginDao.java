package com.viviano.imcarm.persistencia;

import com.viviano.imcarm.entidades.FreiraBean;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.viviano.imcarm.entidades.LoginBean;
import java.sql.PreparedStatement;


public class LoginDao {
	private InterfaceConexao conexao;
	
	public LoginDao(){
		conexao = new Conexao();
	}
	
	public FreiraBean getLoginBean(String loginFreira, String senha) throws SQLException, ClassNotFoundException{
		Connection con = conexao.getConnection();
		String sql = "SELECT * FROM login WHERE login_freira like ? AND senha ILIKE ?";
                PreparedStatement ps = con.prepareStatement(sql, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		ps.setString(1, loginFreira);
                ps.setString(2, senha);
                ResultSet rs = ps.executeQuery();
		LoginBean loginBean = null;
                FreiraBean freiraBean = null;
		if (rs.first()){
			loginBean = new LoginBean();
			loginBean.setloginFreira(rs.getString("login_freira"));
			loginBean.setSenha(rs.getString("senha"));
                        loginBean.setIdFreira(rs.getInt("id_freira"));
		}
                if(loginBean != null){
                    FreiraDao freiraDao = new FreiraDao();
                    freiraBean = freiraDao.getFreiraBean(loginBean.getIdFreira());
                }
		rs.close();
		ps.close();
		con.close();
		return freiraBean;
	}

/*
 * id_freira double precision NOT NULL,
  senha character varying,
 */
}
