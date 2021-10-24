package it.televisore.dao.televisore;

import java.util.List;

import it.televisore.dao.IBaseDAO;
import it.televisore.model.Televisore;

public interface TelevisoreDAO extends IBaseDAO<Televisore>{
	public List<Televisore> findByMarcaAndModello(String marca, String modello);
}
