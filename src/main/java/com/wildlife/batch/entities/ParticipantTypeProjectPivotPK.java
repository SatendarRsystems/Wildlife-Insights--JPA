package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the participant_type_project_pivot database table.
 * 
 */
@Embeddable
public class ParticipantTypeProjectPivotPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="participantid", insertable=false, updatable=false)
	private Integer participantId;

	@Column(name="projectid", insertable=false, updatable=false)
	private Integer projectId;

	public ParticipantTypeProjectPivotPK() {
	}
	public Integer getParticipantId() {
		return this.participantId;
	}
	public void setParticipantId(Integer participantId) {
		this.participantId = participantId;
	}
	public Integer getProjectId() {
		return this.projectId;
	}
	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ParticipantTypeProjectPivotPK)) {
			return false;
		}
		ParticipantTypeProjectPivotPK castOther = (ParticipantTypeProjectPivotPK)other;
		return 
			this.participantId.equals(castOther.participantId)
			&& this.projectId.equals(castOther.projectId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.participantId.hashCode();
		hash = hash * prime + this.projectId.hashCode();
		
		return hash;
	}
}