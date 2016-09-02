<%--
  Created by IntelliJ IDEA.
  User: lijunhong
  Date: 16/8/30
  Time: 下午10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>修改</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/student/update.do" method="post">
        姓名:<input type="text" name="name" value="${student.name}">
        年龄:<input type="text" name="age" value="${student.age}">
        <input type="submit" value="提交">
    </form>
</body>
</html>
