package com.viviano.imcarm.entidades;

public class AgregacaoBean {
	
	private Integer fraternidade;
	private Integer freira;
	
	
	public AgregacaoBean(){
		
	}
	public AgregacaoBean( Integer fraternidade,
			Integer freira) {
		
		
		this.fraternidade = fraternidade;
		this.freira = freira;
	}


    public Integer getFraternidade() {
        return fraternidade;
    }

    public void setFraternidade(Integer fraternidade) {
        this.fraternidade = fraternidade;
    }

    public Integer getFreira() {
        return freira;
    }

    public void setFreira(Integer freira) {
        this.freira = freira;
    }


	
}
