package com.fstop.test.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "examples")
@Entity
public class example {

	@Id
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;

	
	

}
