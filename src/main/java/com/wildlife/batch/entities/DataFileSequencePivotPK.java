package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the data_file_sequence_pivot database table.
 * 
 */
@Embeddable
public class DataFileSequencePivotPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="dataFileId", insertable=false, updatable=false)
	private Integer dataFileId;

	@Column(name="sequenceId", insertable=false, updatable=false)
	private Integer sequenceId;

	public DataFileSequencePivotPK() {
	}
	public Integer getDataFileId() {
		return this.dataFileId;
	}
	public void setDataFileId(Integer dataFileId) {
		this.dataFileId = dataFileId;
	}
	public Integer getSequenceId() {
		return this.sequenceId;
	}
	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof DataFileSequencePivotPK)) {
			return false;
		}
		DataFileSequencePivotPK castOther = (DataFileSequencePivotPK)other;
		return 
			this.dataFileId.equals(castOther.dataFileId)
			&& this.sequenceId.equals(castOther.sequenceId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dataFileId.hashCode();
		hash = hash * prime + this.sequenceId.hashCode();
		
		return hash;
	}
}