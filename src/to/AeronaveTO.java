package to;
import model.Aeronave;
import java.io.Serializable;
import java.util.ArrayList;

public class AeronaveTO implements Serializable {	
	private static final long serialVersionUID = 1L;
	public ArrayList<Aeronave> aeronave = new ArrayList<>();
	private int statusOperacao = -2;
	private int perfils = -1;
	public int getStatus(){
		return statusOperacao; 
	}

	public int getPeril(){
		return perfils;
	}
   public void setStatusOperacao( int newstatus){
	   statusOperacao = newstatus;
   }
   public void setPerfil(int newperfil){
	   perfils = newperfil;
   }
}
