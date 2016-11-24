<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>boss出现了</title>
</head>
<body>
<jsp:useBean id="status" class="ch.Status" scope="session"></jsp:useBean>
<h1>这不是演习！这不是演习！</h1>
     <form action="showInfo.jsp" method="post">
     <%
     int s=(int) Math.floor(Math.random()*2);
     String test =status.getZhuangTai().get(s);
     ArrayList<String> xuanXiang = status.getTiMu().get(test);
     out.println("<h1>"+test+"应该怎样回答？想清楚</h1>");
     for(int i=0;i<4;i++){
    	 String neiRong = xuanXiang.get(i);
    	 String num=String.valueOf(i);
    	 out.print("<p><input type='radio'name='phone' value='+"+num+"'>"+neiRong+"</input></p>");
    	 
     }
     %>
     <button>提交</button>
     </form>
</body>
</html>