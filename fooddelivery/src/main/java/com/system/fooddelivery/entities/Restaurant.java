package com.system.fooddelivery.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Restaurant {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantId;
	private String restaurantName;
	private String restaurantCity;
	private String ownerName;
	private String ownerContactNumber;
	private String ownerEmailId;
	
}
