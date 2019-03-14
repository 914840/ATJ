<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> Generator równań </h2>
	<h4> przetestuj swoje umiejętności rozwiązując losowe równania z jedną niewiadomą w przedziale liczb całkowitych od -10 do 10. </h4>
	<fieldset>
		<legend> Rozwiąż równania </legend>
		
		<form action="Get" method="post">
		
		<!-- Dyrektywa - importowanioe pakietów -->
		<%@ page import="atj.*, java.util.*" %>
		
		<!-- Skryplet - kod w jezyku java -->
		<% 	Random rand = new Random(); 
			int x1 = rand.nextInt(10);
			int y1 = rand.nextInt(10);
			
			int x2 = rand.nextInt(10);
			int y2 = rand.nextInt(10);
			
			int x3 = rand.nextInt(4);
			int y3 = rand.nextInt(5);
			
			int x4 = rand.nextInt(9)+1;
			int y4 = (x4 * rand.nextInt(10));
			
			int x5 = rand.nextInt(9) + 1;
			int y5 = (x5 * rand.nextInt(10));
			
			int x6 = rand.nextInt(9) + 1;
			int y6 = (x6 * rand.nextInt(10));
			
			int x7 = rand.nextInt(9) + 1;
			int y7 = (x7 * rand.nextInt(10));
			
			int x8 = rand.nextInt(10);
			int y8 = rand.nextInt(10);
			
			int x9 = rand.nextInt(10);
			int y9 = rand.nextInt(10);
			
			int x10 = rand.nextInt(4)+1;
			int y10 = rand.nextInt(10);
		%>
		
		<p>
		<%=x1%> + x = <%=y1%>      	Podaj x:    <input type="number" name="o1" min="-10" max="10" step="1" >
		<% 
			int w1 = y1 - x1; 
			String rownanie1 = x1 + " + x = " + y1;					
		%>
		</p>
		
		<p>
		x + <%=x2%> = <%=y2%>     	Podaj x:    <input type="number" name="o2" min="-10" max="10" step="1" >
		<% 
			int w2 = y2 - x2; 
			String rownanie2 = "x + " + x2 + " = " + y2;
		%>
		</p>
		
		<p>
		x + <%=x3%> = <%=-y3%>      Podaj x:    <input type="number" name="o3" min="-10" max="10" step="1" >
		<%
			int w3 = -y3 - x3;
			String rownanie3 = "x + " + x3 +" = " + -y3;		
		%>
		</p>
		
		<p>
		x * <%=x4%> = <%=y4 %>   	Podaj x: 	<input type="number" name="o4" min="-10" max="10" step="1" >
		<% 
			int w4 = y4 / x4;
			String rownanie4 = "x * " + x4 +" = "+ y4;
		%>
		</p>
		
		<p>
		<%=y5%> / x = <%= x5 %>		Podaj x: 	<input type="number" name="o5" min="-10" max="10" step="1" >
		<% 
			int w5 = y5 / x5; 
			String rownanie5 = y5 + " / x = " + x5;
		%>
		</p>
		
		<p>
		x * <%=x6%> = <%=y6%> 		Podaj x:	<input type="number" name="o6" min="-10" max="10" step="1" >
		<% 
			int w6 = y6 / x6;
			String rownanie6 = "x * " + x6 + " = " + y6;
		%>
		</p>
		
		<p>
		<%=y7%> / x = <%=x7 %>		Podaj x: 	<input type="number" name="o7" min="-10" max="10" step="1" >
		<% 
			int w7 = y7 / x7;
			String rownanie7 = y7 + " / x = "+ x7;
		%>
		
		</p>
		
		<p>
		x + <%=x8 %> + 3 = <%=y8 %> Podaj x: 	<input type="number" name="o8" min="-10" max="10" step="1" >
		<% 
			int w8 = y8 - 3 - x8;
			String rownanie8 = "x + "+ x8 + " + 3 = " + y8;
		%>
		</p>
		
		<p>
		x + <%=x9 %> - 1 = <%=y9 %> Podaj x: 	<input type="number" name="o9" min="-10" max="10" step="1" >
		<% 
			int w9 = y9 + 1 - x9;
			String rownanie9 = "x + " + x9 +" - 1 = " + y9;
		%>
		</p>
		
		<p>
		x - <%=x10 %>  = <%=y10 %> Podaj x: 	<input type="number" name="o10" min="-10" max="10" step="1" >
		<% 
			int w10 = y10 + x10; 
			String rownanie10 = "x - " + x10 + " = " + y10;
		%>
		</p>
		
		<p>
		<% 	String wynik1 = String.valueOf(w1); 
			String wynik2 = String.valueOf(w2);
			String wynik3 = String.valueOf(w3);
		 	String wynik4 = String.valueOf(w4); 
		 	String wynik5 = String.valueOf(w5); 
		 	String wynik6 = String.valueOf(w6); 
		 	String wynik7 = String.valueOf(w7); 
		 	String wynik8 = String.valueOf(w8); 
		 	String wynik9 = String.valueOf(w9); 
		 	String wynik10 = String.valueOf(w10); 
		%>
		
		<% 	response.addCookie(new Cookie("w1", wynik1)); 
			response.addCookie(new Cookie("w2", wynik2)); 
		 	response.addCookie(new Cookie("w3", wynik3)); 
		 	response.addCookie(new Cookie("w4", wynik4)); 
		 	response.addCookie(new Cookie("w5", wynik5)); 
		 	response.addCookie(new Cookie("w6", wynik6)); 
		 	response.addCookie(new Cookie("w7", wynik7)); 
		 	response.addCookie(new Cookie("w8", wynik8)); 
		 	response.addCookie(new Cookie("w9", wynik9)); 
		 	response.addCookie(new Cookie("w10", wynik10)); 
		 	
		 	response.addCookie(new Cookie("rownanie1", rownanie1));
		 	response.addCookie(new Cookie("rownanie2", rownanie2));
		 	response.addCookie(new Cookie("rownanie3", rownanie3));
		 	response.addCookie(new Cookie("rownanie4", rownanie4));
		 	response.addCookie(new Cookie("rownanie5", rownanie5));
		 	response.addCookie(new Cookie("rownanie6", rownanie6));
		 	response.addCookie(new Cookie("rownanie7", rownanie7));
		 	response.addCookie(new Cookie("rownanie8", rownanie8));
		 	response.addCookie(new Cookie("rownanie9", rownanie9));
		 	response.addCookie(new Cookie("rownanie10", rownanie10));
		 	

		%>
		
	
		<input type="submit" value="sprawdz wynik">
		</p>
		
		</form>
	</fieldset>

</body>
</html>