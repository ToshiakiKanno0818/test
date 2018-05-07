package com.internousdev.miami.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.internousdev.miami.dto.ProductInfoDTO;
import com.internousdev.miami.util.DBConnector;


public class ProductInfoDAO {
	private DBConnector dbConnector = new DBConnector();

	private Connection connection = dbConnector.getConnection();

	/**
	 * 商品一覧取得
	 *
	 * @return
	 * @throws SQLException
	 */
	public ArrayList<ProductInfoDTO> getProductListInfo() throws SQLException {
		ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

		String sql = "SELECT product_id, product_name, product_name_kana, category_id, price, image_file_path, image_file_name FROM product_info";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while(resultSet.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setProductId(resultSet.getString("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setCategoryId(resultSet.getString("category_id"));
				dto.setPrice(resultSet.getString("price"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setImageFileName(resultSet.getString("image_file_name"));
				productInfoDTOList.add(dto);
			}

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return productInfoDTOList;
	}
}
