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
     
    <title>普通账户注册</title>
     
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
         alert(user);  
         $.ajax( {  
           type : 'POST',  
           contentType : 'application/json;charset=utf-8',
           url :  '<%=path%>/user/hello22', 
           data : user,  
           dataType : 'json' ,
           success : function(data) {  
        	   if(data=="0"){
        		   alert("用户名重复");
        	   		
        	   }
        	   else if(data=="1"){
        		   window.location.href="user/login2";  
        	   }
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
<form action="user/hello22" method="post" id="form">  
username：<input type="text" name="username"/> </br> 
email：&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<input type="text" name="email"/>  </br> 
password：<input type="text" name="password"/>  </br> 
  
<input type="button" value="提交" id="submit" onclick="send()"/>  
</form>

  </body>

</html>