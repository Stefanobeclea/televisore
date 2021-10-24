package it.televisore.dao;

import it.televisore.dao.televisore.TelevisoreDAO;
import it.televisore.dao.televisore.TelevisoreDAOImpl;

public class MyDaoFactory {

	private static TelevisoreDAO ABITANTE_DAO_INSTANCE = null;

	public static TelevisoreDAO getTelevisoreDAOInstance() {
		if (ABITANTE_DAO_INSTANCE == null)
			ABITANTE_DAO_INSTANCE = new TelevisoreDAOImpl();

		return ABITANTE_DAO_INSTANCE;
	}

}
