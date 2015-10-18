package mysqldao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlAcessoBd {
		
		
            public static Connection obtemConexao() throws SQLException {
            	try {
    				Class.forName("com.mysql.jdbc.Driver");
    				DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    			    return DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto","root","root");
    			} 
        		catch (ClassNotFoundException e) {
    				e.printStackTrace();
    			   return null;
            }
            }
	
            	
            
        		


}