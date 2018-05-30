package com.coha.artistsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class BlogDescriptionAction extends ActionSupport implements SessionAware {

	private String insertDate;
	private String updateDate;
	private String title;
	private String category;
	private String news;

	public Map<String, Object> session;

	public String execute() {
		return SUCCESS;
	}

	public String getInsertDate() {
		return insertDate;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public String getNews() {
		return news;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
