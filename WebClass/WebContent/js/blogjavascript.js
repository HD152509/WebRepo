/**
 * 
 */

			var _rys = jQuery.noConflict();
			_rys("document")
					.ready(
							function() {

								_rys(window)
										.scroll(
												function() {
													if (_rys(this).scrollTop() > 136) {
														_rys(
																'.navbar.navbar-expand-lg.navbar-light')
																.addClass(
																		"f-navbarSupportedContent");
													} else {
														_rys(
																'.navbar.navbar-expand-lg.navbar-light')
																.removeClass(
																		"f-navbarSupportedContent");
													}
												});

							});
			

			$(document).ready(function() {
				// Add smooth scrolling to all links
				$("a").on('click', function(event) {

					// Make sure this.hash has a value before overriding default behavior
					if (this.hash !== "") {
						// Prevent default anchor click behavior
						event.preventDefault();

						// Store hash
						var hash = this.hash;

						// Using jQuery's animate() method to add smooth page scroll
						// The optional number (800) specifies the number of milliseconds it takes to scroll to the specified area
						$('html, body').animate({
							scrollTop : $(hash).offset().top
						}, 800, function() {

							// Add hash (#) to URL when done scrolling (default click behavior)
							window.location.hash = hash;
						});
					} // End if
				});
			});
			
			// 이 코드는 움직임 smooth 코드
			
  function menu_over(e){
	 e.style.color="#ffffff"
  }
  function menu_out(e){
	  e.style.color="#000000"
  }
  
  function logged(){
	  //var ID = document.getElementById("id").value;
	  //var PWD = document.getElementById("pwd").value;
	  /*if(e.innerHTML=='로그아웃'){
		  alert("로그아웃되셨습니다.");
		  location.reload();
	  }
	  else if((ID!=""&&PWD!="")&&(e.innerHTML=='로그인')){
		  e.innerHTML='로그아웃';
	  }*/
	  location.href='/WebClass/bloglogin';
  }
  
  function signup(){
	  
      var e = document.getElementById("log").innerHTML;
      
      if(e=='로그아웃'){
    	  alert("로그아웃을 한후에 진행해주세요.");
    	  return;
      }
      
	  alert("회원가입창으로 이동합니다.");
	  location.href='blog_signup.html';
  }
  
  function Add_Text1(){
      var Elm = document.getElementById("Span_1");
      var TheText = "저의 꿈은 정보보안 전문가입니다.";
      Elm.innerHTML = TheText;
  }
  
  function Add_Text2(){
      var Elm = document.getElementById("Span_2");
      var TheText = "저의 취미는 운동하기입니다.";
      Elm.innerHTML = TheText;
  }
  
  function Add_Text3(){
      var Elm = document.getElementById("Span_3");
      var TheText = "제가 좋아하는 것은 독서입니다.";
      Elm.innerHTML = TheText;
  }
  
      
      //이미지 클릭시 텍스트 출력