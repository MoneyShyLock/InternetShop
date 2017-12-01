<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name = "";
		String pwd = "";
		Cookie[] cs = request.getCookies();
		if (cs != null) {
			for (Cookie c : cs) {
				if ("name".equals(c.getName())) {
					name = c.getValue();
				}
				if ("pwd".equals(c.getName())) {
					pwd = c.getValue();
				}
			}
		}
		//
		pageContext.setAttribute("name", name);
		pageContext.setAttribute("pwd", pwd);
	%>
	<form action="${pageContext.request.contextPath}/login" method="get">
		<div>
			<div>
				用户名：<input type="text" name="name" value="${name }" /><span>${error}<span />
			</div>
			<div>
				密 码：<input type="password" name="pwd" value="${pwd }" />
			</div>
			<div>
				记住密码<input type="checkbox"
					${!empty name&&!empty pwd ?"checked='checked'":""}
					name="remenberMe" value="on" />
			</div>
			<div>
			<a href="${pageContext.request.contextPath}/regist.jsp">注册</a>
				<input type="submit" value="登录" />
			</div>
		</div>
	</form>
</body>
</html>