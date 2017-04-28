<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<style>
li{
	list-style: none;
}
</style>


	<h2>Ajax Test Page</h2>
	<div>
		<div>
			REPLY TEXT <input type="text" name="rcontent" id="newReplyText">
		</div>
		<button id="replyAddBtn">ADD REPLY</button>	
	</div>
	

	<ul id="replies">
	</ul>


	<script src="https://code.jquery.com/jquery-2.2.4.min.js"
		integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
		crossorigin="anonymous"></script>
	<script>
		$(document).ready(function(event) {
			
			$("#replies").on("click",".replyLi button",function(){
				
			});
			
			$("#replyAddBtn").on("click",function(e){
				
				var rcontent = $("#newReplyText").val();
				var bno = 209;
				$.ajax({
					type: 'post',
					url:'/replies',
					headers:{
						"Content-Type" : "application/json",
						"X-HTTP-Method-Overrride" : "POST"
					},
					dataType: 'text',
					data: JSON.stringify({
						bno:bno,
						rcontent : rcontent
					}),
					success : function(result){
						if(result == 'SUCCESS'){
							alert("등록 되었습니다.");
							getAllList();
						}
					}
				});
			});
			
			function getAllList(){
				
				$.getJSON("/replies/" + 209 + "/" + 1, function(data) {

					var str = "";

					console.log(data);

					$.each(data.list, function(index, value) {
						str +="<li data-rno='"+this.rno+"' class ='replyLi'>"
						+ this.rno + ":" + this.rcontent
						+ "<button>MOD</button></li>";
					});
					$("#replies").html(str);
				});
			

			}

		});
	</script>

</body>
</html>