package com.system.fooddelivery.repositories;

import org.springframework.data.repository.CrudRepository;
import com.system.fooddelivery.entities.Payment;

public interface PaymentRepo extends CrudRepository<Payment, Integer>{

}
