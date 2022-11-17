package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the identification_metavalues database table.
 * 
 */
@Entity
@Table(name="identification_metavalues")
@NamedQuery(name="IdentificationMetavalue.findAll", query="SELECT i FROM IdentificationMetavalue i")
public class IdentificationMetavalue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String remarks;

	private String value;

	//bi-directional many-to-one association to IdentificationMetakey
	@ManyToOne
	@JoinColumn(name="key_id")
	private IdentificationMetakey identificationMetakey;

	//bi-directional many-to-one association to IdentifiedObject
	@OneToMany(mappedBy="identificationMetavalue")
	private List<IdentifiedObject> identifiedObjects;

	//bi-directional many-to-one association to SequenceIdentifiedObject
	@OneToMany(mappedBy="identificationMetavalue")
	private List<SequenceIdentifiedObject> sequenceIdentifiedObjects;

	public IdentificationMetavalue() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public IdentificationMetakey getIdentificationMetakey() {
		return this.identificationMetakey;
	}

	public void setIdentificationMetakey(IdentificationMetakey identificationMetakey) {
		this.identificationMetakey = identificationMetakey;
	}

	public List<IdentifiedObject> getIdentifiedObjects() {
		return this.identifiedObjects;
	}

	public void setIdentifiedObjects(List<IdentifiedObject> identifiedObjects) {
		this.identifiedObjects = identifiedObjects;
	}

	public IdentifiedObject addIdentifiedObject(IdentifiedObject identifiedObject) {
		getIdentifiedObjects().add(identifiedObject);
		identifiedObject.setIdentificationMetavalue(this);

		return identifiedObject;
	}

	public IdentifiedObject removeIdentifiedObject(IdentifiedObject identifiedObject) {
		getIdentifiedObjects().remove(identifiedObject);
		identifiedObject.setIdentificationMetavalue(null);

		return identifiedObject;
	}

	public List<SequenceIdentifiedObject> getSequenceIdentifiedObjects() {
		return this.sequenceIdentifiedObjects;
	}

	public void setSequenceIdentifiedObjects(List<SequenceIdentifiedObject> sequenceIdentifiedObjects) {
		this.sequenceIdentifiedObjects = sequenceIdentifiedObjects;
	}

	public SequenceIdentifiedObject addSequenceIdentifiedObject(SequenceIdentifiedObject sequenceIdentifiedObject) {
		getSequenceIdentifiedObjects().add(sequenceIdentifiedObject);
		sequenceIdentifiedObject.setIdentificationMetavalue(this);

		return sequenceIdentifiedObject;
	}

	public SequenceIdentifiedObject removeSequenceIdentifiedObject(SequenceIdentifiedObject sequenceIdentifiedObject) {
		getSequenceIdentifiedObjects().remove(sequenceIdentifiedObject);
		sequenceIdentifiedObject.setIdentificationMetavalue(null);

		return sequenceIdentifiedObject;
	}

}