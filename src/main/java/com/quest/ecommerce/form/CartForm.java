package com.quest.ecommerce.form;



import com.quest.ecommerce.dto.BaseDTO;
import com.quest.ecommerce.dto.CartDTO;

import lombok.Getter;
import lombok.Setter;

public class CartForm extends BaseForm {

	private String[] quantity;


	public String[] getQuantity() {
		return quantity;
	}

	public void setQuantity(String[] quantity) {
		this.quantity = quantity;
	}

	@Override
	public BaseDTO getDTO() {
		CartDTO dto = new CartDTO();
		dto.setId(id);
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {
		CartDTO dto = (CartDTO) bDto;
		id=dto.getId();
	}

}
