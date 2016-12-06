<%--
  Created by IntelliJ IDEA.
  User: lunhengle
  Date: 2016/12/6
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style type="text/css">
    .tree {
        background: gray;
    }

    .hide {
        display: none;
    }

    .show {
        display: block;
    }

</style>
<script type="text/javascript">
    $(function () {
        $(".tree").find(".parent").click(function () {
            $(this).find("ul").toggleClass("show");
            if ($(this).find("ul").attr("class") != "hide") {
                $(this).siblings().find("ul").attr("class", "hide");
            }
        });
    });
</script>
<div class="tree">
    <ul>
        <li class="parent">用户管理
            <ul class="hide">
                <li>修改密码</li>
                <li>授予权限</li>
            </ul>
        </li>
        <li class="parent">系统分析
            <ul class="hide">
                <li>用户行为分析</li>
                <li>交易统计</li>
            </ul>
        </li>
    </ul>
</div>