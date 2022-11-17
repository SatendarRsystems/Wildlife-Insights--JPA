package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sequenceid database table.
 * 
 */
@Entity
@NamedQuery(name="Sequenceid.findAll", query="SELECT s FROM Sequenceid s")
public class Sequenceid implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	public Sequenceid() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}