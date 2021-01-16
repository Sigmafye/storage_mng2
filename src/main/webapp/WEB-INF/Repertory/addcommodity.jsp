<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 15:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
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
</head>
<body>

<form action="<%=request.getContextPath()%>goods/add" method="post">
    <table class="table table-bordered table-hover definewidth m10">
        <%--编号自动生成--%>
        <%--        <tr>
            <td width="10%" class="tableleft">商品编号</td>
            <td><input type="text" name="gs_id" value=""/></td>
        </tr>--%>
        <tr>
            <td width="10%" class="tableleft">出库编号</td>
            <td><input type="text" name="ex_id" value=""/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">仓库编号</td>
            <td><input type="text" name="w_id" value=""/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">入库编号</td>
            <td><input type="text" name="im_id" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">商品名称</td>
            <td ><input type="text" name="gs_name" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">价格</td>
            <td ><input type="text" name="gs_price" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">商品分类</td>
            <td ><input type="text" name="gs_class" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">数量</td>
            <td ><input type="text" name="gs_num" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">所在仓库</td>
            <td ><input type="text" name="gs_ware" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">商品货架</td>
            <td ><input type="text" name="gs_shelf" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft"></td>
            <td>
                <button type="submit" class="btn btn-primary" type="button">保存</button>
                <button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
<script>
    $(function () {
        $('#backid').click(function(){
            window.location.href="commodity_manage.jsp";
        });

    });
</script>