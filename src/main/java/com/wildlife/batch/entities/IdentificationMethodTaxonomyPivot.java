package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the identification_method_taxonomy_pivot database table.
 * 
 */
@Entity
@Table(name="identification_method_taxonomy_pivot")
@NamedQuery(name="IdentificationMethodTaxonomyPivot.findAll", query="SELECT i FROM IdentificationMethodTaxonomyPivot i")
public class IdentificationMethodTaxonomyPivot implements Serializable {
	private static final long serialVersionUID = 1L;

	private String tag;

	//bi-directional many-to-one association to IdentificationMethod
	@Id
	@ManyToOne
	@JoinColumn(name="identification_method_id")
	private IdentificationMethod identificationMethod;

	//bi-directional many-to-one association to TaxonomiesAll
	@ManyToOne
	@JoinColumn(name="taxonomies_uuid", referencedColumnName="unique_identifier")
	private Taxonomy taxonomiesAll;

	public IdentificationMethodTaxonomyPivot() {
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public IdentificationMethod getIdentificationMethod() {
		return this.identificationMethod;
	}

	public void setIdentificationMethod(IdentificationMethod identificationMethod) {
		this.identificationMethod = identificationMethod;
	}

	public Taxonomy getTaxonomiesAll() {
		return this.taxonomiesAll;
	}

	public void setTaxonomiesAll(Taxonomy taxonomiesAll) {
		this.taxonomiesAll = taxonomiesAll;
	}

}