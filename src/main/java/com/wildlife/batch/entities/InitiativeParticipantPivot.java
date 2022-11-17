package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the initiative_participant_pivot database table.
 * 
 */
@Entity
@Table(name="initiative_participant_pivot")
@NamedQuery(name="InitiativeParticipantPivot.findAll", query="SELECT i FROM InitiativeParticipantPivot i")
public class InitiativeParticipantPivot implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InitiativeParticipantPivotPK id;

	@Column(name="is_implicit")
	private Boolean isImplicit;

	//bi-directional many-to-one association to Initiative
	@ManyToOne
	private Initiative initiative;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	private Participant participant;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	public InitiativeParticipantPivot() {
	}

	public InitiativeParticipantPivotPK getId() {
		return this.id;
	}

	public void setId(InitiativeParticipantPivotPK id) {
		this.id = id;
	}

	public Boolean getIsImplicit() {
		return this.isImplicit;
	}

	public void setIsImplicit(Boolean isImplicit) {
		this.isImplicit = isImplicit;
	}

	public Initiative getInitiative() {
		return this.initiative;
	}

	public void setInitiative(Initiative initiative) {
		this.initiative = initiative;
	}

	public Participant getParticipant() {
		return this.participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}