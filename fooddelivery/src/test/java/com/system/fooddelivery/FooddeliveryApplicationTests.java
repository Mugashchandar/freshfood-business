package com.system.fooddelivery;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.system.fooddelivery.entities.Card;
import com.system.fooddelivery.entities.Cheque;
import com.system.fooddelivery.entities.Restaurant;
import com.system.fooddelivery.repositories.PaymentRepo;
import com.system.fooddelivery.repositories.RestaurantRepo;

@SpringBootTest
class FooddeliveryApplicationTests {
	
	@Autowired
	private RestaurantRepo repo;
	
	@Autowired
	private PaymentRepo paymentRepo;

	@Test
	public void testRestaurantByOwner() {
		repo.findByOwnerName("Akshymathi");
	}
	
	@Test
	public void testRestaurantByOwnerAndCity() {
		//List<Restaurant> restaurants = repo.findByOwnerNameAndRestaurantCity("Mugash", "Chennai");
		//restaurants.forEach(restaurant -> System.out.println(restaurant.getRestaurantName()));
	}
	
	@Test
	public void testRestaurantByCity() {
		List<Restaurant> restaurants = repo.findByRestaurantCity("Chennai", PageRequest.of(0, 3, Sort.by(Direction.ASC, "restaurantName")));
		restaurants.forEach(restaurant -> System.out.println(restaurant.getRestaurantName()));
	}

	@Test
	public void testPayment1() {
		Card card = new Card();
		card.setAmount(230.15);
		card.setCardNumber("5233 5244 1214 2453");
		paymentRepo.save(card);
	}
	
	@Test
	public void testPayment2() {
		Card card = new Card();
		card.setAmount(230.15);
		card.setCardNumber("5133 5244 1214 0453");
		paymentRepo.save(card);
	}
	
	@Test
	public void testPayment3() {
		Cheque cheque = new Cheque();
		cheque.setAmount(220.15);
		cheque.setChequeNumber("5656 25");
		paymentRepo.save(cheque);
	}
	
	@Test
	public void testPayment4() {
		Cheque cheque = new Cheque();
		cheque.setAmount(123.15);
		cheque.setChequeNumber("45 5656 25");
		paymentRepo.save(cheque);
	}

}


