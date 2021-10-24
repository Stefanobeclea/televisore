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




@WebServlet("/ExecuteDeleteServlet")
public class ExecuteDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public ExecuteDeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parametroIdDellTelevisoreDiCuiVoglioEliminare = request.getParameter("idTelevisoreDaEliminare");
		
		
		TelevisoreService televisoreServiceInstance = MyServiceFactory.getTelevisoreServiceInstance();
		try {
			Televisore televisoreDaEliminare = televisoreServiceInstance.cercaSingoloElemento(Long.parseLong(parametroIdDellTelevisoreDiCuiVoglioEliminare));
			
			televisoreServiceInstance.rimuovi(televisoreDaEliminare);
			
			request.setAttribute("listTelevisoriAttributeName", televisoreServiceInstance.stampaTutto());
			
			String destinazione = "results.jsp";
			
			RequestDispatcher rd = request.getRequestDispatcher(destinazione);
			rd.forward(request, response);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
