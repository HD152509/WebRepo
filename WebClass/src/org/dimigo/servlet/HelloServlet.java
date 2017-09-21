package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet(description = "This is a first servlet.", urlPatterns = { "/hello" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public HelloServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//request -> 요청,입력
		
		request.setCharacterEncoding("utf-8"); //request 호출전에 미리 encoding방식을 설정해줘야함. response랑 마찬가지. 항상 맨위에서 출력하기.
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		System.out.printf("id:%s, name:%s\n", id, name);
		
		
		
		//reponse는 출력
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		

		response.setContentType("text/html;charset=utf-8;"); //printwriter 호출 전에 미리 해야함. 안그러면 한글출력안됨. 항상 맨위에서 출력학.
		PrintWriter out = response.getWriter();
		
		
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello, Servlet</h1>");
		out.println("<h2>안녕, 서블릿</h2>");
		
		out.println("<h3>id : " + id + ", name : " + name + "</h3>");

		out.println("</body>");
		out.println("</html>");
		
		out.close();
		
	}

	/**	
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("dopost() 호출됨");
		doGet(request, response);
	}
	

	@Override
	public void init() throws ServletException{
		System.out.println("init()");
	}
	
	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		System.out.println("service()");
		super.service(req, resp); //doget dopost 처리
	}
	
	@Override
	public void destroy(){
		System.out.println("destroy()");
	}
	
	

}
	