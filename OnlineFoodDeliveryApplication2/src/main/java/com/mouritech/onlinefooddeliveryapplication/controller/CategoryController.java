/*package com.mouritech.onlinefooddeliveryapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.onlinefooddeliveryapplication.entity.Category;
import com.mouritech.onlinefooddeliveryapplication.exception.CategoryNotFound;
import com.mouritech.onlinefooddeliveryapplication.service.CategoryService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/categories/")

public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping("insertcategory")
	public Category insertCategory(@RequestBody Category newCategory) {
		
		return categoryService.insertCategory(newCategory);
		
	}
	@GetMapping("shallallcategory")
	public List<Category> showAllCategorys(){
		return categoryService.showAllCategorys();
		
	}
	
	@GetMapping("category/{cid}")
	public Category showCatById(@PathVariable("cid") String catId) throws CategoryNotFound{
		return categoryService.showCatById(catId);
		
	}
	
	@PutMapping("category/{cid}")
	public Category updateCatById(@PathVariable("cid") String catId,@RequestBody Category category) throws CategoryNotFound{
		return categoryService.updateCatById(catId,category);
		
	}
	
	@DeleteMapping("category/{cid}")
	public String deleteCatById(@PathVariable("cid") String catId) throws CategoryNotFound{
		 categoryService.deleteCatById(catId);
		 return "deleted the category";
		
	}
}*/
