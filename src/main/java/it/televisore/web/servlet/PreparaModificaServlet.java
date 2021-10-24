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



@WebServlet("/PreparaModificaServlet")
public class PreparaModificaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public PreparaModificaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parametroIdDellTelevisoreDiCuiVoglioIlDettaglio = request.getParameter("idDaInviareComeParametro");
		
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		
		try {
			Televisore result = televisoreServiceInstance.cercaSingoloElemento(Long.parseLong(parametroIdDellTelevisoreDiCuiVoglioIlDettaglio));
			request.setAttribute("televisoreDaInviareAPaginaModifica", result);
			
			String destinazione = "modifica.jsp";
			
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}


