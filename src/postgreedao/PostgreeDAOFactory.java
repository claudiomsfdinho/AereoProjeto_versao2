package postgreedao;

import dao.AeronaveDAO;
import dao.DAOFactory;
import dao.LoginDAO;
import dao.VooDao;


public class PostgreeDAOFactory extends DAOFactory{
	@Override
	public LoginDAO getLoginDao() {
	     return new PostgreeLoginDao();
		// TODO Auto-generated method stub
	
	}
	public AeronaveDAO aeroDAO(){
	     return new PostgreeAeronaveDao();
	     
		}
	
	@Override
	public VooDao vooDao() {
		// TODO Auto-generated method stub
		return null;
	}
}
