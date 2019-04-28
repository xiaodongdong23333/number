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
    <title>修改学生信息</title>
</head>
<body>
<h2>修改学生信息</h2>
<form method="post" action="../change" >
    <fieldset>
        <p>
            <label for="studentId">学生的学号： </label>
            <input name="studentId" id="studentId" type="text" required="required" readonly="readonly" maxlength="128" value="${Student.studentId}" />
        </p>
        <p>
            <label for="name">要修改的姓名为： </label>
            <input name="name" id="name" type="text" required="required" maxlength="128"  value="${Student.name}" />
        </p>
        <p>
            <label for="score">要修改的时长为： </label>
            <input name="score" id="score" type="text" required="required" maxlength="128" value="${Student.score}" />
        </p>

        <p>
            <button>提交</button>
        </p>
    </fieldset>
</form>
<a href="list">返回</a>
</body>
</html>
