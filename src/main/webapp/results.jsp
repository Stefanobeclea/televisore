<%@page import="it.televisore.model.Televisore"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pagina dei risultati</title>
<style type="text/css">
	table, th, td {
	  border: 1px solid black;
	}
	
	th, td {
	  padding: 10px;
	}
	.center {
		margin-left: auto;
		margin-right: auto;
	}
</style>

</head>
<body>
	<table class="center">
		<thead>
			<tr>
				<th>Marca</th>
				<th>Modello</th>
				<th>Azione</th>
			</tr>
		</thead>
		
		<% List<Televisore> listaDaServlet = (List<Televisore>)request.getAttribute("listTelevisoriAttributeName");
							for(Televisore abitanteItem : listaDaServlet){
				%>
				<tr>
					<td><%=abitanteItem.getMarca() %></td>
					<td><%=abitanteItem.getModello() %></td>
					<td>
						<a href="VisualizzaDettaglioServlet?idDaInviareComeParametro=<%=abitanteItem.getId() %>">Dettaglio</a>
						<a href="PreparaModificaServlet?idDaInviareComeParametro=<%=abitanteItem.getId() %>">Modifica</a>
						<a href="PreparaDeleteServlet?idDaInviareComeParametro=<%=abitanteItem.getId() %>">Rimuovi</a>
					</td>
				</tr>
		<%	}%>
	
	</table>
	<div align="center" style="margin-top: 10px;">
		<a href="PrepareInsertServlet">Inserisci Nuovo</a>
	</div>
	
	
</body>
</html>