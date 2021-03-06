<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>blog_signup</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
	<link rel="stylesheet" type = "text/css" href="../css/blogstyle2.css"> <!-- 외부 css 파일 - 전체 사이트 디자인 -->
	<script src = "../js/blogjavascript2.js"></script>  <!-- 외부 js 파일 - 전체 사이트 디자인 -->
	
</head>

	
<body>
<br>
<br>
<h1>회원가입</h1>

<!-- 회원가입창은 css템플릿 쓰기 form 제대로 되어있는거 -->

<br>
<form class="form-inline my-2 my-lg-0" id="signupform">
<div>
<input type = "radio" name = "grades" value = "1" >1학년
<input type = "radio" name = "grades" value = "2" checked>2학년
<input type = "radio" name = "grades" value = "3">3학년
</div>
<br>
<br>
<div>
<select name = "classes">
	<option value = "1" selected>1반</option>
	<option value = "2">2반</option>
	<option value = "3">3반</option>
	<option value = "4">4반</option>
	<option value = "5">5반</option>
	<option value = "6">6반</option>
</select>
</div>
<br>
<input type="text" placeholder="번호" aria-label="번호" required>
<input type="text" placeholder="이름" aria-label="이름" required>
<input class="form-control mr-sm-2" type="text" placeholder="Id" aria-label="ID" id="id" required>
<input class="form-control mr-sm-2" type="text" placeholder="Password" aria-label="PWD" id="pwd" required>
<input type = "submit" value="회원가입">

	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>
    
<div class="modal" id="myModal">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title">회원가입창</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        <p></p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal" onclick="toHome();">닫기</button>
      </div>
    </div>
  </div>
</div>

	<script src = "../js/blogjavascript3.js"></script>  <!-- 외부 js 파일 -->
	
</form>
</body>
</html>