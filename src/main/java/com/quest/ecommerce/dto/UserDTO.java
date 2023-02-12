package com.quest.ecommerce.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "USER")
public class UserDTO extends BaseDTO {

	@Column(name = "FIRST_NAME", length = 225)
	private String firstName;

	@Column(name = "LAST_NAME", length = 225)
	private String lastName;

	@Column(name = "LOGIN" ,length = 225)
	private String login;

	@Column(name = "PASSWORD", length = 225)
	private String password;

	private String confirmPassword;

	@Column(name = "ROLE_ID", length = 225)
	private long roleId;

	@Column(name = "EMAIL_ID", length = 225)
	private String emailId;
	
	@Column(name = "CONTACT_NO", length = 225)
	private String contactNo;
	
	@Column(name = "status", length = 225)
	private String status;
	
	@Column(name = "userType", length = 225)
	private String userType;
	
	
	public String getKey() {
		return id + "";
	}

	public String getValue() {
		return firstName + " " + lastName;
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

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public long getRoleId() {
		return roleId;
	}

	public void setRoleId(long roleId) {
		this.roleId = roleId;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	
	
}
