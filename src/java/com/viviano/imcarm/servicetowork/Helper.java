package com.viviano.imcarm.servicetowork;

import java.util.HashMap;
import java.util.Map;

import tests.AlteraIrma;

import com.viviano.imcarm.commands.AlteraFormandaCommand;
import com.viviano.imcarm.commands.AlteraIrmaCommand;
import com.viviano.imcarm.commands.Command;
import com.viviano.imcarm.commands.ExibeCasasDeMissaoCommand;
import com.viviano.imcarm.commands.GravaCasaDeMissaoCommand;
import com.viviano.imcarm.commands.GravaFormandaCommand;
import com.viviano.imcarm.commands.GravaIrmaCommand;
import com.viviano.imcarm.commands.LoginCommand;
import com.viviano.imcarm.commands.LogoutCommand;
import com.viviano.imcarm.commands.SalvaAlteracoesCasasDeMissaoCommand;
import com.viviano.imcarm.commands.SalvaAlteracoesIrmaCommand;
import com.viviano.imcarm.commands.SalvaalteracoesFormandaCommand;

public class Helper {
	
	private static Map<String, Command> mapCommands;
	
	private static Helper instance;
	
	private Helper(){
		mapCommands = new HashMap<String, Command>();
		mapCommands.put("1", new LoginCommand());
		mapCommands.put("2", new GravaIrmaCommand());
		mapCommands.put("3", new AlteraIrmaCommand());
		mapCommands.put("4", new SalvaAlteracoesIrmaCommand());
		mapCommands.put("5", new GravaFormandaCommand());
		mapCommands.put("6", new SalvaalteracoesFormandaCommand());
		mapCommands.put("7", new AlteraFormandaCommand());
		mapCommands.put("8", new GravaCasaDeMissaoCommand());
		mapCommands.put("9", new SalvaAlteracoesCasasDeMissaoCommand());
		mapCommands.put("10", new ExibeCasasDeMissaoCommand());
		mapCommands.put("11", new LogoutCommand());
	}
	
	public static Helper getInstance(){
		if (instance == null){
			instance = new Helper();
		}
		return instance;
	}
	public static Command getCommand(String key){
		return mapCommands.get(key);
	}
		

}
