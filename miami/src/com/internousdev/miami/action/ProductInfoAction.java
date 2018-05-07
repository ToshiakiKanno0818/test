package com.internousdev.miami.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.miami.dao.ProductInfoDAO;
import com.internousdev.miami.dto.ProductInfoDTO;
import com.internousdev.miami.util.PageNation;
import com.opensymphony.xwork2.ActionSupport;


public class ProductInfoAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;

	private String categoryId = "0";

	private String search = "";

	//商品情報取得DAO
	private ProductInfoDAO productInfoDAO = new ProductInfoDAO();

	//商品情報をリストに格納
	public ArrayList<ProductInfoDTO> productInfoList = new ArrayList<ProductInfoDTO>();

	//9個格納
	private ArrayList<ArrayList<ProductInfoDTO>> mainList = new ArrayList<>();
	public int pageSelect;
	private List<Integer> pageList = new ArrayList<>();

	public String execute() throws SQLException {

		productInfoList = productInfoDAO.getProductListInfo(categoryId, search);

		// productListを9個づつ格納
				PageNation change = new PageNation();
				mainList = change.pageNation(productInfoList);

				for (int i = 0; i < mainList.size(); i++) {
					pageList.add(i + 1);
				}
				for (int i = 0; i < mainList.size(); i++) {
					if (i == pageSelect) {
						productInfoList = mainList.get(i);
						break;
					}
				}

		Iterator<ProductInfoDTO> iterator = productInfoList.iterator();
		if (!(iterator.hasNext())) {
			productInfoList = null;
		}

		return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return this.session;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public int getPageSelect() {
		return pageSelect;
	}

	public void setPageSelect(int pageSelect) {
		this.pageSelect = pageSelect;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
