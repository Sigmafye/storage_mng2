<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/Css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/resources/Css/bootstrap-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/Css/style.css"/>
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
<div align="center">
    <h4>产品库存管理</h4>
</div>
<form class="form-inline definewidth m20" action="<%=request.getContextPath()%>/product/searchByName" method="get">
    关键字：
    <input type="text" name="keyname" id="rolename" class="abc input-default" placeholder="" value="">&nbsp;&nbsp;&nbsp;
    产品类别：
    <select type="text" name="productname" id="supportor" class="abc input-default" >

        <c:forEach var="product" items="${productClassList}">
            <option value ="${product}">${product}</option>
        </c:forEach>
    </select>
    <button type="submit" class="btn btn-primary" id="#">查询</button>&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-success" id="addnew">新增产品信息</button>
</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
        <th>产品编号</th>
        <th>仓库编号</th>
        <th>所在仓库</th>
        <th>入库编号</th>
        <th>出库编号</th>
        <th>产品名称</th>
        <th>产品单价/元</th>
        <th>库存数量</th>
        <th>产品类别</th>
        <th>贷架号</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
        <tr>
            <td>${product.p_idd}</td>
            <td>${product.w_id}</td>
            <td>${product.p_warehouse}</td>
            <td>${product.im_id}</td>
            <td>${product.ex_id}</td>
            <td>${product.p_name}</td>
            <td>${product.p_price}</td>
            <td>${product.p_quantity}</td>
            <td>${product.p_type}</td>
            <td>${product.p_shelf_number}</td>
            <td>
                <button type="submit" class="btn btn-warning"><a
                        href="<%=request.getContextPath()%>/product/updatePage/${product.p_idd}">修改</a></button>&nbsp;
                <button id="del" type="submit" class="btn btn-danger"><a
                        href="<%=request.getContextPath()%>/product//delete/${product.p_idd}">删除</a></button>&nbsp;
            </td>
        </tr>
    </c:forEach>
    </tbody>

</table>
<%--<div class="inline pull-right page">
    10122 条记录 1/507 页  <a href='#'>下一页</a>
    <span class='current'>1</span>
    <a href='#'>2</a>
    <a href='#'>3</a>
    <a href='#'>4</a>
    <a href='#'>5</a>
    <a href='#' >下5页</a>
    <a href='#' >最后一页</a>
</div>--%>
<script  src="../../resources/Js/jquery-3.2.1.min.js"></script>
<script>
    $('thead input').change(function () {
        var isChecked = $(this).prop('checked');
        $('tbody input').prop('checked', isChecked);
    })
    $('tbody input').change(function () {
        var allCount = $('tbody input').length;
        var checkCount = $('tbody input:checked').length;
        var isAllChecked = allCount === checkCount;
        $('thead input').prop('checked', isAllChecked);
    })

</script>
</body>
</html>

<script>
    $(function () {

        $('#addnew').click(function () {
            window.location.href = "<%=request.getContextPath()%>/product/addPage";
        });
    });

    function del(id) {
        if (confirm("确定要删除吗？")) {
            var url = "index.html";
            var url = "";
            window.location.href = url;
        }
    }
</script>
