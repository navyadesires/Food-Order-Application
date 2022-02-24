package com.mouritech.onlinefooddeliveryapplication.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mouritech.onlinefooddeliveryapplication.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {
	
	Optional<Category> findByCatId(String catId);
	List<Category> findByCatName(String catId);
	
	boolean existsByCatId(String catid);
	

}
