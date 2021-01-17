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
<form class="form-inline definewidth m20" action="" method="get">
    用户名：
    <input type="text" name="buyername" id="buyername" class="abc input-default" placeholder="请输入用户名" value="">&nbsp;&nbsp;
    <button type="submit" class="btn btn-primary" id="select">查询</button>
    <button type="button" class="btn btn-success" id="addnew">新增</button>
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th>管理员编号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>电话</th>
        <th>地址</th>
        <th>管理仓库</th>
        <th>操作</th>

    </tr>
    </thead>

    <c:forEach var="mnger" items="${wareMngerList}">
        <tr>
            <td>${mnger.m_id}</td>
            <td>${mnger.m_name}</td>
            <td>${mnger.m_password}</td>
            <td>${mnger.m_tel}</td>
            <td>${mnger.m_addr}</td>
            <td>${mnger.m_wnum}</td>
            <td>
                <button type="submit" class="btn btn-warning"><a href="<%=request.getContextPath()%>/wareMnger/update/${mnger.m_id}">修改</a></button>&nbsp;
                <button id="del" type="submit" class="btn btn-danger"><a href="<%=request.getContextPath()%>/wareMnger/delete/${mnger.m_id}">删除</a></button>&nbsp;
            </td>
        </tr>
    </c:forEach>
</table>
<div class="inline pull-right page" align="center">
    10122 条记录 1/507 页  <a href='#'>下一页</a>     <span class='current'>1</span><a href='#'>2</a><a href='/chinapost/index.php?m=Label&a=index&p=3'>3</a><a href='#'>4</a><a href='#'>5</a>  <a href='#' >下5页</a> <a href='#' >最后一页</a>    </div>
</body>
</html>
<script>
    $(function () {

        $('#addnew').click(function(){

            window.location.href="<%=request.getContextPath()%>/wareMnger/addPage";
        });


    });

    $(function () {

        $('#select').click(function(){

            window.location.href="<%=request.getContextPath()%>/wareMnger/addPage";
        });


    });
</script>
