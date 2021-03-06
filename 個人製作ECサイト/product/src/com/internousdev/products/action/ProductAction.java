package com.internousdev.products.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.products.dao.ProductDAO;
import com.internousdev.products.dto.ProductDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author internous
 *
 */
public class ProductAction extends ActionSupport implements SessionAware {


//	商品番号
	private String productId;

//	個数
	private int count;


//	商品情報を格納
	public Map<String,Object> session;

//	商品情報取得DAO
	private ProductDAO productDAO = new ProductDAO();

/*	商品情報取得DTO
	private ProductDTO productDTO = new ProductDTO();
*/
	private String errorMassage;

	public String execute() {
			String result = SUCCESS;

			session.put("count", count);
			session.put("product_id", productId);

			System.out.println(session.get("count"));
			System.out.println(session.get("product_id"));

			// 商品情報を取得
			ProductDTO productDTO = productDAO.getProductInfo();
			session.put("product_name",	productDTO.getProductName());
			session.put("product_price", productDTO.getProductPrice());
			session.put("product_discription", productDTO.getProductDiscription());


			return result;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}
