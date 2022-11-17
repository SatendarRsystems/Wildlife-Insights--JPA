package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the placement_configuration database table.
 * 
 */
@Entity
@Table(name="placement_configuration")
@NamedQuery(name="PlacementConfiguration.findAll", query="SELECT p FROM PlacementConfiguration p")
public class PlacementConfiguration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="num_deployments")
	private Integer numDeployments;

	@Column(name="orientation_description")
	private String orientationDescription;

	private String remarks;

	//bi-directional many-to-one association to Deployment
	@ManyToOne
	@JoinColumn(name="deployments_id")
	private Deployment deployment;

	//bi-directional many-to-one association to Feature
	@ManyToOne
	@JoinColumn(name="features_id")
	private Feature feature;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="locations_id")
	private Location location;

	public PlacementConfiguration() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumDeployments() {
		return this.numDeployments;
	}

	public void setNumDeployments(Integer numDeployments) {
		this.numDeployments = numDeployments;
	}

	public String getOrientationDescription() {
		return this.orientationDescription;
	}

	public void setOrientationDescription(String orientationDescription) {
		this.orientationDescription = orientationDescription;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Deployment getDeployment() {
		return this.deployment;
	}

	public void setDeployment(Deployment deployment) {
		this.deployment = deployment;
	}

	public Feature getFeature() {
		return this.feature;
	}

	public void setFeature(Feature feature) {
		this.feature = feature;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}