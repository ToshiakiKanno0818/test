package com.coha.artistsite.dto;

public class WorksDTO {
	private int id;
	private String workName;
	private String workDescription;
	private int updateYear;
	private int updateMonth;
	private int updateDate;
	private String imageFilePath;
	private String imageFileName;
	private String musicFilePath;
	private String musicFileName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWorkName() {
		return workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getWorkDescription() {
		return workDescription;
	}

	public void setWorkDescription(String workDescription) {
		this.workDescription = workDescription;
	}

	public int getUpdateYear() {
		return updateYear;
	}

	public void setUpdateYear(int updateYear) {
		this.updateYear = updateYear;
	}

	public int getUpdateMonth() {
		return updateMonth;
	}

	public void setUpdateMonth(int updateMonth) {
		this.updateMonth = updateMonth;
	}

	public int getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(int updateDate) {
		this.updateDate = updateDate;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath(String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getMusicFilePath() {
		return musicFilePath;
	}

	public void setMusicFilePath(String musicFilePath) {
		this.musicFilePath = musicFilePath;
	}

	public String getMusicFileName() {
		return musicFileName;
	}

	public void setMusicFileName(String musicFileName) {
		this.musicFileName = musicFileName;
	}

}
