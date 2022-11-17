package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the media_types database table.
 * 
 */
@Entity
@Table(name="media_types")
@NamedQuery(name="MediaType.findAll", query="SELECT m FROM MediaType m")
public class MediaType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="created_at")
	private Timestamp createdAt;

	private String mime;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to DataFileMetakey
	@OneToMany(mappedBy="mediaType")
	private List<DataFileMetakey> dataFileMetakeys;

	//bi-directional many-to-one association to DataFile
	@OneToMany(mappedBy="mediaType")
	private List<DataFile> dataFiles;

	//bi-directional many-to-many association to Sensor
	//@ManyToMany(mappedBy="mediaTypes")
	//TODO Satendar
	//private List<Sensor> sensors;

	public MediaType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getMime() {
		return this.mime;
	}

	public void setMime(String mime) {
		this.mime = mime;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<DataFileMetakey> getDataFileMetakeys() {
		return this.dataFileMetakeys;
	}

	public void setDataFileMetakeys(List<DataFileMetakey> dataFileMetakeys) {
		this.dataFileMetakeys = dataFileMetakeys;
	}

	public DataFileMetakey addDataFileMetakey(DataFileMetakey dataFileMetakey) {
		getDataFileMetakeys().add(dataFileMetakey);
		dataFileMetakey.setMediaType(this);

		return dataFileMetakey;
	}

	public DataFileMetakey removeDataFileMetakey(DataFileMetakey dataFileMetakey) {
		getDataFileMetakeys().remove(dataFileMetakey);
		dataFileMetakey.setMediaType(null);

		return dataFileMetakey;
	}

	public List<DataFile> getDataFiles() {
		return this.dataFiles;
	}

	public void setDataFiles(List<DataFile> dataFiles) {
		this.dataFiles = dataFiles;
	}

	public DataFile addDataFile(DataFile dataFile) {
		getDataFiles().add(dataFile);
		dataFile.setMediaType(this);

		return dataFile;
	}

	public DataFile removeDataFile(DataFile dataFile) {
		getDataFiles().remove(dataFile);
		dataFile.setMediaType(null);

		return dataFile;
	}

	/*
	 * public List<Sensor> getSensors() { return this.sensors; }
	 * 
	 * public void setSensors(List<Sensor> sensors) { this.sensors = sensors; }
	 */

}