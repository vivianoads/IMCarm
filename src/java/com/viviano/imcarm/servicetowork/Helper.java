package com.viviano.imcarm.servicetowork;

import com.viviano.imcarm.commands.AdicionaIrmaACasadeMissaoCommand;
import java.util.HashMap;
import java.util.Map;


import com.viviano.imcarm.commands.AlteraFormandaCommand;
import com.viviano.imcarm.commands.AlteraIrmaCommand;
import com.viviano.imcarm.commands.ApagarCongregacao;
import com.viviano.imcarm.commands.ApagarFraternidadeCommand;
import com.viviano.imcarm.commands.CadastraCongregacao;
import com.viviano.imcarm.commands.CadastrarCoordenacaoDeFraternidadeCommand;
import com.viviano.imcarm.commands.CancelaAdicaodeFreiraACasaDeMissao;
import com.viviano.imcarm.commands.CancelaCadastroCasaDeMissaoCommand;
import com.viviano.imcarm.commands.CancelaCadastroCoordenacaoCasaDeMissaoCommand;
import com.viviano.imcarm.commands.CancelaCadastroGovernoGeral;
import com.viviano.imcarm.commands.Command;
import com.viviano.imcarm.commands.ConfirmaCadastroFraternidadeCommand;
import com.viviano.imcarm.commands.ConfirmaCadastroGovernoGeral;
import com.viviano.imcarm.commands.EditaCoordenacaoCommand;
import com.viviano.imcarm.commands.EditaDadosCasaDeMissaoCommand;
import com.viviano.imcarm.commands.ExibeCasasDeMissaoCommand;
import com.viviano.imcarm.commands.GravaCasaDeMissaoCommand;
import com.viviano.imcarm.commands.GravaFormandaCommand;
import com.viviano.imcarm.commands.GravaIrmaCommand;
import com.viviano.imcarm.commands.IrCadastroFormandasCommand;
import com.viviano.imcarm.commands.IrCadastroFreiraCommand;
import com.viviano.imcarm.commands.IrFormAlteraDadosCongregacao;
import com.viviano.imcarm.commands.IrFormCadastraGovernoGeralCommand;
import com.viviano.imcarm.commands.IrFormCadastroDeCongregacao;
import com.viviano.imcarm.commands.IrFormCadastroEquipeDeServico;
import com.viviano.imcarm.commands.IrParaCadastroDeCongregacao;
import com.viviano.imcarm.commands.ListaCasasDeMissaoParaTransferirIrma;
import com.viviano.imcarm.commands.ListaIrmasParaAdicionarACasaDeMissao;
import com.viviano.imcarm.commands.ListaIrmasParaGerarCoordenacao;
import com.viviano.imcarm.commands.ListaIrmasParaTransferirDeCasaDeMissao;
import com.viviano.imcarm.commands.ListaIrmasSelecionarMadre;
import com.viviano.imcarm.commands.LoginCommand;
import com.viviano.imcarm.commands.LogoutCommand;
import com.viviano.imcarm.commands.SalvaAlteracoesCasasDeMissaoCommand;
import com.viviano.imcarm.commands.SalvaAlteracoesIrmaCommand;
import com.viviano.imcarm.commands.SalvaEquipeDeServico;
import com.viviano.imcarm.commands.SalvaalteracoesFormandaCommand;
import com.viviano.imcarm.commands.SalvarCoordenacaoDeFraternidade;
import com.viviano.imcarm.commands.SalvarGovernoGeralCommand;
import com.viviano.imcarm.commands.SelecionaCoordenadoraFraternidade;
import com.viviano.imcarm.commands.SelecionaCoordenadoraParaEquipeDeServicoCommand;
import com.viviano.imcarm.commands.SelecionaMadreGeralParaGovernoGeralCommand;
import com.viviano.imcarm.commands.TransferirIrmaDeCasaDeMissaoCommand;
import com.viviano.imcarm.commands.VerificaUsuarioLogadoCommand;

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
                mapCommands.put("12", new VerificaUsuarioLogadoCommand());
                mapCommands.put("13", new EditaDadosCasaDeMissaoCommand());
                mapCommands.put("14", new CancelaCadastroCasaDeMissaoCommand());
                mapCommands.put("15", new ConfirmaCadastroFraternidadeCommand());
                mapCommands.put("16", new ApagarFraternidadeCommand());
                mapCommands.put("17", new ListaIrmasParaAdicionarACasaDeMissao());
                mapCommands.put("18", new AdicionaIrmaACasadeMissaoCommand());
                mapCommands.put("19", new CancelaAdicaodeFreiraACasaDeMissao());
                mapCommands.put("20", new ListaIrmasParaTransferirDeCasaDeMissao());
                mapCommands.put("21", new ListaCasasDeMissaoParaTransferirIrma());
                mapCommands.put("22", new TransferirIrmaDeCasaDeMissaoCommand());
                mapCommands.put("23", new CadastrarCoordenacaoDeFraternidadeCommand());
                mapCommands.put("24", new ListaIrmasParaGerarCoordenacao());
                mapCommands.put("25", new SelecionaCoordenadoraFraternidade());
                mapCommands.put("26", new SalvarCoordenacaoDeFraternidade());
                mapCommands.put("27", new CancelaCadastroCoordenacaoCasaDeMissaoCommand());
                mapCommands.put("28", new EditaCoordenacaoCommand());
                mapCommands.put("29", new IrParaCadastroDeCongregacao());
                mapCommands.put("30", new IrFormCadastroDeCongregacao());
                mapCommands.put("31", new CadastraCongregacao());
                mapCommands.put("32", new IrFormAlteraDadosCongregacao());
                mapCommands.put("33", new ApagarCongregacao());
                mapCommands.put("34", new IrCadastroFormandasCommand());
                mapCommands.put("35", new IrCadastroFreiraCommand());
                mapCommands.put("36", new IrFormCadastraGovernoGeralCommand());
                mapCommands.put("37", new ListaIrmasSelecionarMadre());
                mapCommands.put("38", new SelecionaMadreGeralParaGovernoGeralCommand());
                mapCommands.put("39", new SalvarGovernoGeralCommand());
                mapCommands.put("40", new CancelaCadastroGovernoGeral());
                mapCommands.put("41", new ConfirmaCadastroGovernoGeral());
                mapCommands.put("42", new IrFormCadastroEquipeDeServico());
                mapCommands.put("43", new SelecionaCoordenadoraParaEquipeDeServicoCommand());
                mapCommands.put("44", new SalvaEquipeDeServico());
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
