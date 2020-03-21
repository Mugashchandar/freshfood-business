package com.system.fooddelivery.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@Data
@PrimaryKeyJoinColumn(name="ca_id")
public class Card extends Payment {
	private String cardNumber;
}
