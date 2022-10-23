package com.hibernateEmbeddable.hibernateEmbeddableexample.entity;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/*
*/
/**
	 * Created by Niraj Singh *
*/
/*
*/
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Address {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String country;
	private String zipCode;
}