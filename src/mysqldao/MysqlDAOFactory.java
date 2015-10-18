package mysqldao;
import dao.LoginDAO;
import dao.VooDao;
import dao.AeronaveDAO;
import dao.DAOFactory;

public class MysqlDAOFactory extends DAOFactory {

	
	@Override
	public LoginDAO getLoginDao() {
	     return new MySqlLoginDao();
		// TODO Auto-generated method stub
	
	}
	public AeronaveDAO aeroDAO(){
     return new MySqlAeronaveDAO();
     
	}
	@Override
	public VooDao vooDao() {
		// TODO Auto-generated method stub
		return null;
	}
		
	}



