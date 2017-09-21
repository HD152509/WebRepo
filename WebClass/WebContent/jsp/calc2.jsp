<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>숫자 합 계산</title>
<%--//선생님 풀이 --%>
</head>
<body>
	<form>
		<input type="number" name="num" min="1" required>
		<button type="submit">계산</button>
	</form>
	<%
		String abc = request.getParameter("num");
		if (abc != null) {

			int sum = 0;
			for (int i = 1; i <= Integer.parseInt(abc); i++) {
				sum += i;
			}
			if (sum != 0) {
	%>
	<h1>
		1 ~
		<%=sum%>입니다.
	</h1>
	<%
		}
		}
	%>
</body>
</html>