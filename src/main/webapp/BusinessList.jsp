<%@ page import="com.alura.servlets.model.Business" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%


%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<ul>
    Business List
    <br/>
    <c:forEach items="${business}" var="b">

        <li>${b.name}  <fmt:formatDate value="${b.openingDate}"/>
            <a href="removeServlet?id=${b.id}">Remove Business</a>
            <a href="showServlet?id=${b.id}">Update Business</a>
        </li>
    </c:forEach>

</ul>


</body>
</html>
