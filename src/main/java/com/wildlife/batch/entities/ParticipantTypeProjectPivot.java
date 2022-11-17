package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the participant_type_project_pivot database table.
 * 
 */
@Entity
@Table(name="participant_type_project_pivot")
@NamedQuery(name="ParticipantTypeProjectPivot.findAll", query="SELECT p FROM ParticipantTypeProjectPivot p")
public class ParticipantTypeProjectPivot implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ParticipantTypeProjectPivotPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Column(name="is_implicit")
	private Boolean isImplicit;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private String status;

	//bi-directional many-to-one association to ParticipantType
	@ManyToOne
	@JoinColumn(name="participant_type_id")
	private ParticipantType participantType;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	private Participant participant;

	//bi-directional many-to-one association to Project
	@ManyToOne
	private Project project;

	//bi-directional many-to-one association to Role
	@ManyToOne
	@JoinColumn(name="roles_id")
	private Role role;

	public ParticipantTypeProjectPivot() {
	}

	public ParticipantTypeProjectPivotPK getId() {
		return this.id;
	}

	public void setId(ParticipantTypeProjectPivotPK id) {
		this.id = id;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Boolean getIsImplicit() {
		return this.isImplicit;
	}

	public void setIsImplicit(Boolean isImplicit) {
		this.isImplicit = isImplicit;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ParticipantType getParticipantType() {
		return this.participantType;
	}

	public void setParticipantType(ParticipantType participantType) {
		this.participantType = participantType;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}