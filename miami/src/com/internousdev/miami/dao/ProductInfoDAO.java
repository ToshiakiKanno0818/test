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
	 * @return ArrayList<ProductInfoDTO>
	 * @throws SQLException
	 */

	public ArrayList<ProductInfoDTO> getProductListInfoAll(String search) {
		ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

		String sql = "SELECT * FROM product_info WHERE product_name LIKE '%" + search
				+ "%' OR product_name_kana LIKE '%" + search + "%' ";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setId(resultSet.getString("id"));
				dto.setProductId(resultSet.getString("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setProductDescription(resultSet.getString("product_description"));
				dto.setCategoryId(resultSet.getString("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setReleaseDate(resultSet.getString("release_date"));
				dto.setStatus(resultSet.getInt("status"));
				dto.setRegistDate(resultSet.getString("regist_date"));
				dto.setUpdateDate(resultSet.getString("updated_date"));
				productInfoDTOList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try{
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return productInfoDTOList;
	}

	public ArrayList<ProductInfoDTO> getProductListInfo(int categoryId, String search) throws SQLException {
		ArrayList<ProductInfoDTO> productInfoDTOList = new ArrayList<ProductInfoDTO>();

		String sql = "SELECT * FROM product_info WHERE category_id = ? AND (product_name LIKE '%" + search
				+ "%' OR product_name_kana LIKE '%" + search + "%' )";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, categoryId);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				ProductInfoDTO dto = new ProductInfoDTO();
				dto.setId(resultSet.getString("id"));
				dto.setProductId(resultSet.getString("product_id"));
				dto.setProductName(resultSet.getString("product_name"));
				dto.setProductNameKana(resultSet.getString("product_name_kana"));
				dto.setProductDescription(resultSet.getString("product_description"));
				dto.setCategoryId(resultSet.getString("category_id"));
				dto.setPrice(resultSet.getInt("price"));
				dto.setImageFilePath(resultSet.getString("image_file_path"));
				dto.setReleaseDate(resultSet.getString("release_date"));
				dto.setStatus(resultSet.getInt("status"));
				dto.setRegistDate(resultSet.getString("regist_date"));
				dto.setUpdateDate(resultSet.getString("updated_date"));
				productInfoDTOList.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}

		return productInfoDTOList;
	}

}
