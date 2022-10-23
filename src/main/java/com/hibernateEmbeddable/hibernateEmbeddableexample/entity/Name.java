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
public class Name {
	private String firstName;

	private String middleName;

	private String lastName;

}