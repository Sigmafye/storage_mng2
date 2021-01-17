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
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/Css/style.css" />
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/Js/jquery.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/Js/bootstrap.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/Js/ckform.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/Js/common.js"></script>
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
<h4>更新商品信息</h4>
<form action="<%=request.getContextPath()%>/orderGoods/updateGoods" class="definewidth m20">
    <table class="table table-bordered table-hover ">
        <tr>
            <td width="10%" class="tableleft">采购商品编号</td>
            <td><input type="text" name="g_id" value="${ordergoods.g_id}"  readonly/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">订单编号</td>
            <td><input type="text" name="bl_id" value="${ordergoods.bl_id}"  readonly/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">采购商品名称</td>
            <td><input type="text" name="g_name" value="${ordergoods.g_name}"/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">采购商品分类</td>
            <td><input type="text" name="g_clacc" value="${ordergoods.g_clacc}" /></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">采购数量</td>
            <td><input type="text" name="g_num" value="${ordergoods.g_num}" /></td>
        </tr>
        <tr>
            <td class="tableleft">采购单价</td>
            <td ><input type="text" name="g_price" value="${ordergoods.g_price}"/></td>
        </tr>

        <tr>
            <td class="tableleft"></td>
            <td>
                <button type="submit" class="btn btn-primary">保存</button> &nbsp;&nbsp;
                <button type="button" onclick="window.history.go(-1)" class="btn btn-success" >返回列表</button>
            </td>
        </tr>
    </table>
</form>
${result}
</body>
</html>
