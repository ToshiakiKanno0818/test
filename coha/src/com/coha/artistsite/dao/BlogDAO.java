package com.coha.artistsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.coha.artistsite.dto.BlogDTO;
import com.coha.artistsite.util.DBConnector;

public class BlogDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	ArrayList<BlogDTO> blogDTOList = new ArrayList<BlogDTO>();

	public ArrayList<BlogDTO> getBlogInfo() {
		String sql = "SELECT * FROM blog_info";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				BlogDTO dto = new BlogDTO();
				dto.setId(rs.getInt("id"));
				dto.setInsertDate(rs.getString("insert_date"));
				dto.setUpdateDate(rs.getString("update_date"));
				dto.setTitle(rs.getString("title"));
				dto.setCategory(rs.getInt("category"));
				dto.setNews(rs.getString("news"));
				blogDTOList.add(dto);
			}

//			System.out.println(rs.getInt("id"));
//			System.out.println(rs.getString("work_description"));
//			System.out.println(rs.getInt("update_year"));
//			System.out.println(rs.getInt("update_month"));
//			System.out.println(rs.getInt("update_date"));
//			System.out.println(rs.getString("image_file_path"));
//			System.out.println(rs.getString("image_file_name"));
//			System.out.println(rs.getString("music_file_path"));

		} catch(Exception e) {
			e.printStackTrace();
		}
		return blogDTOList;
	}

}
