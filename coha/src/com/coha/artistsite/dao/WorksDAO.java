package com.coha.artistsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.coha.artistsite.dto.WorksDTO;
import com.coha.artistsite.util.DBConnector;

public class WorksDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	ArrayList<WorksDTO> worksDTOList = new ArrayList<WorksDTO>();

	public ArrayList<WorksDTO> getWorksInfo() {
		String sql = "SELECT * FROM work_info";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				WorksDTO dto = new WorksDTO();
				dto.setId(rs.getInt("id"));
				dto.setWorkName(rs.getString("work_name"));
				dto.setWorkDescription(rs.getString("work_description"));
				dto.setUploadDate(rs.getString("upload_date"));
				dto.setImageFilePath(rs.getString("image_file_path"));
				dto.setImageFileName(rs.getString("image_file_name"));
				dto.setMusicFilePath(rs.getString("music_file_path"));
//				worksDTO.setMusicFileName(rs.getString("music_file_name"));
				worksDTOList.add(dto);
			}

//			テストコード
//			System.out.println(rs.getInt("id"));
//			System.out.println(rs.getString("work_description"));
//			System.out.println(rs.geString("upload_date"));
//			System.out.println(rs.getString("image_file_path"));
//			System.out.println(rs.getString("image_file_name"));
//			System.out.println(rs.getString("music_file_path"));

		} catch(Exception e) {
			e.printStackTrace();
		}
		return worksDTOList;
	}

}
