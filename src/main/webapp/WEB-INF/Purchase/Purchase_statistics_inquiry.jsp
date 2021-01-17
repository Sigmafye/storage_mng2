<%--
  Created by IntelliJ IDEA.
  User: xxdn
  Date: 2021/1/16
  Time: 15:06
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
<form action="<%=request.getContextPath()%>/order/orderStaticSearch" method="post" class="definewidth m20">
    <table class="table table-bordered table-hover definewidth m10">
        <tr>
            <h4 align="center">采购单基本信息</h4>
        </tr>
        <tr>
            <td width="10%" class="tableleft">采购单编号</td>
            <td><input type="text" name="bl_id"/></td>
            当前仓库共有:${totalOrderNum}条采购单
        </tr>
        <tr>
            <td class="tableleft">采购单统计项</td>
            <td>
                <label class='checkbox inline'><input type='checkbox' name='node[]' checked="checked" value='g_num' />数量</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' checked="checked" value='g_price' />单价</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' checked="checked" value='g_total' />金额合计</label>
            </td>
        </tr>
    </table>
    <div align="center">
        <button type="submit" class="btn btn-primary">检索</button>
    </div>
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <h4 align="center">采购汇总统计</h4>
    </tr>
    <tr>
        <th>采购商品编号</th>
        <th>采购商品名称</th>
        <th>采购数量</th>
        <th>采购单价</th>
        <th>供应商</th>
        <th>预计到货时间</th>
        <th>总计金额</th>
        <th>采购员工号</th>

    </tr>
    </thead>
    <c:forEach var="good" items="${goodsList}">
        <tr>
            <td>${good.g_id}</td>
            <td>${good.g_name}</td>
            <td>${good.g_num}</td>
            <td>${good.g_price}</td>
            <td>${order.supportor}</td>
            <td>${order.a_time}</td>
            <td>${good.g_num*good.g_price}</td>
            <td>${order.u_id}</td>
        </tr>
    </c:forEach>

    <tr>
        <td>
            订单商品金额总计：${totalMoney}
        </td>
    </tr>
</table>
<form class="form-inline definewidth m20" action="index.html" method="get">
    <div align="center">
        <button type="submit" class="btn btn-primary">导出</button>
    </div>
</form>
</body>
</html>
