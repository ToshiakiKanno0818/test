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
<meta charset="utf-8">
<title>ProductInfo</title>

<style>
.product_container{
	float:left;
	width:33%;
	border:1px solid red;
	text-align:center;
}
</style>
</head>
<body>
	<s:form action="CartAction">
		<s:property value="session.productId" />
		<s:property value="session.productName" />
		<s:property value="session.productNameKana" />
		<s:property value="session.productDiscription" />
		<s:property value="session.price" />
		<s:property value="session.imageFilePath" />
		<s:property value="session.imageFileName" />
		<s:property value="session.categoryId" />
		<s:submit value="カートに入れる" />
	</s:form>

	<s:iterator value="sugestList">
		<div class="product_container">
			<a
				href="<s:url action="ProductInfoDiscriptionAction">
				<s:param name="productId" value="%{productId}"/>
				<s:param name="imageFilePath" value="%{imageFilePath}"/>
				<s:param name="productName" value="%{productName}"/>
				<s:param name="productNameKana" value="%{productNameKana}"/>
				<s:param name="productDescription" value="%{productDescription}"/>
				<s:param name="price" value="%{price}"/>
				<s:param name="categoryId" value="%{categoryId}"/>
				</s:url>">

				<img src="<s:property value= 'imageFilePath'/>">
				<span><s:property value="productName" /></span>
				<br>
				<span> <s:property value="productNameKana" /></span>
				<br>
				<span> <s:property value="price" />円</span>

			</a>
		</div>
	</s:iterator>


</body>
</html>