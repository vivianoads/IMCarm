package com.viviano.imcarm.commands;

import javax.servlet.http.HttpServletRequest;

public interface Command {

	public String execute(HttpServletRequest request);
}
