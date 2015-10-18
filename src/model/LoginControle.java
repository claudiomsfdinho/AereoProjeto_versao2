package model;
import dao.LoginDAO;
import dao.DAOFactory;
public class LoginControle {
	public LoginControle(String usuario, String senha){
     try{
    	  DefineBanco df = new DefineBanco();
    	 if(df.getBancoSelecionado() == 2){
    		//POSTGREE
          LoginDAO logindao=  DAOFactory.getDAOFactory(1).getLoginDao();
	      logindao.selecionarLogin(usuario, senha);
	         }
    	 else{ 
    		 LoginDAO logindao=  DAOFactory.getDAOFactory(0).getLoginDao();
   	         logindao.selecionarLogin(usuario, senha);
    	 }
    	 
    		
     }
		catch(Exception ex){
			System.out.println("ex"+ex);
		}
		}
   
	}
	

