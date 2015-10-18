package postgreedao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Login;
import to.LoginTO;
import dao.LoginDAO;

public class PostgreeLoginDao implements LoginDAO {
	        
			public  PostgreeLoginDao() {
				// TODO Auto-generated constructor stub
			}
			      Connection conn=null;
		          public Login selecionarLogin(String nome, String senha){
	                ResultSet rs = null;
				    PreparedStatement pst = null;
			    	try{
			    		conn = PostgreeAcessoBD.obtemConexao();
			            if(conn != null){
			    		String query = "select perfil from login where usuario = '"+nome+"'and senha ='"+senha+"'";
				        LoginTO to = new LoginTO();
                pst = conn.prepareStatement(query);
				rs = pst.executeQuery();
				while (rs.next()) {
				to.setPerfil(rs.getInt(1));	
				}
				rs.close();
				pst.close();
			            }
				}
			    catch (SQLException sqe) {
					sqe.printStackTrace();
				} finally {
					if (rs != null) {
						try {
							rs.close();
						} catch (SQLException sqe) {
							sqe.printStackTrace();
						}
					}
					if (pst != null) {
						try {
							pst.close();
						} catch (SQLException sqe) {
							sqe.printStackTrace();
						}
					}
				}
					return null;
				
			
			
			}
			
		}





	


