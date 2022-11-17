package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the summary_data_cache database table.
 * 
 */
@Entity
@Table(name="summary_data_cache")
@NamedQuery(name="SummaryDataCache.findAll", query="SELECT s FROM SummaryDataCache s")
public class SummaryDataCache implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="key_id")
	private String keyId;

	@Column(name="blank_images_count_data")
	private String blankImagesCountData;

	private String entitytype;

	@Column(name="images_per_species_data")
	private String imagesPerSpeciesData;

	@Column(name="last_changed")
	private Timestamp lastChanged;

	@Column(name="total_images_count_data")
	private String totalImagesCountData;

	@Column(name="unknown_images_count_data")
	private String unknownImagesCountData;

	@Column(name="wildlife_images_count_data")
	private String wildlifeImagesCountData;

	public SummaryDataCache() {
	}

	public String getKeyId() {
		return this.keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
	}

	public String getBlankImagesCountData() {
		return this.blankImagesCountData;
	}

	public void setBlankImagesCountData(String blankImagesCountData) {
		this.blankImagesCountData = blankImagesCountData;
	}

	public String getEntitytype() {
		return this.entitytype;
	}

	public void setEntitytype(String entitytype) {
		this.entitytype = entitytype;
	}

	public String getImagesPerSpeciesData() {
		return this.imagesPerSpeciesData;
	}

	public void setImagesPerSpeciesData(String imagesPerSpeciesData) {
		this.imagesPerSpeciesData = imagesPerSpeciesData;
	}

	public Timestamp getLastChanged() {
		return this.lastChanged;
	}

	public void setLastChanged(Timestamp lastChanged) {
		this.lastChanged = lastChanged;
	}

	public String getTotalImagesCountData() {
		return this.totalImagesCountData;
	}

	public void setTotalImagesCountData(String totalImagesCountData) {
		this.totalImagesCountData = totalImagesCountData;
	}

	public String getUnknownImagesCountData() {
		return this.unknownImagesCountData;
	}

	public void setUnknownImagesCountData(String unknownImagesCountData) {
		this.unknownImagesCountData = unknownImagesCountData;
	}

	public String getWildlifeImagesCountData() {
		return this.wildlifeImagesCountData;
	}

	public void setWildlifeImagesCountData(String wildlifeImagesCountData) {
		this.wildlifeImagesCountData = wildlifeImagesCountData;
	}

}