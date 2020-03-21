package com.system.fooddelivery.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.system.fooddelivery.entities.Restaurant;

@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {
	
	List<Restaurant> findByOwnerName(String name);
	
	List<Restaurant> findByOwnerNameAndRestaurantCity(String owner, String city);
	
	List<Restaurant> findByRestaurantCity(String city, Pageable pageable);
	
}
