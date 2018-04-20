package com.internousdev.products.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.products.dao.CartDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author internous
 *
 */
public class CartAction extends ActionSupport implements SessionAware {

//	ユーザーID
	private String user_id;

//	個数
	private int count;

	private CartDAO cartDAO = new CartDAO();

//	商品情報を格納
	public Map<String,Object> session;

	private String errorMassage;

	public String execute() throws SQLException {

		System.out.println(session.get("product_id"));
		System.out.println(session.get("product_name"));
		System.out.println(session.get("product_price"));

		String result = SUCCESS;
		return result ;
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
