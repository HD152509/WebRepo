<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="org.dimigo.vo.UserVO" %>

<!DOCTYPE html>
<html lang="ko">
  <head>
  
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <title>suchan_blog</title>
    
    <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Lobster">
    <link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Poppins">
    
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	
	
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	
	
    <script src = "http://hd152509.run.goorm.io/WebClass/js/blogjavascript.js"></script>
  
  	<link rel="stylesheet" type = "text/css" href="http://hd152509.run.goorm.io/WebClass/css/blogstyle.css">
  	
	
  </head>
  
  
  
  
  <body>
  
<div class = "blogTitle">
  <h2>Suchan's Blog</h2>
</div>
<nav class="navbar navbar-expand-lg navbar-light">
  <div class="collapse navbar-collapse"  id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto" id = "navs">
     <li class="nav-item">
        <a class="nav-link" href="#"  onmouseover="menu_over(this);" onmouseout="menu_out(this);">Home</a>
      <li class="nav-item">
        <a class="nav-link" href="#Dream"  onmouseover="menu_over(this);" onmouseout="menu_out(this);">Dream</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#Hobby" onmouseover="menu_over(this);" onmouseout="menu_out(this);">Hobby</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#Favorite"  onmouseover="menu_over(this);" onmouseout="menu_out(this);">Favorite</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Etc
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
          <a class="dropdown-item" href="http://passworld.tistory.com/" target="_blank">Other Blog</a>
          <a class="dropdown-item" href="http://www.boannews.com" target="_blank">News</a>
          <a class="dropdown-item" href="https://www.w3schools.com/" target="_blank">Learn Web</a>
        </div>
      </li>
    </ul>
    
    
  <div class="form-inline my-2 my-lg-0" id="loginForm">
  <!--  <input class="form-control mr-sm-2" type="text" placeholder="Id" aria-label="ID" id="id" required> -->
  <!--  <input class="form-control mr-sm-2" type="text" placeholder="Password" aria-label="PWD" id="pwd" required> -->
  <%-- 세션에 사용자 정보가 없는 경우 --%>
    <%
		UserVO user = (UserVO) session.getAttribute("user");
    	if(user==null){ // 아직 노 로그인이면
    %>
  	<button type="submit" class="btn btn-primary" id="log" onclick="logged();">로그인</button>
  	<button type="button" class="btn btn-dark" onclick="signup();">회원가입</button>
  	<% }
    	
    else { %>
    
    <%-- 세션에 사용자 정보가 있는 경우 --%>
	    	<%=user.getName()+"님 환영합니다." %>
	    	<div>
	    	<form action="/WebClass/bloglogout" method="post"> 
	      	<button type="submit">로그아웃</button>
	      	</form>
	      	</div>
	 <% }  %>
  </div>
  </div>
</nav>


<div class="wrapper">

    <img src="http://hd152509.run.goorm.io/WebClass/image/sea2.jpg" alt="Main">
    
    <div class="imgTopic">
	<a href="#Dream"><img class="menu_img" id="Dream" src="http://hd152509.run.goorm.io/WebClass/image/security.jpg" alt="Dream" onclick="Add_Text1();">
	<span id="Span_1"></span></a>
	</div>
	
	<div class="imgTopic">
	<a href="#Hobby"><img class="menu_img" id="Hobby" src="http://hd152509.run.goorm.io/WebClass/image/exercising.jpg" alt="Hobby" onclick="Add_Text2();">
	<span id="Span_2"></span></a>
	</div>
	
	<div class="imgTopic">
	<a href="#Favorite"><img class="menu_img" id="Favorite" src="http://hd152509.run.goorm.io/WebClass/image/reading.jpg" alt="Favorite" onclick="Add_Text3();">
	<span id="Span_3"></span></a>
	</div>
  	
	
</div>
	
<div class="toTop">
<p class="toTopText"><a class="toTopAnchor" href = "#">- 맨위로 -</a></p>
</div>
    
    
    <!-- ajax path -->
    
	<!--  <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>-->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
    
    <!-- ajax path -->
    
<!--
<div class="modal" id="myModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">로그인창</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p></p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
      </div>
    </div>
  </div>
</div>
-->    
	
    <script src = "http://hd152509.run.goorm.io/WebClass/js/blogjavascript1.js"></script>  	
	

  </body>
</html>
