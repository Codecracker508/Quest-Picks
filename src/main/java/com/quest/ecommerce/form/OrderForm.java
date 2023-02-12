package com.quest.ecommerce.form;

import com.quest.ecommerce.dto.BaseDTO;
import com.quest.ecommerce.dto.OrderDTO;
import com.quest.ecommerce.util.DataUtility;



public class OrderForm extends BaseForm {

	private String name;
	private String email;
	private String mobileNo;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String orderId;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	@Override
	public BaseDTO getDTO() {
		OrderDTO dto = new OrderDTO();
		dto.setId(id);
		dto.setOrderid(DataUtility.getLong(orderId));
		dto.setName(name);
		dto.setEmail(email);
		dto.setMobileNo(mobileNo);
		dto.setAddress1(address1);
		dto.setAddress2(address2);
		dto.setCity(city);
		dto.setState(state);
		dto.setCreatedBy(createdBy);
		dto.setModifiedBy(modifiedBy);
		dto.setCreatedDatetime(createdDateTime);
		dto.setModifiedDatetime(modifiedDateTime);
		return dto;
	}

	@Override
	public void populate(BaseDTO bDto) {
		OrderDTO dto = (OrderDTO) bDto;
		id = dto.getId();
		orderId = String.valueOf(dto.getOrderid());
		name = dto.getName();
		email = dto.getEmail();
		mobileNo = dto.getMobileNo();
		address1 = dto.getAddress1();
		address2 = dto.getAddress2();
		city = dto.getCity();
		state = dto.getState();
		createdBy = dto.getCreatedBy();
		modifiedBy = dto.getModifiedBy();
		createdDateTime = dto.getCreatedDatetime();
		modifiedDateTime = dto.getModifiedDatetime();
	}

}
