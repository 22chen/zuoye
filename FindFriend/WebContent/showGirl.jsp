<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="ch.GirlFriend" scope="session"></jsp:useBean>

<jsp:setProperty property="*" name="user"/>

<p>女朋友的颜值：<jsp:getProperty property="yanZhi" name="user"/></p>
<p>女朋友的体重：<jsp:getProperty property="tiZhong" name="user"/></p>
<p>女朋友的身高：<jsp:getProperty property="shenGao" name="user"/></p>
<p>女朋友的怒值：<jsp:getProperty property="shengQi" name="user"/></p>
<p>女朋友的爱值：<jsp:getProperty property="ai" name="user"/></p>
<p><a href="status.jsp">骚年，高能区，开始测试了！！！</a></p>
</body>
</html>