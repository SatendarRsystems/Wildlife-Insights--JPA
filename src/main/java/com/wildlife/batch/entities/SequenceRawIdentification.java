package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the sequence_raw_identification database table.
 * 
 */
@Entity
@Table(name="sequence_raw_identification")
@NamedQuery(name="SequenceRawIdentification.findAll", query="SELECT s FROM SequenceRawIdentification s")
public class SequenceRawIdentification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="data_file_id")
	private Integer dataFileId;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="identification")
	private String identification;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional one-to-one association to DataFile
	@OneToOne
	@JoinColumn(name="data_file_id")
	private DataFile dataFile;

	public SequenceRawIdentification() {
	}

	public Integer getDataFileId() {
		return this.dataFileId;
	}

	public void setDataFileId(Integer dataFileId) {
		this.dataFileId = dataFileId;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public DataFile getDataFile() {
		return this.dataFile;
	}

	public void setDataFile(DataFile dataFile) {
		this.dataFile = dataFile;
	}

}