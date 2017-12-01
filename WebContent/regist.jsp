<%@page import="java.util.UUID"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册界面</title>
</head>
<style type="text/css">
.con {
	border-radius: 20px;
	border: 1px solid red;
	width: 490px;
	height: 330px;
	margin: 0 auto;
	/*	background-image: url(../img/mm.jpg);*/
	background-color: aqua;
	background-size: 400px 300px;
	margin-top: 60px;
}

.cl1 {
	width: 350px;
	margin-left: 60px;
	margin-top: 12px;
}

#div1 {
	margin-top: 60px;
}

.cl2 {
	width: 210px;
	height: 25px;
}

.cl3 {
	width: 120px;
	height: 43px;
	font-size: 20px;
	font-weight: 900;
	line-height: 36px;
	background-color: green;
	border-radius: 20px;
	color: white;
}

#sub {
	margin-left: 33px;
	margin-right: 12px;
}

.nav {
	width: 100%;
	height: 89px;
	background-color: yellow;
	text-align: center;
	font-size: 36px;
	line-height: 89px;
}

body {
	margin: 0;
}
</style>
<body>
	<%
		String uuid = UUID.randomUUID().toString();
		session.setAttribute("numFlag", uuid);
	%>
	<div class="nav">
		<span>用户注册界面</span>
	</div>
	<div class="con">
		<form action="${pageContext.request.contextPath }/register"
			method="post" onsubmit="return dosubmit();">
			<input type="hidden" name="numFlag" value="${numFlag}" />
			<div class="cl1" id="div1">
				<label> 用户名：</label> <input type="text" name="uname" value=""
					id="uname" placeholder="请输入用户名" class="cl2" />
			</div>
			<div class="cl1">
				<label>用户密码：</label> <input type="password" name="upwd" value=""
					id="upwd" placeholder="请输入用户密码" class="cl2" />
			</div>
			<div class="cl1">
				<label>确认密码：</label> <input type="password" name="upwd_" value=""
					id="upwd_" placeholder="请再次输入密码" class="cl2" />
			</div>

			<div class="cl1">
				<label> 性别：</label> <input type="radio" name="ugender" id="gender_1"
					value="男" checked="checked" />男 <input type="radio" name="ugender"
					id="gender_2" value="女" />女

			</div>

			<div class="cl1">
				<label> 生日：</label> <input type="text" name="ubirthday"
					id="ubirthday" maxlength="11" placeholder="请入yyyy-MM-dd的生日"
					class="cl2" />

			</div>
			<div class="cl1">
				<input type="submit" value="注册用户" class="cl3" id="sub" /> <input
					type="reset" value="重置信息" class="cl3" />
			</div>
		</form>
	</div>
	<script type="text/javascript">
		var is = false;
		function dosubmit() {
			if (is == false) {
				is = true;
				return true;
			} else {
				alert("请不要重复提交");
				return false;
			}
		}
	</script>
</body>
</html>