<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>性别</th>
        <th>年龄</th>
        <th>?</th>
        <th>?</th>
    </tr>
    <c:forEach items="${emps}" var="emp">
        <tr>
            <td>${emp.eid}</td>
            <td>${emp.ename}</td>
            <td>${emp.esex}</td>
            <td>${emp.eage}</td>
            <td>${emp.esalary}</td>
            <td>${emp.id}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
