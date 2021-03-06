package com.internousdev.ecsite.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author internous
 *
 */
public class UserCreateConfirmAction extends ActionSupport implements SessionAware {

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

	private String errorMassage;

	public String execute() {

		String result = SUCCESS;

		if(!(loginUserId.equals("")) &&	!(loginPassword.equals("")) && !(userName.equals("")) && !(firstName.equals("")) && !(lastName.equals("")) && !(firstCana.equals("")) && !(lastCana.equals("")) && !(postcodeNumber.equals("")) && !(prefectureName.equals("")) && !(cityName.equals("")) && !(address.equals("")) && !(tel.equals("")) && !(mail.equals("")) && !(gender.equals(""))) {
			session.put("loginUserId", loginUserId);
			session.put("loginPassword", loginPassword);
			session.put("userName", userName);
			session.put("firstName", firstName);
			session.put("lastName", lastName);
			session.put("firstCana", firstCana);
			session.put("lastCana", lastCana);
			session.put("postcodeNumber", postcodeNumber);
			session.put("prefectureName", prefectureName);
			session.put("cityName", cityName);
			session.put("address", address);
			session.put("tel", tel);
			session.put("mail", mail);
			session.put("gender", gender);
		} else {

			setErrorMassage("未入力の項目があります。");
			result = ERROR;
		}

		return result;
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








	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMassage() {
		return errorMassage;
	}

	public void setErrorMassage(String errorMassage) {
		this.errorMassage = errorMassage;
	}
}
