<%--
  Created by IntelliJ IDEA.
  User: lijunhong
  Date: 16/8/30
  Time: 上午9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <%--<script language="JavaScript" src="../js/jquery-1.4.2.min.js"/>--%>
</head>
<body>
    <form action="/login2.do" method="post">
        username:<input type="text" name="username"/>
        password:<input type="text" name="password">
        num:<input type="text" name="asd">
        <input type="submit" value="登录">
    </form>
    <%--<script type="text/javascript">--%>
        <%--$(function(){--%>
            <%--$("#btn").click(function(){--%>
                <%--$.post("/getUsername.do",{username:$("#username").val(),password:$("#password").val()},function(data){--%>
                    <%--alert(data);--%>
                <%--});--%>
            <%--})--%>
        <%--});--%>

<%--//        creatXmlHttpRequest()--%>


        <%--//创建XMLHttpRequest对象--%>
        <%--function creatXmlHttpRequest() {--%>
            <%--var xmlHttp;--%>
            <%--try{--%>
                <%--//非IE浏览器使用--%>
                <%--xmlHttp = new XMLHttpRequest();--%>
            <%--}catch(e){--%>
                <%--try{--%>
                    <%--xmlHttp = new ActiveXobject("Msxm.XMLHTTP");--%>
                <%--}catch(e){--%>
                    <%--try{--%>
                        <%--xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");--%>
                    <%--}catch(e){--%>

                    <%--}--%>
                <%--}--%>
            <%--}--%>
            <%--return xmlHttp;--%>
        <%--}--%>
<%--//    </script>--%>
</body>
</html>
