<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>동적쿼리 작성하기</title>
</head>
<body>

	<h3>
		<a href="${path }/emp/selectEmpAll.do">전체 직원조회</a>
	</h3>
	<h3>
		<a href="${path }/selectDept.do?deptId=D5">부서 조회</a>
	</h3>
	<h3>
		<a href="${path }/boardView.do?boardNo=61">게시글 조회</a>
	</h3>
	
	
</body>
</html>