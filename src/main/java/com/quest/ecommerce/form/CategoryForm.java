package com.quest.ecommerce.form;

import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

import com.quest.ecommerce.dto.BaseDTO;
import com.quest.ecommerce.dto.CategoryDTO;

import lombok.Getter;
import lombok.Setter;


public class CategoryForm extends BaseForm {

	@NotEmpty(message = "Name is required")
	private String name;
	
	@NotEmpty(message = "Description is required")
	private String description;
	
	private MultipartFile image;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MultipartFile getImage() {
		return image;
	}

	public void setImage(MultipartFile image) {
		this.image = image;
	}

	@Override
	public BaseDTO getDTO() {
		CategoryDTO bean=new CategoryDTO();
		bean.setName(name);
		bean.setDescription(description);
		bean.setCreatedBy(createdBy);
		bean.setModifiedBy(modifiedBy);
		bean.setCreatedDatetime(createdDateTime);
		bean.setModifiedDatetime(modifiedDateTime);
		return bean;
	}

	@Override
	public void populate(BaseDTO bdto) {
		CategoryDTO bean=(CategoryDTO) bdto;
		name=bean.getName();
		description=bean.getDescription();
		createdBy=bean.getCreatedBy();
		modifiedBy=bean.getModifiedBy();
		createdDateTime=bean.getCreatedDatetime();
		modifiedDateTime=bean.getModifiedDatetime();
	}

}
