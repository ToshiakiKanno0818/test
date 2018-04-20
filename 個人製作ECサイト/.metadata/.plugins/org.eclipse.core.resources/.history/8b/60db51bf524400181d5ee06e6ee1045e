package com.internousdev.products.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.products.dto.ProductDTO;
import com.internousdev.products.util.DBConnector;

public class ProductDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private ProductDTO productDTO = new ProductDTO();

	/**
	 * 商品情報取得メソッド
	 *
	 * @return BuyItemDTO
	 */
	public ProductDTO getProductInfo() {

		String sql = "SELECT id, product_name, product_price, product_discription FROM products_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();

			if(resultSet.next()) {
				productDTO.setId(resultSet.getInt("id"));
				productDTO.setProductName(resultSet.getString("product_name"));
				productDTO.setProductPrice(resultSet.getString("product_price"));
				productDTO.setProductDiscription(resultSet.getString("product_discription"));
			}

		} catch(Exception e) {
			e.printStackTrace();
		}

		return productDTO;
	}

	public ProductDTO getProductDTO() {
		return productDTO;
	}
}