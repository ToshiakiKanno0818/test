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
	<!-- ↓引き出した商品情報を３×３で表示↓ -->
	<s:iterator value="productInfoList">
		<div class="product_container">
			<a
				href="<s:url action="ProductInfoDiscriptionAction">
					<s:param name="productId" value="%{productId}"/>
					<s:param name="imageFilePath" value="%{imageFilePath}"/>
					<s:param name="imageFileName" value="%{imageFileName}"/>
					<s:param name="productName" value="%{productName}"/>
					<s:param name="productNameKana" value="%{productNameKana}"/>
					<s:param name="productDescription" value="%{productDescription}"/>
					<s:param name="price" value="%{price}"/>
					<s:param name="categoryId" value="%{categoryId}"/>
				</s:url>">
				<img src="<s:property value= 'imageFilePath' />"> <span><b>
						<s:property value="productName" />
				</b> </span> <br> <span> <s:property value="productNameKana" /></span> <br>
				<span> <s:property value="price" />円
			</span> <br>
			</a>
		</div>
	</s:iterator>

	<!-- ページセレクト -->
	<form action="ProductInfoAction" method="post">
		<s:hidden name="pageSelect" value="%{pageSelect + 1}" />
		<s:submit value=" 次へ" />
	</form>


	<form action="ProductInfoAction">
		<s:hidden name="pageSelect" value="%{pageSelect - 1}" />
		<s:submit value=" 前へ" />
	</form>


</body>
</html>