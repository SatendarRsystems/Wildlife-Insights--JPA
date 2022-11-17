package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the continents database table.
 * 
 */
@Entity
@Table(name="continents")
@NamedQuery(name="Continent.findAll", query="SELECT c FROM Continent c")
public class Continent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="bucket_region")
	private String bucketRegion;

	private String code;

	private String name;

	//bi-directional many-to-one association to Country
	@OneToMany(mappedBy="continent")
	private List<Country> countries;

	public Continent() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBucketRegion() {
		return this.bucketRegion;
	}

	public void setBucketRegion(String bucketRegion) {
		this.bucketRegion = bucketRegion;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Country> getCountries() {
		return this.countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public Country addCountry(Country country) {
		getCountries().add(country);
		country.setContinent(this);

		return country;
	}

	public Country removeCountry(Country country) {
		getCountries().remove(country);
		country.setContinent(null);

		return country;
	}

}