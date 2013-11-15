package com.viviano.imcarm.servicetowork;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.viviano.imcarm.commands.Command;
import com.viviano.imcarm.entidades.LoginBean;

public class ServletControler extends HttpServlet{
	
	   private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		   String action = request.getParameter("action");
	    	Helper.getInstance();
	    	Command cmd = Helper.getCommand(action);	    	
	    	String nextPage = cmd.execute(request);
	    	request.getRequestDispatcher(nextPage).forward(request, response);
	    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		processRequest(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException{
		processRequest(request, response);
	}

}
