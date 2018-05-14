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
	private WorksDTO worksDTO = new WorksDTO();

	public ArrayList<WorksDTO> getWorksInfo() {
		String sql = "SELECT * FROM work_info";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()) {
				worksDTO.setId(rs.getInt("id"));
				worksDTO.setWorkName(rs.getString("work_name"));
				worksDTO.setWorkDescription(rs.getString("work_description"));
				worksDTO.setUpdateYear(rs.getInt("update_year"));
				worksDTO.setUpdateMonth(rs.getInt("update_month"));
				worksDTO.setUpdateDate(rs.getInt("update_date"));
				worksDTO.setUpdateTime(rs.getInt("update_time"));
				worksDTO.setUpdateMinute(rs.getInt("update_minite"));
				worksDTO.setImageFilePath(rs.getString("image_file_path"));
				worksDTO.setImageFileName(rs.getString("image_file_name"));
				worksDTO.setMusicFilePath(rs.getString("music_file_path"));
				worksDTO.setMusicFileName(rs.getString("music_file_name"));
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return worksDTOList;
	}

}
