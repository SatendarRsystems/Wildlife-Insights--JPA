package com.wildlife.batch.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the common_names database table.
 * 
 */
@Entity
@Table(name="common_names")
@NamedQuery(name="CommonName.findAll", query="SELECT c FROM CommonName c")
public class CommonName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="alias_yn")
	private Boolean aliasYn;

	@Column(name="common_name")
	private String commonName;

	@Column(name="primary_yn")
	private Boolean primaryYn;

	private String remarks;

	//bi-directional many-to-one association to Language
	@ManyToOne
	@JoinColumn(name="language")
	private Language languageBean;

	//bi-directional many-to-one association to TaxonomiesAll
	@ManyToOne
	@JoinColumn(name="taxonomies_uuid", referencedColumnName="unique_identifier")
	private Taxonomy taxonomiesAll;

	public CommonName() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getAliasYn() {
		return this.aliasYn;
	}

	public void setAliasYn(Boolean aliasYn) {
		this.aliasYn = aliasYn;
	}

	public String getCommonName() {
		return this.commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public Boolean getPrimaryYn() {
		return this.primaryYn;
	}

	public void setPrimaryYn(Boolean primaryYn) {
		this.primaryYn = primaryYn;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Language getLanguageBean() {
		return this.languageBean;
	}

	public void setLanguageBean(Language languageBean) {
		this.languageBean = languageBean;
	}

	public Taxonomy getTaxonomiesAll() {
		return this.taxonomiesAll;
	}

	public void setTaxonomiesAll(Taxonomy taxonomiesAll) {
		this.taxonomiesAll = taxonomiesAll;
	}

}