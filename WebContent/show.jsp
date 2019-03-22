<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示梯形面积</title>
</head>
<body>
<jsp:getProperty property="message" name="data"/> 
上底：<jsp:getProperty property="a" name="data"/> 
下底：<jsp:getProperty property="b" name="data"/> 
高：<jsp:getProperty property="c" name="data"/> 
的面积是：<jsp:getProperty property="area" name="data"/> 
</body>
</html>