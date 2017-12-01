<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
Object o=session.getAttribute("user");
if(o==null){
	response.sendRedirect("./error/noright.jsp");
}


%> --%>
	<c:if test="${!empty user }">
		<div>
			<a href="modifyServlet?uid=${sessionScope.user.uid}">修改个人信息</a>
		</div>
		<div>
			<a href="findAll">查询所有</a>
		</div>
	</c:if>
	<c:if test="${empty user }">
		<c:redirect></c:redirect>
	</c:if>
</body>
</html>