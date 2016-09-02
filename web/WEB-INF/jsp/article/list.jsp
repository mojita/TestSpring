<%--
  Created by IntelliJ IDEA.
  User: lijunhong
  Date: 16/8/31
  Time: 上午9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文章列表</title>
</head>
<body>
    <table>
        <tr>
            <th>序号</th>
            <th>文章名</th>
        </tr>
        <tr>
            <td>1</td>
            <td><a href="${pageContext.request.contextPath}/article/books/1">文章一</a></td>
        </tr>
        <tr>
            <td>2</td>
            <td><a href="${pageContext.request.contextPath}/article/books/2">文章二</a></td>
        </tr>
    </table>
</body>
</html>
