package com.wildlife.batch.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the projects database table.
 * 
 */
@Entity
@Table(name="projects")
@NamedQuery(name="Project.findAll", query="SELECT p FROM Project p")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private String abbreviation;

	@Column(name="access_rights")
	private String accessRights;

	private String acknowledgements;

	@Column(name="created_at")
	private Timestamp createdAt;

	@Column(name="cv_training")
	private Boolean cvTraining;

	@Column(name="data_citation")
	private String dataCitation;

	@Column(name="data_files_license")
	private String dataFilesLicense;

	@Column(name="delete_data_files_with_identified_humans")
	private Boolean deleteDataFilesWithIdentifiedHumans;

	private String design;

	@Column(name="disable_analytics")
	private Boolean disableAnalytics;

	@Column(name="disable_count")
	private Boolean disableCount;

	private Integer embargo;

	@Column(name="embargo_confirmation_approval")
	private Boolean embargoConfirmationApproval;

	@Column(name="embargo_start_date")
	private Timestamp embargoStartDate;

	@Column(name="enable_bucket_notification")
	private Boolean enableBucketNotification;

	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;

	@Column(name="initiative_id")
	private Integer initiativeId;

	@Column(name="metadata")
	private String metadata;

	@Column(name="metadata_license")
	private String metadataLicense;

	private String methodology;

	private String name;

	private String objectives;

	private String privacy;

	@Column(name="project_credit_line")
	private String projectCreditLine;

	@Column(name="project_status")
	private String projectStatus;

	@Column(name="project_type")
	private String projectType;

	@Column(name="project_url")
	private String projectUrl;

	@Column(name="public_latitude")
	private Double publicLatitude;

	@Column(name="public_longitude")
	private Double publicLongitude;

	private String remarks;

	@Column(name="rights_holder")
	private String rightsHolder;

	@Column(name="short_name")
	private String shortName;

	private String slug;

	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;

	private String status;

	@Column(name="tagger_upload")
	private Boolean taggerUpload;

	private String trigger;

	@Column(name="updated_at")
	private Timestamp updatedAt;

	//bi-directional many-to-one association to Organization
	@ManyToOne
	@JoinColumn(name="organizations_id")
	private Organization organization;

	//bi-directional many-to-many association to PublicBatchDownload
	@ManyToMany(mappedBy="projects")
	private List<PublicBatchDownload> publicBatchDownloads;

	//bi-directional many-to-one association to Tag
	@OneToMany(mappedBy="project")
	private List<Tag> tags;

	public Project() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAbbreviation() {
		return this.abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public String getAccessRights() {
		return this.accessRights;
	}

	public void setAccessRights(String accessRights) {
		this.accessRights = accessRights;
	}

	public String getAcknowledgements() {
		return this.acknowledgements;
	}

	public void setAcknowledgements(String acknowledgements) {
		this.acknowledgements = acknowledgements;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Boolean getCvTraining() {
		return this.cvTraining;
	}

	public void setCvTraining(Boolean cvTraining) {
		this.cvTraining = cvTraining;
	}

	public String getDataCitation() {
		return this.dataCitation;
	}

	public void setDataCitation(String dataCitation) {
		this.dataCitation = dataCitation;
	}

	public String getDataFilesLicense() {
		return this.dataFilesLicense;
	}

	public void setDataFilesLicense(String dataFilesLicense) {
		this.dataFilesLicense = dataFilesLicense;
	}

	public Boolean getDeleteDataFilesWithIdentifiedHumans() {
		return this.deleteDataFilesWithIdentifiedHumans;
	}

	public void setDeleteDataFilesWithIdentifiedHumans(Boolean deleteDataFilesWithIdentifiedHumans) {
		this.deleteDataFilesWithIdentifiedHumans = deleteDataFilesWithIdentifiedHumans;
	}

	public String getDesign() {
		return this.design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public Boolean getDisableAnalytics() {
		return this.disableAnalytics;
	}

	public void setDisableAnalytics(Boolean disableAnalytics) {
		this.disableAnalytics = disableAnalytics;
	}

	public Boolean getDisableCount() {
		return this.disableCount;
	}

	public void setDisableCount(Boolean disableCount) {
		this.disableCount = disableCount;
	}

	public Integer getEmbargo() {
		return this.embargo;
	}

	public void setEmbargo(Integer embargo) {
		this.embargo = embargo;
	}

	public Boolean getEmbargoConfirmationApproval() {
		return this.embargoConfirmationApproval;
	}

	public void setEmbargoConfirmationApproval(Boolean embargoConfirmationApproval) {
		this.embargoConfirmationApproval = embargoConfirmationApproval;
	}

	public Timestamp getEmbargoStartDate() {
		return this.embargoStartDate;
	}

	public void setEmbargoStartDate(Timestamp embargoStartDate) {
		this.embargoStartDate = embargoStartDate;
	}

	public Boolean getEnableBucketNotification() {
		return this.enableBucketNotification;
	}

	public void setEnableBucketNotification(Boolean enableBucketNotification) {
		this.enableBucketNotification = enableBucketNotification;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getInitiativeId() {
		return this.initiativeId;
	}

	public void setInitiativeId(Integer initiativeId) {
		this.initiativeId = initiativeId;
	}

	public Object getMetadata() {
		return this.metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public String getMetadataLicense() {
		return this.metadataLicense;
	}

	public void setMetadataLicense(String metadataLicense) {
		this.metadataLicense = metadataLicense;
	}

	public String getMethodology() {
		return this.methodology;
	}

	public void setMethodology(String methodology) {
		this.methodology = methodology;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjectives() {
		return this.objectives;
	}

	public void setObjectives(String objectives) {
		this.objectives = objectives;
	}

	public String getPrivacy() {
		return this.privacy;
	}

	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}

	public String getProjectCreditLine() {
		return this.projectCreditLine;
	}

	public void setProjectCreditLine(String projectCreditLine) {
		this.projectCreditLine = projectCreditLine;
	}

	public String getProjectStatus() {
		return this.projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getProjectType() {
		return this.projectType;
	}

	public void setProjectType(String projectType) {
		this.projectType = projectType;
	}

	public String getProjectUrl() {
		return this.projectUrl;
	}

	public void setProjectUrl(String projectUrl) {
		this.projectUrl = projectUrl;
	}

	public Double getPublicLatitude() {
		return this.publicLatitude;
	}

	public void setPublicLatitude(Double publicLatitude) {
		this.publicLatitude = publicLatitude;
	}

	public Double getPublicLongitude() {
		return this.publicLongitude;
	}

	public void setPublicLongitude(Double publicLongitude) {
		this.publicLongitude = publicLongitude;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getRightsHolder() {
		return this.rightsHolder;
	}

	public void setRightsHolder(String rightsHolder) {
		this.rightsHolder = rightsHolder;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getSlug() {
		return this.slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getTaggerUpload() {
		return this.taggerUpload;
	}

	public void setTaggerUpload(Boolean taggerUpload) {
		this.taggerUpload = taggerUpload;
	}

	public String getTrigger() {
		return this.trigger;
	}

	public void setTrigger(String trigger) {
		this.trigger = trigger;
	}

	public Timestamp getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Organization getOrganization() {
		return this.organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

	public List<PublicBatchDownload> getPublicBatchDownloads() {
		return this.publicBatchDownloads;
	}

	public void setPublicBatchDownloads(List<PublicBatchDownload> publicBatchDownloads) {
		this.publicBatchDownloads = publicBatchDownloads;
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	public Tag addTag(Tag tag) {
		getTags().add(tag);
		tag.setProject(this);

		return tag;
	}

	public Tag removeTag(Tag tag) {
		getTags().remove(tag);
		tag.setProject(null);

		return tag;
	}

}