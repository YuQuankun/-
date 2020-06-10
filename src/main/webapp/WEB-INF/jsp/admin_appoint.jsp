<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>借还日志</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <script src="js/jquery-3.2.1.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script>
        $(function () {
            $('#header').load('admin_header.html');
        })
        function Agree() {
            window.alert("同意预约，您可以在借书列表中进行查看");
        }
        function Disagree() {
            window.alert("拒绝预约");
        }
    </script>
</head>
<body background="img/u5.jpeg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">
<div id="header"></div>

<div style="position: relative;padding-top: 100px">
    <c:if test="${!empty succ}">
        <div class="alert alert-success alert-dismissable">
            <button type="button" class="close" data-dismiss="alert"
                    aria-hidden="true">
                &times;
            </button>
                ${succ}
        </div>
    </c:if>
    <c:if test="${!empty error}">
        <div class="alert alert-danger alert-dismissable">
            <button type="button" class="close" data-dismiss="alert"
                    aria-hidden="true">
                &times;
            </button>
                ${error}
        </div>
    </c:if>
</div>
<div class="panel panel-default" style="width: 90%;margin-left: 5%">
    <div class="panel-heading">
        <h3 class="panel-title">
            预约日志
        </h3>
    </div>
    <div class="panel-body">
        <table class="table table-hover">
            <thead>
            <tr>
                <th>流水号</th>
                <th>图书号</th>
                <th>读者号</th>
                <th>预约日期</th>
                <th>操作</th>
            </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>3</td>
                    <td>123142</td>
                    <td>Mon Dec 16 1:38:10 CST 2019</td>
                    <td>
                        <a onclick="Agree()">
                                <button type="button" class="btn btn-danger btn-xs">同意</button>
<%--                                <button type="button" class="btn btn-default btn-xs" disabled="disabled">拒绝</button>--%>
                        </a>
                        <a onclick="Disagree()">
                            <button type="button" class="btn btn-default btn-xs" >拒绝</button>
                        </a>
                    </td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>4</td>
                    <td>123412</td>
                    <td>Mon Dec 16 6:38:10 CST 2019</td>
                    <td>
                        <a onclick="Agree()">
                            <button type="button" class="btn btn-danger btn-xs">同意</button>
                            <%--                                <button type="button" class="btn btn-default btn-xs" disabled="disabled">拒绝</button>--%>
                        </a>
                        <a onclick="Disagree()">
                            <button type="button" class="btn btn-default btn-xs" >拒绝</button>
                        </a>
                    </td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>12</td>
                    <td>214313</td>
                    <td>Mon Dec 16 7:10:00 CST 2019</td>
                    <td>
                        <a onclick="Agree()">
                            <button type="button" class="btn btn-danger btn-xs">同意</button>
                            <%--                                <button type="button" class="btn btn-default btn-xs" disabled="disabled">拒绝</button>--%>
                        </a>
                        <a onclick="Disagree()">
                            <button type="button" class="btn btn-default btn-xs" >拒绝</button>
                        </a>
                    </td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>13</td>
                    <td>124123</td>
                    <td>Mon Dec 16 9:58:07 CST 2019</td>
                    <td>
                        <a onclick="Agree()">
                            <button type="button" class="btn btn-danger btn-xs">同意</button>
                            <%--                                <button type="button" class="btn btn-default btn-xs" disabled="disabled">拒绝</button>--%>
                        </a>
                        <a onclick="Disagree()">
                            <button type="button" class="btn btn-default btn-xs" >拒绝</button>
                        </a>
                    </td>
                </tr>
                <tr>
                    <td>5</td>
                    <td>8</td>
                    <td>214131</td>
                    <td>Tue Dec 17 17:30:00 CST 2019</td>
                    <td>
                        <a onclick="Agree()">
                            <button type="button" class="btn btn-danger btn-xs">同意</button>
                            <%--                                <button type="button" class="btn btn-default btn-xs" disabled="disabled">拒绝</button>--%>
                        </a>
                        <a onclick="Disagree()">
                            <button type="button" class="btn btn-default btn-xs" >拒绝</button>
                        </a>
                    </td>
                </tr>
                <tr>
                    <td>6</td>
                    <td>5</td>
                    <td>213142</td>
                    <td>Wed Dec 18 15:58:22 CST 2019</td>
                    <td>
                        <a onclick="Agree()">
                            <button type="button" class="btn btn-danger btn-xs">同意</button>
                            <%--                                <button type="button" class="btn btn-default btn-xs" disabled="disabled">拒绝</button>--%>
                        </a>
                        <a onclick="Disagree()">
                            <button type="button" class="btn btn-default btn-xs" >拒绝</button>
                        </a>
                    </td>
                </tr>
                <tr>
                    <td>6</td>
                    <td>5</td>
                    <td>124132</td>
                    <td>Wed Dec 18 16:38:10 CST 2019</td>
                    <td>
                        <a onclick="Agree()">
                            <button type="button" class="btn btn-danger btn-xs">同意</button>
                            <%--                                <button type="button" class="btn btn-default btn-xs" disabled="disabled">拒绝</button>--%>
                        </a>
                        <a onclick="Disagree()">
                            <button type="button" class="btn btn-default btn-xs" >拒绝</button>
                        </a>
                    </td>
                </tr>
                <tr>
                    <td>7</td>
                    <td>1</td>
                    <td>111111</td>
                    <td>Wed Dec 18 16:38:10 CST 2019</td>
                    <td>
                        <a onclick="Agree()">
                            <button type="button" class="btn btn-danger btn-xs">同意</button>
                            <%--                                <button type="button" class="btn btn-default btn-xs" disabled="disabled">拒绝</button>--%>
                        </a>
                        <a onclick="Disagree()">
                            <button type="button" class="btn btn-default btn-xs" >拒绝</button>
                        </a>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
