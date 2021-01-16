<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 17:09
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
<h4>添加商品</h4>
分类：
<select>
    <option value ="volvo">Volvo</option>
    <option value ="saab">Saab</option>
    <option value="opel">Opel</option>
    <option value="audi">Audi</option>
</select>
编号：
<input type="text" name="g_id" id="g_id"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
商品名称：
<input type="text" name="g_name" id="g_name"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;
<button type="submit" class="btn btn-primary" id="#">搜索</button>

<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th>采购商品编号</th>
        <th>订单编号</th>
        <th>采购商品名称</th>
        <th>采购商品分类</th>
        <th>采购数量</th>
        <th>采购单价</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>0x00001</td>
        <td>a3423668987</td>
        <td>云大海苔</td>
        <td>食物</td>
        <td>100</td>
        <td>12元</td>
        <td>
            <button type="submit" class="btn btn-primary">添加</button>&nbsp;
        </td>
    </tr>
    <tr>
        <td>0x00001</td>
        <td>a3423668987</td>
        <td>云大海苔</td>
        <td>食物</td>
        <td>100</td>
        <td>12元</td>
        <td>
            <button type="submit" class="btn btn-primary">添加</button>&nbsp;
        </td>
    </tr>
    </tbody>
</table>
<button type="submit" class="btn btn"><a href="add_purchaser_order.jsp">返回采购单界面</a></button>&nbsp;
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
