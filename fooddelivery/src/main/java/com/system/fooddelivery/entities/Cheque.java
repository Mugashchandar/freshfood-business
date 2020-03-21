package com.system.fooddelivery.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@Data
@PrimaryKeyJoinColumn(name="ch_id")
public class Cheque extends Payment {
	private String chequeNumber;
}

