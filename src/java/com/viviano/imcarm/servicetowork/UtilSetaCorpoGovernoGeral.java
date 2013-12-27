package com.viviano.imcarm.servicetowork;

import java.util.HashMap;
import java.util.Map;


import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.GovernoGeralBean;

public class UtilSetaCorpoGovernoGeral {
    private static final Map<String, Integer> mapMethods;

    static{
        mapMethods = new HashMap<String, Integer>();
	mapMethods.put("madre", 1);
	mapMethods.put("vice", 2);
	mapMethods.put("economa", 3);
	mapMethods.put("secretaria", 4);
	mapMethods.put("conselheira_titular1", 5);
	mapMethods.put("conselheira_titular2", 6);
	mapMethods.put("conselheira_titular3", 7);
	mapMethods.put("conselheira_titular4", 8);
	mapMethods.put("conselheira_suplente1", 9);
	mapMethods.put("conselheira_suplente2", 10);
	mapMethods.put("conselheira_fiscal1", 11);
        mapMethods.put("conselheira_fiscal2", 12);
        mapMethods.put("conselheira_fiscal3", 13);
    }
    
    
	
	
	
//	public void UtilSetaCorpoGovernoGeral(String funcao, FreiraBean freira, GovernoGeralBean governoGeralBean){
//		mapMethods = new HashMap<String, GovernoGeralBean>();
//		mapMethods.put("madre", this.setaMadreGeral(governoGeralBean, freira));
//		mapMethods.put("vice", this.setaViceGeral(governoGeralBean, freira));
//		mapMethods.put("economa", this.setaEconomaGeral(governoGeralBean, freira));
//		mapMethods.put("secretaria", this.setaSecretariaGeral(governoGeralBean, freira));
//		mapMethods.put("conselheira_titular1", this.setaConselheirasTitularesGeral(governoGeralBean, freira, funcao));
//		mapMethods.put("conselheira_titular2", this.setaConselheirasTitularesGeral(governoGeralBean, freira, funcao));
//		mapMethods.put("conselheira_titular3", this.setaConselheirasTitularesGeral(governoGeralBean, freira, funcao));
//		mapMethods.put("conselheira_titular4", this.setaConselheirasTitularesGeral(governoGeralBean, freira, funcao));
//		mapMethods.put("conselheira_suplente1", this.setaConselheiraSuplenteGeral(governoGeralBean, freira, funcao));
//		mapMethods.put("conselheira_suplente2", this.setaConselheiraSuplenteGeral(governoGeralBean, freira, funcao));
//		mapMethods.put("conselheira_fiscal1", this.setaConselheirasFiscaisGeral(governoGeralBean, freira, funcao));
//                mapMethods.put("conselheira_fiscal2", this.setaConselheirasFiscaisGeral(governoGeralBean, freira, funcao));
//                mapMethods.put("conselheira_fiscal3", this.setaConselheirasFiscaisGeral(governoGeralBean, freira, funcao));
//	}
	
        
        
        
        
        
        
	public GovernoGeralBean getCommand(GovernoGeralBean governoGeralBean, FreiraBean freiraBean, String opcao){
            
            switch(mapMethods.get(opcao)){
            case(1): governoGeralBean = setaMadreGeral(governoGeralBean, freiraBean);break;
            case(2): governoGeralBean = setaViceGeral(governoGeralBean, freiraBean);break;
            case(3): governoGeralBean = setaEconomaGeral(governoGeralBean, freiraBean);break;
            case(4): governoGeralBean = setaSecretariaGeral(governoGeralBean, freiraBean);break;
            case(5): governoGeralBean = setaConselheirasTitularesGeral(governoGeralBean, freiraBean, opcao);break;
            case(6): governoGeralBean = setaConselheirasTitularesGeral(governoGeralBean, freiraBean, opcao);break;
            case(7): governoGeralBean = setaConselheirasTitularesGeral(governoGeralBean, freiraBean, opcao);break;
            case(8): governoGeralBean = setaConselheirasTitularesGeral(governoGeralBean, freiraBean, opcao);break;
            case(9): governoGeralBean = setaConselheiraSuplenteGeral(governoGeralBean, freiraBean, opcao);break;
            case(10): governoGeralBean = setaConselheiraSuplenteGeral(governoGeralBean, freiraBean, opcao);break;
            case(11): governoGeralBean = setaConselheirasFiscaisGeral(governoGeralBean, freiraBean, opcao);break;
            case(12): governoGeralBean = setaConselheirasFiscaisGeral(governoGeralBean, freiraBean, opcao);break;
            case(13): governoGeralBean = setaConselheirasFiscaisGeral(governoGeralBean, freiraBean, opcao);break;
	
        }
		return governoGeralBean;
	}
	
        private static GovernoGeralBean setaMadreGeral(GovernoGeralBean governoGeralBean, FreiraBean freiraBean){
            governoGeralBean.setMadreGeral(freiraBean);
            return governoGeralBean;
        }
        private static GovernoGeralBean setaViceGeral(GovernoGeralBean governoGeralBean, FreiraBean freiraBean){
            governoGeralBean.setViceGeral(freiraBean);
            return governoGeralBean;
        }
        private static GovernoGeralBean setaEconomaGeral(GovernoGeralBean governoGeralBean, FreiraBean freiraBean){
            governoGeralBean.setEconomaGeral(freiraBean);
            return governoGeralBean;
        }
        private static GovernoGeralBean setaSecretariaGeral(GovernoGeralBean governoGeralBean, FreiraBean freiraBean){
            governoGeralBean.setSecretariaGeral(freiraBean);
            return governoGeralBean;
        }
        private static GovernoGeralBean setaConselheirasTitularesGeral(GovernoGeralBean governoGeralBean, FreiraBean freiraBean, String funcao){
            FreiraBean[] conselheirasTitulares = governoGeralBean.getConselheirasTitulares();
            Integer index = new Integer(funcao.substring(funcao.length()-1))-1;
            conselheirasTitulares[index] = freiraBean;
//            for(int i = 0; i < conselheirasTitulares.length; i++){
//                if(conselheirasTitulares[i] == null) {
//                    conselheirasTitulares[i] = freiraBean;
//                    break;
//                }
//            }
            governoGeralBean.setConselheirasTitulares(conselheirasTitulares);
            return governoGeralBean;
        }
        private static GovernoGeralBean setaConselheiraSuplenteGeral(GovernoGeralBean governoGeralBean, FreiraBean freiraBean, String funcao){
            FreiraBean[] conselheirasSuplentes = governoGeralBean.getConselheirasSuplentes();
            Integer index = new Integer(funcao.substring(funcao.length()-1))-1;
            conselheirasSuplentes[index] = freiraBean;
            governoGeralBean.setConselheirasSuplentes(conselheirasSuplentes);
            return governoGeralBean;
        }
        private static GovernoGeralBean setaConselheirasFiscaisGeral(GovernoGeralBean governoGeralBean, FreiraBean freiraBean, String funcao){
            FreiraBean[] conselheirasFiscais = governoGeralBean.getConselhoFiscal();
            Integer index = new Integer(funcao.substring(funcao.length()-1))-1;
            conselheirasFiscais[index] = freiraBean;
            governoGeralBean.setConselhoFiscal(conselheirasFiscais);
            return governoGeralBean;
        }

}
