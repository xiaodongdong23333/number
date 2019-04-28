<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xiaod
  Date: 2018/7/11
  Time: 21:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>智能打卡管理系统</title>
</head>
<body>
<h2>智能打卡管理系统</h2>
<table width="100%" border="1">
    <tr>
        <th scope="col">学号</th><th scope="col">姓名</th><th scope="col">时长</th><th scope="col">操作</th>
    </tr>
    <c:forEach begin="0" step="1" items="${list}" var="Student">
        <tr>
            <td align="center">${Student.studentId}</td><td align="center">${Student.name}</td><td align="center">${Student.score}</td>

            <td align="center">
                <a href="delete/${Student.studentId}" class="delete">删除</a>|
                <a href="change/${Student.studentId}">修改</a>
            </td>
        </tr>
    </c:forEach>

   <tr>
        <td align="center">添加学生信息</td>
        <form method="post" action="add" >
            <fieldset>

                <td align="center"><p>
                    <label for="name">姓名： </label>
                    <input name="name" id="name" type="text" required="required" maxlength="128" />
                </p>
                </td>

                <td align="center">
                    <p>
                        <label for="score">成绩： </label>
                        <input name="score" id="score" type="text" required="required" maxlength="128" />
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

</table>

<script>
    var items=document.querySelectorAll(".delete");
    for(var i=0;i<items.length;i++){
        items[i].onclick=function () {
            return confirm("您确定要删除吗?");
        }
    }
</script>

<p style="text-align: center">一共${pageInfo.pages}页
    <a href="?pn=${pageInfo.firstPage}">第一页</a>
    <a href="?pn=${pageInfo.prePage}">上一页</a>
    <a href="?pn=${pageInfo.nextPage}">下一页</a>
    <a href="?pn=${pageInfo.lastPage}">最后页</a>
</p>


</body>
</html>