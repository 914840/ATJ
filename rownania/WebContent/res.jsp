<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, td {width 80%; height 80%}
td {text-align:center; vertical-align:middle}
th {vertical-align:middle; text-align:center}]

</style>
</head>
<body>
	<table>
		<thead> 
			<tr> <th>równanie</th> <th></th> <th>twoja odpowiedz</th> <th></th> <th>wrawidłowa odpowiedz</th> <th> punkty </th>   </tr>
		</thead>
		<tbody>
			<tr>
				<td><%=request.getAttribute("rownanie1") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp1")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w1")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt1")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie2") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp2")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w2")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt2")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie3") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp3")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w3")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt3")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie4") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp4")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w4")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt4")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie5") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp5")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w5")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt5")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie6") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp6")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w6")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt6")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie7") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp7")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w7")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt7")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie8") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp8")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w8")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt8")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie9") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp9")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w9")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt9")%> </td>
			</tr>
			<tr>
				<td><%=request.getAttribute("rownanie10") %> </td>
				<td> </td>
				<td><%=request.getAttribute("odp10")%> </td>
				<td> </td>
				<td><%=request.getAttribute("w10")%> </td>
				<td> </td>
				<td><%=request.getAttribute("pkt10")%> </td>
			</tr>
			<tr>
				<td> </td>
				<td> </td>
				<td> </td>
				<td> </td>
				<td> </td>
				<td> </td>
				<td>suma punktów:<%= "   " + request.getAttribute("suma")%> </td>
			</tr>
			<tr>
				<td> </td>
				<td> </td>
				<td> </td>
				<td> </td>
				<td> </td>
				<td> </td>
				<td>Twoja ocean to:<%= " " + request.getAttribute("ocena")%> </td>
			</tr>
		</tbody>
	</table>

</body>
</html>