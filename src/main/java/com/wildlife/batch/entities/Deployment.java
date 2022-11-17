package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the deployments database table.
 * 
 */
@Entity
@Table(name="deployments")
@NamedQuery(name="Deployment.findAll", query="SELECT d FROM Deployment d")
public class Deployment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name="\"createdAt\"")
	private Timestamp createdAt;

	@Column(name="deployment_identifier")
	private String deploymentIdentifier;

	@Column(name="deployment_name")
	private String deploymentName;

	@Column(name="detection_distance")
	private Double detectionDistance;

	@Column(name="end_datetime")
	private Timestamp endDatetime;

	@Column(name="\"lastModified\"")
	private Timestamp lastModified;

	private String metadata;

	@Column(name="quiet_period")
	private Integer quietPeriod;

	private String remarks;

	@Column(name="rotation_angle")
	private Integer rotationAngle;

	@Column(name="sample_rate")
	private String sampleRate;

	@Column(name="sensor_end_status")
	private String sensorEndStatus;

	@Column(name="sensor_failure_details")
	private String sensorFailureDetails;

	@Column(name="sensor_height")
	private String sensorHeight;

	@Column(name="sensor_orientation")
	private String sensorOrientation;

	@Column(name="sensor_resolution")
	private String sensorResolution;

	@Column(name="sensor_schedule")
	private String sensorSchedule;

	@Column(name="sensor_sensitivity")
	private String sensorSensitivity;

	@Column(name="start_datetime")
	private Timestamp startDatetime;

	private String uuid;

	//bi-directional many-to-one association to DataFile
	@OneToMany(mappedBy="deployment")
	private List<DataFile> dataFiles;

	//bi-directional many-to-one association to DeploymentGroup
	@OneToMany(mappedBy="deployment")
	private List<DeploymentGroup> deploymentGroups;

	//bi-directional many-to-one association to BaitType
	@ManyToOne
	@JoinColumn(name="bait_type_id")
	private BaitType baitType;

	//bi-directional many-to-one association to Device
	@ManyToOne
	private Device device;

	//bi-directional many-to-one association to Location
	@ManyToOne
	@JoinColumn(name="locations_id")
	private Location location;

	//bi-directional many-to-one association to PairedDeployment
	@ManyToOne
	@JoinColumn(name="paired_deployments_id")
	private PairedDeployment pairedDeployment;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	@JoinColumn(name="participant_set_sensor_id")
	private Participant participant1;

	//bi-directional many-to-one association to Participant
	@ManyToOne
	@JoinColumn(name="participant_remove_sensor_id")
	private Participant participant2;

	//bi-directional many-to-one association to Project
	@ManyToOne
	@JoinColumn(name="projects_id")
	private Project project;

	//bi-directional many-to-one association to Subproject
	@ManyToOne
	private Subproject subproject;

	//bi-directional many-to-many association to Tag
	//@ManyToMany(mappedBy="deployments" ) Not data found in tag table
	//private List<Tag> tags;

	//bi-directional many-to-one association to PlacementConfiguration
	@OneToMany(mappedBy="deployment")
	private List<PlacementConfiguration> placementConfigurations;

	//bi-directional many-to-one association to Sequence
	@OneToMany(mappedBy="deployment")
	private List<Sequence> sequences;

	//bi-directional many-to-one association to SequenceDeploymentAdjust
	@OneToMany(mappedBy="deployment")
	private List<SequenceDeploymentAdjust> sequenceDeploymentAdjusts;

	public Deployment() {
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

	public String getDeploymentIdentifier() {
		return this.deploymentIdentifier;
	}

	public void setDeploymentIdentifier(String deploymentIdentifier) {
		this.deploymentIdentifier = deploymentIdentifier;
	}

	public String getDeploymentName() {
		return this.deploymentName;
	}

	public void setDeploymentName(String deploymentName) {
		this.deploymentName = deploymentName;
	}

	public Double getDetectionDistance() {
		return this.detectionDistance;
	}

	public void setDetectionDistance(Double detectionDistance) {
		this.detectionDistance = detectionDistance;
	}

	public Timestamp getEndDatetime() {
		return this.endDatetime;
	}

	public void setEndDatetime(Timestamp endDatetime) {
		this.endDatetime = endDatetime;
	}

	public Timestamp getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Timestamp lastModified) {
		this.lastModified = lastModified;
	}

	public String getMetadata() {
		return this.metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Integer getQuietPeriod() {
		return this.quietPeriod;
	}

	public void setQuietPeriod(Integer quietPeriod) {
		this.quietPeriod = quietPeriod;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getRotationAngle() {
		return this.rotationAngle;
	}

	public void setRotationAngle(Integer rotationAngle) {
		this.rotationAngle = rotationAngle;
	}

	public String getSampleRate() {
		return this.sampleRate;
	}

	public void setSampleRate(String sampleRate) {
		this.sampleRate = sampleRate;
	}

	public String getSensorEndStatus() {
		return this.sensorEndStatus;
	}

	public void setSensorEndStatus(String sensorEndStatus) {
		this.sensorEndStatus = sensorEndStatus;
	}

	public String getSensorFailureDetails() {
		return this.sensorFailureDetails;
	}

	public void setSensorFailureDetails(String sensorFailureDetails) {
		this.sensorFailureDetails = sensorFailureDetails;
	}

	public String getSensorHeight() {
		return this.sensorHeight;
	}

	public void setSensorHeight(String sensorHeight) {
		this.sensorHeight = sensorHeight;
	}

	public String getSensorOrientation() {
		return this.sensorOrientation;
	}

	public void setSensorOrientation(String sensorOrientation) {
		this.sensorOrientation = sensorOrientation;
	}

	public String getSensorResolution() {
		return this.sensorResolution;
	}

	public void setSensorResolution(String sensorResolution) {
		this.sensorResolution = sensorResolution;
	}

	public String getSensorSchedule() {
		return this.sensorSchedule;
	}

	public void setSensorSchedule(String sensorSchedule) {
		this.sensorSchedule = sensorSchedule;
	}

	public String getSensorSensitivity() {
		return this.sensorSensitivity;
	}

	public void setSensorSensitivity(String sensorSensitivity) {
		this.sensorSensitivity = sensorSensitivity;
	}

	public Timestamp getStartDatetime() {
		return this.startDatetime;
	}

	public void setStartDatetime(Timestamp startDatetime) {
		this.startDatetime = startDatetime;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public List<DataFile> getDataFiles() {
		return this.dataFiles;
	}

	public void setDataFiles(List<DataFile> dataFiles) {
		this.dataFiles = dataFiles;
	}

	public DataFile addDataFile(DataFile dataFile) {
		getDataFiles().add(dataFile);
		dataFile.setDeployment(this);

		return dataFile;
	}

	public DataFile removeDataFile(DataFile dataFile) {
		getDataFiles().remove(dataFile);
		dataFile.setDeployment(null);

		return dataFile;
	}

	public List<DeploymentGroup> getDeploymentGroups() {
		return this.deploymentGroups;
	}

	public void setDeploymentGroups(List<DeploymentGroup> deploymentGroups) {
		this.deploymentGroups = deploymentGroups;
	}

	public DeploymentGroup addDeploymentGroup(DeploymentGroup deploymentGroup) {
		getDeploymentGroups().add(deploymentGroup);
		deploymentGroup.setDeployment(this);

		return deploymentGroup;
	}

	public DeploymentGroup removeDeploymentGroup(DeploymentGroup deploymentGroup) {
		getDeploymentGroups().remove(deploymentGroup);
		deploymentGroup.setDeployment(null);

		return deploymentGroup;
	}

	public BaitType getBaitType() {
		return this.baitType;
	}

	public void setBaitType(BaitType baitType) {
		this.baitType = baitType;
	}

	public Device getDevice() {
		return this.device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public PairedDeployment getPairedDeployment() {
		return this.pairedDeployment;
	}

	public void setPairedDeployment(PairedDeployment pairedDeployment) {
		this.pairedDeployment = pairedDeployment;
	}

	public Participant getParticipant1() {
		return this.participant1;
	}

	public void setParticipant1(Participant participant1) {
		this.participant1 = participant1;
	}

	public Participant getParticipant2() {
		return this.participant2;
	}

	public void setParticipant2(Participant participant2) {
		this.participant2 = participant2;
	}

	public Project getProject() {
		return this.project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Subproject getSubproject() {
		return this.subproject;
	}

	public void setSubproject(Subproject subproject) {
		this.subproject = subproject;
	}

	/*
	 * public List<Tag> getTags() { return this.tags; }
	 * 
	 * public void setTags(List<Tag> tags) { this.tags = tags; }
	 */

	public List<PlacementConfiguration> getPlacementConfigurations() {
		return this.placementConfigurations;
	}

	public void setPlacementConfigurations(List<PlacementConfiguration> placementConfigurations) {
		this.placementConfigurations = placementConfigurations;
	}

	public PlacementConfiguration addPlacementConfiguration(PlacementConfiguration placementConfiguration) {
		getPlacementConfigurations().add(placementConfiguration);
		placementConfiguration.setDeployment(this);

		return placementConfiguration;
	}

	public PlacementConfiguration removePlacementConfiguration(PlacementConfiguration placementConfiguration) {
		getPlacementConfigurations().remove(placementConfiguration);
		placementConfiguration.setDeployment(null);

		return placementConfiguration;
	}

	public List<Sequence> getSequences() {
		return this.sequences;
	}

	public void setSequences(List<Sequence> sequences) {
		this.sequences = sequences;
	}

	public Sequence addSequence(Sequence sequence) {
		getSequences().add(sequence);
		sequence.setDeployment(this);

		return sequence;
	}

	public Sequence removeSequence(Sequence sequence) {
		getSequences().remove(sequence);
		sequence.setDeployment(null);

		return sequence;
	}

	public List<SequenceDeploymentAdjust> getSequenceDeploymentAdjusts() {
		return this.sequenceDeploymentAdjusts;
	}

	public void setSequenceDeploymentAdjusts(List<SequenceDeploymentAdjust> sequenceDeploymentAdjusts) {
		this.sequenceDeploymentAdjusts = sequenceDeploymentAdjusts;
	}

	public SequenceDeploymentAdjust addSequenceDeploymentAdjust(SequenceDeploymentAdjust sequenceDeploymentAdjust) {
		getSequenceDeploymentAdjusts().add(sequenceDeploymentAdjust);
		sequenceDeploymentAdjust.setDeployment(this);

		return sequenceDeploymentAdjust;
	}

	public SequenceDeploymentAdjust removeSequenceDeploymentAdjust(SequenceDeploymentAdjust sequenceDeploymentAdjust) {
		getSequenceDeploymentAdjusts().remove(sequenceDeploymentAdjust);
		sequenceDeploymentAdjust.setDeployment(null);

		return sequenceDeploymentAdjust;
	}

}