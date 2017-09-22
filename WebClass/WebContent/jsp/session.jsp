<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	Integer cnt = (Integer)session.getAttribute("cnt"); //request는 getParameter
	
	if(cnt==null){
		out.println("최초 호출");
		cnt = 0;
	}
	
	session.setAttribute("cnt",++cnt);
%>
<h1>cnt : <%= cnt %></h1>
<br>
<%=request.getHeader("Cookie") %>
</body>
</html>	