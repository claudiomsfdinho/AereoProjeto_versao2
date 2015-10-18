package dao;
import java.sql.SQLException;

import model.Aeronave;
import model.Voo;
import mysqldao.NotFoundException;

import java.util.ArrayList;
import java.util.List;
public interface VooDao {

public abstract Voo insereVoo(String codigo , String origem, String destino , int escalas, String dataHora, String aeronave, String situacao)
				throws NotFoundException,SQLException, NotFoundException;

		public abstract Voo atualizaVoo(String id, String codigo , String origem, String destino , int escalas, String dataHora, String aeronave, String situacao)
				throws NotFoundException,SQLException, NotFoundException;

		public abstract ArrayList<Voo> getVoo()
				throws NotFoundException,SQLException, NotFoundException;

		public abstract Voo getVooById(int id)
				throws NotFoundException,SQLException, NotFoundException;
	       
		public abstract Voo delVoo(String id) throws NotFoundException,SQLException, NotFoundException;

		public abstract ArrayList<Voo> getAeronaveByNome()
				throws NotFoundException,SQLException, NotFoundException;


}
	
	
	
	
	
	
	
	
	
	
	

