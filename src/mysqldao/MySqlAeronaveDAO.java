package mysqldao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Aeronave;
import model.Voo;
import dao.AeronaveDAO;
import to.AeronaveTO;

import java.util.ArrayList;
import java.util.List;
public class MySqlAeronaveDAO implements AeronaveDAO {
Connection conn=null;
ResultSet rs = null;
PreparedStatement pst = null;

			public MySqlAeronaveDAO() {
            	try{
            		conn = MySqlAcessoBd.obtemConexao();
            	}
            	catch(Exception ex){
            		System.out.println("Erro ao setar a string"+ex);
			}
			}
			
				@Override
				public Aeronave insereAeronave(String codigo, String nome, int quant_assentos)
						throws NotFoundException, SQLException, NotFoundException {
                  String query = "INSERT INTO AERONAVE(CODIGO,NOME,QUANT_PASSAGEIROS)VALUES('"+codigo+"' , '"+nome+"' , "+quant_assentos+");";
                  AeronaveTO to = new AeronaveTO();
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
				public Aeronave atualizaAeronave(String id, String codigo, String nome, int quant_assentos)
						throws NotFoundException, SQLException, NotFoundException {
					
					  String query = "UPDATE AERONAVE SET CODIGO = '"+codigo+"', nome = '"+nome+"', QUANT_PASSAGEIROS = "+quant_assentos+" where aeronave_id = "+id+";";
	                  AeronaveTO to = new AeronaveTO();
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
				public ArrayList<Aeronave> getAeronave() throws NotFoundException, SQLException, NotFoundException {
					AeronaveTO to = new AeronaveTO();
					ArrayList<Aeronave>lista = new ArrayList<>();
					try{
						
	                	String query = "Select * from aeronave ";
	                    pst = conn.prepareStatement(query);
						rs = pst.executeQuery();
						while(rs.next()) {
						int id = rs.getInt(1);
						String codigos = rs.getString(2);
						String nomes = rs.getString(3);
						int qa = rs.getInt(4);
					    Aeronave aero = new Aeronave(id, codigos, nomes, qa);
					   lista.add(aero);
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
							 to.aeronave = lista;
						     return to.aeronave;
								
						}
				}
                       
					
					

					
					
				
				@Override
				public Aeronave getAeronaveById(int id) throws NotFoundException, SQLException, NotFoundException {
					// TODO Auto-generated method stub
					return null;
				}
				@Override
				public Aeronave delAeronave(String id) throws NotFoundException, SQLException, NotFoundException {
					String query = "delete from aeronave where aeronave_id = "+ id + ";";

	                  AeronaveTO to = new AeronaveTO();
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
			
					
					
		}





	
	
	


