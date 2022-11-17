package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the identification_methods database table.
 * 
 */
@Entity
@Table(name="identification_methods")
@NamedQuery(name="IdentificationMethod.findAll", query="SELECT i FROM IdentificationMethod i")
public class IdentificationMethod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="default_model")
	private Boolean defaultModel;

	private String endpoint;

	@Column(name="id_threshold")
	private Double idThreshold;

	@Column(name="identification_type")
	private String identificationType;

	@Column(name="ml_identification")
	private Boolean mlIdentification;

	@Column(name="type_name")
	private String typeName;

	//bi-directional many-to-one association to IdentificationMethodTaxonomyPivot
	@OneToMany(mappedBy="identificationMethod")
	private List<IdentificationMethodTaxonomyPivot> identificationMethodTaxonomyPivots;

	//bi-directional many-to-one association to IdentificationOutput
	@OneToMany(mappedBy="identificationMethod")
	private List<IdentificationOutput> identificationOutputs;

	//bi-directional many-to-one association to SequenceIdentificationOutput
	@OneToMany(mappedBy="identificationMethod")
	private List<SequenceIdentificationOutput> sequenceIdentificationOutputs;

	public IdentificationMethod() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getDefaultModel() {
		return this.defaultModel;
	}

	public void setDefaultModel(Boolean defaultModel) {
		this.defaultModel = defaultModel;
	}

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public Double getIdThreshold() {
		return this.idThreshold;
	}

	public void setIdThreshold(Double idThreshold) {
		this.idThreshold = idThreshold;
	}

	public String getIdentificationType() {
		return this.identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public Boolean getMlIdentification() {
		return this.mlIdentification;
	}

	public void setMlIdentification(Boolean mlIdentification) {
		this.mlIdentification = mlIdentification;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public List<IdentificationMethodTaxonomyPivot> getIdentificationMethodTaxonomyPivots() {
		return this.identificationMethodTaxonomyPivots;
	}

	public void setIdentificationMethodTaxonomyPivots(List<IdentificationMethodTaxonomyPivot> identificationMethodTaxonomyPivots) {
		this.identificationMethodTaxonomyPivots = identificationMethodTaxonomyPivots;
	}

	public IdentificationMethodTaxonomyPivot addIdentificationMethodTaxonomyPivot(IdentificationMethodTaxonomyPivot identificationMethodTaxonomyPivot) {
		getIdentificationMethodTaxonomyPivots().add(identificationMethodTaxonomyPivot);
		identificationMethodTaxonomyPivot.setIdentificationMethod(this);

		return identificationMethodTaxonomyPivot;
	}

	public IdentificationMethodTaxonomyPivot removeIdentificationMethodTaxonomyPivot(IdentificationMethodTaxonomyPivot identificationMethodTaxonomyPivot) {
		getIdentificationMethodTaxonomyPivots().remove(identificationMethodTaxonomyPivot);
		identificationMethodTaxonomyPivot.setIdentificationMethod(null);

		return identificationMethodTaxonomyPivot;
	}

	public List<IdentificationOutput> getIdentificationOutputs() {
		return this.identificationOutputs;
	}

	public void setIdentificationOutputs(List<IdentificationOutput> identificationOutputs) {
		this.identificationOutputs = identificationOutputs;
	}

	public IdentificationOutput addIdentificationOutput(IdentificationOutput identificationOutput) {
		getIdentificationOutputs().add(identificationOutput);
		identificationOutput.setIdentificationMethod(this);

		return identificationOutput;
	}

	public IdentificationOutput removeIdentificationOutput(IdentificationOutput identificationOutput) {
		getIdentificationOutputs().remove(identificationOutput);
		identificationOutput.setIdentificationMethod(null);

		return identificationOutput;
	}

	public List<SequenceIdentificationOutput> getSequenceIdentificationOutputs() {
		return this.sequenceIdentificationOutputs;
	}

	public void setSequenceIdentificationOutputs(List<SequenceIdentificationOutput> sequenceIdentificationOutputs) {
		this.sequenceIdentificationOutputs = sequenceIdentificationOutputs;
	}

	public SequenceIdentificationOutput addSequenceIdentificationOutput(SequenceIdentificationOutput sequenceIdentificationOutput) {
		getSequenceIdentificationOutputs().add(sequenceIdentificationOutput);
		sequenceIdentificationOutput.setIdentificationMethod(this);

		return sequenceIdentificationOutput;
	}

	public SequenceIdentificationOutput removeSequenceIdentificationOutput(SequenceIdentificationOutput sequenceIdentificationOutput) {
		getSequenceIdentificationOutputs().remove(sequenceIdentificationOutput);
		sequenceIdentificationOutput.setIdentificationMethod(null);

		return sequenceIdentificationOutput;
	}

}