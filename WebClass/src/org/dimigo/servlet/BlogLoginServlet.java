package org.dimigo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVO;

/**
 * Servlet implementation class BlogLoginServlet
 */
@WebServlet("/bloglogin")
public class BlogLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BlogLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("jsp/bloglogin.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.printf("id : %s, pwd : %s\n", id, pwd);
		
		// 이부분 수정
		
		
		boolean result = true;
		if(result){
			HttpSession session = request.getSession();
			UserVO user = new UserVO();
			user.setId(id);
			user.setName("홍길동"); 
			user.setNickname("의적");
			
			session.setAttribute("user", user); //session에 유저정보를 담아둠.
			
			RequestDispatcher rd = request.getRequestDispatcher("jsp/suchan_blog.jsp"); //true면 홈화면으로
			rd.forward(request, response);
		}
		else{ //일치하지 않으면 다시 로그인하세요 !!
			request.setAttribute("msg","error");
			RequestDispatcher rd = request.getRequestDispatcher("jsp/bloglogin.jsp"); //false면 에러메세지뜨면서 로그인창으로 다시 포워딩
			rd.forward(request, response);
		}
	}

}
