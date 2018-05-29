<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
<title>Works</title>
</head>
<body>
	<a href='<s:url action="WorksDescriptionAction" />'>WorksDescriptionAction</a>

	<s:iterator value="worksList">
		<s:property value="workName" /><br>
		<s:property value="workDescription" /><br>
		<s:property value="updateYear" /><br>
		<s:property value="updateMonth" /><br>
		<s:property value="updateDate" /><br>
		<s:property value="imageFileName" /><br>
		<s:property value="imageFilePath" /><br>
		<s:property value="musicFilePath" /><br>
	</s:iterator>
</body>
</html>