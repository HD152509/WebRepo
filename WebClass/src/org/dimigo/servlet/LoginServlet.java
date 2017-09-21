package org.dimigo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException; //java EE 표준
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

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
    public LoginServlet() {
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
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
