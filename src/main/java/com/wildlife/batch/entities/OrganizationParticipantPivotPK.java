package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the organization_participant_pivot database table.
 * 
 */
@Embeddable
public class OrganizationParticipantPivotPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="participant")
	private Integer participantId;

	@Column(name="role")
	private Integer roleId;

	@Column(name="organization")
	private Integer organizationId;

	public OrganizationParticipantPivotPK() {
	}
	public Integer getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}
	public Integer getRoleId() {
		return this.roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public Integer getOrganizationId() {
		return this.organizationId;
	}
	public void setOrganizationId(Integer organizationId) {
		this.organizationId = organizationId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrganizationParticipantPivotPK)) {
			return false;
		}
		OrganizationParticipantPivotPK castOther = (OrganizationParticipantPivotPK)other;
		return 
			this.participantId.equals(castOther.participantId)
			&& this.roleId.equals(castOther.roleId)
			&& this.organizationId.equals(castOther.organizationId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.participantId.hashCode();
		hash = hash * prime + this.roleId.hashCode();
		hash = hash * prime + this.organizationId.hashCode();
		
		return hash;
	}
}