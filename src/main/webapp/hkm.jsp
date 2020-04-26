<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: 11920
  Date: 2020/1/31
  Time: 12:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<ui>
    <c:forEach items="${hkm}" var="h">
        <li>id为${h.id}sp1为${h.sp1}</li>
    </c:forEach>
</ui>


</body>
</html>
