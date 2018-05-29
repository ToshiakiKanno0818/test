<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />
<title>Blog</title>
</head>
<body>
	<s:iterator value="blogList">
		<a href='<s:url action="BlogDescriptionAction" />'><s:property value="title" />
			<s:param name="id" value="%{id}"/>
			<s:param name="insertDate" value="%{insertDate}"/>
			<s:param name="updateDate" value="%{updateDate}"/>
			<s:param name="title" value="%{title}"/>
			<s:param name="category" value="%{category}"/>
			<s:param name="news" value="%{news}"/>
		</a>
		<s:property value="insertDate" /><br>
		<s:property value="updateDate" /><br>
		<s:property value="title" /><br>
		<s:property value="category" /><br>
		<s:property value="news" /><br>
	</s:iterator>
</body>
</html>