package com.system.fooddelivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.fooddelivery.entities.Restaurant;
import com.system.fooddelivery.forms.LoginForm;
import com.system.fooddelivery.services.RegistrationService;

@RestController
@RequestMapping(path="/api")
@CrossOrigin(origins = "http://localhost:4200")
public class RestaurantController {
	
	@Autowired
	private RegistrationService registrationService;
	
	@GetMapping(path="/ping")
	public String ping() {
		return "Pong!!";
	}
	
	@PostMapping(path="/register")
	public void registerRestaurant(@RequestBody Restaurant restaurant) {
		registrationService.registerRestaurant(restaurant);
	}
	
	@PostMapping(path="/login")
	public boolean loginRestausant(@RequestBody LoginForm loginForm) {
		return registrationService.findById(loginForm.getRid()) != null;
	}
}
