package com.internousdev.products.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.products.util.DBConnector;

public class CartDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();

	public void cartInput( String cart_product_id, String cart_count, String cart_product_total_price) throws SQLException {

		String sql = "INSERT user_id, product_id, total_count, total_price FROM products_info_transaction";

		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, cart_product_id);
			preparedStatement.setString(2, cart_count);
			preparedStatement.setString(3, cart_product_total_price);

			preparedStatement.execute();
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
