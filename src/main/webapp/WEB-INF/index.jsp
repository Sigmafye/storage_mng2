<%--
  Created by IntelliJ IDEA.
  User: DELL
  Date: 2021/1/13
  Time: 14:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>仓库管理系统</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link href="../resources/assets/css/dpl-min.css" rel="stylesheet" type="text/css" />
    <link href="../resources/assets/css/bui-min.css" rel="stylesheet" type="text/css" />
    <link href="../resources/assets/css/main-min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="header">

    <div class="dl-title">
        <!--<img src="/chinapost/Public/assets/img/top.png">-->
    </div>

    <div class="dl-log">欢迎您，<span class="dl-log-user">root</span><a href="login.jsp" title="退出系统" class="dl-log-quit">[退出]</a>
    </div>
</div>
<div class="content">
    <div class="dl-main-nav">
        <div class="dl-inform"><div class="dl-inform-title"><s class="dl-inform-icon dl-up"></s></div></div>
        <ul id="J_Nav"  class="nav-list ks-clear">
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-home">采购管理</div></li>
            <li class="nav-item dl-selected"><div class="nav-item-inner nav-order">库存管理</div></li>

        </ul>
    </div>
    <ul id="J_NavContent" class="dl-tab-conten">

    </ul>
</div>
<script type="text/javascript" src="../resources/assets/js/jquery-1.8.1.min.js"></script>
<script type="text/javascript" src="../resources/assets/js/bui-min.js"></script>
<script type="text/javascript" src="../resources/assets/js/common/main-min.js"></script>
<script type="text/javascript" src="../resources/assets/js/config-min.js"></script>
<script>
    BUI.use('common/main',function(){
        var config = [{ id: '1', menu: [{ text: '采购管理', items: [{ id: '12', text: '采购单管理', href: 'Node/index.html' }, { id: '3', text: '采购统计查询', href: 'Role/index.html' }] }] }, { id: '7', homePage: '9', menu: [{ text: '库存管理', items: [{ id: '10', text: '商品库存管理', href: 'Node/index.html' },{ id: '11', text: '产品库存管理', href: 'Commodity/commodity_manage.jsp' },{ id: '12', text: '入库管理', href: 'Node/index.html' },{ id: '13', text: '出库管理', href: 'Node/index.html' },{ id: '14', text: '库存统计查询', href: 'Node/index.html' }] }] }];
        new PageUtil.MainPage({
            modulesConfig : config
        });
    });
</script>
<div style="text-align:center;">
    <p>来源：<a href="http://www.mycodes.net/" target="_blank">第二实习小组</a></p>
</div>
</body>
</html>