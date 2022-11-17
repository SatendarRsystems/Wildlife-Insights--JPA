package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the exif_data_file_pivot database table.
 * 
 */
@Embeddable
public class ExifDataFilePivotPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="datafileid", insertable=false, updatable=false)
	private Integer dataFileId;

	@Column(name="exiftagid", insertable=false, updatable=false)
	private Integer exifTagId;

	public ExifDataFilePivotPK() {
	}
	public Integer getDataFileId() {
		return this.dataFileId;
	}
	public void setDataFileId(Integer dataFileId) {
		this.dataFileId = dataFileId;
	}
	public Integer getExifTagId() {
		return this.exifTagId;
	}
	public void setExifTagId(Integer exifTagId) {
		this.exifTagId = exifTagId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ExifDataFilePivotPK)) {
			return false;
		}
		ExifDataFilePivotPK castOther = (ExifDataFilePivotPK)other;
		return 
			this.dataFileId.equals(castOther.dataFileId)
			&& this.exifTagId.equals(castOther.exifTagId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.dataFileId.hashCode();
		hash = hash * prime + this.exifTagId.hashCode();
		
		return hash;
	}
}