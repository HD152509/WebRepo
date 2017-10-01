package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException; //java EE 표준
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.dimigo.vo.UserVO;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() { //servlet은 비즈니스 로직 담당
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// jsp 포워딩
		RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp"); //home 화면에서 login.jsp 즉, 기본 로그인 화면으로 간다!! - get방식
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		//현재 사용자로부터 입력을 받았고, submit버튼이 눌린 직후상태임
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		//System.out.printf("id : %s, pwd : %s\n", id, pwd);
		
		boolean result = true;
		if(result){
			// 아이디, 비밀번호가 일치하면 -> 세션에 사용자 정보를 생성해서 담기
			// jsp에서는 session내장객체가있지만 servlet은 session이없어서 가져와줘야댐
			HttpSession session = request.getSession();
			//session.setAttribute("id", id); //이런식으로 받으면 받을 데이터가 너무 많으니까 클래스를 써서 Value Object 생성
			UserVO user = new UserVO();
			user.setId(id);
			user.setName("홍길동"); //여기서는 임의적으로 정햇지만 실무에서는 사용자가 입력한 데이터를 이용해 처리해줘야함
			user.setNickname("의적");
			
			session.setAttribute("user", user); //session에 유저정보를 담아둠.
			
			RequestDispatcher rd = request.getRequestDispatcher("jsp/home.jsp"); //true면 홈화면으로
			rd.forward(request, response);
		}
		else{ //일치하지 않으면 다시 로그인하세요 !!
			request.setAttribute("msg","error");
			RequestDispatcher rd = request.getRequestDispatcher("jsp/login.jsp"); //false면 에러메세지뜨면서 로그인창으로 다시 포워딩
			rd.forward(request, response);
		}
	}
	
	//백업용 dopost2
	
	protected void doPost2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.printf("id: %s, pwd : %s\n",id,pwd);
		
		response.setContentType("application/json;charset=utf-8");
		PrintWriter out = response.getWriter();	
		
		
		/*
		 * 
		 * {
		 * 		"id": "testid"
		 * }
		 */
		
	/*	out.println("{");
		out.println("\"id\":" + "\""+ id + "\"");
		out.println("}");*/
		
		
		//json 라이브러리 사용
		
	/*	JSONObject json = new JSONObject();
		
		json.put("id", id);
		System.out.println(json.toJSONString());
		out.write(json.toJSONString());*/
		
		//Gson 라이브러리 사용
		
		Gson gson = new Gson();
		JsonObject object = new JsonObject();
		object.addProperty("id",id);
		String json = gson.toJson(object);
		System.out.println(json);
		out.write(json);
		
		
		out.close();
	}

}
