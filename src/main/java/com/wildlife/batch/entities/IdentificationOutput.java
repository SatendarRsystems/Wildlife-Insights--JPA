package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the identification_outputs database table.
 * 
 */
@Entity
@Table(name="identification_outputs")
@NamedQuery(name="IdentificationOutput.findAll", query="SELECT i FROM IdentificationOutput i")
public class IdentificationOutput implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="blank_yn")
	private Boolean blankYn;

	private BigDecimal confidence;

	@Column(name="model_version")
	private String modelVersion;

	private Timestamp timestamp;

	//bi-directional many-to-one association to BoundingBoxe
	@OneToMany(mappedBy="identificationOutput")
	private List<BoundingBoxe> boundingBoxes;

	//bi-directional many-to-one association to DataFile
	@ManyToOne
	@JoinColumn(name="data_file_id")
	private DataFile dataFile;

	//bi-directional many-to-one association to IdentificationMethod
	@ManyToOne
	@JoinColumn(name="identification_methods_id")
	private IdentificationMethod identificationMethod;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	@JoinColumn(name="participants_id")
	private Participant participant;

	//bi-directional many-to-one association to IdentifiedObject
	@OneToMany(mappedBy="identificationOutput")
	private List<IdentifiedObject> identifiedObjects;

	public IdentificationOutput() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getBlankYn() {
		return this.blankYn;
	}

	public void setBlankYn(Boolean blankYn) {
		this.blankYn = blankYn;
	}

	public BigDecimal getConfidence() {
		return this.confidence;
	}

	public void setConfidence(BigDecimal confidence) {
		this.confidence = confidence;
	}

	public String getModelVersion() {
		return this.modelVersion;
	}

	public void setModelVersion(String modelVersion) {
		this.modelVersion = modelVersion;
	}

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public List<BoundingBoxe> getBoundingBoxes() {
		return this.boundingBoxes;
	}

	public void setBoundingBoxes(List<BoundingBoxe> boundingBoxes) {
		this.boundingBoxes = boundingBoxes;
	}

	public BoundingBoxe addBoundingBoxe(BoundingBoxe boundingBoxe) {
		getBoundingBoxes().add(boundingBoxe);
		boundingBoxe.setIdentificationOutput(this);

		return boundingBoxe;
	}

	public BoundingBoxe removeBoundingBoxe(BoundingBoxe boundingBoxe) {
		getBoundingBoxes().remove(boundingBoxe);
		boundingBoxe.setIdentificationOutput(null);

		return boundingBoxe;
	}

	public DataFile getDataFile() {
		return this.dataFile;
	}

	public void setDataFile(DataFile dataFile) {
		this.dataFile = dataFile;
	}

	public IdentificationMethod getIdentificationMethod() {
		return this.identificationMethod;
	}

	public void setIdentificationMethod(IdentificationMethod identificationMethod) {
		this.identificationMethod = identificationMethod;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public List<IdentifiedObject> getIdentifiedObjects() {
		return this.identifiedObjects;
	}

	public void setIdentifiedObjects(List<IdentifiedObject> identifiedObjects) {
		this.identifiedObjects = identifiedObjects;
	}

	public IdentifiedObject addIdentifiedObject(IdentifiedObject identifiedObject) {
		getIdentifiedObjects().add(identifiedObject);
		identifiedObject.setIdentificationOutput(this);

		return identifiedObject;
	}

	public IdentifiedObject removeIdentifiedObject(IdentifiedObject identifiedObject) {
		getIdentifiedObjects().remove(identifiedObject);
		identifiedObject.setIdentificationOutput(null);

		return identifiedObject;
	}

}