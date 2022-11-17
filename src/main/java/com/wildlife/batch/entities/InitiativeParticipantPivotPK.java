package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the initiative_participant_pivot database table.
 * 
 */
@Embeddable
public class InitiativeParticipantPivotPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="participantid", insertable=false, updatable=false)
	private Integer participantId;

	@Column(name="initiativeid", insertable=false, updatable=false)
	private Integer initiativeId;

	public InitiativeParticipantPivotPK() {
	}
	public Integer getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}
	public Integer getInitiativeId() {
		return this.initiativeId;
	}
	public void setInitiativeId(Integer initiativeId) {
		this.initiativeId = initiativeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InitiativeParticipantPivotPK)) {
			return false;
		}
		InitiativeParticipantPivotPK castOther = (InitiativeParticipantPivotPK)other;
		return 
			this.participantId.equals(castOther.participantId)
			&& this.initiativeId.equals(castOther.initiativeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.participantId.hashCode();
		hash = hash * prime + this.initiativeId.hashCode();
		
		return hash;
	}
}