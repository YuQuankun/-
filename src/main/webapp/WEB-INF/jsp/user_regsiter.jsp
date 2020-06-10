<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2019/12/10
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>读者注册</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <style>
        #register{
            height: 50%;
            width: 28%;
            margin-left: auto;
            margin-right: auto;
            margin-top: 5%;
            display: block;
            position: center;
        }
    </style>
</head>
<body background="img/timg.jpg" style=" background-repeat:no-repeat ;
background-size:100% 100%;
background-attachment: fixed;">
<h2 style="text-align: center; color: white; font-family: '华文行楷'; font-size: 500%">图 书 馆</h2>

<div class="panel panel-default" id="register">
    <div class="panel-body">
        <div class="panel panel-default" id="insertRegister">
            <div class="panel-heading" style="background-color: #fff">
                <h3 class="panel-title">请注册</h3>
            </div>
            <form action="registerUser.html" method="post" id="registerUser">
                <div class="panel-body">
                    <div class="form-group">
                        <label for="readerId">账号</label>
                        <input type="text" class="form-control" name="readerId" id="readerId" placeholder="请输入账号">
                    </div>
                    <div class="form-group">
                        <label for="username">用户名</label>
                        <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名">
                    </div>
                    <div class="form-group">
                        <label for="password">密码</label>
                        <input type="password" class="form-control" name="password" id="password" placeholder="请输入密码">
                    </div>
                    <p style="text-align: right;color: #c1a2ff;position: absolute" id="info"></p><br/>
                    <input type="submit"  class="btn btn-primary  btn-block">
                </div>
                <script>
                    $("#registerUser").submit(function () {
                        if($("readerId").val()==''||$("password").val()==''||$("username").val()==''){
                            alert("账号密码及用户名均不能为空！");
                            return false;
                        }
                    })
                </script>
            </form>
        </div>
    </div>
</div>
</body>
</html>
