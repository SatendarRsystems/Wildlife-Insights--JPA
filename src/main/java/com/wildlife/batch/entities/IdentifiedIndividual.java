package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the identified_individuals database table.
 * 
 */
@Entity
@Table(name="identified_individuals")
@NamedQuery(name="IdentifiedIndividual.findAll", query="SELECT i FROM IdentifiedIndividual i")
public class IdentifiedIndividual implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String name;

	//bi-directional many-to-one association to IdentifiedObject
	@ManyToOne
	@JoinColumn(name="identified_animals_id")
	private IdentifiedObject identifiedObject;

	public IdentifiedIndividual() {
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

	public IdentifiedObject getIdentifiedObject() {
		return this.identifiedObject;
	}

	public void setIdentifiedObject(IdentifiedObject identifiedObject) {
		this.identifiedObject = identifiedObject;
	}

}