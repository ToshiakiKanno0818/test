package com.coha.artistsite.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.coha.artistsite.dao.BlogDAO;
import com.coha.artistsite.dto.BlogDTO;
import com.opensymphony.xwork2.ActionSupport;

public class BlogAction extends ActionSupport implements SessionAware {
//	ブログ情報をインスタンス化
	private BlogDAO blogDAO = new BlogDAO();
	ArrayList<BlogDTO> blogList = new ArrayList<BlogDTO>();
	public Map<String, Object> session;

//	最大ページ数
	public int pagecount;

//	1ページに格納する日記数
	private List<Integer> apageList = new ArrayList<>();

//	1ページの表示件数
	public int pagenum = 3;

//	表示したいページ
	public int pageselect;

	public String execute() {
		blogList = blogDAO.getBlogInfo();

		Iterator<BlogDTO> iterator = blogList.iterator();
		if (!(iterator.hasNext())) {
			blogList = null;
		}

///////////////////////////ページング///////////////////////


//		表示記事ID = pagenum * (pageselect-1)

//		最大ページ数をカウント
		pagecount = blogList.size()/pagenum;
		if(blogList.size()%pagenum != 0){
			pagecount = pagecount + 1;
		}

		for(int i = 0; i < pagenum; i++){
			apageList.add(i);
		}
		for(int i = 0; i < pagenum; i++){
			apageList = blogList.get(pagenum * (pageselect-1));
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
