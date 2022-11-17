package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the batch_uploads database table.
 * 
 */
@Entity
@Table(name="batch_uploads")
@NamedQuery(name="BatchUpload.findAll", query="SELECT b FROM BatchUpload b")
public class BatchUpload implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String status;

	@Column(name="submitted_timestamp")
	private Timestamp submittedTimestamp;

	private String target;

	//bi-directional many-to-one association to Organization
	@ManyToOne
	@JoinColumn(name="organizations_id")
	private Organization organization;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	private Participant participant;

	public BatchUpload() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getSubmittedTimestamp() {
		return this.submittedTimestamp;
	}

	public void setSubmittedTimestamp(Timestamp submittedTimestamp) {
		this.submittedTimestamp = submittedTimestamp;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

}