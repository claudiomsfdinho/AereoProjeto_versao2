package model;
import dao.DAOFactory;
import to.AeronaveTO;
import dao.AeronaveDAO;
import java.util.ArrayList;
public class AeronaveEspecialista {
  AeronaveDAO aerodao;
	public AeronaveEspecialista(){
		try{
	    	  DefineBanco df = new DefineBanco();
	    	 if(df.getBancoSelecionado() == 2){
	    		//POSTGREE
	            
	    		 aerodao =  DAOFactory.getDAOFactory(1).aeroDAO();
		         }
	    	 else{ 
	    		 aerodao =  DAOFactory.getDAOFactory(0).aeroDAO();
	    	 }
	    	 
	    		
	     }
			catch(Exception ex){
				System.out.println("ex"+ex);
			}

	}
	
	public void insereAeronave(String nome, String codigo, int quantassentos){
	try{
	aerodao.insereAeronave(codigo, nome, quantassentos);
	}
	catch(Exception ex){
	System.out.println("Erro ao inserir aeronave");	
	}
	}
	public ArrayList<Aeronave> getAeronave(){
		AeronaveTO to = new AeronaveTO();
		to.aeronave = null;
		try{
		to.aeronave = aerodao.getAeronave();
		//return to.aeronave;
		}
		catch(Exception ex){
		
		}
		return to.aeronave;
	}
	
	
	
	public void delAeronave(String id){
		try{
		aerodao.delAeronave(id);
		}
		catch(Exception ex){
		 ex.printStackTrace();
		}
	}
	public void updAeronave(String id ,String nome, String codigo, int quantassentos){
		try{
			aerodao.atualizaAeronave(id,codigo, nome, quantassentos);
			}
			catch(Exception ex){
			System.out.println("Erro ao stualizar aeronave");	
			}
	}
}
