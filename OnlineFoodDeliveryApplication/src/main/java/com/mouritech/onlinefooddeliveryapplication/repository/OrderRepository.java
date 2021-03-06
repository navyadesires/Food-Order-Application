package com.mouritech.onlinefooddeliveryapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.onlinefooddeliveryapplication.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
