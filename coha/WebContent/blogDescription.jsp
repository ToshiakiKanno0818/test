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
		<s:property value="insertDate" /><br>
		<s:property value="updateDate" /><br>
		<h2><s:property value="title" /></h2><br>
		<s:property value="category" /><br>
		<s:property value="news" /><br>
</body>
</html>