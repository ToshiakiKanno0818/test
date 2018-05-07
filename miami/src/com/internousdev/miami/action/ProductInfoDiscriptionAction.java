package com.internousdev.miami.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miami.dao.ProductInfoDiscriptionDAO;
import com.internousdev.miami.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductInfoDiscriptionAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	//商品詳細情報格納リスト
	private ProductInfoDiscriptionDAO productInfoDiscriptionDAO = new ProductInfoDiscriptionDAO();

	// お勧めリスト
	public List<ProductInfoDTO> sugestList = new ArrayList<ProductInfoDTO>();

	private String productId;
	private String categoryId;

	public String execute() {

		session.put("productId", productId);

		ProductInfoDTO productInfoDTO = productInfoDiscriptionDAO.getProductDiscription(session.get("productId").toString());
		session.put("productName", productInfoDTO.getProductName());
		session.put("productNameKana", productInfoDTO.getProductNameKana());
		session.put("productDiscription", productInfoDTO.getProductDiscription());
		session.put("categoryId", productInfoDTO.getCategoryId());
		session.put("price", productInfoDTO.getPrice());
		session.put("imageFilePath", productInfoDTO.getImageFilePath());
		session.put("imageFileName", productInfoDTO.getImageFileName());


		// お勧めリスト情報取得
		try {
			sugestList = productInfoDiscriptionDAO.getSugestProductInfo(categoryId, productId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}



	public ProductInfoDiscriptionDAO getProductInfoDiscriptionDAO() {
		return productInfoDiscriptionDAO;
	}

	public void setProductInfoDiscriptionDAO(ProductInfoDiscriptionDAO productInfoDiscriptionDAO) {
		this.productInfoDiscriptionDAO = productInfoDiscriptionDAO;
	}

	public List<ProductInfoDTO> getSugestList() {
		return sugestList;
	}

	public void setSugestList(List<ProductInfoDTO> sugestList) {
		this.sugestList = sugestList;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}