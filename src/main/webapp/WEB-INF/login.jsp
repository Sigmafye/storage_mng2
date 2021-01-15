<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/14
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>后台管理系统</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../resources/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="../resources/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="../resources/Css/style.css" />
    <script type="text/javascript" src="../resources/Js/jquery.js"></script>
    <script type="text/javascript" src="../resources/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="../resources/Js/bootstrap.js"></script>
    <script type="text/javascript" src="../resources/Js/ckform.js"></script>
    <script type="text/javascript" src="../resources/Js/common.js"></script>

    <style type="text/css">
        body {
            padding-top: 40px;
            padding-bottom: 40px;
            background-color: #f5f5f5;
        }

        .form-signin {
            max-width: 300px;
            padding: 19px 29px 29px;
            margin: 0 auto 20px;
            background-color: #ffffff;
            border: 1px solid #e5e5e5;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            -webkit-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            -moz-box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
            box-shadow: 0 1px 2px rgba(0, 0, 0, .05);
        }

        .form-signin .form-signin-heading,
        .form-signin .checkbox {
            margin-bottom: 10px;
        }

        .form-signin input[type="text"],
        .form-signin input[type="password"] {
            font-size: 16px;
            height: auto;
            margin-bottom: 15px;
            padding: 7px 9px;
        }

    </style>
</head>
<body>

<div class="container">

    <form class="form-signin" method="post" action="/WEB-INF/index.jsp">
        <h2 class="form-signin-heading">登录系统</h2>
        <input type="text" name="username" class="input-block-level" placeholder="账号">
        <input type="password" name="password" class="input-block-level" placeholder="密码">
        <input type="text" name="verify" class="input-medium" placeholder="验证码">
        <tr class="accordion-group">
            <td>
                <button class="btn btn-large btn-primary" type="submit"  onclick="doLogin()">登录</button>
<%--                <button class="btn btn-large btn-primary" type="submit"  onclick="doRegister()">注册</button>--%>
            </td>
        </tr>
    </form>
    ${result}
</div>

<script type="text/javascript">
    function  doLogin() {  //登录验证
        alert("ok");
        var username = document.getElementById("username").value;
        var password = document.getElementById("password").value;
        window.open("<%=request.getContextPath()%>/account/validate?"+"username="+username+"&password="+password,"_self")
    }

    function doRegister() {  //注册账号
        window.open("<%=request.getContextPath()%>/account/registerPage","_self");
    }
</script>
</body>
</html>

