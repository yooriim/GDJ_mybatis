<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>학생정보</h1>
	<h2>학생 수 : ${studentCount }</h2>
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>주소</th>
			<th>등록일</th>
		</tr>
		<tr>
			<td><c:out value="${student.no }"/></td>
			<td><c:out value="${student.name }"/></td>
			<td><c:out value="${student.tel }"/></td>
			<td><c:out value="${student.email }"/></td>
			<td><c:out value="${student.addr }"/></td>
			<td><fmt:formatDate value="${student.reg_date }" type="both"/></td>
		</tr>
	</table>

	<h3>전체</h3>
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>주소</th>
			<th>등록일</th>
		</tr>
		<c:if test="${empty students }">
			<tr>
				<td colspan="6">조회된 학생이 없습니다.</td>
			</tr>
		</c:if>
		<c:if test="${not empty students }">
			<c:forEach var="student" items="${students }">
				<tr>
					<td><c:out value="${student.no }"/></td>
					<td><c:out value="${student.name }"/></td>
					<td><c:out value="${student.tel }"/></td>
					<td><c:out value="${student.email }"/></td>
					<td><c:out value="${student.addr }"/></td>
					<td><fmt:formatDate value="${student.reg_date }" type="both"/></td>
				</tr>
			</c:forEach>	
		</c:if>
		
	</table>
	<div>
		${pageBar }
	</div>


</body>
</html>