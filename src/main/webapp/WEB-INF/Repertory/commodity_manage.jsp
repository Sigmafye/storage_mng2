<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<% %>
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
<div align="center">
    <h4>商品库存管理</h4>
</div>
<form class="form-inline definewidth m20" action="index.html" method="get">
    关键字：
    <input type="text" name="rolename" id="rolename"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;&nbsp;
    类别：
    <select></select>
    <button type="submit" class="btn btn-primary" id="#">查询</button>&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-success" id="addnew">新增商品信息</button>
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th>商品编号</th>
        <th>出库编号</th>
        <th>仓库编号</th>
        <th>入库编号</th>
        <th>商品名称</th>
        <th>价格</th>
        <th>商品分类</th>
        <th>数量</th>
        <th>所在仓库</th>
        <th>商品货架</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="goods" items="${goodsList}">
    <tr>
        <td>${goods.gs_id}</td>
        <td>${goods.ex_id}</td>
        <td>${goods.w_id}</td>
        <td>${goods.im_id}</td>
        <td>${goods.gs_name}</td>
        <td>${goods.gs_price}</td>
        <td>${goods.gs_class}</td>
        <td>${goods.gs_num}</td>
        <td>${goods.gs_ware}</td>
        <td>${goods.gs_shelf}</td>
        <td>
            <button type="submit" class="btn btn-warning"><a href="<%=request.getContextPath()%>/goods/update/${goods.gs_id}">修改</a></button>&nbsp;
            <button id="del" type="submit" class="btn btn-danger">删除</button>&nbsp;
        </td>
    </tr>
    </c:forEach>
    </tbody>

</table>
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
<script  src="../../resources/Js/jquery-3.2.1.min.js"></script>
<script>
    $('thead input').change(function (){
        var isChecked = $(this).prop('checked');
        $('tbody input').prop('checked',isChecked);
    })
    $('tbody input').change(function (){
        var allCount = $('tbody input').length;
        var checkCount = $('tbody input:checked').length;
        var isAllChecked = allCount === checkCount;
        $('thead input').prop('checked',isAllChecked);
    })

</script>

</body>
</html>
<script>
    $(function () {

        $('#addnew').click(function(){

            window.location.href="addcommodity.jsp";
        });


    });

    function del(id)
    {


        if(confirm("确定要删除吗？"))
        {

            var url = "";

            window.location.href=url;

        }
    }
</script>