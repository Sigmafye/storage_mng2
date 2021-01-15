<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/15
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
<div align="center">
    <h4>产品库存管理</h4>
</div>
<form class="form-inline definewidth m20" action="index.html" method="get">
    关键字：
    <input type="text" name="rolename" id="rolename"class="abc input-default" placeholder="" value="">&nbsp;&nbsp;&nbsp;
    类别：
    <select>
        <option value ="volvo">Volvo</option>
        <option value ="saab">Saab</option>
        <option value="opel">Opel</option>
        <option value="audi">Audi</option>
    </select>
    <button type="submit" class="btn btn-primary" id="#">查询</button>&nbsp;&nbsp;&nbsp;&nbsp;
    <button type="button" class="btn btn-success" id="addnew">新增产品信息</button>
</form>
<table class="table table-bordered table-hover definewidth m10" >
    <thead>
    <tr>
        <th><input type="checkbox">全选</th>
        <th>产品编号</th>
        <th>仓库编号</th>
        <th>入库编号</th>
        <th>出库编号</th>
        <th>产品名称</th>
        <th>产品单价/元</th>
        <th>库存数量</th>
        <th>产品类别</th>
        <th>所在仓库</th>
        <th>贷架号</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td><input type="checkbox"></td>
        <td>024859</td>
        <td>A-01</td>
        <td>a423425</td>
        <td>-</td>
        <td>xx薯片</td>
        <td>6</td>
        <td>500</td>
        <td>食品</td>
        <td>A-01</td>
        <td>AB-003</td>
        <td>
            <button type="submit" class="btn btn-warning"><a href="editproduct.html">修改</a></button>&nbsp;
            <button id="del" type="submit" class="btn btn-danger">删除</button>&nbsp;
        </td>
    </tr>
    </tbody>
    <tr>
        <td><input type="checkbox"></td>
        <td>867564</td>
        <td>B-12</td>
        <td>b756444</td>
        <td>b3545</td>
        <td>xx饮料</td>
        <td>8</td>
        <td>1233</td>
        <td>饮品</td>
        <td>B-12</td>
        <td>BF-353</td>
        <td>
            <button type="submit" class="btn btn-warning"><a href="editproduct.html">修改</a></button>&nbsp;
            <button type="submit" class="btn btn-danger">删除</button>&nbsp;
        </td>
    </tr>
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

            window.location.href="addproduct.html";
        });


    });

    function del(id)
    {


        if(confirm("确定要删除吗？"))
        {

            var url = "index.html";

            window.location.href=url;

        }




    }
</script>