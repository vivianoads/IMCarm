package com.viviano.imcarm.entidades;

public class FaseFormacaoBean {
	
	private int idFase;
	private String nome;
        private FormandaBean formanda;
        private String dataEntrada;
        private String dataSaida;

    public FormandaBean getFormanda() {
        return formanda;
    }

    public void setFormanda(FormandaBean formanda) {
        this.formanda = formanda;
    }

    

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }
	
	

	public int getIdFase() {
		return idFase;
	}


	public void setIdFase(int idFase) {
		this.idFase = idFase;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
