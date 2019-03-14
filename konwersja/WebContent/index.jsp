<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Konwersja temperatury</title>
<meta name="author" content="Maciej Tymorek" >
<meta name="keywords" content="JavaEE, ATJ, HTML, temperatura" >
</head>
<body>
	<h2> Przelicznik temperatury </h2>
	<fieldset>
		<legend> Wprowadz dane </legend>
		
		<form action="Get" method="get">
		<p><label>Podaj liczbę: </lable>
		<input type="number" name="val1" min="-9999" max="9999" >
		<lable>  Celsiusza: </lable>
		</p>
		
		<p><label>Podaj liczbę: </label>
		<input type="number" name="val2" min="-9999" max="9999" >
		<label>  Fahrenheit</label>
		</p>
		
		<p><lable>                 </lable>
		<input type="submit" value="Przelicz">
			
		</p>
		</form>
</body>
</html>