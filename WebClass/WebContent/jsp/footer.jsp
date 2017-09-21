<%@ page import = "java.util.Calendar" %>
<%
	Calendar c= Calendar.getInstance(); //Singleton pattern
%>


<footer class="footer">
      <div class="container">
        <span class="text-muted">&copy; <%=c.get(Calendar.YEAR)%> mycompany.com</span>
      </div>
</footer>