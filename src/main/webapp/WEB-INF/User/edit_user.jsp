<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/16
  Time: 上午 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/Css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/Js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/Js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/Js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/Js/common.js"></script>
    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
</head>
<body>
<form action="<%=request.getContextPath()%>/super/doUpdate" method="post" class="definewidth m20">
<%--    <input type="hidden" name="id" value="{$user.id}" />--%>
    <table class="table table-bordered table-hover definewidth m10">
        <tr>
            <td width="10%" class="tableleft">编号</td>
            <td><input type="text" name="su_id" value="${superMnger.su_id}" readonly></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">用户名</td>
            <td><input type="text" name="su_name" value="${superMnger.su_name}"></td>
        </tr>
        <tr>
            <td class="tableleft">密码</td>
            <td><input type="text" name="su_password"value="${superMnger.su_password}"></td>
        </tr>
        <tr>
            <td class="tableleft">年龄</td>
            <td><input type="text" name="su_age"value="${superMnger.su_age}"></td>
        </tr>
        <tr>
            <td class="tableleft">地址</td>
            <td><input type="text" name="su_addr"value="${superMnger.su_addr}"></td>
        </tr>
        <tr>
            <td class="tableleft"></td>
            <td>
                <button type="submit" class="btn btn-primary" type="button">保存</button>				 &nbsp;&nbsp;
                <button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<script>
    $(function () {
        $('#backid').click(function(){
            window.history.go(-1);
        });

    });
</script>
