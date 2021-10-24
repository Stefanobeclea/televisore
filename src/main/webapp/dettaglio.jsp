<%@page import="it.televisore.model.Televisore"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Dettaglio Televisore</title>
	</head>
	<body>
		<h2>
		Dettaglio del televisore:<br>
		<%Televisore televisorePerDettaglio = (Televisore)request.getAttribute("televisoreDaInviareAPaginaDettalio"); %>
		Marca: <%= televisorePerDettaglio.getMarca() %><br>
		Modello: <%= televisorePerDettaglio.getModello() %><br>
		Codice: <%= televisorePerDettaglio.getCodice() %><br>
		</h2>
	</body>
</html>