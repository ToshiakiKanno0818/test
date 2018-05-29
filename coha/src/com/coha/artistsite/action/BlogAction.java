package com.coha.artistsite.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.coha.artistsite.dao.BlogDAO;
import com.coha.artistsite.dto.BlogDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BlogAction extends ActionSupport implements SessionAware {
	private BlogDAO blogDAO = new BlogDAO();

	ArrayList<BlogDTO> blogList = new ArrayList<BlogDTO>();

	public Map<String, Object> session;

	public String execute() {
		blogList = blogDAO.getBlogInfo();

		Iterator<BlogDTO> iterator = blogList.iterator();
		if (!(iterator.hasNext())) {
			blogList = null;
		}

		return SUCCESS;
	}

	public BlogDAO getBlogDAO() {
		return blogDAO;
	}

	public void setBlogDAO(BlogDAO blogDAO) {
		this.blogDAO = blogDAO;
	}

	public ArrayList<BlogDTO> getBlogList() {
		return blogList;
	}

	public void setBlogList(ArrayList<BlogDTO> blogList) {
		this.blogList = blogList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
