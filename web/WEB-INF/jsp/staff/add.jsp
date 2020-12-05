<%--
  Created by IntelliJ IDEA.
  User: xiaod
  Date: 2018/7/12
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaod
  Date: 2018/7/5
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
<h2>添加用户</h2>
<form method="get" action="add" >
    <fieldset>
        <legend>用户信息</legend>
        <p>
            <label for="name">姓名： </label>
            <input name="name" id="name" type="text" required="required" maxlength="128" />
        </p>
        <p>
            <label for="score">时长： </label>
            <input name="score" id="score" type="text" required="required" maxlength="128" />
        </p>
        <p>
            <button>提交</button>
        </p>
    </fieldset>
</form>
<a href="list.jsp">返回</a>
</body>
</html>
