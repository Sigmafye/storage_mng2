<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/1/16
  Time: 上午 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>入库管理</title>
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
<form class="form-inline definewidth m20" action="<%=request.getContextPath()%>/import/getIR1" method="get">
    关键字：
    <input type="text" name="im_id" id="im_id" class="abc input-default" placeholder="请输入" >&nbsp;&nbsp;
    <button type="submit" class="btn btn-primary">查询</button>&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-success" id="addnew"><a href="<%=request.getContextPath()%>/goto/addImport">新增</a></button>
</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>

        <th>入库单编号</th>
        <th>货物编号</th>
        <th>客户编号</th>
        <th>入库数量</th>
        <th>入库时间</th>
        <th>负责人</th>
        <th>备注</th>
        <th>操作</th>
    </tr>
    </thead>
<tbody>
    <c:forEach var="we" items="${IRList}">
        <tr>

        <td>${we.im_id}</td>
        <td>${we.m_id}</td>
        <td>${we.c_id}</td>
        <td>${we.im_quantity}</td>
        <td>${we.im_time}</td>
        <td>${we.im_principal}</td>
        <td>${we.im_remarks}</td>
        <td>
                <button type="submit" class="btn btn-warning"><a href="<%=request.getContextPath()%>/import/transformIR/${we.im_id}/${we.m_id}/${we.c_id}/${we.im_quantity}/${we.im_time}/${we.im_principal}/${we.im_remarks}">修改</a></button>&nbsp;
                <button id="del" type="submit" class="btn btn-danger"><a href="<%=request.getContextPath()%>/import/deleteIR/${we.im_id}">删除</a></button>&nbsp;
            </td>
        </tr>
    </c:forEach>

    <tr>
        <td>${importRecord.im_id}</td>
        <td>${importRecord.m_id}</td>
        <td>${importRecord.c_id}</td>
        <td>${importRecord.im_quantity}</td>
        <td>${importRecord.im_time}</td>
        <td>${importRecord.im_principal}</td>
        <td>${importRecord.im_remarks}</td>
<%--        <td>--%>
<%--            <button type="submit" class="btn btn-warning"><a href="<%=request.getContextPath()%>/import/transformIR/${we.im_id}/${we.m_id}/${we.c_id}/${we.im_quantity}/${we.im_time}/${we.im_principal}/${we.im_remarks}">修改</a></button>&nbsp;--%>
<%--            <button id="del" type="submit" class="btn btn-danger"><a href="<%=request.getContextPath()%>/import/deleteIR/${we.im_id}">删除</a></button>&nbsp;--%>
<%--        </td>--%>
    </tr>


<%--    <c:forEach var="we" items="${importRecord1List}">--%>
<%--        <tr>--%>

<%--            <td><input type="checkbox"></td>--%>

<%--            <td>${we.im_id}</td>--%>
<%--            <td>${we.m_id}</td>--%>
<%--            <td>${we.c_id}</td>--%>
<%--            <td>${we.im_quantity}</td>--%>
<%--            <td>${we.im_time}</td>--%>
<%--            <td>${we.im_principal}</td>--%>
<%--            <td>${we.im_remarks}</td>--%>
<%--        </tr>--%>
<%--    </c:forEach>--%>
</tbody>
</table>
<div class="inline pull-right page">
    10122 条记录 1/507 页 <a href='#'>下一页</a> <span class='current'>1</span><a href='#'>2</a><a
        href='/chinapost/index.php?m=Label&a=index&p=3'>3</a><a href='#'>4</a><a href='#'>5</a> <a href='#'>下5页</a> <a
        href='#'>最后一页</a></div>
</body>
</html>
<%--<script>--%>
<%--    $(function () {--%>

<%--        $('#addnew').click(function () {--%>
<%--            window.location.href = "addGoods_import.jsp";--%>
<%--        });--%>
<%--    });--%>
<%--</script>--%>