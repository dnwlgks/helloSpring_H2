<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<style>
table, tr, th, td {
	border: 1px solid black;
}
</style>


<table>

		<tr>

			<td>�⵵</td>
			<td>�б�</td>
			<td>�̼� ����</td>
			<td>�󼼺���</td>

		</tr>

		<tr>

			<td>2012</td>
			<td>1</td>
			<td>${a}</td>
			<td><a href="${pageContext.request.contextPath}/2012-1"> ��ũ </a></td>

		</tr>
		
		<tr>

			<td>2012</td>
			<td>2</td>
			<td>${b}</td>
			<td><a href="${pageContext.request.contextPath}/2012-2"> ��ũ </a></td>

		</tr>
		<tr>

			<td>2015</td>
			<td>1</td>
			<td>${c}</td>
			<td><a href="${pageContext.request.contextPath}/2015-1"> ��ũ </a></td>

		</tr>
		
		<tr>

			<td>2015</td>
			<td>2</td>
			<td>${d}</td>
			<td><a href="${pageContext.request.contextPath}/2015-2"> ��ũ </a></td>

		</tr>
		

	</table>

</body>
</html>