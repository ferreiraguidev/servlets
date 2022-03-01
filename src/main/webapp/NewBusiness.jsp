<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<html>
<head>
    <title>Jsp Learning</title>
</head>
<body>

    <c:if test="${not empty business}">
        Business ${business} registered!
    </c:if>

    <c:if test="${empty business}">
        No registered business!
    </c:if>

</body>
</html>
