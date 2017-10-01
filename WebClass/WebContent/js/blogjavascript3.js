/**
 * 
 */
    $(document).ready(function(){
    	$('#signupform').submit(function(event){
    		// submit이 자동으로 보내지는 기능을 막고, 우리가 따로 개별적으로 보냄
    		event.preventDefault();
    		
    		//document.getElementById("id").value;
    		var id = $('#id').val();
    		var pwd = $('#pwd').val();
    		
    		//서버로 post 전송(jquery 문법을 이용한 ajax 호출)
    		$.post("http://httpbin.org/post",
    					{ "id" : id, "pwd" : pwd},
    					function(data){
    						
    						//alert(data.form.id + '님 로그인되었습니다.');
    						
    						var myModal = $('#myModal');
    						myModal.modal();
    						myModal.find('.modal-body').text(data.form.id + '님 회원가입되셨습니다.');
    						
    					});
    	});
    	
    });
    