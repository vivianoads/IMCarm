package com.viviano.imcarm.commands;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.servicetowork.VerificaUsuario;

public class ExibeCasasDeMissaoCommand implements Command {

    @Override
    public String execute(HttpServletRequest request) {
        String nextPage = "/listacadasdemissaoparaeditar.jsp";
        Integer initialIndex = new Integer(request.getParameter("initial_index"));
        FraternidadeDao fraternidadeDao = new FraternidadeDao();
        List<FraternidadeBean> fraternidades = new ArrayList<FraternidadeBean>();
        List<FraternidadeBean> fraternidadespaginada = new ArrayList<FraternidadeBean>();

        try {
            fraternidades = fraternidadeDao.getAllFraternidade();
            for (int i = initialIndex; i <= initialIndex + 10; i++) {
                fraternidadespaginada.add(fraternidades.get(i));
            }
            Integer[] paginacao = new Integer[fraternidades.size() / 10 + 1];
            for (int i = 0; i < paginacao.length; i++) {
                paginacao[i] = i + 1;
            }
            request.setAttribute("paginacao", paginacao);
            request.setAttribute("fraternidadespaginada", fraternidadespaginada);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nextPage;
    }

}
