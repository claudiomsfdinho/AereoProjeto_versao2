package model;
import java.util.ArrayList;
import java.util.List;

import to.VooTO;

import dao.VooDao;
import dao.DAOFactory;
public class VooControle {
       VooDao voodao;
	 public VooControle(){
		       try{
	    	  DefineBanco df = new DefineBanco();
	    	 if(df.getBancoSelecionado() == 2){
	    		//POSTGREE
	            
	    		 voodao =  DAOFactory.getDAOFactory(1).vooDao();
		         }
	    	 else{ 
	    		 voodao =  DAOFactory.getDAOFactory(0).vooDao();
	    	 }
	    	 
	    		
	     }
			catch(Exception ex){
				System.out.println("ex"+ex);
			}
	 }

		
		
	
		       public void insereVoo(String codigo, String origem, String destino, int escalas, String dataHora, String aeronave, String situacao){
		    		try{
		    		voodao.insereVoo(codigo, origem, destino, escalas, dataHora, aeronave, situacao);
		    		}
		    		catch(Exception ex){
		    		System.out.println("Erro ao inserir Voo");	
		    		}
		    		}
		    		public ArrayList<Voo> getVoo(){
		    			VooTO to = new VooTO();
		    			to.voo = null;
		    			try{
		    			to.voo = voodao.getVoo();
		    			//return to.aeronave;
		    			}
		    			catch(Exception ex){
		    			
		    			}
		    			return to.voo;
		    		}
		    		
		    		public void delVoo(String id){
		    			try{
		    			voodao.delVoo(id);
		    			}
		    			catch(Exception ex){
		    			 ex.printStackTrace();
		    			}
		    		}
		    		public void updVoo(String id, String codigo, String origem, String destino, int escalas, String dataHora, String aeronave, String situacao){
		    			try{
		    				voodao.atualizaVoo(id, codigo, origem, destino, escalas, dataHora, aeronave, situacao);
		    				}
		    				catch(Exception ex){
		    				System.out.println("Erro ao atualizar Voo");	
		    				}
		    		}
		    	}
