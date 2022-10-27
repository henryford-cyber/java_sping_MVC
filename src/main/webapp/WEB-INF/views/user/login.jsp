<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    
    <style>
        .message{
            color: green;
        }
    </style>
</head>
<%@ page isELIgnored="false" %>
<body> 
   
   <div class="container"> 
      <c:if test="${message != null}">
	      <div class="alert alert-danger message" role="alert">
			  ${message}
			</div>
           
      </c:if>
    </p>
    <form:form action="login" method="post" modelAttribute="user" >
        <fieldset>
            <h1 style="text-align: center;">Login</h1>
            <table style="display: flex; justify-content: center;">
                <tr>
                    <td><form:label path="userName">Username:</form:label></td>
                    <td><form:input cssClass="form-control" path="userName"/> </td>
                </tr>
                <tr>
                    <td><form:label path="passWord">Password:</form:label></td>
                    <td><form:input cssClass="form-control" path="passWord"/> </td>
                </tr>
                <tr>
            
                
                <tr>
                    <td></td>
                    <td><form:button class="btn btn-danger">Login</form:button> </td>
                </tr>
            </table>s
        </fieldset>
    </form:form>
   </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    
</body>
</html>
