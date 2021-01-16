<%--
  Created by IntelliJ IDEA.
  User: xxdn
  Date: 2021/1/16
  Time: 15:06
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
<form action="index.html" method="post" class="definewidth m20">
    <table class="table table-bordered table-hover definewidth m10">
        <tr>
            <h4 align="center">商品基本信息</h4>
        </tr>
        <tr>
            <td width="10%" class="tableleft">物品名称</td>
            <td><input type="text" name="title"/></td>
            <td width="10%" class="tableleft">供应商</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td class="tableleft">采购日期(x/x/x)</td>
            <td>
                <input type="text" name="title"/>
            </td>
            <td></td>
            <td></td>
        </tr>
        <tr>
            <td class="tableleft">采购单统计项</td>
            <td>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />数量</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />单价</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />金额合计</label>
            </td>
            <td class="tableleft">编号统计项</td>
            <td>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />采购管理员工号</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />采购单号</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />采购统计单编号</label>
            </td>
        </tr>

    </table>
</form>
<form class="form-inline definewidth m20" action="index.html" method="get">
    <div align="center">
        <button type="submit" class="btn btn-primary">检索</button>
    </div>

</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <h4 align="center">采购汇总统计</h4>
    </tr>
    <tr>
        <th>物品</th>
        <th>供应商</th>
        <th>日期</th>
        <th>单价</th>
        <th>数量</th>
        <th>金额合计</th>
        <th>采购单号</th>
        <th>采购统计单编号</th>
        <th>采购管理员工号</th>
    </tr>
    </thead>
    <tr>
        <td>dell电脑</td>
        <td>华迪公司</td>
        <td>2020/1/14</td>
        <td>1</td>
        <td>1</td>
        <td>1</td>
        <td>1</td>
        <td>1</td>
        <td>1<a href="edit.html">查看</a></td>
    </tr>
    <tr>
        <td>dell电脑</td>
        <td>华迪公司</td>
        <td>2020/1/14</td>
        <td>1</td>
        <td>1</td>
        <td>1</td>
        <td>2</td>
        <td>1</td>
        <td>2<a href="edit2.html">查看</a></td>
    </tr>
    <tr>
        <td>dell电脑</td>
        <td>华迪公司</td>
        <td>2020/1/14</td>
        <td>1</td>
        <td>1</td>
        <td>1</td>
        <td>3</td>
        <td>1</td>
        <td>3<a href="edit3.html">查看</a></td>
    </tr>
</table>
<form class="form-inline definewidth m20" action="index.html" method="get">
    <div align="center">
        <button type="submit" class="btn btn-primary">导出</button>
    </div>
</form>
</body>
</html>
