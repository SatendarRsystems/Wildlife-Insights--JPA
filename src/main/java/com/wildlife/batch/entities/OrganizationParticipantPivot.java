package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the organization_participant_pivot database table.
 * 
 */
@Entity
@Table(name="organization_participant_pivot")
@NamedQuery(name="OrganizationParticipantPivot.findAll", query="SELECT o FROM OrganizationParticipantPivot o")
public class OrganizationParticipantPivot implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrganizationParticipantPivotPK id;

	//bi-directional many-to-one association to Organization
	@ManyToOne
	private Organization organization;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	private Participant participant;

	//bi-directional many-to-one association to Role
	@ManyToOne
	private Role role;

	public OrganizationParticipantPivot() {
	}

	public OrganizationParticipantPivotPK getId() {
		return this.id;
	}

	public void setId(OrganizationParticipantPivotPK id) {
		this.id = id;
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

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}