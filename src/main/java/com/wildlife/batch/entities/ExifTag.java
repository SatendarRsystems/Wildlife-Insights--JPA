package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the exif_tags database table.
 * 
 */
@Entity
@Table(name="exif_tags")
@NamedQuery(name="ExifTag.findAll", query="SELECT e FROM ExifTag e")
public class ExifTag implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String datatype;

	private String description;

	private String group;

	private String ifd;

	private String key;

	@Column(name="tag_dec")
	private String tagDec;

	@Column(name="tag_hex")
	private String tagHex;

	@Column(name="tag_name")
	private String tagName;

	//bi-directional many-to-one association to ExifDataFilePivot
	@OneToMany(mappedBy="exifTag")
	private List<ExifDataFilePivot> exifDataFilePivots;

	public ExifTag() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDatatype() {
		return this.datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGroup() {
		return this.group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getIfd() {
		return this.ifd;
	}

	public void setIfd(String ifd) {
		this.ifd = ifd;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getTagDec() {
		return this.tagDec;
	}

	public void setTagDec(String tagDec) {
		this.tagDec = tagDec;
	}

	public String getTagHex() {
		return this.tagHex;
	}

	public void setTagHex(String tagHex) {
		this.tagHex = tagHex;
	}

	public String getTagName() {
		return this.tagName;
	}

	public void setTagName(String tagName) {
		this.tagName = tagName;
	}

	public List<ExifDataFilePivot> getExifDataFilePivots() {
		return this.exifDataFilePivots;
	}

	public void setExifDataFilePivots(List<ExifDataFilePivot> exifDataFilePivots) {
		this.exifDataFilePivots = exifDataFilePivots;
	}

	public ExifDataFilePivot addExifDataFilePivot(ExifDataFilePivot exifDataFilePivot) {
		getExifDataFilePivots().add(exifDataFilePivot);
		exifDataFilePivot.setExifTag(this);

		return exifDataFilePivot;
	}

	public ExifDataFilePivot removeExifDataFilePivot(ExifDataFilePivot exifDataFilePivot) {
		getExifDataFilePivots().remove(exifDataFilePivot);
		exifDataFilePivot.setExifTag(null);

		return exifDataFilePivot;
	}

}