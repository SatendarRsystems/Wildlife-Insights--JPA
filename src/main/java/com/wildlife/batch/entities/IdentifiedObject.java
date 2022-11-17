package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the identified_objects database table.
 * 
 */
@Entity
@Table(name="identified_objects")
@NamedQuery(name="IdentifiedObject.findAll", query="SELECT i FROM IdentifiedObject i")
public class IdentifiedObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String behavior;

	private Integer certainity;

	private Integer count;

	private Timestamp date;

	@Column(name="individual_identified")
	private Boolean individualIdentified;

	private String markings;

	@Column(name="relative_age")
	private String relativeAge;

	private String remarks;

	private String sex;

	//bi-directional many-to-one association to IdentifiedIndividual
	@OneToMany(mappedBy="identifiedObject")
	private List<IdentifiedIndividual> identifiedIndividuals;

	//bi-directional many-to-one association to IdentificationMetavalue
	@ManyToOne
	@JoinColumn(name="identification_metavalues_id")
	private IdentificationMetavalue identificationMetavalue;

	//bi-directional many-to-one association to IdentificationOutput
	@ManyToOne
	@JoinColumn(name="identifications_id")
	private IdentificationOutput identificationOutput;

	//bi-directional many-to-one association to TaxonomiesAll
	@ManyToOne
	@JoinColumn(name="taxonomies_uuid", referencedColumnName="unique_identifier")
	private Taxonomy taxonomiesAll;

	public IdentifiedObject() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBehavior() {
		return this.behavior;
	}

	public void setBehavior(String behavior) {
		this.behavior = behavior;
	}

	public Integer getCertainity() {
		return this.certainity;
	}

	public void setCertainity(Integer certainity) {
		this.certainity = certainity;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Timestamp getDate() {
		return this.date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Boolean getIndividualIdentified() {
		return this.individualIdentified;
	}

	public void setIndividualIdentified(Boolean individualIdentified) {
		this.individualIdentified = individualIdentified;
	}

	public String getMarkings() {
		return this.markings;
	}

	public void setMarkings(String markings) {
		this.markings = markings;
	}

	public String getRelativeAge() {
		return this.relativeAge;
	}

	public void setRelativeAge(String relativeAge) {
		this.relativeAge = relativeAge;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public List<IdentifiedIndividual> getIdentifiedIndividuals() {
		return this.identifiedIndividuals;
	}

	public void setIdentifiedIndividuals(List<IdentifiedIndividual> identifiedIndividuals) {
		this.identifiedIndividuals = identifiedIndividuals;
	}

	public IdentifiedIndividual addIdentifiedIndividual(IdentifiedIndividual identifiedIndividual) {
		getIdentifiedIndividuals().add(identifiedIndividual);
		identifiedIndividual.setIdentifiedObject(this);

		return identifiedIndividual;
	}

	public IdentifiedIndividual removeIdentifiedIndividual(IdentifiedIndividual identifiedIndividual) {
		getIdentifiedIndividuals().remove(identifiedIndividual);
		identifiedIndividual.setIdentifiedObject(null);

		return identifiedIndividual;
	}

	public IdentificationMetavalue getIdentificationMetavalue() {
		return this.identificationMetavalue;
	}

	public void setIdentificationMetavalue(IdentificationMetavalue identificationMetavalue) {
		this.identificationMetavalue = identificationMetavalue;
	}

	public IdentificationOutput getIdentificationOutput() {
		return this.identificationOutput;
	}

	public void setIdentificationOutput(IdentificationOutput identificationOutput) {
		this.identificationOutput = identificationOutput;
	}

	public Taxonomy getTaxonomiesAll() {
		return this.taxonomiesAll;
	}

	public void setTaxonomiesAll(Taxonomy taxonomiesAll) {
		this.taxonomiesAll = taxonomiesAll;
	}

}