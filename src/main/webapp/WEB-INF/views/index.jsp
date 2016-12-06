<%--
  Created by IntelliJ IDEA.
  User: lunhengle
  Date: 2016/11/14
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <%@include file="common.jsp" %>
    <style style="text/css">
        body {
            background: #EFEFEF;
        }

        .head {
            height: 10%;
        }

        .main div {
            height: 85%;
        }

        .footer {
            height: 5%;
        }
    </style>
</head>
<body>
<div class="container-fluid">
    <div class="row head">
        <%@include file="head.jsp" %>
    </div>
    <div class="row main">
        <div class="col-sm-2">
            <%@include file="tree.jsp" %>
        </div>
        <div class="col-sm-10"></div>
    </div>
    <div class="row footer">
        <%@include file="footer.jsp" %>
    </div>
</div>
</body>
</html>
