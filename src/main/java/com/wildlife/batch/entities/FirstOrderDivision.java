package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the first_order_divisions database table.
 * 
 */
@Entity
@Table(name="first_order_divisions")
@NamedQuery(name="FirstOrderDivision.findAll", query="SELECT f FROM FirstOrderDivision f")
public class FirstOrderDivision implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	private String type;

	//bi-directional many-to-one association to Country
	@ManyToOne
	private Country country;

	public FirstOrderDivision() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Country getCountry() {
		return this.country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

}