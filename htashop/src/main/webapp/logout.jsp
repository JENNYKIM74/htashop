<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 세션객체 뿌수기
	session.invalidate();

	response.sendRedirect("index.jsp");
%>