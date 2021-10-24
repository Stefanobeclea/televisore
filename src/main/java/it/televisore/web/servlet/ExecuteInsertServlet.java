package it.televisore.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.televisore.model.Televisore;
import it.televisore.service.MyServiceFactory;
import it.televisore.service.televisore.TelevisoreService;

@WebServlet("/ExecuteInsertServlet")
public class ExecuteInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public ExecuteInsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String marcaDaInserire = request.getParameter("marcaInput");
		String modelloDaInserire = request.getParameter("modelloInput");
		String codiceDaInserire = request.getParameter("codiceInput");
	
		
		Televisore televisoreInseritoDalClient = new Televisore(marcaDaInserire, modelloDaInserire, codiceDaInserire);
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		try {
			televisoreServiceInstance.inserisciNuovo(televisoreInseritoDalClient);
			
			request.setAttribute("listTelevisoriAttributeName", televisoreServiceInstance.stampaTutto());
			
			String destinazione = "results.jsp";
			
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
