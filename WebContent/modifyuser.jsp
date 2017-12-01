<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="bean.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改界面</title>
</head>
<body>
	<%
		User user = (User) request.getAttribute("user");
	%>
	<form action="${pageContext.request.contextPath}/modifyUserServlet"
		method="get">
		<input type="hidden" name="id" value="<%=user.getUid()%>"/>
		<div>
			用户名：<input type="text" name="name" readonly="readonly"
				value="<%=user.getUname()%>" />
		</div>
		<div>
			密 码：<input type="password" name="pwd"
				value="<%=user.getUpassword()%>" />
		</div>
		<div>
			<input type="submit" value="确认修改" />
		</div>



	</form>

</body>
</html>