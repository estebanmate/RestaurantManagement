<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>

<h2>Hello Customer</h2>
 
<table>
    
  <tr>
    <th>Customer 1</th>
    <th>Customer 2</th>
   
  </tr>
  <%List<Branch>dssanpham=(List<Branch>)request.getAttribute("branchlist");%>
        <% for (Branch sp:dssanpham) { %> 
  <tr>
     <td><%= sp.getId()%></td>
    <td><%= sp.getName()%></td>
   
  </tr>
  
  <%}%>
</table>

</html>
