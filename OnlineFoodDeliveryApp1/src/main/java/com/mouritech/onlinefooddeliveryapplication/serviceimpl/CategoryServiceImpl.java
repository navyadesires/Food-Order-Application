package com.mouritech.onlinefooddeliveryapplication.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.mouritech.onlinefooddeliveryapplication.entity.Category;
import com.mouritech.onlinefooddeliveryapplication.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryService categoryService;

	public Category addCategory(Category cat) {
		return categoryService.addCategory(cat);
	}

	public Category updateCategory(Category cat) {
		return categoryService.updateCategory(cat);
	}

	public Category removeCategory(Category cat) {
		return categoryService.removeCategory(cat);
	}

	public Category viewCategory(Category cat) {
		return categoryService.viewCategory(cat);
	}

	public List<Category> viewAllCategory() {
		return categoryService.viewAllCategory();
	}

}
