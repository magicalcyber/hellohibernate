<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: MagicalCyber
  Date: 10/30/2014
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
    </tr>

    </thead>
    <tbody>
    <c:forEach var="person" items="${persons}">
        <tr>
            <td><c:out value="${person.id}"/></td>
            <td><c:out value="${person.name}"/></td>
        </tr>
    </c:forEach>
    </tbody>

</table>
</body>
</html>
