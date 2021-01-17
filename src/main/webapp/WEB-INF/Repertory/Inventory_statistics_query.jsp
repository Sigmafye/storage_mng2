<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: xxdn
  Date: 2021/1/16
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<h4 align="center">检索信息</h4>
<form align="center" class="form-inline definewidth m20" action="<%=request.getContextPath()%>/import/repertorySearch" method="get">
    检索物品名称：
    <input type="text" name="r_name" id="r_name" class="abc input-default">
    <button type="submit" class="btn btn-primary" id="startSearch">开始检索</button>
</form>


<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <h4 align="center">库存汇总统计</h4>
    </tr>

    <tr>
        <th>物品编号</th>
        <th>名称</th>
        <th>类型</th>
        <th>价格</th>
        <th>数量</th>
        <th>所在仓库</th>
        <th>所在货架</th>
    </tr>
    </thead>

    <tbody>

    <c:forEach var="ReperoryList" items="${repertoryList}">
        <tr>
            <td>${ReperoryList.r_id}</td>
            <td>${ReperoryList.r_name}</td>
            <td>${ReperoryList.r_type}</td>
            <td>${ReperoryList.r_price}</td>
            <td>${ReperoryList.r_quantity}</td>
            <td>${ReperoryList.r_warehouse}</td>
            <td>${ReperoryList.r_shelf}</td>

        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
