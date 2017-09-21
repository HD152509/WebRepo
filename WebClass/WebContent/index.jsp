<!-- 1. Directive tag -->
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>First JSP</title>
</head>
<body>
<%-- 2. Comment tag --%>
<%-- 3. Declaration tag --%>
<%! private static final String DEFAULT_NAME="GUEST";%>

<%-- 4. Scriptlet tag --%>	
<%
	//자바 코드를 그대로 작성
	String name = request.getParameter("name");
	if(name==null)name=DEFAULT_NAME;
	//out.println("<h1>hello, "+name+"</h1>");
%>
<%-- 5. Expression tag --%>
<h1>Hello,<%=name%></h1> <%-- 표현식에서는 절대 마지막에 ; 를 붙이지 않는다 --%>
	
</body>
</html>