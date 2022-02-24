package com.mouritech.onlinefooddeliveryapplication.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mouritech.onlinefooddeliveryapplication.dto.ItemDto;
import com.mouritech.onlinefooddeliveryapplication.entity.Item;


@Component
public class ItemsMapper {
	
	@Autowired
	ModelMapper modelMapper;
	
	public ItemDto convertEntityToDto(Item item)
	{
		return modelMapper.map(item, ItemDto.class);
	}
	
	public Item convertDtoToEntity(ItemDto itemDto)
	{
		return modelMapper.map(itemDto,Item.class);
	}


}