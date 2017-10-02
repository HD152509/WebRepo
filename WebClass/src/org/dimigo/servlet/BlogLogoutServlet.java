package org.dimigo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BlogLogoutServlet
 */
@WebServlet("/bloglogout")
public class BlogLogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogLogoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		// session.removeAttribute("user"); //세션에 담긴 사용자 정보가 삭제됨 아마 세션자체는 안사라질듯
		session.invalidate(); // logout할때 완전히 무효화하는 방식(더안전한 방식임) -> 세션 자체가 의미가없는거임.
		
		RequestDispatcher rd = request.getRequestDispatcher("jsp/suchan_blog.jsp"); //로그아웃 후 다시 홈화면으로
		rd.forward(request, response);
	}

}
