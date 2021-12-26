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
<h2>系统</h2>
<tr>
    <td align="center">用户注册</td>
    <form method="post" action="staff/add" >
            <fieldset>

            <td align="center"><p>
                <label for="staff_Name">请输入姓名： </label>
                <input name="staffName" id="staff_Name" type="text" required="required" maxlength="128" />
            </p>
            </td>

            <td align="center">
                <p>
                    <label for="staff_Password">请输入使用密码： </label>
                    <input name="staffPassword" id="staff_Password" type="text" required="required" maxlength="128" />
                </p>
            </td>

            <td align="center">
                <p>
                    <label for="repeat_Password">请重复密码： </label>
                    <input name="repeatPassword" id="repeat_Password" type="text" required="required" maxlength="128" />
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
