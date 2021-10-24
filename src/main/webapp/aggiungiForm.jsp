<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Inserisci televisore</title>
	</head>
	<body>
		Completa i campi per aggiungere un nuovo Televisore: <br>
		<form action="ExecuteInsertServlet" method="post">
			<label for="marcaInputId">Marca:</label><br>
			<input type="text" name="marcaInput" id="marcaInputId">
			<br>
			<label for="modelloInputId">Modello:</label><br>
			<input type="text" name="modelloInput" id="modelloInputId">
			<br>
			<label for="codiceFiscaleInputId">Codice :</label><br>
			<input type="text" name="codiceInput" id="codiceInputId">
			<br><br>
		<input type="submit" value="Inserisci">
	
	</form>
	</body>
</html>