package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the features database table.
 * 
 */
@Entity
@Table(name="features")
@NamedQuery(name="Feature.findAll", query="SELECT f FROM Feature f")
public class Feature implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String description;

	@Column(name="feature_name")
	private String featureName;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="locations_id")
	private Location location;

	//bi-directional many-to-one association to PlacementConfiguration
	@OneToMany(mappedBy="feature")
	private List<PlacementConfiguration> placementConfigurations;

	public Feature() {
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

	public String getFeatureName() {
		return this.featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<PlacementConfiguration> getPlacementConfigurations() {
		return this.placementConfigurations;
	}

	public void setPlacementConfigurations(List<PlacementConfiguration> placementConfigurations) {
		this.placementConfigurations = placementConfigurations;
	}

	public PlacementConfiguration addPlacementConfiguration(PlacementConfiguration placementConfiguration) {
		getPlacementConfigurations().add(placementConfiguration);
		placementConfiguration.setFeature(this);

		return placementConfiguration;
	}

	public PlacementConfiguration removePlacementConfiguration(PlacementConfiguration placementConfiguration) {
		getPlacementConfigurations().remove(placementConfiguration);
		placementConfiguration.setFeature(null);

		return placementConfiguration;
	}

}