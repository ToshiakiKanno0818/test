package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserCreateCompleteDAO {

	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO login_user_transaction (login_id,login_pass,user_name,user_namefirst,user_namelast,user_canafirst,user_canalast,user_postcode,user_prefecture,user_city,user_address,user_tel,user_mail,gender,insert_date) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

	public void cerateUser(String loginUserId, String loginUserPassword, String userName ,String nameFirst, String nameLast, String canaFirst, String canaLast, String postcode, String prefecture,  String city, String address, String tel, String mail, String gender) throws SQLException {



		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2, loginUserPassword);
			preparedStatement.setString(3, userName);
			preparedStatement.setString(4, nameFirst);
			preparedStatement.setString(5, nameLast);
			preparedStatement.setString(6, canaFirst);
			preparedStatement.setString(7, canaLast);
			preparedStatement.setString(8, postcode);
			preparedStatement.setString(9, prefecture);
			preparedStatement.setString(10, city);
			preparedStatement.setString(11, address);
			preparedStatement.setString(12, tel);
			preparedStatement.setString(13, mail);
			preparedStatement.setString(14, gender);
			preparedStatement.setString(15, dateUtil.getDate());

			preparedStatement.execute();


		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
	}
}
