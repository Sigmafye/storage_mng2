<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
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
<h3>采购开单</h3>
<h4 align="center">基本信息</h4>
<form class="form-inline definewidth m20" action="<%=request.getContextPath()%>/order/addOrder" method="post">
    <table>
        <tbody>
        <tr>
            <th>
            <td>供应商编号：</td>
            <td><input type="text" name="s_id" id="s_id" class="abc input-default" value="${order.s_id}" readonly></td>
            </th>
            <th>
            <td>采购员编号：</td>
            <td><input type="text" name="u_id" id="u_id" class="abc input-default" value="${order.u_id}" readonly></td>
            </th>
            <th>
            <td>供应商：</td>
            <td><input type="text" name="supportor" id="supportor" class="abc input-default" value="${order.supportor}"
                       readonly></td>
            </th>


        </tr>
        <tr>
            <th>
            <td>收货仓库：</td>
            <td><input type="text" name="ware" id="ware" class="abc input-default" value="${order.ware}" readonly></td>

            </th>
            <th>
            <td>到货时间：</td>
            <td><input type="text" name="a_time" id="a_time" class="abc input-default" value="${order.a_time}" readonly>
            </td>
            </th>
            <th>
            <td>联系人:</td>
            <td><input type="text" name="relate_peo" id="relate_peo" class="abc input-default"
                       value="${order.relate_peo}" readonly></td>
            </th>


        </tr>
        <tr>
            <th>
            <td>联系方式：</td>
            <td><input type="text" name="re_methods" id="re_methods" class="abc input-default"
                       value="${order.re_methods}" readonly></td>
            </th>
            <th>
            <td>经手人编号：</td>
            <td><input type="text" name="p_id" id="p_id" class="abc input-default" value="${order.p_id}" readonly></td>
            </th>
            <th>
            <td>经手人：</td>
            <td><input type="text" name="processor" id="processor" class="abc input-default" value="${order.processor}"
                       readonly></td>
            </th>
        </tr>
        </tbody>

    </table>


</form>
<!--<ul class="nav nav-list">
    <li class="divider"></li>
</ul>-->
<h5 class="page-header"></h5>
<div>
    <button type="submit" class="btn" id="addnew"><a href="<%=request.getContextPath()%>/goto/addGoods/${order.bl_id}">添加商品</a>
    </button>&nbsp;&nbsp;
    <button type="button" class="btn" id=""><a href="">批量导入</a></button>

    <table class="table table-bordered table-hover definewidth m10">
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
                    <button type="submit" class="btn btn-warning"><a
                            href="<%=request.getContextPath()%>/goto/updateGoods/${ordergoods.g_id}/${ordergoods.bl_id}">修改</a>
                    </button>&nbsp;
                    <button type="submit" class="btn btn-danger"><a
                            href="<%=request.getContextPath()%>/orderGoods/deleteGoods/${ordergoods.g_id}/${ordergoods.bl_id}">删除</a>
                    </button>&nbsp;
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <div class="inline pull-right page">
        10122 条记录 1/507 页 <a href='#'>下一页</a>
        <span class='current'>1</span>
        <a href='#'>2</a>
        <a href='#'>3</a>
        <a href='#'>4</a>
        <a href='#'>5</a>
        <a href='#'>下5页</a>
        <a href='#'>最后一页</a>
    </div>

</div>

<div align="center">
    <button type="submit" onclick="doSave()" class="btn btn-primary" id="save">保存</button>
    <button type="submit" onclick="doSubmit()" class="btn btn-success" id="submit">提交审核</button>
</div>

${result}

</body>
</html>
<script type="text/javascript">
    function doSave() {
        alert("添加成功");
        window.open("<%=request.getContextPath()%>/goto/successSave", "_self");
    }

    function doSubmit() {
        alert("提交成功");
        window.open("<%=request.getContextPath()%>/goto/successSave", "_self");
    }
</script>
</html>