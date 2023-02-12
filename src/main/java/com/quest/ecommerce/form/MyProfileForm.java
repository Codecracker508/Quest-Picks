package com.quest.ecommerce.form;
import javax.validation.constraints.NotEmpty;

import com.quest.ecommerce.dto.BaseDTO;
import com.quest.ecommerce.dto.UserDTO;

import lombok.Getter;
import lombok.Setter;


public class MyProfileForm extends BaseForm {

	@NotEmpty(message = "First Name is required")
	private String firstName;
	
	@NotEmpty(message = "LastName is required")
	private String lastName;
	
	@NotEmpty(message = "Email is required")
	private String email;
	
	@NotEmpty(message = "MobileNo is required")
	private String mobileNo;
	
	
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


	public String getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public BaseDTO getDTO() {
		UserDTO entity = new UserDTO();
		entity.setFirstName(firstName);
		entity.setLastName(lastName);
		entity.setContactNo(mobileNo);
		entity.setEmailId(email);
		return entity;
	}

	
	public void populate(BaseDTO bDto) {
		UserDTO entity = (UserDTO) bDto;
		firstName = entity.getFirstName();
		lastName = entity.getLastName();
		mobileNo=entity.getContactNo();
		email=entity.getEmailId();
	}

	

}
