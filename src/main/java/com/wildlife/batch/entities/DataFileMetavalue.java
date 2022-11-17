package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the data_file_metavalues database table.
 * 
 */
@Entity
@Table(name="data_file_metavalues")
@NamedQuery(name="DataFileMetavalue.findAll", query="SELECT d FROM DataFileMetavalue d")
public class DataFileMetavalue implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String remarks;

	private String value;

	//bi-directional many-to-one association to DataFileMetakey
	@ManyToOne
	@JoinColumn(name="key_id")
	private DataFileMetakey dataFileMetakey;

	//bi-directional many-to-one association to DataFile
	@ManyToOne
	@JoinColumn(name="data_file_id")
	private DataFile dataFile;

	public DataFileMetavalue() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public DataFileMetakey getDataFileMetakey() {
		return this.dataFileMetakey;
	}

	public void setDataFileMetakey(DataFileMetakey dataFileMetakey) {
		this.dataFileMetakey = dataFileMetakey;
	}

	public DataFile getDataFile() {
		return this.dataFile;
	}

	public void setDataFile(DataFile dataFile) {
		this.dataFile = dataFile;
	}

}