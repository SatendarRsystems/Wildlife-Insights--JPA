package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the sequence_identified_objects database table.
 * 
 */
@Entity
@Table(name="sequence_identified_objects")
@NamedQuery(name="SequenceIdentifiedObject.findAll", query="SELECT s FROM SequenceIdentifiedObject s")
public class SequenceIdentifiedObject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String behavior;

	private Integer certainity;

	private BigDecimal confidence;

	private Integer count;

	private Timestamp date;

	@Column(name="individual_identified")
	private Boolean individualIdentified;

	private String markings;

	@Column(name="model_version")
	private String modelVersion;

	@Column(name="relative_age")
	private String relativeAge;

	private String remarks;

	private String sex;

	@Column(name="taxon_id")
	private Integer taxonId;

	//bi-directional many-to-one association to IdentificationMetavalue
	@ManyToOne
	@JoinColumn(name="identification_metavalues_id")
	private IdentificationMetavalue identificationMetavalue;

	//bi-directional many-to-one association to SequenceIdentificationOutput
	@ManyToOne
	@JoinColumn(name="identifications_id")
	private SequenceIdentificationOutput sequenceIdentificationOutput;

	//bi-directional many-to-one association to TaxonomiesAll
	@ManyToOne
	@JoinColumn(name="taxonomies_uuid", referencedColumnName="unique_identifier")
	private Taxonomy taxonomiesAll;

	public SequenceIdentifiedObject() {
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

	public BigDecimal getConfidence() {
		return this.confidence;
	}

	public void setConfidence(BigDecimal confidence) {
		this.confidence = confidence;
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

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
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

	public Integer getTaxonId() {
		return this.taxonId;
	}

	public void setTaxonId(Integer taxonId) {
		this.taxonId = taxonId;
	}

	public IdentificationMetavalue getIdentificationMetavalue() {
		return this.identificationMetavalue;
	}

	public void setIdentificationMetavalue(IdentificationMetavalue identificationMetavalue) {
		this.identificationMetavalue = identificationMetavalue;
	}

	public SequenceIdentificationOutput getSequenceIdentificationOutput() {
		return this.sequenceIdentificationOutput;
	}

	public void setSequenceIdentificationOutput(SequenceIdentificationOutput sequenceIdentificationOutput) {
		this.sequenceIdentificationOutput = sequenceIdentificationOutput;
	}

	public Taxonomy getTaxonomiesAll() {
		return this.taxonomiesAll;
	}

	public void setTaxonomiesAll(Taxonomy taxonomiesAll) {
		this.taxonomiesAll = taxonomiesAll;
	}

}