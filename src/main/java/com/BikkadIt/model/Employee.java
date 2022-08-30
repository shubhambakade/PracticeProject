package com.BikkadIt.model;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private Integer id;
	private String name;
	private String address;
	private int age;
	private String email;
	
}
