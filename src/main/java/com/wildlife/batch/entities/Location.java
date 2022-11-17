package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the locations database table.
 * 
 */
@Entity
@Table(name="locations")
@NamedQuery(name="Location.findAll", query="SELECT l FROM Location l")
public class Location implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String country;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="elevation_gtopo30")
	private Integer elevationGtopo30;

	@Column(name="field_number")
	private String fieldNumber;

	@Column(name="first_order_division")
	private String firstOrderDivision;

	@Column(name="geodetic_datum")
	private String geodeticDatum;

	private String habitat;

	@Column(name="igbp_climate_classification")
	private String igbpClimateClassification;

	@Column(name="landcover_type")
	private String landcoverType;

	private Double latitude;

	private Double longitude;

	private String placename;

	@Column(name="plot_treatment")
	private String plotTreatment;

	@Column(name="plot_treatment_description")
	private String plotTreatmentDescription;

	@Column(name="property_type")
	private String propertyType;

	private String remarks;

	@Column(name="second_order_division")
	private String secondOrderDivision;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Deployment
	@OneToMany(mappedBy="location")
	private List<Deployment> deployments;

	//bi-directional many-to-one association to Feature
	@OneToMany(mappedBy="location")
	private List<Feature> features;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="projects_id")
	private Project project;

	//bi-directional many-to-one association to PlacementConfiguration
	@OneToMany(mappedBy="location")
	private List<PlacementConfiguration> placementConfigurations;

	public Location() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getElevationGtopo30() {
		return this.elevationGtopo30;
	}

	public void setElevationGtopo30(Integer elevationGtopo30) {
		this.elevationGtopo30 = elevationGtopo30;
	}

	public String getFieldNumber() {
		return this.fieldNumber;
	}

	public void setFieldNumber(String fieldNumber) {
		this.fieldNumber = fieldNumber;
	}

	public String getFirstOrderDivision() {
		return this.firstOrderDivision;
	}

	public void setFirstOrderDivision(String firstOrderDivision) {
		this.firstOrderDivision = firstOrderDivision;
	}

	public String getGeodeticDatum() {
		return this.geodeticDatum;
	}

	public void setGeodeticDatum(String geodeticDatum) {
		this.geodeticDatum = geodeticDatum;
	}

	public String getHabitat() {
		return this.habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getIgbpClimateClassification() {
		return this.igbpClimateClassification;
	}

	public void setIgbpClimateClassification(String igbpClimateClassification) {
		this.igbpClimateClassification = igbpClimateClassification;
	}

	public String getLandcoverType() {
		return this.landcoverType;
	}

	public void setLandcoverType(String landcoverType) {
		this.landcoverType = landcoverType;
	}

	public Double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getPlacename() {
		return this.placename;
	}

	public void setPlacename(String placename) {
		this.placename = placename;
	}

	public String getPlotTreatment() {
		return this.plotTreatment;
	}

	public void setPlotTreatment(String plotTreatment) {
		this.plotTreatment = plotTreatment;
	}

	public String getPlotTreatmentDescription() {
		return this.plotTreatmentDescription;
	}

	public void setPlotTreatmentDescription(String plotTreatmentDescription) {
		this.plotTreatmentDescription = plotTreatmentDescription;
	}

	public String getPropertyType() {
		return this.propertyType;
	}

	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSecondOrderDivision() {
		return this.secondOrderDivision;
	}

	public void setSecondOrderDivision(String secondOrderDivision) {
		this.secondOrderDivision = secondOrderDivision;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<Deployment> getDeployments() {
		return this.deployments;
	}

	public void setDeployments(List<Deployment> deployments) {
		this.deployments = deployments;
	}

	public Deployment addDeployment(Deployment deployment) {
		getDeployments().add(deployment);
		deployment.setLocation(this);

		return deployment;
	}

	public Deployment removeDeployment(Deployment deployment) {
		getDeployments().remove(deployment);
		deployment.setLocation(null);

		return deployment;
	}

	public List<Feature> getFeatures() {
		return this.features;
	}

	public void setFeatures(List<Feature> features) {
		this.features = features;
	}

	public Feature addFeature(Feature feature) {
		getFeatures().add(feature);
		feature.setLocation(this);

		return feature;
	}

	public Feature removeFeature(Feature feature) {
		getFeatures().remove(feature);
		feature.setLocation(null);

		return feature;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public List<PlacementConfiguration> getPlacementConfigurations() {
		return this.placementConfigurations;
	}

	public void setPlacementConfigurations(List<PlacementConfiguration> placementConfigurations) {
		this.placementConfigurations = placementConfigurations;
	}

	public PlacementConfiguration addPlacementConfiguration(PlacementConfiguration placementConfiguration) {
		getPlacementConfigurations().add(placementConfiguration);
		placementConfiguration.setLocation(this);

		return placementConfiguration;
	}

	public PlacementConfiguration removePlacementConfiguration(PlacementConfiguration placementConfiguration) {
		getPlacementConfigurations().remove(placementConfiguration);
		placementConfiguration.setLocation(null);

		return placementConfiguration;
	}

}