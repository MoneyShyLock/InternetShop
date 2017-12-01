<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.List,bean.User"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%
		List<User> list=(List<User>) request.getAttribute("list");
		for (int i = 0; i < list.size(); i++) {
	%>
	<div>用户名：<%=list.get(i).getUname()%></div>
	<div>用户名：<%=list.get(i).getUpassword()%></div>
	<%
		}
	%> --%>
	<table border="1" align="center" cellspacing="0" width="600"
		height="400">
		<caption>用户表</caption>
		<thead>
			<tr>
				<th>用户名id</th>
				<th>用户名</th>
				<th>用户密码</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
			<!-- 
		item表示要遍历的集合
		begin:表示从哪里开始遍历
		end:表示遍历到哪个下标
		step:步长
		var:当前遍历的元素的名字
		varStatus：表示遍历的信息 index
		 -->
			<c:forEach begin="0" end="${list.size()}" items="${list }" step="1"
				var="item" varStatus="">
				<tr>
					<td>${item.uid }</td>
					<td>${item.uname }</td>
					<td>${item.upassword }</td>
					<td><input type="button" value="删除"
						onclick="delUser(${item.uid})" /><a
						href="modifyUser?uid=${item.uid}">修改</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
<script type="text/javascript">
function delUser(uid) {
	if(confirm("您确认要删除吗？")){
		window.location.href="${pageContext.request.contextPath}/deleteUser?uid="+uid;
		//window.location.href='${pageContext.request.contextPath}/deleteUser?uid='+uid;
	}
}

</script>
</html>