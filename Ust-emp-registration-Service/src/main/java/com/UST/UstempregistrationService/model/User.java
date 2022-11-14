package com.UST.UstempregistrationService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="EMP_REG_TBL")

public class User {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private int experience;
	private String  domain;
	

}
