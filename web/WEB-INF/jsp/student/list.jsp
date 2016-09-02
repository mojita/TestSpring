<%--
  Created by IntelliJ IDEA.
  User: lijunhong
  Date: 16/8/30
  Time: 下午10:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>studentList</title>
</head>
<body>


    <a href="${pageContext.request.contextPath}/student/add.do">添加学生</a>
    <table>
        <tr>
            <th>编号:</th>
            <th>姓名:</th>
            <th>年龄:</th>
            <th>操作:</th>
        </tr>
        <c:forEach var="s" items="${students}">
            <tr>
                <td>${s.id}</td>
                <td>${s.name}</td>
                <td>${s.age}</td>
                <td><a href="${pageContext.request.contextPath}/student/add.do?id=${s.id}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
