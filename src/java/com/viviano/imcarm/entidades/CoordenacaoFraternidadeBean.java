package com.viviano.imcarm.entidades;

import java.util.Calendar;
import java.util.Date;

public class CoordenacaoFraternidadeBean {
	
	private Integer idCoordenacao;
	private Integer idFraternidade;
	private Integer idCoordenadora;
	private Integer idTesoureira;
	private Integer idSecretaria;
	private String dataInicio;
	private String dataTermino;
        private String isAtual;

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

        
    public String getIsAtual() {
        return isAtual;
    }

    public void setIsAtual(String isAtual) {
        this.isAtual = isAtual;
    }
	
	public CoordenacaoFraternidadeBean() {
		
	}

	
	
	
	
	
//	 id_coordenacao serial NOT NULL,
//	  coordenadora double precision,
//	  tesoureira double precision,
//	  secretaria double precision,
//	  data_inicio date,
//	  data_termino date,
//	  id_fraternidade integer,

    public Integer getIdCoordenacao() {
        return idCoordenacao;
    }

    public void setIdCoordenacao(Integer idCoordenacao) {
        this.idCoordenacao = idCoordenacao;
    }

    public Integer getIdFraternidade() {
        return idFraternidade;
    }

    public void setIdFraternidade(Integer idFraternidade) {
        this.idFraternidade = idFraternidade;
    }

    public Integer getIdCoordenadora() {
        return idCoordenadora;
    }

    public void setIdCoordenadora(Integer idCoordenadora) {
        this.idCoordenadora = idCoordenadora;
    }

    public Integer getIdTesoureira() {
        return idTesoureira;
    }

    public void setIdTesoureira(Integer idTesoureira) {
        this.idTesoureira = idTesoureira;
    }

    public Integer getIdSecretaria() {
        return idSecretaria;
    }

    public void setIdSecretaria(Integer idSecretaria) {
        this.idSecretaria = idSecretaria;
    }

    

}
