<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/4/16
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="InsertServlet" method="post">
        名称：<input type="text" name="name"/><br/>
        开始时间：<input type="date" name="start_time"/><br/>
        工作时间：<input type="text" name="work_time"/><br/>
        地址：<select name="address_id" id="">
                <option value="1">奉贤区五四广场</option>
                <option value="2">浦东区天津路</option>
                <option value="3">松江区南山</option>
               </select><br/>

        <input type="submit" value="提交">
    </form>
</body>
</html>
