package com.internousdev.products.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.products.dto.ProductAllDTO;
import com.internousdev.products.util.DBConnector;

public class ProductAllDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private ProductAllDTO productAllDTO = new ProductAllDTO();


	public ArrayList<ProductAllDTO> getProductAllInfo(String product_id) throws SQLException {
		ArrayList<ProductAllDTO> productAllDTO = new ArrayList<ProductAllDTO>();
		String sql = "SELECT id, product_name, product_price FROM products_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				ProductAllDTO dto = new ProductAllDTO();
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductName(resultSet.getString("product_price"));
				productAllDTO.add(dto);
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return productAllDTO;
	}


	public ProductAllDTO getProductDTO() {
		return productAllDTO;
	}
}