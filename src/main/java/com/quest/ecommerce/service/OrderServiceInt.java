package com.quest.ecommerce.service;

import java.util.List;

import com.quest.ecommerce.dto.OrderDTO;
import com.quest.ecommerce.exception.DuplicateRecordException;

public interface OrderServiceInt {

	public long add(OrderDTO dto) throws DuplicateRecordException;

	public void delete(OrderDTO dto);

	public OrderDTO findBypk(long pk);

	public OrderDTO findByName(String name);

	public void update(OrderDTO dto) throws DuplicateRecordException;

	public List<OrderDTO> list();

	public List<OrderDTO> list(int pageNo, int pageSize);

	public List<OrderDTO> search(OrderDTO dto);

	public List<OrderDTO> search(OrderDTO dto, int pageNo, int pageSize);
	

}
