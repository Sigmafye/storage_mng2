<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 17:18
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
<h4 align="center">采购单详情</h4>

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
        <tr>
            <td>0x00001</td>
            <td>ac22211</td>
            <td>qaz</td>
            <td>xx有限公司</td>
            <td>A-12</td>
            <td>2020-12-12</td>
            <td>张三</td>
            <td>123434322</td>
            <td>j232</td>
            <td>李二牛</td>
            <td>
                <button type="submit" class="btn btn-warning"><a href="edit_purchaser_order.jsp">修改</a></button>&nbsp;
                <button id="" type="submit" class="btn btn-danger">删除</button>&nbsp;
            </td>
        </tr>
        <tr>
            <td>0x00001</td>
            <td>ac22211</td>
            <td>qaz</td>
            <td>xx有限公司</td>
            <td>A-12</td>
            <td>2020-12-12</td>
            <td>张三</td>
            <td>123434322</td>
            <td>j232</td>
            <td>李二牛</td>
            <td>
                <button type="submit" class="btn btn-warning"><a href="edit_purchaser_order.jsp">修改</a></button>&nbsp;
                <button id="" type="submit" class="btn btn-danger">删除</button>&nbsp;
            </td>
        </tr>
        <tr>
            <td>0x00001</td>
            <td>ac22211</td>
            <td>qaz</td>
            <td>xx有限公司</td>
            <td>A-12</td>
            <td>2020-12-12</td>
            <td>张三</td>
            <td>123434322</td>
            <td>j232</td>
            <td>李二牛</td>
            <td>
                <button type="submit" class="btn btn-warning"><a href="edit_purchaser_order.jsp">修改</a></button>&nbsp;
                <button id="" type="submit" class="btn btn-danger">删除</button>&nbsp;
            </td>
        </tr>
        <tr>
            <td>0x00001</td>
            <td>ac22211</td>
            <td>qaz</td>
            <td>xx有限公司</td>
            <td>A-12</td>
            <td>2020-12-12</td>
            <td>张三</td>
            <td>123434322</td>
            <td>j232</td>
            <td>李二牛</td>
            <td>
                <button type="submit" class="btn btn-warning"><a href="edit_purchaser_order.jsp">修改</a></button>&nbsp;
                <button id="" type="submit" class="btn btn-danger">删除</button>&nbsp;
            </td>
        </tr>
        </tbody>
    </table>
</div>
<button type="submit" class="btn"><a href="add_purchaser_order.jsp">添加采购单</a></button>&nbsp;
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