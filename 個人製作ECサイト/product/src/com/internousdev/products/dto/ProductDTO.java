package com.internousdev.products.dto;

public class ProductDTO {

	public int id;
	public String productName;
	public String productPrice;
	public String productDiscription;
	private boolean productFlg = false;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDiscription() {
		return productDiscription;
	}

	public void setProductDiscription(String productDiscription) {
		this.productDiscription = productDiscription;
	}

	public boolean getProductFlg() {
		return productFlg;
	}

	public void setProductFlg(boolean productFlg) {
		this.productFlg = productFlg;
	}


}
