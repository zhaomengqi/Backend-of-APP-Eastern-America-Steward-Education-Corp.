<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>编辑用户</title>
</head>
<body>
   <h2>Edit User</h2>
   <spring:url value="/user/list" var ="list" />
   <a href="${list}">User List</a>
   
   <c:url var="action" value="/user/update"></c:url>
   <form:form method="post" action="${action}" modelAttribute="user">
      <table>
         <tr>
            <td>
               <form:hidden path="UserId" />
               <form:label path="Username">Username</form:label>
            </td>
            <td><form:input path="Username" /></td>
         </tr>
         <tr>
            <td><form:label path="Email">Email</form:label>
            <td><form:input path="Email" /></td>
         </tr>
         <tr>
            <td><form:label path="Password">Password</form:label>
            <td><form:input path="Password" /></td>
         </tr>
         <tr>
            <td><form:label path="RoleId">RoleId</form:label>
            <td><form:input path="RoleId" /></td>
         </tr>
         <tr><td colspan="2"><input type="submit" value="Update User" /></td></tr>
      </table>
   </form:form>
   
</body>
</html>