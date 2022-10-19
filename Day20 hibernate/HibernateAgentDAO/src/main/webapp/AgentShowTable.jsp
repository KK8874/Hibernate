<%@page import="com.infinite.HibernateAgentDAO.AgentDAO"%>
<%@page import="com.infinite.HibernateAgentDAO.Agent"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
  AgentDAO dao=new AgentDAO();
  List<Agent> agentList=dao.showAgent();

%>
<table border="3" align="center">

<tr>
   <th>AgentId</th>
   <th>AgentName</th>
   <th>AgentCity</th>
   <th>AgentGender</th>
   <th>AgentMaritalstatus</th>
   <th>AgentPremium</th>
   
</tr>

<%
  for(Agent agent:agentList){
%>
<tr>
<td>
<%=agent.getAgentid()%>
</td>
<td>
<%=agent.getName() %>
</td>
<td>
<%=agent.getCity() %>
</td>
<td>
<%=agent.getGender() %>
</td>
<td>
<%=agent.getMaritalstatus() %>
</td>
<td>
<%=agent.getPremium() %>
</td>
<%
}
%>

</table>

</body>
</html>