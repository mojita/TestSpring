<%--
  Created by IntelliJ IDEA.
  User: lijunhong
  Date: 16/8/31
  Time: 下午9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>upload</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/upload2.do" method="post" enctype="multipart/form-data">
        <table>
            <tr>
                <th colspan="2">上传文件</th>
            </tr>
            <tr>
                <td>文件1</td>
                <td><input type="file" name="files"></td>
            </tr><tr>
                <td>文件二</td>
                <td><input type="file" name="files"></td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="上传文件">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
