package it.televisore.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import it.televisore.model.Televisore;



public class DB_Mock {
	public static final List<Televisore> LISTA_TELEVISORI = new ArrayList<>();

	static {
		// preparo una lista mock perché ancora non ho il collegamento alla
		// base dati
		LISTA_TELEVISORI.add(new Televisore(1l, "Samsung", "A23", "mrs111"));
		LISTA_TELEVISORI.add(new Televisore(2l, "Samsung23", "A3", "mrs222"));
		LISTA_TELEVISORI.add(new Televisore(3l, "Samsung4", "A24", "mrs333"));
		LISTA_TELEVISORI.add(new Televisore(4l, "Samsung6", "bianchi", "pppbbb4"));
		LISTA_TELEVISORI.add(new Televisore(5l, "Samsung7", "rossi", "plros"));
		LISTA_TELEVISORI.add(new Televisore(6l, "Samsung8", "rossi36", "mrs366"));
		LISTA_TELEVISORI.add(new Televisore(7l, "LG", "sattoni", "mrs333"));
	}

	public static Long getNexIdAvailable() {
		Long resultId = null;
		if (LISTA_TELEVISORI == null || LISTA_TELEVISORI.isEmpty()) {
			resultId = 1L;
		}
		resultId=LISTA_TELEVISORI.stream().max(Comparator.comparing(Televisore::getId)).get().getId();
		return ++resultId;
	}

}
