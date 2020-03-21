package com.system.fooddelivery.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.fooddelivery.entities.Restaurant;
import com.system.fooddelivery.repositories.RestaurantRepo;

@Service
public class RegistrationService {

		@Autowired
		private RestaurantRepo restaurantRepo;
		
		public void registerRestaurant(Restaurant restaurant) {
			restaurantRepo.save(restaurant);
		}
		
		public Restaurant findById(String rid) {
			try {
				Optional<Restaurant> restOpt = restaurantRepo.findById(Integer.valueOf(rid));
				return restOpt.isPresent() ? restOpt.get() : null;
			} catch(Exception ex) {
				System.out.print(ex);
			}
			return null;
		}
	
}
