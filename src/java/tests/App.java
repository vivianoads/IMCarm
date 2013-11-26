package tests;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.viviano.imcarm.entidades.CongregacaoBean;
import com.viviano.imcarm.entidades.FraternidadeBean;
import com.viviano.imcarm.entidades.FreiraBean;
import com.viviano.imcarm.entidades.FreiraEquipeBean;
import com.viviano.imcarm.entidades.LoginBean;
import com.viviano.imcarm.persistencia.CongregacaoDao;
import com.viviano.imcarm.persistencia.FraternidadeDao;
import com.viviano.imcarm.persistencia.FreiraDao;
import com.viviano.imcarm.persistencia.LoginDao;



public class App {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
//		FraternidadeDao fraternidadeDao =  new FraternidadeDao();
//		FraternidadeBean fraternidadeBean = new FraternidadeBean();
//		fraternidadeBean = fraternidadeDao.getFraternidade(7);
//		System.out.println(fraternidadeBean.getIdFraternidade());
//		System.out.println(fraternidadeBean.getNome());
//		CongregacaoDao cd = new CongregacaoDao();
//		List<CongregacaoBean> list = new ArrayList<>();
//		try {
//			list = cd.getAllCongregacao();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//			for (int i =0; i < list.size(); i++){
//				System.out.println("id : " + list.get(i).getIdCongregacao() + " nome: " + list.get(i).getNome());
//			}
//			
		
		
		//FreiraDao
		
//		FreiraBean f1 = new FreiraBean(01, 01, "ir. 1", "ir. religiosa", "pai", "mae", new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()));
//		FreiraBean f2 = new FreiraBean(02, 02, "ir. 2", "ir. religiosa2", "pai", "mae", new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()), new Date(Calendar.getInstance().getTimeInMillis()));
//		FreiraDao freiraDao = new FreiraDao();
		
		//inserir 1, n
//		freiraDao.gravaFreira(f1);
//		freiraDao.gravaFreira(f2);
		//Buscar 1, n
		
//		System.out.println(freiraDao.getFreiraBean(01).getNomeCivil());
//		//alterar 1
//		freiraDao.alteraFreira((double) 01, f2);
		
//		//apagar 1
//		freiraDao.apagaFreira(02);
		
		//Congregacao
		
		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//formanda

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//fraternidade

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//GovernoGeral

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//Agregacao

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//ConselhoFiscal

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//CoordenacaoFraternidade

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//EquipeServico

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//Formacao

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//FaseFormacao

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//FormandaEquipe

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//FreiraEquipe

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//MembrosEquipeFormanda

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//MembrosEquipeFreira

		//inserir 1, n
		//Buscar 1, n
		//alterar 1
		//apagar 1
		
		//ResidenciaFraternidade
		
//		FraternidadeDao fraternidadeDao = new FraternidadeDao();
//		System.out.println(fraternidadeDao.getFraternidade(11).getIdFraternidade());
            
            
            //testar Login
            
//            LoginDao ld = new LoginDao();
//            LoginBean lbean = ld.getLoginBean("sineide", "123");
//            System.out.println("Login" + lbean.getLoginFreira());
//            System.out.println("Senha" + lbean.getSenha());
            
            
//            Integer i = 78;
//            System.out.println(i/10+1);
            Integer[] paginacao = new Integer[78/10+1];
            for(int i = 0; i <paginacao.length; i++){
                    paginacao[i] = i+1;
                    System.out.println(paginacao[i]);
                }
            
	}

}
