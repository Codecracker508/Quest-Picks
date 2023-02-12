package com.quest.ecommerce.form;

import java.sql.Timestamp;

import com.quest.ecommerce.dto.BaseDTO;

import lombok.Getter;
import lombok.Setter;



public abstract class BaseForm {

	protected long id;

	protected String createdBy;

	protected String modifiedBy;

	protected Timestamp createdDateTime;

	protected Timestamp modifiedDateTime;

	protected int pageNo = 1;

	protected int pageSize = 10;

	protected long[] ids;

	protected int listsize;

	protected int total;

	private String operation;
	private int pagenosize;

	

	public abstract BaseDTO getDTO();

	public abstract void populate(BaseDTO bDto);

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Timestamp getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(Timestamp createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}

	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public long[] getIds() {
		return ids;
	}

	public void setIds(long[] ids) {
		this.ids = ids;
	}

	public int getListsize() {
		return listsize;
	}

	public void setListsize(int listsize) {
		this.listsize = listsize;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public int getPagenosize() {
		return pagenosize;
	}

	public void setPagenosize(int pagenosize) {
		this.pagenosize = pagenosize;
	}

}
