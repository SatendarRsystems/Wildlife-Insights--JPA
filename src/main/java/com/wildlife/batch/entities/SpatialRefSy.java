package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the spatial_ref_sys database table.
 * 
 */
@Entity
@Table(name="spatial_ref_sys")
@NamedQuery(name="SpatialRefSy.findAll", query="SELECT s FROM SpatialRefSy s")
public class SpatialRefSy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer srid;

	@Column(name="auth_name")
	private String authName;

	@Column(name="auth_srid")
	private Integer authSrid;

	private String proj4text;

	private String srtext;

	public SpatialRefSy() {
	}

	public Integer getSrid() {
		return this.srid;
	}

	public void setSrid(Integer srid) {
		this.srid = srid;
	}

	public String getAuthName() {
		return this.authName;
	}

	public void setAuthName(String authName) {
		this.authName = authName;
	}

	public Integer getAuthSrid() {
		return this.authSrid;
	}

	public void setAuthSrid(Integer authSrid) {
		this.authSrid = authSrid;
	}

	public String getProj4text() {
		return this.proj4text;
	}

	public void setProj4text(String proj4text) {
		this.proj4text = proj4text;
	}

	public String getSrtext() {
		return this.srtext;
	}

	public void setSrtext(String srtext) {
		this.srtext = srtext;
	}

}