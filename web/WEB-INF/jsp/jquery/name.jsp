
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>name</title>
    <%--<script type="text/javascript" src="../../js/jquery-1.4.2.min.js"></script>--%>
</head>
    <script type="text/javascript" src="/js/jquery-1.4.2.js"></script>
<body>


        请输入姓名?
        <input type="text" name="name" id="name"><br>
        <input type="submit" value="提交" id="btn">
        <script type="text/javascript">
            $(function(){
                $("#btn").click(function() {
                    $.post('${pageContext.request.contextPath}/jquery/getName.do',{name:$("#name").val()},function(date){
                       alert(date);
                    });
                });
            });
        </script>
</body>
</html>
