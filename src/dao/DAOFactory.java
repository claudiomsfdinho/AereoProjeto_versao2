package dao;
//import factory.CategoriasDAOFactory;
//import factory.CervejaDAOFactory;
import mysqldao.MysqlDAOFactory;
import postgreedao.PostgreeDAOFactory;;
public abstract class DAOFactory {
        public abstract LoginDAO getLoginDao();
        public abstract AeronaveDAO aeroDAO();
        public abstract VooDao vooDao();
        public static DAOFactory getDAOFactory(int qualFactory) {
			    if(qualFactory == 1){
				return new PostgreeDAOFactory();
			    }
			    else {
			    	return new MysqlDAOFactory();
			    
			    }
			    
		}
	}
	

	

	


