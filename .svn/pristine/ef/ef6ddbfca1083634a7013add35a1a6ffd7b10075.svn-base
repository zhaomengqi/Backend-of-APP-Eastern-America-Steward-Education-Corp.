<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑项目</title>
</head>
<body>
   <h2>编辑留学，游学项目</h2>
   <spring:url value="/event/list" var ="list" />
   <a href="${list}">Event List</a>
   
   <c:url var="action" value="/event/update"></c:url>
   <form:form method="post" action="${action}" modelAttribute="event">
      <table>
         <tr>
            <td>
               <form:hidden path="EventId" />
               <form:label path="EventName">Event Name</form:label>
            </td>
            <td><form:input path="EventName" /></td>
         </tr>
         <tr>
            <td><form:label path="EventContent">Event Content</form:label>
            <td><form:textarea path="EventContent" rows="15" cols="90" /></td>
         </tr>
        
         <tr><td colspan="2"><input type="submit" value="Update Event" /></td></tr>
      </table>
   </form:form>
   
</body>
</html>