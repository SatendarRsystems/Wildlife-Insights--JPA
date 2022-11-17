package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the unique_identified_objects_of_identification_outputs database table.
 * 
 */
@Entity
@Table(name="unique_identified_objects_of_identification_outputs")
@NamedQuery(name="UniqueIdentifiedObjectsOfIdentificationOutput.findAll", query="SELECT u FROM UniqueIdentifiedObjectsOfIdentificationOutput u")
public class UniqueIdentifiedObjectsOfIdentificationOutput implements Serializable {
	private static final long serialVersionUID = 1L;

	private String behavior;

	private Integer certainity;

	@Id
	private Integer id;

	@Column(name="identifications_id")
	private Integer identificationsId;

	@Column(name="individual_identified")
	private Boolean individualIdentified;

	private String markings;

	@Column(name="number_of_animals")
	private Long numberOfAnimals;

	@Column(name="relative_age")
	private String relativeAge;

	private String remarks;

	private String sex;

	@Column(name="taxonomies_uuid")
	private String taxonomiesUuid;

	public UniqueIdentifiedObjectsOfIdentificationOutput() {
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

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdentificationsId() {
		return this.identificationsId;
	}

	public void setIdentificationsId(Integer identificationsId) {
		this.identificationsId = identificationsId;
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

	public Long getNumberOfAnimals() {
		return this.numberOfAnimals;
	}

	public void setNumberOfAnimals(Long numberOfAnimals) {
		this.numberOfAnimals = numberOfAnimals;
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

	public String getTaxonomiesUuid() {
		return this.taxonomiesUuid;
	}

	public void setTaxonomiesUuid(String taxonomiesUuid) {
		this.taxonomiesUuid = taxonomiesUuid;
	}

}