package dao;
import java.sql.SQLException;
import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.List;
import model.Login;
import mysqldao.NotFoundException;
public interface LoginDAO {
public abstract Login selecionarLogin(String usuario, String senha)
		throws NotFoundException,SQLException, NotFoundException;






}


