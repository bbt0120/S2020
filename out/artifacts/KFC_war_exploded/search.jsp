<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/15
  Time: 19:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="${ks == null}">
        <c:redirect url="FindKFCByAreaServlet"></c:redirect>
    </c:if>

    <form action="FindKFCByAreaServlet" method="get">
        <%--<select name="area_id">
            <option value="1">奉贤区</option>
            <option value="2">浦东区</option>
            <option value="3">松江区</option>
        </select>--%>
        <select name="area_id">

        </select>
        <input type="submit" value="搜索" />
    </form>

    <table border="1">
        <tr>
            <td>id</td>
            <td>店面名称</td>
            <td>开店时间</td>
            <td>营业时间</td>
            <td>区域</td>
            <td>所在地</td>
        </tr>
        <c:forEach var="kfc" items="${ks}">
            <tr>
                <td>${kfc.id}</td>
                <td>${kfc.name}</td>
                <td>${kfc.start_time}</td>
                <td>${kfc.work_time}</td>
                <td>${kfc.area_name}</td>
                <td>${kfc.address}</td>
            </tr>
        </c:forEach>
    </table>

    <script>
        $.getJSON("FindAllAreaServlet",function (result) {
            for(var i=0;i<result;i++){
                $("select").append("<option value='"+result[i].area_id+"'>"+result[i].area_name+"</option>")
            }
        })
    </script>
</body>
</html>
