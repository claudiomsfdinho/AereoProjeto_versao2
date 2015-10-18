package to;
import model.Voo;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VooTO implements Serializable {	
	private static final long serialVersionUID = 1L;
	public ArrayList<Voo> voo = new ArrayList<>();
	private int statusOperacao = -2;
	private int perfils = -1;
	public int getStatus(){
		return statusOperacao; 
	}

	public int getPerfil(){
		return perfils;
	}
   public void setStatusOperacao( int newstatus){
	   statusOperacao = newstatus;
   }
   public void setPerfil(int newperfil){
	   perfils = newperfil;
   }
}
