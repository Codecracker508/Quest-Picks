package com.quest.ecommerce.form;

import javax.validation.constraints.NotEmpty;

import com.quest.ecommerce.dto.BaseDTO;
import com.quest.ecommerce.dto.UserDTO;

import lombok.Getter;
import lombok.Setter;


public class LoginForm extends BaseForm {

	@NotEmpty(message = "Login Id is required")
	private String login;
	@NotEmpty(message = "Password is required")
	private String password;
	

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

	@Override
	public BaseDTO getDTO() {
		UserDTO bean=new UserDTO();
		bean.setLogin(login);
		bean.setPassword(password);
		return bean;
	}

	@Override
	public void populate(BaseDTO bdto) {
		UserDTO entity=(UserDTO) bdto;
		login=entity.getLogin();
		password=entity.getPassword();
	}

}
