package model;

public class DefineBanco {
	private  int MYSQL=1;
	private  int POSTGRE=0;
	public int getBancoSelecionado(){
	
		if(POSTGRE == 1){
			return 2;
		}
		else {
		return 1;
		}
	}
	
	
}
