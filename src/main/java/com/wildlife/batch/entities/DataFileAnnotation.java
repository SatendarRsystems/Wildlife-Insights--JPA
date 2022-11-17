package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the data_file_annotations database table.
 * 
 */
@Entity
@Table(name="data_file_annotations")
@NamedQuery(name="DataFileAnnotation.findAll", query="SELECT d FROM DataFileAnnotation d")
public class DataFileAnnotation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String description;

	@Column(name="favorite_yn")
	private Boolean favoriteYn;

	@Column(name="flag_indentification")
	private Boolean flagIndentification;

	private String identifications;

	private Integer rating;

	private String remarks;

	//bi-directional many-to-one association to DataFile
	@ManyToOne
	@JoinColumn(name="data_file_id")
	private DataFile dataFile;

	public DataFileAnnotation() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getFavoriteYn() {
		return this.favoriteYn;
	}

	public void setFavoriteYn(Boolean favoriteYn) {
		this.favoriteYn = favoriteYn;
	}

	public Boolean getFlagIndentification() {
		return this.flagIndentification;
	}

	public void setFlagIndentification(Boolean flagIndentification) {
		this.flagIndentification = flagIndentification;
	}

	public String getIdentifications() {
		return this.identifications;
	}

	public void setIdentifications(String identifications) {
		this.identifications = identifications;
	}

	public Integer getRating() {
		return this.rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public DataFile getDataFile() {
		return this.dataFile;
	}

	public void setDataFile(DataFile dataFile) {
		this.dataFile = dataFile;
	}

}