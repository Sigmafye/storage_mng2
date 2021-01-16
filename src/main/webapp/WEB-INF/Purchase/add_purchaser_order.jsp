<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 17:10
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
<h3>采购开单</h3>
<h4 align="center">基本信息</h4>
<form class="form-inline definewidth m20" action="<%=request.getContextPath()%>order/addOrder" method="post">
    <table>
        <tbody>
        <tr>
            <th>
                供应商编号：
<%--                <input type="text" name="s_id" id="s_id" class="abc input-default" placeholder="" value="">--%>
                <select type="text" name="ware" id="supportor" class="abc input-default" placeholder="" value="">
                    <c:forEach var="supportor" items="${supportorList}">
                        <option value ="${supportor.s_name}">A-01</option>
                    </c:forEach>
                </select>
            </th>
            <th>
                采购员编号：
<%--                <input type="text" name="u_id" id="u_id"class="abc input-default" placeholder="" value="">--%>
                <select type="text" name="ware" id="buyer" class="abc input-default" placeholder="" value="">
                    <c:forEach var="buyer" items="${buyerIdList}">
                        <option value ="${buyer.u_id}">A-01</option>
                    </c:forEach>
                </select>
            </th>
            <th>
                供应商：
                <input type="text" name="suppotor" id="suppotor"class="abc input-default" placeholder="" value="">
            </th>
            <th>
                收货仓库：
                <select type="text" name="ware" id="ware"class="abc input-default" placeholder="" value="">
                    <option value ="A-01">A-01</option>
                    <option value ="B-02">B-02</option>
                    <option value="C-03">C-03</option>
                    <option value="D-04">D-04</option>
                </select>
            </th>

        </tr>
        <tr>
            <th>
                到货时间：
                <input type="text" name="a_time" id="a_time" class="abc input-default" placeholder="" value="">
            </th>
            <th>
                联系人:
                <input type="text" name="relate_peo" id="relate_peo" class="abc input-default" placeholder="" value="">
            </th>
            <th>
                联系方式：
                <input type="text" name="re_methods" id="re_methods"class="abc input-default" placeholder="" value="">
            </th>
            <th>
                经手人编号：
                <input type="text" name="p_id" id="p_id"class="abc input-default" placeholder="" value="">
            </th>

        </tr>
        <tr>
            <th>
                经手人：
                <input type="text" name="processor" id="processor"class="abc input-default" placeholder="" value="">
            </th>
        </tr>
        </tbody>
        <tbody>
        <tr>
    </table>
    <div align="center">
        <input type="submit" class="btn btn-primary" value="提交采购单" >
    </div>

</form>
<!--<ul class="nav nav-list">
    <li class="divider"></li>
</ul>-->
<h5 class="page-header"></h5>
<div>
    <button type="submit" class="btn" id="addnew"><a href="add_commodity.jsp">添加商品</a></button>&nbsp;&nbsp;
    <button type="button" class="btn" id=""><a href="add_commodity.jsp">批量导入</a></button>
    <form class="form-inline definewidth m20" action="index.html" method="get">
        分类：
        <select>
            <option value ="all">所有</option>
            <option value ="saab">Saab</option>
            <option value="opel">Opel</option>
            <option value="audi">Audi</option>
        </select>
        商品编号：
        <input type="text" name="rolename" id="rolename"class="abc input-default" placeholder="" value="请输入编码">
        商品名称：
        <input type="text" name="commodityname" id="commodityname"class="abc input-default" placeholder="" value="请输入关键字">
        <button type="submit" class="btn btn-primary" id="#">搜索</button>
    </form>
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
        <c:forEach var="ordergoods" items="${goodsList}">
        <tr>
            <td>${ordergoods.g_id}</td>
            <td>${ordergoods.bl_id}</td>
            <td>${ordergoods.g_name}</td>
            <td>${ordergoods.g_clacc}</td>
            <td>${ordergoods.g_num}</td>
            <td>${ordergoods.g_price}</td>
            <td>
                <button type="submit" class="btn btn-warning"><a href="edit_purchaser.jsp">修改</a></button>&nbsp;
                <button type="submit" class="btn btn-danger">删除</button>&nbsp;
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

</div>

<div align="center">
    <button type="submit" class="btn btn-primary" id="">保存</button>
    <button type="submit" class="btn btn-success" id="">提交审核</button>
</div>
</body>
<script>
    $(function () {

        $('#addnew').click(function(){
            window.location.href="add_commodity.html";
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
</html>