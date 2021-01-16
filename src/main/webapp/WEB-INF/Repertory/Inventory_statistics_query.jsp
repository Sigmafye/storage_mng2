<%--
  Created by IntelliJ IDEA.
  User: xxdn
  Date: 2021/1/16
  Time: 15:08
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
            <h4 align="center">基本信息</h4>
        </tr>
        <tr>
            <td width="10%" class="tableleft">仓库</td>
            <td><input type="text" name="title"/></td>
            <td width="10%" class="tableleft">物品</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td class="tableleft">物品类型筛选</td>
            <td>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />产品</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />商品</label>
            </td>
            <td width="10%" class="tableleft">仓库管理员编号</td>
            <td><input type="text" name="title"/></td>
        </tr>
        <tr>
            <td class="tableleft">出入库时间(x/x/x)</td>
            <td>
                <input type="text" name="title"/>
            </td>
            <td class="tableleft">统计项</td>
            <td>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />颜色</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />型号</label>
                <label class='checkbox inline'><input type='checkbox' name='node[]' value='' />数量</label>
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
        <h4 align="center">库存汇总统计</h4>
    </tr>

    <tr>
        <th>仓库</th>
        <th>物品</th>
        <th>物品类型</th>
        <th>出入库时间</th>
        <th>颜色</th>
        <th>型号</th>
        <th>数量</th>
        <th>仓库管理员编号</th>
    </tr>
    </thead>
    <tr>
        <td>1号仓库</td>
        <td>dell电脑</td>
        <td>产品</td>
        <td>2020/1/14</td>
        <td>黑色</td>
        <td>Inspiron5577</td>
        <td>1</td>
        <td>1<a href="edit.html">查看</a></td>
    </tr>
    <tr>
        <td>2号仓库</td>
        <td>dell电脑</td>
        <td>产品</td>
        <td>2020/1/14</td>
        <td>黑色</td>
        <td>Inspiron5577</td>
        <td>1</td>
        <td>1<a href="edit.html">查看</a></td>
    </tr>
    <tr>
        <td>3号仓库</td>
        <td>sony微单</td>
        <td>商品</td>
        <td>2020/1/14</td>
        <td>黑色</td>
        <td>a6400</td>
        <td>1</td>
        <td>1<a href="edit.html">查看</a></td>
    </tr>
</table>
<form class="form-inline definewidth m20" action="index.html" method="get">

    <div align="center">
        <button type="submit" class="btn btn-primary">导出</button>
    </div>
</form>
</body>
</html>
