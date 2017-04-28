<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<base href="/resources/register/">
<meta charset="UTF-8">
<title>new register</title>



<link rel="stylesheet" href="css/style.css">


</head>

<body>
	<!DOCTYPE html>
<head>
<link
	href='http://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css'
	rel='stylesheet' type='text/css'>
<link
	href='//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.2.0/css/datepicker.min.css'
	rel='stylesheet' type='text/css'>
<link
	href='//cdnjs.cloudflare.com/ajax/libs/bootstrap-switch/1.8/css/bootstrap-switch.css'
	rel='stylesheet' type='text/css'>
<link
	href='http://davidstutz.github.io/bootstrap-multiselect/css/bootstrap-multiselect.css'
	rel='stylesheet' type='text/css'>
<script
	src='//cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js'
	type='text/javascript'></script>
<script
	src='//cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.0.0/js/bootstrap.min.js'
	type='text/javascript'></script>
<script
	src='//cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.2.0/js/bootstrap-datepicker.min.js'
	type='text/javascript'></script>
<script
	src='//cdnjs.cloudflare.com/ajax/libs/bootstrap-switch/1.8/js/bootstrap-switch.min.js'
	type='text/javascript'></script>
<script
	src='http://davidstutz.github.io/bootstrap-multiselect/js/bootstrap-multiselect.js'
	type='text/javascript'></script>
</head>
<body>
	<div class='container'>
		<div class='panel panel-primary dialog-panel'>
			<div class='panel-heading'>
				<h5>register</h5>
			</div>
			<div class='panel-body'>
				<form class='form-horizontal' role='form' method="post">

					<div class='form-group'>
						<label class='control-label col-md-2 col-md-offset-2'
							for='id_title'>Title</label>
						<div class='col-md-8'>
							<div class='col-md-3 indent-small'>
								<div class='form-group internal'>
									<input class='form-control' placeholder='제목을 입력하세요' type='text' name="title">
								</div>
							</div>
						</div>
					</div>
					<div class='form-group'>
						<label class='control-label col-md-2 col-md-offset-2'
							for='id_comments'>Content</label>
						<div class='col-md-6'>
							<textarea class='form-control' id='id_comments'
								placeholder='내용을 입력하세요' rows='3' name="content"></textarea>
						</div>
					</div>

					<div class='form-group'>
						<label class='control-label col-md-2 col-md-offset-2'
							for='id_title'>Writer</label>
						<div class='col-md-8'>
							<div class='col-md-3 indent-small'>
								<div class='form-group internal'>
									<input class='form-control' id='id_first_name'
										placeholder='작성자를 입력하세요' type='text' name="writer">
								</div>
							</div>
						</div>
					</div>

					<div class='form-group'>
						<div class='col-md-offset-4 col-md-3'>
							<button class='btn-lg btn-primary'>Register</button>
							
						

					</div>
				</form>
				<form action="/board/list" method="get">
				<input type="hidden" value="${cri.page}" name="page">
				<button class='btn-lg btn-danger'>Cancle</button>
				</form>
				</div>
			</div>
		</div>
	</div>
</body>

<script src="js/index.js"></script>
<script src="https://code.jquery.com/jquery-3.2.1.min.js"
		integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
		crossorigin="anonymous"></script>


	
</body>
</html>
