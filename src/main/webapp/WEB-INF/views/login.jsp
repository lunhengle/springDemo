<%--
  Created by IntelliJ IDEA.
  User: lunhengle
  Date: 2016/12/5
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登陆</title>
    <%@include file="common.jsp" %>
    <style type="text/css">
        body {
            background: #EFEFEF;
        }

        .form-signIn {
            max-width: 500px;
            padding: 15px;
            margin: 300px auto;
        }

        .title {
            margin-bottom: 40px;
        }
    </style>
</head>
<body>
<div class="container">
    <div class="col-sm-offset-4 col-sm-8">
        <form class="form-horizontal form-signIn" role="form" action="/login">
            <h2 class="title">
                欢迎使用
            </h2>
            <div class="form-group">
                <label for="username" class="col-sm-2 control-label">账号：</label>
                <div class="col-sm-10">
                    <input type="text" id="username" name="username" class="form-control" value="" placeholder="账号"/>
                </div>
            </div>
            <div class="form-group">
                <label for="password" class="col-sm-2 control-label">密码：</label>
                <div class="col-sm-10">
                    <input type="text" id="password" name="password" class="form-control" value="" placeholder="密码"/>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" id="submit" name="submit" class="btn btn-lg" value="登陆"/>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
