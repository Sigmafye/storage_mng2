<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 17:09
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
<h4>添加商品</h4>


<form action="<%=request.getContextPath()%>/orderGoods/addOrderGoods/${bl_id}" class="definewidth m20">

    <table class="table table-bordered table-hover ">
        <tr>
            <td class="tableleft">商品名称</td>
            <td ><input type="text" name="g_name" required="required"/></td>
        </tr>
        <tr>
            <td class="tableleft">商品分类</td>
            <td ><input type="text" name="g_clacc" required="required"/></td>
        </tr>
        <tr>
            <td class="tableleft">采购数量</td>
            <td ><input type="text" name="g_num" required="required"/></td>
        </tr>
        <tr>
            <td class="tableleft">采购价格</td>
            <td ><input type="text" name="g_price" required="required"/></td>
        </tr>
        <tr>
            <td class="tableleft"></td>
            <td>
                <button type="submit" class="btn btn-primary" type="button">添加</button> &nbsp;&nbsp;
                <button type="button" onclick="window.history.go(-1)" class="btn btn-success" >返回列表</button>
            </td>
        </tr>
    </table>
</form>
${result}
</body>
</html>
