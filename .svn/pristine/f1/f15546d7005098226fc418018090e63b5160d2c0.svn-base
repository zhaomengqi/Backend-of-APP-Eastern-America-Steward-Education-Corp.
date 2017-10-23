<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>  

   <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery-json/2.6.0/jquery.json.min.js"></script> 
    <base href="<%=basePath%>">
     
    <title>普通用户登陆</title>
     
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">   
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
 
     <script type="text/javascript">
     $.fn.serializeObject = function() {  
    	  var o = {};  
    	  var a = this.serializeArray();  
    	  $.each(a, function() {  
    	    if (o[this.name]) {  
    	      if (!o[this.name].push) {  
    	        o[this.name] = [ o[this.name] ];  
    	      }  
    	      o[this.name].push(this.value || '');  
    	    } else {  
    	      o[this.name] = this.value || '';  
    	    }  
    	  });  
    	  return o;  
    	}; 
     
     
     function send() {  
         var user = $.toJSON($('#form').serializeObject());  
        
         $.ajax( {  
           type : 'POST',  
           contentType : 'application/json;charset=utf-8',
           url :  '<%=path%>/user/check2', 
           data : user,  
           dataType : 'json', 
           success : function(data) {  
        	   window.location.href="user/list";  
               
             },  
             error : function(data) {  
               alert("error")  
             }  
         });
     }
  </script>
  
</head>
<body>
     
       
<div id="info"></div>  
   <spring:url value="/user/hello22index" var="register" />
   <a href="${register}">Register</a>
   <form action="user/check2" method="post" id="form">  
      username：<input type="text" name="username"/> </br> 
      password：<input type="text" name="password"/>  </br> 
   <input type="button" value="登录" id="submit" onclick="send()"/>  
   </form>
   <spring:url value="/user/login" var="login" />
   <a href="${login}">管理员登录</a>
</body>

</html>