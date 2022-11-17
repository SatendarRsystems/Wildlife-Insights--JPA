package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the sequence database table.
 * 
 */
@Entity
@NamedQuery(name="Sequence.findAll", query="SELECT s FROM Sequence s")
public class Sequence implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="external_sequence_id")
	private String externalSequenceId;

	@Column(name="latest_sequence_identification_outputs_id")
	private Integer latestSequenceIdentificationOutputsId;

	@Column(name="sequence_end_time")
	private Timestamp sequenceEndTime;

	@Column(name="sequence_start_time")
	private Timestamp sequenceStartTime;

	//bi-directional many-to-one association to Deployment
	@ManyToOne
	private Deployment deployment;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

	//bi-directional many-to-one association to SequenceIdentificationOutput
	@OneToMany(mappedBy="sequence")
	private List<SequenceIdentificationOutput> sequenceIdentificationOutputs;

	public Sequence() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getExternalSequenceId() {
		return this.externalSequenceId;
	}

	public void setExternalSequenceId(String externalSequenceId) {
		this.externalSequenceId = externalSequenceId;
	}

	public Integer getLatestSequenceIdentificationOutputsId() {
		return this.latestSequenceIdentificationOutputsId;
	}

	public void setLatestSequenceIdentificationOutputsId(Integer latestSequenceIdentificationOutputsId) {
		this.latestSequenceIdentificationOutputsId = latestSequenceIdentificationOutputsId;
	}

	public Timestamp getSequenceEndTime() {
		return this.sequenceEndTime;
	}

	public void setSequenceEndTime(Timestamp sequenceEndTime) {
		this.sequenceEndTime = sequenceEndTime;
	}

	public Timestamp getSequenceStartTime() {
		return this.sequenceStartTime;
	}

	public void setSequenceStartTime(Timestamp sequenceStartTime) {
		this.sequenceStartTime = sequenceStartTime;
	}

	public Deployment getDeployment() {
		return this.deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<SequenceIdentificationOutput> getSequenceIdentificationOutputs() {
		return this.sequenceIdentificationOutputs;
	}

	public void setSequenceIdentificationOutputs(List<SequenceIdentificationOutput> sequenceIdentificationOutputs) {
		this.sequenceIdentificationOutputs = sequenceIdentificationOutputs;
	}

	public SequenceIdentificationOutput addSequenceIdentificationOutput(SequenceIdentificationOutput sequenceIdentificationOutput) {
		getSequenceIdentificationOutputs().add(sequenceIdentificationOutput);
		sequenceIdentificationOutput.setSequence(this);

		return sequenceIdentificationOutput;
	}

	public SequenceIdentificationOutput removeSequenceIdentificationOutput(SequenceIdentificationOutput sequenceIdentificationOutput) {
		getSequenceIdentificationOutputs().remove(sequenceIdentificationOutput);
		sequenceIdentificationOutput.setSequence(null);

		return sequenceIdentificationOutput;
	}

}