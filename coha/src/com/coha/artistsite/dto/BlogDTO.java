package com.coha.artistsite.dto;

public class BlogDTO {
	private int id;
	//投稿日時
	private String insertDate;
	//更新日時
	private String updateDate;
	//タイトル
	private String title;
	//カテゴリ
	private int category;
	//本文
	private String news;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getNews() {
		return news;
	}
	public void setNews(String news) {
		this.news = news;
	}



}
