package postgreedao;
import java.sql.SQLException;
import java.util.ArrayList;
import dao.AeronaveDAO;
import model.Aeronave;
import mysqldao.NotFoundException;
public class PostgreeAeronaveDao implements AeronaveDAO  {

	@Override
	public Aeronave insereAeronave(String codigo, String nome, int quant_assentos)
			throws NotFoundException, SQLException, NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aeronave atualizaAeronave(String id, String codigo, String nome, int quant_assentos)
			throws NotFoundException, SQLException, NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Aeronave> getAeronave() throws NotFoundException, SQLException, NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aeronave getAeronaveById(int id) throws NotFoundException, SQLException, NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Aeronave delAeronave(String id) throws NotFoundException, SQLException, NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
