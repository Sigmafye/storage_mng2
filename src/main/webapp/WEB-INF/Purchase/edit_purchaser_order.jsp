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
<form action="<%=request.getContextPath()%>order/updateOrder" method="post" class="definewidth m20">
    <input type="hidden" name="id" value="" />
    <table class="table table-bordered table-hover ">
        <tr>
            <td width="10%" class="tableleft">订单编号</td>
            <td><input type="text" name="bl_id" value="" readonly/></td>
        </tr>
        <tr>
            <td class="tableleft">供应商编号</td>
            <td ><input type="text" name="s_id" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">采购员编号</td>
            <td ><input type="text" name="u_id" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">供应商</td>
            <td ><input type="text" name="suppotor" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">收货仓库</td>
            <td >
                <select type="text" name="ware" id="ware"class="abc input-default" placeholder="" value="">
                    <option value ="A-01">A-01</option>
                    <option value ="B-02">B-02</option>
                    <option value="C-03">C-03</option>
                    <option value="D-04">D-04</option>
                </select>
            </td>
        </tr>
        <tr>
            <td class="tableleft">到货时间</td>
            <td ><input type="text" name="a_time" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">联系人</td>
            <td ><input type="text" name="relate_peo" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">联系方式</td>
            <td ><input type="text" name="re_methods" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">经手人编号</td>
            <td ><input type="text" name="p_id" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft">经手人</td>
            <td ><input type="text" name="processor" value=""/></td>
        </tr>
        <tr>
            <td class="tableleft"></td>
            <td>
                <button type="submit" class="btn btn-primary" type="button">保存</button> &nbsp;&nbsp;<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
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