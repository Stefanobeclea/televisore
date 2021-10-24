package it.televisore.service.televisore;

import java.util.List;

import it.televisore.dao.televisore.TelevisoreDAO;
import it.televisore.model.Televisore;

public interface TelevisoreService {
public void setTelevisoreDAO(TelevisoreDAO abitanteDAO);
	
	public List<Televisore> stampaTutto () throws Exception;

	public List<Televisore> cercaPerMarcaEModello(String marca, String modello);
	
	public Televisore cercaSingoloElemento (Long id) throws Exception;
	
	public int inserisciNuovo (Televisore abitanteInstance) throws Exception;
	
	public int rimuovi(Televisore input) throws Exception;
	
	public int aggiorna(Televisore input) throws Exception;
}
