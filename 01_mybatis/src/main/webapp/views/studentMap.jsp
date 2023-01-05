<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
<meta charset="UTF-8">
<title>map으로 데이터 받기</title>
</head>
<body>
	
	<h2>map으로 조회된 학생 출력하기</h2>
	<table>
		<tr>
			<th>번호</th>
			<th>이름</th>
			<th>전화번호</th>
			<th>이메일</th>
			<th>주소</th>
			<th>등록일</th>
		</tr>
			<c:forEach var="student" items="${ student}">
			<tr>
				<td><c:out value="${student['STUDENT_NO'] }"/></td>
				<td><c:out value="${student['STUDENT_NAME'] }"/></td>
				<td><c:out value="${student['STUDENT_TEL'] }"/></td>
				<td><c:out value="${student['STUDENT_EMAIL'] }"/></td>
				<td><c:out value="${student['STUDENT_ADDR'] }"/></td>
				<td><c:out value="${student['REG_DATE'] }"/></td>
				
	<%-- 			<td><c:out value="${student.STUDENT_NO }"/></td>
				<td><c:out value="${student.STUDENT_NAME }"/></td>
				<td><c:out value="${student.STUDENT_TEL }"/></td>
				<td><c:out value="${student.STUDENT_EMAIL }"/></td>
				<td><c:out value="${student.STUDENT_ADDR }"/></td>
				<td><c:out value="${student.REG__DATE }"/></td> --%>
			</tr>
		</c:forEach>
	</table>
	
	
	
	
</body>
</html>