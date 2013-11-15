package com.viviano.imcarm.commands;

import javax.servlet.http.HttpServletRequest;

public class LogoutCommand implements Command{

	@Override
	public String execute(HttpServletRequest request) {
		String nextPage = "/";
		request.getSession().invalidate();
		return nextPage;
	}

}
