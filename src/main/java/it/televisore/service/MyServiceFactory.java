package it.televisore.service;

import it.televisore.dao.MyDaoFactory;
import it.televisore.service.televisore.TelevisoreService;
import it.televisore.service.televisore.TelevisoreServiceImpl;

public class MyServiceFactory {
	// rendiamo questo factory SINGLETON
	private static TelevisoreService ABITANTE_SERVICE_INSTANCE;

	public static TelevisoreService getTelevisoreServiceInstance() {
		if (ABITANTE_SERVICE_INSTANCE == null)
			ABITANTE_SERVICE_INSTANCE = new TelevisoreServiceImpl();

		ABITANTE_SERVICE_INSTANCE.setTelevisoreDAO(MyDaoFactory.getTelevisoreDAOInstance());

		return ABITANTE_SERVICE_INSTANCE;
	}
}
