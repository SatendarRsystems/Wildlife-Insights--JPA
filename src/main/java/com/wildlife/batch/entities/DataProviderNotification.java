package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the data_provider_notifications database table.
 * 
 */
@Entity
@Table(name="data_provider_notifications")
@NamedQuery(name="DataProviderNotification.findAll", query="SELECT d FROM DataProviderNotification d")
public class DataProviderNotification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="approval_timestamp")
	private Timestamp approvalTimestamp;

	@Column(name="email_message")
	private String emailMessage;

	@Column(name="email_sub")
	private String emailSub;

	@Column(name="project_id")
	private Integer projectId;

	@Column(name="requested_timestamp")
	private Timestamp requestedTimestamp;

	private String status;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	private Participant participant;

	public DataProviderNotification() {
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

	public String getEmailMessage() {
		return this.emailMessage;
	}

	public void setEmailMessage(String emailMessage) {
		this.emailMessage = emailMessage;
	}

	public String getEmailSub() {
		return this.emailSub;
	}

	public void setEmailSub(String emailSub) {
		this.emailSub = emailSub;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
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