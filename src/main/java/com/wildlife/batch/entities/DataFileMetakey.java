package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the data_file_metakeys database table.
 * 
 */
@Entity
@Table(name="data_file_metakeys")
@NamedQuery(name="DataFileMetakey.findAll", query="SELECT d FROM DataFileMetakey d")
public class DataFileMetakey implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="key_name")
	private String keyName;

	@Column(name="key_variable")
	private String keyVariable;

	private String remarks;

	//bi-directional many-to-one association to MediaType
	@ManyToOne
	@JoinColumn(name="media_types_id")
	private MediaType mediaType;

	//bi-directional many-to-one association to DataFileMetavalue
	@OneToMany(mappedBy="dataFileMetakey")
	private List<DataFileMetavalue> dataFileMetavalues;

	public DataFileMetakey() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKeyName() {
		return this.keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getKeyVariable() {
		return this.keyVariable;
	}

	public void setKeyVariable(String keyVariable) {
		this.keyVariable = keyVariable;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public MediaType getMediaType() {
		return this.mediaType;
	}

	public void setMediaType(MediaType mediaType) {
		this.mediaType = mediaType;
	}

	public List<DataFileMetavalue> getDataFileMetavalues() {
		return this.dataFileMetavalues;
	}

	public void setDataFileMetavalues(List<DataFileMetavalue> dataFileMetavalues) {
		this.dataFileMetavalues = dataFileMetavalues;
	}

	public DataFileMetavalue addDataFileMetavalue(DataFileMetavalue dataFileMetavalue) {
		getDataFileMetavalues().add(dataFileMetavalue);
		dataFileMetavalue.setDataFileMetakey(this);

		return dataFileMetavalue;
	}

	public DataFileMetavalue removeDataFileMetavalue(DataFileMetavalue dataFileMetavalue) {
		getDataFileMetavalues().remove(dataFileMetavalue);
		dataFileMetavalue.setDataFileMetakey(null);

		return dataFileMetavalue;
	}

}