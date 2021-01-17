<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 15:48
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
<form action="<%=request.getContextPath()%>/product/updateDone" method="post" class="definewidth m20">
    <input type="hidden" name="id" value="" />
    <table class="table table-bordered table-hover ">
        <tr>
            <td width="10%" class="tableleft">产品编号</td>
            <td><input type="text" name="p_idd" value="${product.p_idd}"  readonly/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">仓库编号</td>
            <td>
                <select type="text" name="w_id" id="w_id" class="abc input-default" >
                    <c:forEach var="wareHouseList" items="${wareHouseList}">
                        <option value ="${wareHouseList.w_id}">${wareHouseList.w_id}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">所在仓库</td>
            <td><input type="text" name="p_warehouse" value="${product.p_warehouse}"/></td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">入库编号</td>
            <td>
                <select type="text" name="im_id" id="im_id" class="abc input-default" >
                    <c:forEach var="IRList" items="${IRList}">
                        <option value ="${IRList.im_id}">${IRList.im_id}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td width="10%" class="tableleft">出库编号</td>
            <td>
                <select type="text" name="ex_id" id="ex_id" class="abc input-default" >
                    <c:forEach var="EXList" items="${EXList}">
                        <option value ="${EXList.ex_id}">${EXList.ex_id}</option>
                    </c:forEach>
                </select>
            </td>
        </tr>
        <tr>
            <td class="tableleft">产品名称</td>
            <td ><input type="text" name="p_name" value="${product.p_name}"/></td>
        </tr>
        <tr>
            <td class="tableleft">产品单价/元</td>
            <td ><input type="text" name="p_price" value="${product.p_price}"/></td>
        </tr>
        <tr>
            <td class="tableleft">库存数量</td>
            <td ><input type="text" name="p_quantity" value="${product.p_quantity}"/></td>
        </tr>
        <tr>
            <td class="tableleft">产品类别</td>
            <td ><input type="text" name="p_type" value="${product.p_type}"/></td>
        </tr>

        <tr>
            <td width="10%" class="tableleft">货架号</td>
            <td><input type="text" name="p_shelf_number" value="${product.p_shelf_number}"/></td>
        </tr>
        <tr>
            <td class="tableleft"></td>
            <td>
                <button type="submit" class="btn btn-primary" type="button">保存</button> &nbsp;&nbsp;
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
            window.history.go(-1);
        });

    });
</script>