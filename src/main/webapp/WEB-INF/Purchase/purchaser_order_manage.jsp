<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
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
<h4 align="center">采购单详情</h4>
<form class="form-inline definewidth m20" action="" method="get">
    关键字：
    <input type="text" name="rolename" id="rolename" class="abc input-default" placeholder="" value="">&nbsp;&nbsp;&nbsp;
    供应商：
    <select type="text" name="s_id" id="supportor" class="abc input-default" >
        <c:forEach var="supportor" items="${supportorList}">
            <option value ="${supportor.s_id}">${supportor.s_id},${supportor.s_name}</option>
        </c:forEach>
    </select>
    <button type="submit" class="btn btn-primary" id="#">查询</button>&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="submit" class="btn"><a href="<%=request.getContextPath()%>/goto/addPurchaseOrder">添加采购单</a></button>
</form>
<div>
    <table class="table table-bordered table-hover definewidth m10" >
        <thead>
        <tr>
            <th>订单编号</th>
            <th>供应商编号</th>
            <th>采购员编号</th>
            <th>供应商</th>
            <th>收货仓库</th>
            <th>到货时间</th>
            <th>联系人</th>
            <th>联系方式</th>
            <th>经手人编号</th>
            <th>经手人</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="order" items="${orderList}">
        <tr>
            <td>${order.bl_id}</td>
            <td>${order.s_id}</td>
            <td>${order.u_id}</td>
            <td>${order.supportor}</td>
            <td>${order.ware}</td>
            <td>${order.a_time}</td>
            <td>${order.relate_peo}</td>
            <td>${order.re_methods}</td>
            <td>${order.p_id}</td>
            <td>${order.processor}</td>
            <td>
                <button id="update"  class="btn btn-warning"><a href="<%=request.getContextPath()%>/goto/updateOrder/${order.bl_id}">修改</a></button>&nbsp;
                <button id="delete"  class="btn btn-danger"><a href="<%=request.getContextPath()%>/order/deleteOrder/${order.bl_id}">删除</a></button>&nbsp;
                <button id="GoodsMng"  class="btn btn"><a href="<%=request.getContextPath()%>/goto/addOrderGoods/${order.bl_id}">商品管理</a></button>&nbsp;
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    ${result}
</div>

<div class="inline pull-right page">
    10122 条记录 1/507 页  <a href='#'>下一页</a>
    <span class='current'>1</span>
    <a href='#'>2</a>
    <a href='#'>3</a>
    <a href='#'>4</a>
    <a href='#'>5</a>
    <a href='#' >下5页</a>
    <a href='#' >最后一页</a>
</div>

</body>
</html>