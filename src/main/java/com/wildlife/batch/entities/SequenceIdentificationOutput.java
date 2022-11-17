package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the sequence_identification_outputs database table.
 * 
 */
@Entity
@Table(name="sequence_identification_outputs")
@NamedQuery(name="SequenceIdentificationOutput.findAll", query="SELECT s FROM SequenceIdentificationOutput s")
public class SequenceIdentificationOutput implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="blank_yn")
	private Boolean blankYn;

	private Timestamp timestamp;

	//bi-directional many-to-one association to SequenceBoundingBoxe
	@OneToMany(mappedBy="sequenceIdentificationOutput")
	private List<SequenceBoundingBoxe> sequenceBoundingBoxes;

	//bi-directional many-to-one association to IdentificationMethod
	@ManyToOne
	@JoinColumn(name="identification_methods_id")
	private IdentificationMethod identificationMethod;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	@JoinColumn(name="participants_id")
	private Participant participant;

	//bi-directional many-to-one association to Sequence
	@ManyToOne
	private Sequence sequence;

	//bi-directional many-to-one association to SequenceIdentifiedObject
	@OneToMany(mappedBy="sequenceIdentificationOutput")
	private List<SequenceIdentifiedObject> sequenceIdentifiedObjects;

	public SequenceIdentificationOutput() {
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

	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public List<SequenceBoundingBoxe> getSequenceBoundingBoxes() {
		return this.sequenceBoundingBoxes;
	}

	public void setSequenceBoundingBoxes(List<SequenceBoundingBoxe> sequenceBoundingBoxes) {
		this.sequenceBoundingBoxes = sequenceBoundingBoxes;
	}

	public SequenceBoundingBoxe addSequenceBoundingBoxe(SequenceBoundingBoxe sequenceBoundingBoxe) {
		getSequenceBoundingBoxes().add(sequenceBoundingBoxe);
		sequenceBoundingBoxe.setSequenceIdentificationOutput(this);

		return sequenceBoundingBoxe;
	}

	public SequenceBoundingBoxe removeSequenceBoundingBoxe(SequenceBoundingBoxe sequenceBoundingBoxe) {
		getSequenceBoundingBoxes().remove(sequenceBoundingBoxe);
		sequenceBoundingBoxe.setSequenceIdentificationOutput(null);

		return sequenceBoundingBoxe;
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

	public Sequence getSequence() {
		return this.sequence;
	}

	public void setSequence(Sequence sequence) {
		this.sequence = sequence;
	}

	public List<SequenceIdentifiedObject> getSequenceIdentifiedObjects() {
		return this.sequenceIdentifiedObjects;
	}

	public void setSequenceIdentifiedObjects(List<SequenceIdentifiedObject> sequenceIdentifiedObjects) {
		this.sequenceIdentifiedObjects = sequenceIdentifiedObjects;
	}

	public SequenceIdentifiedObject addSequenceIdentifiedObject(SequenceIdentifiedObject sequenceIdentifiedObject) {
		getSequenceIdentifiedObjects().add(sequenceIdentifiedObject);
		sequenceIdentifiedObject.setSequenceIdentificationOutput(this);

		return sequenceIdentifiedObject;
	}

	public SequenceIdentifiedObject removeSequenceIdentifiedObject(SequenceIdentifiedObject sequenceIdentifiedObject) {
		getSequenceIdentifiedObjects().remove(sequenceIdentifiedObject);
		sequenceIdentifiedObject.setSequenceIdentificationOutput(null);

		return sequenceIdentifiedObject;
	}

}