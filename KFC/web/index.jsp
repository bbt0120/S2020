<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/15
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <c:if test="${kfcs == null}">
    <c:redirect url="FindAllServlet"></c:redirect>
  </c:if>
  <table border="1">
    <tr>
      <td>id</td>
      <td>店面名称</td>
      <td>开店时间</td>
      <td>营业时间</td>
      <td>区域</td>
      <td>所在地</td>
    </tr>
    <c:forEach var="kfc" items="${kfcs}">
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

  <button onclick="sousuo()">搜索</button>
  </body>

  <script>
    function sousuo() {
        window.location="search.jsp";
    }
  </script>
</html>
