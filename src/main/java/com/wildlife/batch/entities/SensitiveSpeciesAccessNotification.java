package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sensitive_species_access_notifications database table.
 * 
 */
@Entity
@Table(name="sensitive_species_access_notifications")
@NamedQuery(name="SensitiveSpeciesAccessNotification.findAll", query="SELECT s FROM SensitiveSpeciesAccessNotification s")
public class SensitiveSpeciesAccessNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="approval_timestamp")
	private Timestamp approvalTimestamp;

	@Column(name="project_id")
	private Integer projectId;

	@Column(name="request_approval_message")
	private String requestApprovalMessage;

	@Column(name="requested_timestamp")
	private Timestamp requestedTimestamp;

	private String status;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	private Participant participant;

	public SensitiveSpeciesAccessNotification() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getApprovalTimestamp() {
		return this.approvalTimestamp;
	}

	public void setApprovalTimestamp(Timestamp approvalTimestamp) {
		this.approvalTimestamp = approvalTimestamp;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getRequestApprovalMessage() {
		return this.requestApprovalMessage;
	}

	public void setRequestApprovalMessage(String requestApprovalMessage) {
		this.requestApprovalMessage = requestApprovalMessage;
	}

	public Timestamp getRequestedTimestamp() {
		return this.requestedTimestamp;
	}

	public void setRequestedTimestamp(Timestamp requestedTimestamp) {
		this.requestedTimestamp = requestedTimestamp;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

}