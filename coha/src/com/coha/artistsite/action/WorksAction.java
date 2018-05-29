package com.coha.artistsite.action;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.coha.artistsite.dao.WorksDAO;
import com.coha.artistsite.dto.WorksDTO;
import com.opensymphony.xwork2.ActionSupport;

public class WorksAction extends ActionSupport implements SessionAware {
	private WorksDAO worksDAO = new WorksDAO();
//	private WorksDTO worksDTO = new WorksDTO();

	ArrayList<WorksDTO> worksList = new ArrayList<WorksDTO>();

	public Map<String, Object> session;

	public String execute() {
		worksList = worksDAO.getWorksInfo();

		Iterator<WorksDTO> iterator = worksList.iterator();
		if (!(iterator.hasNext())) {
			worksList = null;
		}

		return SUCCESS;
	}

	public WorksDAO getWorksDAO() {
		return worksDAO;
	}

	public void setWorksDAO(WorksDAO worksDAO) {
		this.worksDAO = worksDAO;
	}

	public ArrayList<WorksDTO> getWorksList() {
		return worksList;
	}

	public void setWorksList(ArrayList<WorksDTO> worksList) {
		this.worksList = worksList;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
