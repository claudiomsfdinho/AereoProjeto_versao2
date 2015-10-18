package mysqldao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Login;
import to.LoginTO;
import dao.LoginDAO;
public  class MySqlLoginDao implements LoginDAO {
Connection conn=null;
		public MySqlLoginDao() {
	
		}
		    public Login selecionarLogin(String nome, String senha){
                ResultSet rs = null;
			    PreparedStatement pst = null;
		    	try{
		    		conn = MySqlAcessoBd.obtemConexao();
		            String query = "select perfil from login where usuario = '"+nome+"'and senha ='"+senha+"'";
			
			LoginTO to = new LoginTO();

			pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			while   (rs.next()) {
			to.setPerfil(rs.getInt(1));	
			}
			rs.close();
			pst.close();
		
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




