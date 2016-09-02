<%--
  Created by IntelliJ IDEA.
  User: lijunhong
  Date: 16/8/30
  Time: 下午2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ajax测试</title>
    <script type="text/javascript" src="../js/jquery-1.4.2.js"/>
    <script type="text/javascript" src="../js/jquery-1.4.2.min.js"/>
    <script type="text/javascript">
//        $("#bt").click(function(){
//            $.ajax({
//                data:"username="+$("#username").val(),
//                type:'GET',
//                dataType:'json',
//                url:'/ajax.do',
//                error:function(data){
//                    alert("出错了!"+data.msg);
//                },
//                success:function(data){
//                    alert("成功"+data.msg);
//                    $("#result").html(data.msg) ;
//                }
//            })
//        });

        //创建XMLHttpRequest对象
//        function creatXmlHttpRequest() {
//            var xmlHttp;
//            try{
//            //非IE浏览器使用
//                xmlHttp = new XMLHttpRequest();
//            }catch(e){
//                try{
//                    xmlHttp = new ActiveXobject("Msxm.XMLHTTP");
//                }catch(e){
//                    try{
//                        xmlHttp = new ActiveXobject("Microsoft.XMLHTTP");
//                    }catch(e){
//
//                    }
//                }
//            }
//            return xmlHttp;
//        }

//        $("#bt").click(function(){
//            $.ajax({
//                url:
//            });
//        });

    </script>
</head>
<body>
    <%--<input type="text" name="username" id="username">--%>
    <input type="button" id="bt" value="提交">
    <%--<div id="result"></div>--%>
</body>
</html>
