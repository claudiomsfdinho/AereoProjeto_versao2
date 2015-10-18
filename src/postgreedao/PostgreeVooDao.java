package postgreedao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import to.VooTO;
import dao.VooDao;
import model.Voo;
import postgreedao.PostgreeAcessoBD;
import mysqldao.NotFoundException;
public class PostgreeVooDao implements VooDao {
	
	Connection conn=null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	
	public PostgreeVooDao() {
    	try{
    		conn = PostgreeAcessoBD.obtemConexao();
    	}
    	catch(Exception ex){
    		System.out.println("Erro ao setar a string"+ex);
	}
	}

	@Override
	public Voo insereVoo(String codigo, String origem, String destino, int escalas, String dataHora, String aeronave, String situacao)
			throws NotFoundException, SQLException, NotFoundException {
      String query = "INSERT INTO VOO(cod_voo, origem, destino, escalas, data, tipo_aeronave, situacao) VALUES('"+codigo+"' , '"+origem+"' , "+destino+"', '"+escalas+"' , '"+dataHora+"', '"+aeronave+"', '"+situacao+");";
    VooTO to = new VooTO();
      try{
		
        
        pst = conn.prepareStatement(query);
		pst.execute();
		/*
		query = "Select * from aeronave where codigo = '"+codigo+"'";
		pst = conn.prepareStatement(query);
		rs = pst.executeQuery();
		while(rs.next()) {
		int id = rs.getInt(1);
		String codigos = rs.getString(2);
		String nomes = rs.getString(3);
		int qa = rs.getInt(4);
	    Aeronave aero = new Aeronave(id, codigos, nomes, qa);
	    to.aeronave.add(aero);
		}
		*/
		//rs.close();
		//pst.close();
	    to.setStatusOperacao(0);//status ok 
		}
	    catch (SQLException sqe) {
	    	to.setStatusOperacao(1);//falha 
			sqe.printStackTrace();
		} 
      finally {
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
	@Override
	public Voo atualizaVoo(String id, String codigo, String origem, String destino, int escalas, String dataHora, String aeronave, String situacao)
			throws NotFoundException, SQLException, NotFoundException {
		
		  String query = "UPDATE VOO SET CODIGO =(cod_voo, origem, destino, escalas, data, tipo_aeronave, situacao) VALUES('"+id+"','"+codigo+"' , '"+origem+"' , "+destino+"', '"+escalas+"' , '"+dataHora+"', '"+aeronave+"', '"+situacao+");";
          VooTO to = new VooTO();
          try{
			pst = conn.prepareStatement(query);
			pst.execute();
          }
          catch (SQLException sqe) {
		    	to.setStatusOperacao(1);//falha 
				sqe.printStackTrace();
			} 
          finally {
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
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Voo> getVoo() throws NotFoundException, SQLException, NotFoundException {
		VooTO to = new VooTO();
		ArrayList<Voo>lista = new ArrayList<>();
		try{
			
        	String query = "Select * from voo ";
            pst = conn.prepareStatement(query);
			rs = pst.executeQuery();
			while(rs.next()) {
			int id = rs.getInt(1);
			String codigo = rs.getString(2);
			String origem = rs.getString(3);
			String destino = rs.getString(4);
			int escalas = rs.getInt(5);
			String dataHora = rs.getString(6);
			String aeronave = rs.getString(7);
			String situacao = rs.getString(8);
		    Voo voo = new Voo(id , codigo, origem, destino , escalas, dataHora, aeronave, situacao);
		   lista.add(voo);
			}
		
		    //to.setStatusOperacao(0);//status ok 
			}
		    catch (SQLException sqe) {
		    	to.setStatusOperacao(1);//falha 
				sqe.printStackTrace();
			} 
          finally {
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
				 to.voo = lista;
			     return to.voo;
					
			}
	}
           
		
		

		
		
	
	@Override
	public Voo getVooById(int id) throws NotFoundException, SQLException, NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Voo delVoo(String id) throws NotFoundException, SQLException, NotFoundException {
		String query = "delete from aeronave where aeronave_id = "+ id + ";";

         VooTO to = new VooTO();
          try{
			pst = conn.prepareStatement(query);
			pst.execute();
          }
          catch (SQLException sqe) {
		    	to.setStatusOperacao(1);//falha 
				sqe.printStackTrace();
			} 
          finally {
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
		// TODO Auto-generated method stub
		return null;
	// TODO Auto-generated method stub
	
	}

	@Override
	public ArrayList<Voo> getAeronaveByNome() throws NotFoundException,
			SQLException, NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

		
		
}
