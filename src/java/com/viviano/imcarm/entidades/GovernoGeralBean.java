package com.viviano.imcarm.entidades;

public class GovernoGeralBean {
	
	private Integer idGoverno;
	private CongregacaoBean congregacao;
	private FreiraBean MadreGeral, ViceGeral, EconomaGeral, secretariaGeral;
        private FreiraBean[] conselheirasTitulares = new FreiraBean[4];
        private FreiraBean[] conselheirasSuplentes = new FreiraBean[2];
        private FreiraBean[] conselhoFiscal = new FreiraBean[3];
        private String dataInicio;
        private String dataTermino;
        private Boolean isaAtual;
	
	public GovernoGeralBean(){
		
	}

    public FreiraBean[] getConselhoFiscal() {
        return conselhoFiscal;
    }

    public void setConselhoFiscal(FreiraBean[] conselhoFiscal) {
        this.conselhoFiscal = conselhoFiscal;
    }

    public FreiraBean getSecretariaGeral() {
        return secretariaGeral;
    }

    public void setSecretariaGeral(FreiraBean secretariaGeral) {
        this.secretariaGeral = secretariaGeral;
    }

        
    public Integer getIdGoverno() {
        return idGoverno;
    }

    public void setIdGoverno(Integer idGoverno) {
        this.idGoverno = idGoverno;
    }

    public CongregacaoBean getCongregacao() {
        return congregacao;
    }

    public void setCongregacao(CongregacaoBean congregacao) {
        this.congregacao = congregacao;
    }

    public FreiraBean getMadreGeral() {
        return MadreGeral;
    }

    public void setMadreGeral(FreiraBean MadreGeral) {
        this.MadreGeral = MadreGeral;
    }

    public FreiraBean getViceGeral() {
        return ViceGeral;
    }

    public void setViceGeral(FreiraBean ViceGeral) {
        this.ViceGeral = ViceGeral;
    }

    public FreiraBean getEconomaGeral() {
        return EconomaGeral;
    }

    public void setEconomaGeral(FreiraBean EconomaGeral) {
        this.EconomaGeral = EconomaGeral;
    }

    public FreiraBean[] getConselheirasTitulares() {
        return conselheirasTitulares;
    }

    public void setConselheirasTitulares(FreiraBean[] conselheirasTitulares) {
        this.conselheirasTitulares = conselheirasTitulares;
    }

    public FreiraBean[] getConselheirasSuplentes() {
        return conselheirasSuplentes;
    }

    public void setConselheirasSuplentes(FreiraBean[] conselheirasSuplentes) {
        this.conselheirasSuplentes = conselheirasSuplentes;
    }

    public Boolean isIsaAtual() {
        return isaAtual;
    }

    public void setIsaAtual(Boolean isaAtual) {
        this.isaAtual = isaAtual;
    }

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
        
        
}