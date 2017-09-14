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
<body>
<div class="container well">
<h1>회원가입 폼</h1>
<form action="register.do" method="post">
	<div class="form-group">
		<label class="label-control">아이디</label>
		<input type="text" name="id" class="form-control">
	</div>
	<div class="form-group">
		<label class="label-control">비밀번호</label>
		<input type="password" name="password" class="form-control">
	</div>
	<div class="form-group">
		<button type="submit" class="btn btn-success">가입</button>
	</div>
</form>
</div>
</body>
</html>