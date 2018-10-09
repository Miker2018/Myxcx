<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询用户信息</title>
</head>
<body>
	<form action="${pageContext.request.contextPath }/queryuser.action" method="post">
		查询条件：
		<table width="100%" border=1>
			<tr>
				<td>用户id：<input type="text" name="user.id" /></td>
				<!-- <td>用户名称：<input type="text" name="user.name" /></td> -->
				<td><input type="submit" value="查询" /></td>
			</tr>
		</table>
		用户列表：
		<table width="100%" border=1>
			<tr>
				<td>用户昵称</td>
				<td>手机号码</td>
				<td>qq号码</td>
				<td>微信账号</td>
				<td>微信唯一标识</td>
			</tr>
			<c:forEach items="${userList }" var="item">
				<tr>
					<td>${user.name }</td>
					<td>${user.phone }</td>
					<td>${user.qq }</td>
					<td>${user.weixin }</td>
					<td>${user.opid }</td>
					<%-- <td><a href="${pageContext.request.contextPath }/itemEdit.action?id=${item.id}">修改</a></td> --%>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>

</html>