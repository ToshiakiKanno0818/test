package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginPassword;
	private String userName;
	private String firstName;
	private String lastName;
	private String firstCana;
	private String lastCana;
	private String postcodeNumber;
	private String prefectureName;
	private String cityName;
	private String address;
	private String tel;
	private String mail;
	private String gender;

	public Map<String,Object> session;

	private UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();

	public String execute() throws SQLException {

		userCreateCompleteDAO.cerateUser(
				session.get("loginUserId").toString(),
				session.get("loginPassword").toString(),
				session.get("userName").toString(),
				session.get("firstName").toString(),
				session.get("lastName").toString(),
				session.get("firstCana").toString(),
				session.get("lastCana").toString(),
				session.get("postcodeNumber").toString(),
				session.get("prefectureName").toString(),
				session.get("cityName").toString(),
				session.get("address").toString(),
				session.get("tel").toString(),
				session.get("mail").toString(),
				session.get("gender").toString()
				);

		String result = SUCCESS;
		return result ;
	}



	public String getLoginUserId() {
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstCana() {
		return firstCana;
	}

	public void setFirstCana(String firstCana) {
		this.firstCana = firstCana;
	}

	public String getLastCana() {
		return lastCana;
	}

	public void setLastCana(String lastCana) {
		this.lastCana = lastCana;
	}

	public String getPostcodeNumber() {
		return postcodeNumber;
	}

	public void setPostcodeNumber(String postcodeNumber) {
		this.postcodeNumber = postcodeNumber;
	}

	public String getPrefectureName() {
		return prefectureName;
	}

	public void setPrefectureName(String prefectureName) {
		this.prefectureName = prefectureName;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public UserCreateCompleteDAO getUserCreateCompleteDAO() {
		return userCreateCompleteDAO;
	}

	public void setUserCreateCompleteDAO(UserCreateCompleteDAO userCreateCompleteDAO) {
		this.userCreateCompleteDAO = userCreateCompleteDAO;
	}







	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
