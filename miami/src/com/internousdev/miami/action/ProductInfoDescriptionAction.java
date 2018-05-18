package com.internousdev.miami.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miami.dao.ProductInfoDescriptionDAO;
import com.internousdev.miami.dto.ProductInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ProductInfoDescriptionAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	// 商品詳細情報格納リスト
	private ProductInfoDescriptionDAO productInfoDescriptionDAO = new ProductInfoDescriptionDAO();

	// お勧めリスト
	public List<ProductInfoDTO> sugestList = new ArrayList<ProductInfoDTO>();

	private String productId;
	private String categoryId;

	public String execute() {

		session.put("productId", productId);

		ProductInfoDTO productInfoDTO = productInfoDescriptionDAO
				.getProductDescription(session.get("productId").toString());
		session.put("productName", productInfoDTO.getProductName());
		session.put("productNameKana", productInfoDTO.getProductNameKana());
		session.put("productDescription", productInfoDTO.getProductDescription());
		session.put("categoryId", productInfoDTO.getCategoryId());
		session.put("price", productInfoDTO.getPrice());
		session.put("imageFilePath", productInfoDTO.getImageFilePath());
		session.put("imageFileName", productInfoDTO.getImageFileName());

		// お勧めリスト情報取得
		try {
			sugestList = productInfoDescriptionDAO.getSugestProductInfo(categoryId, productId);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	public ProductInfoDescriptionDAO getProductInfoDescriptionDAO() {
		return productInfoDescriptionDAO;
	}

	public void setProductInfoDescriptionDAO(ProductInfoDescriptionDAO productInfoDescriptionDAO) {
		this.productInfoDescriptionDAO = productInfoDescriptionDAO;
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