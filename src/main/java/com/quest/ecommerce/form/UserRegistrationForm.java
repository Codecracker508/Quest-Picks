package com.quest.ecommerce.form;

import javax.validation.constraints.NotEmpty;

import com.quest.ecommerce.dto.BaseDTO;
import com.quest.ecommerce.dto.UserDTO;
import com.quest.ecommerce.util.DataUtility;

import lombok.Getter;
import lombok.Setter;


public class UserRegistrationForm extends BaseForm {

	@NotEmpty(message = "First Name is required")
	private String firstName;
	
	@NotEmpty(message = "LastName is required")
	private String lastName;
	
	@NotEmpty(message = "Email is required")
	private String email;
	
	@NotEmpty(message = "Login is required")
	private String login;
	
	@NotEmpty(message = "Password is required")
	private String password;
	
	@NotEmpty(message = "Confirm Password is required")
	private String confirmPassword;
	
	@NotEmpty(message = "Contact No is required")
	private String contactNo;
	
	@NotEmpty(message = "user Type  is required")
	private String userType;
	
	

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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	@Override
	public BaseDTO getDTO() {
		UserDTO bean=new UserDTO();
		bean.setId(id);
		bean.setFirstName(firstName);
		bean.setLastName(lastName);
		bean.setEmailId(email);
		bean.setPassword(password);
		bean.setContactNo(contactNo);
		bean.setLogin(login);
		bean.setUserType(userType);
		bean.setCreatedBy(createdBy);
		bean.setModifiedBy(modifiedBy);
		bean.setCreatedDatetime(createdDateTime);
		bean.setModifiedDatetime(modifiedDateTime);
		return bean;
	}
	@Override
	public void populate(BaseDTO baseBean) {
		UserDTO bean=(UserDTO)baseBean;
		id=bean.getId();
		firstName=bean.getFirstName();
		lastName=bean.getLastName();
		email=bean.getEmailId();
		password=bean.getPassword();
		contactNo=bean.getContactNo();
		login=bean.getLogin();
		userType = bean.getUserType();
		createdBy=bean.getCreatedBy();
		modifiedBy=bean.getModifiedBy();
		createdDateTime=bean.getCreatedDatetime();
		modifiedDateTime=bean.getModifiedDatetime();
	}
}
