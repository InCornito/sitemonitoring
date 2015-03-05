package net.karalyus.sitemonitoring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Check {

	@Id
	@GeneratedValue
	private int id;

	@Size(min=1, message="Name should be greater than one")
	private String name;

	
	@Size(min=1, message="Name should be greater than one")
	@URL(message="Incorrect url value!")
	private String url;

}