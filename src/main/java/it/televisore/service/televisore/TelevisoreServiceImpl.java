package it.televisore.service.televisore;

import java.util.List;

import it.televisore.dao.televisore.TelevisoreDAO;
import it.televisore.model.Televisore;



public class TelevisoreServiceImpl implements TelevisoreService{
	private it.televisore.dao.televisore.TelevisoreDAO abitanteDAO;

	public void setTelevisoreDAO(TelevisoreDAO abitanteDAO) {
		this.abitanteDAO = abitanteDAO;
	}

	@Override
	public List<Televisore> cercaPerMarcaEModello(String marca, String modello) {
		// abitanteDAO.setConnection(MyConnection.getConnection());
		return abitanteDAO.findByMarcaAndModello(marca, modello);
	}

	@Override
	public Televisore cercaSingoloElemento(Long id) throws Exception {
		try {
			return abitanteDAO.get(id);
		}catch(Exception e) {
			throw new Exception("Get non ha funzionato");
		}
	}

	@Override
	public int inserisciNuovo(Televisore abitanteInstance) throws Exception {
		return abitanteDAO.insert(abitanteInstance);
	}

	@Override
	public List<Televisore> stampaTutto() throws Exception {
		return abitanteDAO.list();
	}

	@Override
	public int rimuovi(Televisore input) throws Exception {
		return abitanteDAO.delete(input);
	}

	@Override
	public int aggiorna(Televisore input) throws Exception {
		return abitanteDAO.update(input);
	}
}
