<%@ page import="com.alura.servlets.model.Business" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <form action="newBusiness" method="post">
        Name: <input type="text" name="name" value="${business.name}">
        Data: <input type="text" name="date" value="${business.openingDate}">
        Data: <input type="text" name="id" value="${business.id}">
        <input type="submit"/>
    </form>




</body>
</html>