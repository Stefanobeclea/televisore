package it.televisore.web.servlet;

import java.io.IOException; 

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.televisore.service.MyServiceFactory;
import it.televisore.service.televisore.TelevisoreService;



@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SearchServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String destinazione = "results.jsp";

		String marcaDaPagina = request.getParameter("marcaInput");
		String modelloDaPagina = request.getParameter("modelloInput");

		try {
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		if (marcaDaPagina.equals("") && modelloDaPagina.equals("")) {
			request.setAttribute("listTelevisoriAttributeName", televisoreServiceInstance.stampaTutto());
		} else {
		request.setAttribute("listTelevisoriAttributeName",televisoreServiceInstance.cercaPerMarcaEModello(marcaDaPagina, modelloDaPagina));
		}
		RequestDispatcher rd = request.getRequestDispatcher(destinazione);
		rd.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
