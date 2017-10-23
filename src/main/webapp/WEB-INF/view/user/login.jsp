<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="<%=request.getContextPath()%>/Resource/JQuery/jquery-3.2.0.min.js"></script>
<script src="<%=request.getContextPath()%>/Resource/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/Resource/css/bootstrap.min.css"/>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>

<body>
<div class="jumbotron" style="text-align:center;">
   <h2>EASE管理员</h2>
</div>
</br>
<div class="center-block" style="width:200px;background-color:#ccc;" >
   <form method="post" action="/EaseTest01/user/check"> 
         账号：<input name = "admin"/></br>
         密码：<input type="password" name = "pass"/></br>
         </br>
    <input style="display:block;margin:auto;" type="submit" value="submit"/></br>
   </form>
</div>   
</body>
</html>