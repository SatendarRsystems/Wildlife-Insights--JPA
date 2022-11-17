package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the data_file_sequence_pivot database table.
 * 
 */
@Entity
@Table(name="data_file_sequence_pivot")
@NamedQuery(name="DataFileSequencePivot.findAll", query="SELECT d FROM DataFileSequencePivot d")
public class DataFileSequencePivot implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private DataFileSequencePivotPK id;

	private Integer position;

	//bi-directional many-to-one association to DataFile
	@ManyToOne
	@JoinColumn(name="data_file_id")
	private DataFile dataFile;

	public DataFileSequencePivot() {
	}

	public DataFileSequencePivotPK getId() {
		return this.id;
	}

	public void setId(DataFileSequencePivotPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return this.position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public DataFile getDataFile() {
		return this.dataFile;
	}

	public void setDataFile(DataFile dataFile) {
		this.dataFile = dataFile;
	}

}