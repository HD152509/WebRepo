<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "org.dimigo.vo.UserVO" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>sessionInfo</title>
</head>
<body>
<% 
	UserVO user = (UserVO) session.getAttribute("user"); 
%>

<h1>id : <%=user.getId()+'\n'%></h1>
<h2>name : <%=user.getName()+'\n'%></h2>
<h3>nickname : <%=user.getNickname()+'\n'%></h3>


</body>
</html>