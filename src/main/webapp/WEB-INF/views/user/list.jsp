
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listing product</title>
</head>
<%@ page isELIgnored="false" %>
<body>
    <h1>Products</h1>
    <p><a href="/login/new"> new</a></p> 
    <table border="1">
        <tr>
            <td>ID</td>
            <td>Username</td>
            <td>Password</td>
            
        </tr>
        <c:forEach var="user" items="${user}">
            <tr>
                <td>${user.getId()}</td>
                <td><a href="view?id=${user.getId()}"> ${user.getUserName()}</a></td>
                <td>${user.getPassWord()}</td>
                          
            </tr>
        </c:forEach>
    </table>
</body>
</html>
