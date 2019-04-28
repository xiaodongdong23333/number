<%--
  Created by IntelliJ IDEA.
  User: xiaod
  Date: 2019/4/25
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>智能打卡管理系统</h2>
<tr>
    <td align="center">学生打卡</td>
    <form method="post" action="student/add" >
        <fieldset>

            <td align="center"><p>
                <label for="student_Id">请输入学号： </label>
                <input name="studentId" id="student_Id" type="text" required="required" maxlength="128" />
            </p>
            </td>

            <td align="center">
                <p>
                    <label for="course_Id">请输入要打卡的课程号： </label>
                    <input name="courseId" id="course_Id" type="text" required="required" maxlength="128" />
                </p>
            </td>

            <td align="center">
                <p>
                    <button>提交</button>
                </p>
            </td>
        </fieldset>
    </form>
</tr>
</body>
</html>
