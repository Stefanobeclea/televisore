<%@page import="it.televisore.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Elimina Televisore</title>
	</head>
	<body>
		<h2>
			Dettaglio dell'abitante:<br>
			<%Televisore abitantePerDettaglio = (Televisore)request.getAttribute("televisoreDaInviareAPaginaDettalio"); %>
			Marca: <%= abitantePerDettaglio.getMarca() %><br>
			Modello: <%= abitantePerDettaglio.getModello() %><br>
			Codice: <%= abitantePerDettaglio.getCodice() %><br>
			Conferma per eliminare l'abitante:<br>
		</h2>
		<form action="ExecuteDeleteServlet" method="post">
			<input type="hidden" name="idTelevisoreDaEliminare" value="<%= abitantePerDettaglio.getId()%>">			
			<input type="submit" value="Conferma">
		</form>
		
	</body>
</html>