<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<script type="text/javascript">
setTimeout("location.reload()",2000);

</script>
<body>
<div class="container well">
	<div class="panel panel-default">
		<h1>메인페이지</h1>
		<p>dispatch = send, dispatcher = 분배기</p>
		<h3>${message}</h3>
		<h3>${user}</h3>
		<h3>${user.name}</h3>
		<h3>${user.email}</h3>
		<h4>${user.type}</h4>
		<h3>${user.myCar.year}년식</h3>
		<h3><strong>${user.myCar.name}</strong>는 가장 좋은 차다. 하하하하</h3>
		
	</div>
	
</div>
</body>
</html>