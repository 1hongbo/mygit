<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>利用表单给servlet送值</title>
</head>
<body>
<form action="handle" method="get"> 
梯形： 
<br>输入上底：<input type=text name="a" size=4> 
<br>输入下底：<input type=text name="b" size=4> 
<br>输入高：<input type=text name="c" size=4> 
<input type=submit value=" 提交 "> 
</form> 
</body>
</html>