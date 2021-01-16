<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/16
  Time: 上午 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<form class="form-inline definewidth m20" action="index.jsp" method="get">
    用户名：
    <input type="text" name="username" id="username"class="abc input-default" placeholder="请输入" value="">&nbsp;&nbsp;
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp; <button type="button" class="btn btn-success" id="addnew">新增用户</button>
</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>年龄</th>
        <th>地址</th>
        <th>操作</th>
    </tr>
    </thead>
    <tr>
        <td>1</td>
        <td>徐铁</td>
        <td>111</td>
        <td>20</td>
        <td>呈贡</td>
        <td>
            <button type="submit" class="btn btn-warning"><a href="edit_user.jsp">修改</a></button>&nbsp;
            <button type="submit" class="btn btn-danger">删除</button>&nbsp;
        </td>
    </tr>
    <tr>
        <td>2</td>
        <td>吴家祥</td>
        <td>222</td>
        <td>21</td>
        <td>呈贡</td>
        <td>
            <button type="submit" class="btn btn-warning"><a href="edit_user.jsp">修改</a></button>&nbsp;
            <button type="submit" class="btn btn-danger">删除</button>&nbsp;
        </td>
    </tr>
    <tr>
        <td>3</td>
        <td>马浩然</td>
        <td>333</td>
        <td>22</td>
        <td>呈贡</td>
        <td>
            <button type="submit" class="btn btn-warning"><a href="edit_user.jsp">修改</a></button>&nbsp;
            <button type="submit" class="btn btn-danger">删除</button>&nbsp;
        </td>
    </tr>
</table>
</body>
</html>
<script>
    $(function () {


        $('#addnew').click(function(){

            window.location.href="add_user.jsp";
        });


    });

    function del(id)
    {


        if(confirm("确定要删除吗？"))
        {

            var url = "index.jsp";

            window.location.href=url;

        }




    }
</script>