package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the iucn_red_list_categories database table.
 * 
 */
@Entity
@Table(name="iucn_red_list_categories")
@NamedQuery(name="IucnRedListCategory.findAll", query="SELECT i FROM IucnRedListCategory i")
public class IucnRedListCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String abbreviation;

	@Column(name="category_name")
	private String categoryName;

	private String remarks;

	//bi-directional many-to-one association to Taxonomy
	@OneToMany(mappedBy="iucnRedListCategory")
	private List<Taxonomy> taxonomies;

	//bi-directional many-to-one association to TaxonomiesAll
	@OneToMany(mappedBy="iucnRedListCategory")
	private List<Taxonomy> taxonomiesAlls;

	public IucnRedListCategory() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public List<Taxonomy> getTaxonomies() {
		return this.taxonomies;
	}

	public void setTaxonomies(List<Taxonomy> taxonomies) {
		this.taxonomies = taxonomies;
	}

	public Taxonomy addTaxonomy(Taxonomy taxonomy) {
		getTaxonomies().add(taxonomy);
		taxonomy.setIucnRedListCategory(this);

		return taxonomy;
	}

	public Taxonomy removeTaxonomy(Taxonomy taxonomy) {
		getTaxonomies().remove(taxonomy);
		taxonomy.setIucnRedListCategory(null);

		return taxonomy;
	}

	public List<Taxonomy> getTaxonomiesAlls() {
		return this.taxonomiesAlls;
	}

	public void setTaxonomiesAlls(List<Taxonomy> taxonomiesAlls) {
		this.taxonomiesAlls = taxonomiesAlls;
	}

	public Taxonomy addTaxonomiesAll(Taxonomy taxonomiesAll) {
		getTaxonomiesAlls().add(taxonomiesAll);
		taxonomiesAll.setIucnRedListCategory(this);

		return taxonomiesAll;
	}

	public Taxonomy removeTaxonomiesAll(Taxonomy taxonomiesAll) {
		getTaxonomiesAlls().remove(taxonomiesAll);
		taxonomiesAll.setIucnRedListCategory(null);

		return taxonomiesAll;
	}

}