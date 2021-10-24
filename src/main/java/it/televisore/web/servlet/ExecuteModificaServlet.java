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


@WebServlet("/ExecuteModificaServlet")
public class ExecuteModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExecuteModificaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long idTelevisoreDaAggiornare = Long.parseLong(request.getParameter("idInput"));
		String marcaDaAggiornare = request.getParameter("marcaInput");
		String modelloDaAggiornare = request.getParameter("modelloInput");
		String codiceDaAggiornare = request.getParameter("codiceInput");
		
		Televisore televisoreInseritoDalClient = new Televisore(idTelevisoreDaAggiornare ,marcaDaAggiornare, modelloDaAggiornare, codiceDaAggiornare);
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		try {
			
			if(televisoreServiceInstance.aggiorna(televisoreInseritoDalClient) == 0) {
				throw new Exception("L'id del televisore da modificare non è presente nel DB");
			}
			
			request.setAttribute("listTelevisoriAttributeName", televisoreServiceInstance.stampaTutto());
			
			String destinazione = "results.jsp";
			
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
