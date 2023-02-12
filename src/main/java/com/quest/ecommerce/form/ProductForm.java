package com.quest.ecommerce.form;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

import org.springframework.web.multipart.MultipartFile;

import com.quest.ecommerce.dto.BaseDTO;
import com.quest.ecommerce.dto.ProductDTO;



public class ProductForm extends BaseForm {

	@NotEmpty(message = "Name is required")
	private String name;

	@NotEmpty(message = "Price is required")
	private String price;

	@Min(value = 1, message = "Category is required")
	private long categoryId;

	@NotEmpty(message = "Description is required")
	private String description;

	private MultipartFile image;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
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
		ProductDTO bean = new ProductDTO();
		bean.setName(name);
		bean.setPrice(price);
		bean.setCategoryId(categoryId);
		bean.setDescription(description);
		bean.setCreatedBy(createdBy);
		bean.setModifiedBy(modifiedBy);
		bean.setCreatedDatetime(createdDateTime);
		bean.setModifiedDatetime(modifiedDateTime);
		return bean;
	}

	@Override
	public void populate(BaseDTO bdto) {
		ProductDTO bean = (ProductDTO) bdto;
		name = bean.getName();
		categoryId = bean.getCategoryId();
		price = bean.getPrice();
		description = bean.getDescription();
		createdBy = bean.getCreatedBy();
		modifiedBy = bean.getModifiedBy();
		createdDateTime = bean.getCreatedDatetime();
		modifiedDateTime = bean.getModifiedDatetime();
	}

}
