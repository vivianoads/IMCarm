package com.viviano.imcarm.commands;

import com.viviano.imcarm.entidades.FreiraBean;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.LoginDao;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {

        LoginDao loginDao = new LoginDao();
        FreiraBean freiraBean = null;

        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        String nextPage = new String();

        try {
            freiraBean = loginDao.getLoginBean(usuario, senha);
            if (freiraBean != null) {
                request.setAttribute("usuarioLogado", freiraBean);
                System.out.println(freiraBean.getNomeCivil());
                nextPage = "usuariologado.jsp";
            } else {
                nextPage = "";
            }
        } catch (SQLException e) {
            nextPage = "erro.html";
            System.out.println("Entrou na SQL Exception");
            e.printStackTrace();
        }catch(ClassNotFoundException ex){
            Logger.getLogger(LoginCommand.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Entrou na ClassNotFoundException");
            nextPage = "erro.html";
        }
        return nextPage;
    }
}
