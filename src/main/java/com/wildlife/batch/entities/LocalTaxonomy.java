package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the local_taxonomies database table.
 * 
 */
@Entity
@Table(name="local_taxonomies")
@NamedQuery(name="LocalTaxonomy.findAll", query="SELECT l FROM LocalTaxonomy l")
public class LocalTaxonomy implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//TO DO Satendar
	@Id
	@Column(name="local_common_name")
	private String localCommonName;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="projects_id")
	private Project project;

	//bi-directional many-to-one association to Taxonomy
	@ManyToOne
	@JoinColumn(name="taxonomies_uuid", referencedColumnName="unique_identifier")
	private Taxonomy taxonomy;

	public LocalTaxonomy() {
	}

	public String getLocalCommonName() {
		return this.localCommonName;
	}

	public void setLocalCommonName(String localCommonName) {
		this.localCommonName = localCommonName;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Taxonomy getTaxonomy() {
		return this.taxonomy;
	}

	public void setTaxonomy(Taxonomy taxonomy) {
		this.taxonomy = taxonomy;
	}

}