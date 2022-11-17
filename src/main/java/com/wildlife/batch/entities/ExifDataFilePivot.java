package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the exif_data_file_pivot database table.
 * 
 */
@Entity
@Table(name="exif_data_file_pivot")
@NamedQuery(name="ExifDataFilePivot.findAll", query="SELECT e FROM ExifDataFilePivot e")
public class ExifDataFilePivot implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ExifDataFilePivotPK id;

	private String value;

	//bi-directional many-to-one association to DataFile
	@ManyToOne
	@JoinColumn(name="data_file_id")
	private DataFile dataFile;

	//bi-directional many-to-one association to ExifTag
	@ManyToOne
	@JoinColumn(name="exif_tag_id")
	private ExifTag exifTag;

	public ExifDataFilePivot() {
	}

	public ExifDataFilePivotPK getId() {
		return this.id;
	}

	public void setId(ExifDataFilePivotPK id) {
		this.id = id;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public DataFile getDataFile() {
		return this.dataFile;
	}

	public void setDataFile(DataFile dataFile) {
		this.dataFile = dataFile;
	}

	public ExifTag getExifTag() {
		return this.exifTag;
	}

	public void setExifTag(ExifTag exifTag) {
		this.exifTag = exifTag;
	}

}