package com.quest.ecommerce.form;


import javax.validation.constraints.NotEmpty;

import com.quest.ecommerce.dto.BaseDTO;
import com.quest.ecommerce.dto.UserDTO;




public class ForgetPasswordForm extends BaseForm {

	@NotEmpty(message = "Login is required")
	private String login;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Override
	public BaseDTO getDTO() {
		UserDTO dto = new UserDTO();
		dto.setLogin(login);
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {
		
	}

}
