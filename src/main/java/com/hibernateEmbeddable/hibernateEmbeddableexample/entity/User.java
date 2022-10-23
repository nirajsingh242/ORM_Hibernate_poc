package com.hibernateEmbeddable.hibernateEmbeddableexample.entity;

import javax.persistence.*;
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
@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Embedded
	private Name name;

	private String email;

	@Embedded
	@AttributeOverrides(value = 
					{
					@AttributeOverride(name = "addressLine1", column = @Column(name = "house_number")),
					@AttributeOverride(name = "addressLine2", column = @Column(name = "street")) 
					})
	private Address address;
	
	
	public User(Name name, String email, Address address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}
}