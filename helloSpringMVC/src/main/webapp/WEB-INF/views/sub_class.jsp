<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<link rel="stylesheet" type="text/css"
		href="${pageContext.request.contextPath }/resources/CSS/main.css">
<title>Insert title here</title>
</head>
<body>
<h2> 2017년 1학기에 신청할 예상 교과목 입력</h2>

<form method="get" action="${pageContext.request.contextPath}/doapplication">
<table class="formtable">
			<tr>
				<td class ="label">수강년도:</td>
				<td><input name="year" type="text" /></td>
			</tr>
			<tr>
				<td class ="label">학기:</td>
				<td><input name="grade" type="text" /></td>
			</tr>
			<tr>
				<td class ="label">교과코드:</td>
				<td><input name="code" type="text" /></td>
			</tr>
			<tr>
				<td class ="label">교과목명:</td>
				<td><input name="name" type="text" /></td>
			</tr>
			<tr>
				<td class ="label">구분:</td>
				<td><input name="division" type="text" /></td>
			</tr>
			<tr>
				<td class ="label">학점:</td>
				<td><input name="score" type="text" /></td>
			</tr>
			
			<tr>
				<td></td>
				<td><input name="subscript" type="submit" /></td>
			</tr>
		</table>
</form>

</body>
</html>