<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/16
  Time: 上午 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>出库管理</title>
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
<form class="form-inline definewidth m20" action="export.jsp" method="get">
    编号：
    <input type="text" name="goodsname" id="goodname" class="abc input-default" placeholder="请输入编号" value="">&nbsp;&nbsp;
    <select>
        <option>-请选择-</option>
        <option>按编号排序</option>
        <option>按状态排序</option>
    </select>
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp; <button type="button" class="btn btn-success" id="addnew">新增</button>
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th>入库编号</th>
        <th>产品编号</th>
        <th>管理员编号</th>
        <th>货物名称</th>
        <th>数量</th>
        <th>入库时间</th>
        <th>备注</th>
        <th>操作</th>

    </tr>
    </thead>
    <tr>
        <td>1</td>
        <td>2</td>
        <td>001</td>
        <td>dell笔记本</td>
        <td>21</td>
        <td>2020-01-01</td>
        <td>出库</td>
        <td>
            <button type="submit" class="btn btn-warning"><a href="edit_list.jsp">修改</a></button>&nbsp;
            <button id="del" type="submit" class="btn btn-danger">删除</button>&nbsp;
        </td>
    </tr></table>
<div class="inline pull-right page" >
    10122 条记录 1/507 页  <a href='#'>下一页</a>     <span class='current'>1</span><a href='#'>2</a><a href='/chinapost/index.php?m=Label&a=index&p=3'>3</a><a href='#'>4</a><a href='#'>5</a>  <a href='#' >下5页</a> <a href='#' >最后一页</a>    </div>
</body>
</html>
<script>
    $(function () {

        $('#addnew').click(function(){

            window.location.href="addGoods_export.jsp";
        });


    });

</script>