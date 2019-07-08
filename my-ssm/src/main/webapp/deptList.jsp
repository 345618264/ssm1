<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/3
  Time: 12:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>地址</th>
        <th>详情</th>
    </tr>
    <c:forEach items="${depts}" var="dept">
        <tr>
            <td>${dept.did}</td>
            <td>${dept.dname}</td>
            <td>${dept.address}</td>
            <td>${dept.manager}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
