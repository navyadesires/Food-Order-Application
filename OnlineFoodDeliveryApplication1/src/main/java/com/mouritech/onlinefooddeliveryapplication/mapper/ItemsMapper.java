package com.mouritech.onlinefooddeliveryapplication.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mouritech.onlinefooddeliveryapplication.dto.ItemDto;
import com.mouritech.onlinefooddeliveryapplication.entity.Items;

@Component
public class ItemsMapper {
	
	@Autowired
	ModelMapper modelMapper;
	
	public ItemDto convertEntityToDto(Items items)
	{
		return modelMapper.map(items, ItemDto.class);
	}
	
	public Items convertDtoToEntity(ItemDto itemDto)
	{
		return modelMapper.map(itemDto,Items.class);
	}


}