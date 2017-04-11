<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="Models.Loai"%>
<%@page import="java.util.List"%>
<%@page import="BusinessLogics.LoaiBL"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    List<Loai> dsLoai = LoaiBL.DocTatCa();
    pageContext.setAttribute("dsLoai", dsLoai);
%>
<ul>
    <c:forEach items="${dsLoai}" var="loai">
    <li>${loai.tenLoai}</li>
    </c:forEach>
</ul>