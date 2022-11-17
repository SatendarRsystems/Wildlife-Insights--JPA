package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sequence_temporary database table.
 * 
 */
@Entity
@Table(name="sequence_temporary")
@NamedQuery(name="SequenceTemporary.findAll", query="SELECT s FROM SequenceTemporary s")
public class SequenceTemporary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="deployment_id")
	private Integer deploymentId;

	@Column(name="external_sequence_id")
	private String externalSequenceId;

	@Column(name="latest_sequence_identification_outputs_id")
	private Integer latestSequenceIdentificationOutputsId;

	@Column(name="project_id")
	private Integer projectId;

	@Column(name="sequence_end_time")
	private Timestamp sequenceEndTime;

	@Column(name="sequence_start_time")
	private Timestamp sequenceStartTime;

	public SequenceTemporary() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDeploymentId() {
		return this.deploymentId;
	}

	public void setDeploymentId(Integer deploymentId) {
		this.deploymentId = deploymentId;
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

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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

}