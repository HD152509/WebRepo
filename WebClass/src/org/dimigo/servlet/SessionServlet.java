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
 * Servlet implementation class SessionServlet
 */
@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//세션에 사용자 정보가 있는지 체크(null 체크부터)
		//없다면, jsp/login.jsp로 포워딩 !! 
		//세션에 사용자 정보가 있다면 즉 로그인을 했다면 jsp/sessionInfo.jsp로 포워딩(id, name, nickname을 출력)
		
		if(request.getSession().getAttribute("user")==null){
			response.sendRedirect("jsp/login.jsp"); //연결이 안되며 이페이지 보여주고 끝 - 세션에 값이 없으니까 한번보여주고 끝내는거임
		}
		
		else{
			RequestDispatcher rd = request.getRequestDispatcher("jsp/sessionInfo.jsp"); //로그아웃 후 다시 홈화면으로
			rd.forward(request, response); //받은거를 또 받아서 넘김 계속 set하고 get하고 -> 세션에 값이 있으니까. 만약에 request에서 겟해서 쓰고싶으면 이방식을 사용해야함
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
