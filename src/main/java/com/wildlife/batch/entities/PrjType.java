package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the prj_type database table.
 * 
 */
@Entity
@Table(name="prj_type")
@NamedQuery(name="PrjType.findAll", query="SELECT p FROM PrjType p")
public class PrjType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="project_type")
	private String projectType;

	public PrjType() {
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

}