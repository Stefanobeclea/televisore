<%@page import="it.televisore.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Modifica televisore</title>
	</head>
	<body>
		<%Televisore televisorePerModificare = (Televisore)request.getAttribute("televisoreDaInviareAPaginaModifica"); %>
		Completa i campi per aggiornare un Televisore: <br>
		<form action="ExecuteModificaServlet" method="post">
			<input type="hidden" name="idInput" value="<%= televisorePerModificare.getId()%>">			
			<label for="marcaInputId">Marca:</label><br>
			<input type="text" name="marcaInput" id="marcaInputId" value="<%= televisorePerModificare.getMarca()%>">
			<br>
			<label for="modelloInputId">Modello:</label><br>
			<input type="text" name="modelloInput" id="modelloInputId" value="<%= televisorePerModificare.getModello()%>">
			<br>
			<label for="codiceFiscaleInputId">Codice :</label><br>
			<input type="text" name="codiceInput" id="codiceFiscaleInputId" value="<%= televisorePerModificare.getCodice()%>">
			<br><br>
		<input type="submit" value="Modifica">
	
	</form>
	</body>
</html>